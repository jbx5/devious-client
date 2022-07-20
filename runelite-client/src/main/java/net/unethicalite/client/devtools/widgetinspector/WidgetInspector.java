package net.unethicalite.client.devtools.widgetinspector;

import com.google.inject.Provider;
import com.google.inject.Singleton;
import lombok.AccessLevel;
import lombok.Getter;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.SpriteID;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetConfig;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetType;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.ColorUtil;

import javax.inject.Inject;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Stream;

@Singleton
public class WidgetInspector
{
	static final Color SELECTED_WIDGET_COLOR = Color.CYAN;
	private static final Map<Integer, WidgetInfo> widgetIdMap = new HashMap<>();
	private static final float SELECTED_WIDGET_HUE;

	static
	{
		float[] hsb = new float[3];
		Color.RGBtoHSB(SELECTED_WIDGET_COLOR.getRed(), SELECTED_WIDGET_COLOR.getGreen(), SELECTED_WIDGET_COLOR.getBlue(), hsb);
		SELECTED_WIDGET_HUE = hsb[0];
	}

	private final Provider<WidgetInspectorOverlay> overlay;
	private final OverlayManager overlayManager;
	private final WidgetInfoTableModel infoTableModel;
	private final ClientThread clientThread;
	private final Client client;
	private JTree widgetTree;
	private JCheckBox hideHidden;
	private DefaultMutableTreeNode root;
	@Getter(AccessLevel.PACKAGE)
	private Widget selectedWidget;

	@Getter(AccessLevel.PACKAGE)
	private int selectedItem;

	private Widget picker = null;

	@Getter(AccessLevel.PACKAGE)
	private boolean pickerSelected = false;

	private JFrame frame;

	@Inject
	private WidgetInspector(
			Client client,
			ClientThread clientThread,
			WidgetInfoTableModel infoTableModel,
			EventBus eventBus,
			Provider<WidgetInspectorOverlay> overlay,
			OverlayManager overlayManager)
	{
		this.infoTableModel = infoTableModel;
		this.overlay = overlay;
		this.overlayManager = overlayManager;
		this.client = client;
		this.clientThread = clientThread;
		eventBus.register(this);
	}

	public static WidgetInfo getWidgetInfo(int packedId)
	{
		if (widgetIdMap.isEmpty())
		{
			//Initialize map here so it doesn't create the index
			//until it's actually needed.
			WidgetInfo[] widgets = WidgetInfo.values();
			for (WidgetInfo w : widgets)
			{
				widgetIdMap.put(w.getPackedId(), w);
			}
		}

		return widgetIdMap.get(packedId);
	}

	private void refreshWidgets()
	{
		clientThread.invokeLater(() ->
		{
			Widget[] rootWidgets = client.getWidgetRoots();
			root = new DefaultMutableTreeNode();

			Widget wasSelectedWidget = selectedWidget;
			int wasSelectedItem = selectedItem;

			selectedWidget = null;
			selectedItem = -1;

			for (Widget widget : rootWidgets)
			{
				DefaultMutableTreeNode childNode = addWidget("R", widget);
				if (childNode != null)
				{
					root.add(childNode);
				}
			}

			SwingUtilities.invokeLater(() ->
			{
				widgetTree.setModel(new DefaultTreeModel(root));
				setSelectedWidget(wasSelectedWidget, wasSelectedItem, true);
			});
		});
	}

	private DefaultMutableTreeNode addWidget(String type, Widget widget)
	{
		if (widget == null || (hideHidden.isSelected() && widget.isHidden()))
		{
			return null;
		}

		DefaultMutableTreeNode node = new WidgetTreeNode(type, widget);

		Widget[] childComponents = widget.getDynamicChildren();
		if (childComponents != null)
		{
			for (Widget component : childComponents)
			{
				DefaultMutableTreeNode childNode = addWidget("D", component);
				if (childNode != null)
				{
					node.add(childNode);
				}
			}
		}

		childComponents = widget.getStaticChildren();
		if (childComponents != null)
		{
			for (Widget component : childComponents)
			{
				DefaultMutableTreeNode childNode = addWidget("S", component);
				if (childNode != null)
				{
					node.add(childNode);
				}
			}
		}

		childComponents = widget.getNestedChildren();
		if (childComponents != null)
		{
			for (Widget component : childComponents)
			{
				DefaultMutableTreeNode childNode = addWidget("N", component);
				if (childNode != null)
				{
					node.add(childNode);
				}
			}
		}

		Collection<WidgetItem> items = widget.getWidgetItems();
		if (items != null)
		{
			for (WidgetItem item : items)
			{
				if (item == null)
				{
					continue;
				}

				node.add(new WidgetItemNode(item));
			}
		}

		return node;
	}

	private void setSelectedWidget(Widget widget, int item, boolean updateTree)
	{
		infoTableModel.setWidget(widget);

		if (this.selectedWidget == widget && this.selectedItem == item)
		{
			return;
		}

		this.selectedWidget = widget;
		this.selectedItem = item;

		if (root == null || !updateTree)
		{
			return;
		}

		clientThread.invoke(() ->
		{
			Stack<Widget> treePath = new Stack<>();
			for (Widget w = widget; w != null; w = w.getParent())
			{
				treePath.push(w);
			}

			DefaultMutableTreeNode node = root;
			deeper:
			for (; !treePath.empty(); )
			{
				Widget w = treePath.pop();
				for (Enumeration<?> it = node.children(); it.hasMoreElements(); )
				{
					WidgetTreeNode inner = (WidgetTreeNode) it.nextElement();
					if (inner.getWidget().getId() == w.getId() && inner.getWidget().getIndex() == w.getIndex())
					{
						node = inner;
						continue deeper;
					}
				}
			}
			if (selectedItem != -1)
			{
				for (Enumeration<?> it = node.children(); it.hasMoreElements(); )
				{
					Object wiw = it.nextElement();
					if (wiw instanceof WidgetItemNode)
					{
						WidgetItemNode inner = (WidgetItemNode) wiw;
						if (inner.getWidgetItem().getIndex() == selectedItem)
						{
							node = inner;
							break;
						}
					}
				}
			}

			final DefaultMutableTreeNode fnode = node;
			SwingUtilities.invokeLater(() ->
			{
				widgetTree.getSelectionModel().clearSelection();
				widgetTree.getSelectionModel().addSelectionPath(new TreePath(fnode.getPath()));
			});
		});
	}

	public void open()
	{
		if (frame != null && frame.isVisible())
		{
			close();
			return;
		}

		if (frame == null)
		{
			frame = new JFrame();
			frame.setAlwaysOnTop(true);
			frame.setTitle("Widget Inspector");
			frame.setLayout(new BorderLayout());

			frame.addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					close();
				}
			});

			widgetTree = new JTree(new DefaultMutableTreeNode());
			widgetTree.setRootVisible(false);
			widgetTree.setShowsRootHandles(true);
			widgetTree.getSelectionModel().addTreeSelectionListener(e ->
			{
				Object selected = widgetTree.getLastSelectedPathComponent();
				if (selected instanceof WidgetTreeNode)
				{
					WidgetTreeNode node = (WidgetTreeNode) selected;
					Widget widget = node.getWidget();
					setSelectedWidget(widget, -1, false);
				}
				else if (selected instanceof WidgetItemNode)
				{
					WidgetItemNode node = (WidgetItemNode) selected;
					setSelectedWidget(node.getWidgetItem().getWidget(), node.getWidgetItem().getIndex(), false);
				}
			});

			final JScrollPane treeScrollPane = new JScrollPane(widgetTree);
			treeScrollPane.setPreferredSize(new Dimension(200, 400));

			final JTable widgetInfo = new JTable(infoTableModel);

			final JScrollPane infoScrollPane = new JScrollPane(widgetInfo);
			infoScrollPane.setPreferredSize(new Dimension(400, 400));


			final JPanel bottomPanel = new JPanel();
			frame.add(bottomPanel, BorderLayout.SOUTH);

			final JButton refreshWidgetsBtn = new JButton("Refresh");
			refreshWidgetsBtn.addActionListener(e -> refreshWidgets());
			bottomPanel.add(refreshWidgetsBtn);
			hideHidden = new JCheckBox("Hide hidden");
			hideHidden.setSelected(true);
			hideHidden.addItemListener(ev -> refreshWidgets());
			bottomPanel.add(hideHidden);

			final JButton revalidateWidget = new JButton("Revalidate");
			revalidateWidget.addActionListener(ev -> clientThread.invokeLater(() ->
			{
				if (selectedWidget == null)
				{
					return;
				}

				selectedWidget.revalidate();

			}));
			bottomPanel.add(revalidateWidget);

			final JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, treeScrollPane, infoScrollPane);
			frame.add(split, BorderLayout.CENTER);
			frame.setLocationRelativeTo(client.getCanvas());
			frame.pack();
		}

		frame.setVisible(true);
		frame.toFront();
		frame.repaint();
		overlayManager.add(this.overlay.get());
		clientThread.invokeLater(this::addPickerWidget);
	}

	public void close()
	{
		overlayManager.remove(this.overlay.get());
		clientThread.invokeLater(this::removePickerWidget);
		setSelectedWidget(null, -1, false);
		frame.setVisible(false);
	}

	private void removePickerWidget()
	{
		if (picker == null)
		{
			return;
		}

		Widget parent = picker.getParent();
		if (parent == null)
		{
			return;
		}

		Widget[] children = parent.getChildren();
		if (children == null || children.length <= picker.getIndex() || children[picker.getIndex()] != picker)
		{
			return;
		}

		children[picker.getIndex()] = null;
	}

	private void addPickerWidget()
	{
		removePickerWidget();

		int x = 10, y = 2;
		Widget parent = client.getWidget(WidgetInfo.MINIMAP_ORBS);
		if (parent == null)
		{
			Widget[] roots = client.getWidgetRoots();

			parent = Stream.of(roots)
					.filter(w -> w.getType() == WidgetType.LAYER && w.getContentType() == 0 && !w.isSelfHidden()).max(Comparator.comparingInt((Widget w) -> w.getRelativeX() + w.getRelativeY())
							.reversed()
							.thenComparingInt(Widget::getId)).get();
			x = 4;
			y = 4;
		}

		picker = parent.createChild(-1, WidgetType.GRAPHIC);

		picker.setSpriteId(SpriteID.MOBILE_FINGER_ON_INTERFACE);
		picker.setOriginalWidth(15);
		picker.setOriginalHeight(17);
		picker.setOriginalX(x);
		picker.setOriginalY(y);
		picker.revalidate();
		picker.setTargetVerb("Select");
		picker.setName("Pick");
		picker.setClickMask(WidgetConfig.USE_WIDGET | WidgetConfig.USE_ITEM);
		picker.setNoClickThrough(true);
		picker.setOnTargetEnterListener((JavaScriptCallback) ev ->
		{
			pickerSelected = true;
			picker.setOpacity(30);
			client.setAllWidgetsAreOpTargetable(true);
		});
		picker.setOnTargetLeaveListener((JavaScriptCallback) ev -> onPickerDeselect());
	}

	private void onPickerDeselect()
	{
		client.setAllWidgetsAreOpTargetable(false);
		picker.setOpacity(0);
		pickerSelected = false;
	}

	@Subscribe
	private void onMenuOptionClicked(MenuOptionClicked ev)
	{
		if (!pickerSelected)
		{
			return;
		}

		onPickerDeselect();
		client.setSpellSelected(false);
		ev.consume();

		Object target = getWidgetOrWidgetItemForMenuOption(ev.getMenuAction().getId(), ev.getParam0(), ev.getParam1());
		if (target == null)
		{
			return;
		}
		if (target instanceof WidgetItem)
		{
			WidgetItem iw = (WidgetItem) target;
			setSelectedWidget(iw.getWidget(), iw.getIndex(), true);
		}
		else
		{
			setSelectedWidget((Widget) target, -1, true);
		}
	}

	@Subscribe
	private void onMenuEntryAdded(MenuEntryAdded event)
	{
		if (!pickerSelected)
		{
			return;
		}

		MenuEntry[] menuEntries = client.getMenuEntries();

		for (int i = 0; i < menuEntries.length; i++)
		{
			MenuEntry entry = menuEntries[i];
			if (entry.getOpcode() != MenuAction.WIDGET_USE_ON_ITEM.getId()
					&& entry.getOpcode() != MenuAction.WIDGET_TARGET_ON_WIDGET.getId())
			{
				continue;
			}
			String name = WidgetInfo.TO_GROUP(entry.getParam1()) + "." + WidgetInfo.TO_CHILD(entry.getParam1());

			if (entry.getParam0() != -1)
			{
				name += " [" + entry.getParam0() + "]";
			}

			Color color = colorForWidget(i, menuEntries.length);

			entry.setTarget(ColorUtil.wrapWithColorTag(name, color));
		}

		client.setMenuEntries(menuEntries);
	}

	Color colorForWidget(int index, int length)
	{
		float h = SELECTED_WIDGET_HUE + .1f + (.8f / length) * index;

		return Color.getHSBColor(h, 1, 1);
	}

	Object getWidgetOrWidgetItemForMenuOption(int type, int param0, int param1)
	{
		if (type == MenuAction.WIDGET_TARGET_ON_WIDGET.getId())
		{
			Widget w = client.getWidget(WidgetInfo.TO_GROUP(param1), WidgetInfo.TO_CHILD(param1));
			if (param0 != -1)
			{
				w = w.getChild(param0);
			}

			return w;
		}
		else if (type == MenuAction.ITEM_USE_ON_ITEM.getId())
		{
			Widget w = client.getWidget(WidgetInfo.TO_GROUP(param1), WidgetInfo.TO_CHILD(param1));
			return w.getWidgetItem(param0);
		}

		return null;
	}
}
