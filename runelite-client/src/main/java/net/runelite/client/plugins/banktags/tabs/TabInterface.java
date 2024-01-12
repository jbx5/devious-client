/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
 * Copyright (c) 2018, Ron Young <https://github.com/raiyni>
 * Copyright (c) 2023, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.banktags.tabs;

import com.google.common.base.Strings;
import com.google.common.util.concurrent.Runnables;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Singleton;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.ItemContainer;
import net.runelite.api.KeyCode;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.ScriptEvent;
import net.runelite.api.ScriptID;
import net.runelite.api.SoundEffectID;
import net.runelite.api.SpriteID;
import net.runelite.api.Varbits;
import net.runelite.api.events.DraggingWidgetChanged;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.ScriptPreFired;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.InterfaceID;
import net.runelite.api.widgets.ItemQuantityMode;
import net.runelite.api.widgets.JavaScriptCallback;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetConfig;
import net.runelite.api.widgets.WidgetSizeMode;
import net.runelite.api.widgets.WidgetType;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.chatbox.ChatboxItemSearch;
import net.runelite.client.game.chatbox.ChatboxPanelManager;
import net.runelite.client.plugins.bank.BankSearch;
import net.runelite.client.plugins.banktags.BankTagsConfig;
import static net.runelite.client.plugins.banktags.BankTagsPlugin.TAG_SEARCH;
import static net.runelite.client.plugins.banktags.BankTagsPlugin.VAR_TAG_SUFFIX;
import net.runelite.client.plugins.banktags.TagManager;
import net.runelite.client.ui.JagexColors;
import net.runelite.client.util.ColorUtil;
import net.runelite.client.util.Text;

@Singleton
@Slf4j
public class TabInterface
{
	public static final IntPredicate FILTERED_CHARS = c -> "</>:".indexOf(c) == -1;

	private static final Color HILIGHT_COLOR = JagexColors.MENU_TARGET;
	private static final String SCROLL_UP = "Scroll up";
	private static final String SCROLL_DOWN = "Scroll down";
	private static final String NEW_TAB = "New tag tab";
	private static final String REMOVE_TAB = "Delete tag tab";
	private static final String EXPORT_TAB = "Export tag tab";
	private static final String IMPORT_TAB = "Import tag tab";
	private static final String VIEW_TAB = "View tag tab";
	private static final String RENAME_TAB = "Rename tag tab";
	private static final String CHANGE_ICON = "Change icon";
	private static final String REMOVE_TAG = "Remove-tag";
	private static final String TAG_GEAR = "Tag-equipment";
	private static final String TAG_INVENTORY = "Tag-inventory";
	private static final String TAB_MENU_KEY = "tagtabs";
	private static final String OPEN_TAB_MENU = "View tag tabs";
	private static final int TAB_HEIGHT = 40;
	private static final int TAB_WIDTH = 39;
	private static final int BUTTON_HEIGHT = 20;
	private static final int MARGIN = 1;
	private static final int SCROLL_TICK = 500;
	private static final int INCINERATOR_WIDTH = 48;
	private static final int INCINERATOR_HEIGHT = 39;
	private static final int BANK_ITEM_WIDTH = 36;
	private static final int BANK_ITEM_HEIGHT = 32;
	private static final int BANK_ITEM_X_PADDING = 12;
	private static final int BANK_ITEM_Y_PADDING = 4;
	private static final int BANK_ITEMS_PER_ROW = 8;
	private static final int BANK_ITEM_START_X = 51;
	private static final int BANK_ITEM_START_Y = 0;
	private static final int TAB_OP_OPEN_TAG = 1;
	private static final int TAB_OP_CHANGE_ICON = 2;
	private static final int TAB_OP_DELETE_TAB = 3;
	private static final int TAB_OP_EXPORT_TAB = 4;
	private static final int TAB_OP_RENAME_TAB = 5;
	private static final int NEWTAB_OP_NEW_TAB = 1;
	private static final int NEWTAB_OP_IMPORT_TAB = 2;
	private static final int NEWTAB_OP_OPEN_TAB_MENU = 3;

	private final Client client;
	private final ClientThread clientThread;
	private final ItemManager itemManager;
	private final TagManager tagManager;
	private final TabManager tabManager;
	private final ChatboxPanelManager chatboxPanelManager;
	private final BankTagsConfig config;
	private final BankSearch bankSearch;
	private final ChatboxItemSearch searchProvider;
	private final ChatMessageManager chatMessageManager;

	private boolean enabled;
	@Getter
	private TagTab activeTab;
	@Getter
	private boolean tagTabActive;
	private int tagTabFirstChildIdx = -1;
	private int currentTabIndex;
	private Instant startScroll = Instant.now();

	private Widget upButton;
	private Widget downButton;
	private Widget newTab;
	private Widget tabLayer;

	@Inject
	private TabInterface(
		final Client client,
		final ClientThread clientThread,
		final ItemManager itemManager,
		final TagManager tagManager,
		final TabManager tabManager,
		final ChatboxPanelManager chatboxPanelManager,
		final BankTagsConfig config,
		final BankSearch bankSearch,
		final ChatboxItemSearch searchProvider,
		final ChatMessageManager chatMessageManager
		)
	{
		this.client = client;
		this.clientThread = clientThread;
		this.itemManager = itemManager;
		this.tagManager = tagManager;
		this.tabManager = tabManager;
		this.chatboxPanelManager = chatboxPanelManager;
		this.config = config;
		this.bankSearch = bankSearch;
		this.searchProvider = searchProvider;
		this.chatMessageManager = chatMessageManager;
	}

	public boolean isActive()
	{
		return activeTab != null;
	}

	@Subscribe
	public void onScriptPreFired(ScriptPreFired event)
	{
		if (event.getScriptId() == ScriptID.BANKMAIN_INIT)
		{
			boolean tabs = config.tabs();
			if (enabled != tabs)
			{
				enabled = tabs;
				if (tabs)
				{
					init();
				}
				else
				{
					// this is probably the "Use Tag Tabs" option being toggled off when the bank is open
					deinit();
				}
			}
		}
		else if (event.getScriptId() == ScriptID.BANKMAIN_SIZE_CHECK && enabled)
		{
			// from [proc,bankmain_size_check] - resize tab layer when the bank is resized
			final int[] intStack = client.getIntStack();
			final int intStackSize = client.getIntStackSize();
			Widget w = client.getWidget(intStack[intStackSize - 5]);
			int width = intStack[intStackSize - 4];
			int height = intStack[intStackSize - 3];
			if (w.getWidth() != width || w.getHeight() != height)
			{
				log.debug("Bank resize!");
				// This is right before the bank is resized, so wait until after so the computed tab layer size is right
				clientThread.invokeLater(this::resizeTabLayer);
			}
		}
		else if (event.getScriptId() == ScriptID.BANKMAIN_SEARCH_TOGGLE)
		{
			if (activeTab != null)
			{
				// close the active tab when search is pressed
				closeTag(false);
			}
		}
		else if (event.getScriptId() == ScriptID.BANKMAIN_FINISHBUILDING && enabled)
		{
			if (tagTabActive)
			{
				hideBank();
			}

			resizeTabLayer();
			rebuildTabs();
			rebuildTagTabTab();

			// Since we apply tag tab search filters even when the bank is not in search mode,
			// bankkmain_build will reset the bank title to "The Bank of Gielinor". So apply our
			// own title.
			if (tagTabActive)
			{
				// Tag tab tab has its own title since it isn't a real tag
				Widget bankTitle = client.getWidget(ComponentID.BANK_TITLE_BAR);
				bankTitle.setText("Tag tab tab");
			}
			else if (activeTab != null)
			{
				Widget bankTitle = client.getWidget(ComponentID.BANK_TITLE_BAR);
				bankTitle.setText("Tag tab <col=ff0000>" + activeTab.getTag() + "</col>");
			}

			if (activeTab != null && config.removeSeparators())
			{
				removeSeparators();
			}

			// Recompute scroll size. Only required for tag tab tab and with remove separators, to remove the
			// space that the separators took.
			if (tagTabActive || (activeTab != null && config.removeSeparators()))
			{
				Widget itemContainer = client.getWidget(ComponentID.BANK_ITEM_CONTAINER);
				int items = 0;
				for (Widget child : itemContainer.getChildren())
				{
					if (child != null && child.getItemId() != -1 && !child.isHidden())
					{
						++items;
					}
				}

				// New scroll height for if_setscrollsize
				final int adjustedScrollHeight = (Math.max(0, items - 1) / BANK_ITEMS_PER_ROW) * (BANK_ITEM_HEIGHT + BANK_ITEM_Y_PADDING) +
					(BANK_ITEM_HEIGHT + BANK_ITEM_Y_PADDING) + BANK_ITEM_Y_PADDING;

				// This is prior to bankmain_finishbuilding running, so the arguments are still on the stack. Overwrite
				// argument int12 (7 from the end) which is the height passed to if_setscrollsize
				final int[] intStack = client.getIntStack();
				final int intStackSize = client.getIntStackSize();
				intStack[intStackSize - 7] = adjustedScrollHeight;
			}
		}
	}

	@Subscribe
	public void onWidgetClosed(WidgetClosed event)
	{
		if (event.getGroupId() == InterfaceID.BANK && event.isUnload())
		{
			enabled = false;
			upButton = downButton = newTab = tabLayer = null;
			activeTab = null;
			tagTabActive = false;
			tagTabFirstChildIdx = -1;
		}
	}

	private void init()
	{
		Widget parent = client.getWidget(ComponentID.BANK_CONTENT_CONTAINER);

		assert tabLayer == null; // avoid double init

		tabLayer = parent.createStaticChild(WidgetType.LAYER);
		tabLayer.setHasListener(true);
		tabLayer.setNoScrollThrough(true);
		tabLayer.setOnScrollWheelListener((JavaScriptCallback) (event) -> scrollTab(event.getMouseY()));

		upButton = createGraphic(parent, "", TabSprites.UP_ARROW.getSpriteId(), -1, TAB_WIDTH, BUTTON_HEIGHT, MARGIN, 0);
		upButton.setAction(1, SCROLL_UP);
		int clickmask = upButton.getClickMask();
		clickmask |= WidgetConfig.DRAG;
		upButton.setClickMask(clickmask);
		upButton.setHasListener(true);
		upButton.setOnOpListener((JavaScriptCallback) (event) -> scrollTab(-1));

		downButton = createGraphic(parent, "", TabSprites.DOWN_ARROW.getSpriteId(), -1, TAB_WIDTH, BUTTON_HEIGHT, MARGIN, 0);
		downButton.setAction(1, SCROLL_DOWN);
		clickmask = downButton.getClickMask();
		clickmask |= WidgetConfig.DRAG;
		downButton.setClickMask(clickmask);
		downButton.setHasListener(true);
		downButton.setOnOpListener((JavaScriptCallback) (event) -> scrollTab(1));

		newTab = createGraphic(parent, "", TabSprites.NEW_TAB.getSpriteId(), -1, TAB_WIDTH, 39, MARGIN, 0);
		newTab.setHasListener(true);
		newTab.setAction(NEWTAB_OP_NEW_TAB, NEW_TAB);
		newTab.setAction(NEWTAB_OP_IMPORT_TAB, IMPORT_TAB);
		newTab.setAction(NEWTAB_OP_OPEN_TAB_MENU, OPEN_TAB_MENU);
		newTab.setOnOpListener((JavaScriptCallback) this::handleNewTab);

		tabManager.clear();
		tabManager.getAllTabs().forEach(this::loadTab);

		currentTabIndex = config.position();
		scrollTab(0);

		if (config.rememberTab() && !Strings.isNullOrEmpty(config.tab()))
		{
			// the server will resync the last opened vanilla tab when the bank is opened
			client.setVarbit(Varbits.CURRENT_BANK_TAB, 0);
			activeTab = tabManager.find(config.tab());
			tagTabActive = false;
		}

		// Move equipment button to the titlebar
		Widget equipmentButton = client.getWidget(ComponentID.BANK_EQUIPMENT_BUTTON);
		Widget titleBar = client.getWidget(ComponentID.BANK_TITLE_BAR);
		Widget bankItemCountTop = client.getWidget(ComponentID.BANK_ITEM_COUNT_TOP);
		if (equipmentButton != null && titleBar != null && bankItemCountTop != null)
		{
			equipmentButton.setOriginalX(6);
			equipmentButton.setOriginalY(4);
			equipmentButton.revalidate();

			int equipmentButtonTotalWidth = equipmentButton.getWidth() + equipmentButton.getOriginalX() - bankItemCountTop.getOriginalX();
			// the bank item count is 3 widgets
			for (int c = ComponentID.BANK_ITEM_COUNT_TOP; c <= ComponentID.BANK_ITEM_COUNT_BOTTOM; c++)
			{
				Widget widget = client.getWidget(c);
				if (widget == null)
				{
					continue;
				}

				widget.setOriginalX(widget.getOriginalX() + equipmentButtonTotalWidth);
				widget.revalidate();
			}

			titleBar.setOriginalX(equipmentButton.getWidth() / 2);
			titleBar.setOriginalWidth(titleBar.getWidth() - equipmentButton.getWidth());
			titleBar.revalidate();

			Widget groupStorageButton = client.getWidget(ComponentID.BANK_GROUP_STORAGE_BUTTON);
			if (groupStorageButton != null)
			{
				groupStorageButton.setOriginalX(groupStorageButton.getOriginalX() + equipmentButtonTotalWidth);
				groupStorageButton.revalidate();
			}
		}
	}

	public void deinit()
	{
		enabled = false;
		activeTab = null;

		// we can't easily remove these, just hide and orphan them
		upButton.setHidden(true);
		downButton.setHidden(true);
		newTab.setHidden(true);
		tabLayer.setHidden(true);
		upButton = downButton = newTab = tabLayer = null;

		tabManager.clear();
	}

	private void removeSeparators()
	{
		Widget itemContainer = client.getWidget(ComponentID.BANK_ITEM_CONTAINER);
		Widget[] containerChildren = itemContainer.getDynamicChildren();

		// sort the child array as the items are not in the displayed order
		Arrays.sort(containerChildren, Comparator.comparingInt(Widget::getOriginalY)
			.thenComparingInt(Widget::getOriginalX));

		int items = 0;
		for (Widget child : containerChildren)
		{
			if (child.getItemId() != -1 && !child.isHidden())
			{
				// calculate correct item position as if this was a normal tab
				int adjYOffset = (items / BANK_ITEMS_PER_ROW) * (BANK_ITEM_HEIGHT + BANK_ITEM_Y_PADDING);
				int adjXOffset = (items % BANK_ITEMS_PER_ROW) * (BANK_ITEM_WIDTH + BANK_ITEM_X_PADDING) + BANK_ITEM_START_X;

				if (child.getOriginalY() != adjYOffset || child.getOriginalX() != adjXOffset)
				{
					child.setOriginalY(adjYOffset);
					child.setOriginalX(adjXOffset);
					child.revalidate();
				}

				items++;
			}

			// separator line or tab text
			if (child.getSpriteId() == SpriteID.RESIZEABLE_MODE_SIDE_PANEL_BACKGROUND
				|| child.getText().contains("Tab"))
			{
				child.setHidden(true);
			}
		}
	}

	private void handleDeposit(MenuOptionClicked event, boolean inventory)
	{
		ItemContainer container = client.getItemContainer(inventory ? InventoryID.INVENTORY : InventoryID.EQUIPMENT);

		if (container == null)
		{
			return;
		}

		List<Integer> items = Arrays.stream(container.getItems())
			.filter(Objects::nonNull)
			.map(Item::getId)
			.filter(id -> id != -1)
			.collect(Collectors.toList());

		if (!Strings.isNullOrEmpty(event.getMenuTarget()))
		{
			if (activeTab != null && Text.removeTags(event.getMenuTarget()).equals(activeTab.getTag()))
			{
				for (Integer item : items)
				{
					tagManager.addTag(item, activeTab.getTag(), false);
				}

				reloadActiveTab();
			}

			return;
		}

		chatboxPanelManager.openTextInput((inventory ? "Inventory" : "Equipment") + " tags:")
			.addCharValidator(FILTERED_CHARS)
			.onDone((Consumer<String>) (newTags) ->
				clientThread.invoke(() ->
				{
					final List<String> tags = Text.fromCSV(newTags.toLowerCase());

					for (Integer item : items)
					{
						tagManager.addTags(item, tags, false);
					}

					reloadActiveTab();
				}))
			.build();
	}

	private void handleNewTab(ScriptEvent event)
	{
		switch (event.getOp() - 1)
		{
			case NEWTAB_OP_NEW_TAB:
				chatboxPanelManager.openTextInput("Tag name")
					.addCharValidator(FILTERED_CHARS)
					.onDone((Consumer<String>) (tagName) -> clientThread.invoke(() ->
					{
						if (!Strings.isNullOrEmpty(tagName))
						{
							loadTab(tagName);
							tabManager.save();

							resizeTabLayer();
							rebuildTabs();
							rebuildTagTabTab();
						}
					}))
					.build();
				break;
			case NEWTAB_OP_IMPORT_TAB:
				try
				{
					final String dataString = Toolkit
						.getDefaultToolkit()
						.getSystemClipboard()
						.getData(DataFlavor.stringFlavor)
						.toString()
						.trim();

					final Iterator<String> dataIter = Text.fromCSV(dataString).iterator();
					String name = dataIter.next();
					StringBuilder sb = new StringBuilder();
					for (char c : name.toCharArray())
					{
						if (FILTERED_CHARS.test(c))
						{
							sb.append(c);
						}
					}

					if (sb.length() == 0)
					{
						sendChatMessage("Failed to import tag tab from clipboard, invalid format.");
						return;
					}

					name = sb.toString();

					final String icon = dataIter.next();
					tabManager.setIcon(name, icon);

					while (dataIter.hasNext())
					{
						final int itemId = Integer.parseInt(dataIter.next());
						tagManager.addTag(itemId, name, itemId < 0);
					}

					loadTab(name);
					tabManager.save();

					resizeTabLayer();
					rebuildTabs();
					rebuildTagTabTab();

					if (activeTab != null && name.equals(activeTab.getTag()))
					{
						bankSearch.reset(true);
					}

					sendChatMessage("Tag tab " + name + " has been imported from your clipboard!");
				}
				catch (UnsupportedFlavorException | NoSuchElementException | IOException | NumberFormatException ex)
				{
					sendChatMessage("Failed to import tag tab from clipboard, invalid format.");
				}
				break;
			case NEWTAB_OP_OPEN_TAB_MENU:
				client.setVarbit(Varbits.CURRENT_BANK_TAB, 0);
				openNamedTag(TAB_MENU_KEY, true);
				break;
		}
	}

	private void handleTagTab(ScriptEvent event)
	{
		switch (event.getOp() - 1)
		{
			case TAB_OP_OPEN_TAG:
				client.setVarbit(Varbits.CURRENT_BANK_TAB, 0);
				Widget clicked = event.getSource();

				TagTab tab = tabManager.find(Text.removeTags(clicked.getName()));

				if (tab.equals(activeTab))
				{
					closeTag(true);
				}
				else
				{
					openTag(tab, true);
				}

				client.playSoundEffect(SoundEffectID.UI_BOOP);
				break;
			case TAB_OP_CHANGE_ICON:
				final String tag = Text.removeTags(event.getOpbase());
				searchProvider
					.tooltipText(CHANGE_ICON + " (" + tag + ")")
					.onItemSelected((itemId) ->
					{
						TagTab iconToSet = tabManager.find(tag);
						if (iconToSet != null)
						{
							iconToSet.setIconItemId(itemId);
							tabManager.setIcon(iconToSet.getTag(), itemId + "");
							rebuildTabs();
							rebuildTagTabTab();
						}
					})
					.build();
				break;
			case TAB_OP_DELETE_TAB:
				String target = Text.standardize(event.getOpbase());
				chatboxPanelManager.openTextMenuInput("Delete " + target)
					.option("1. Tab and tag from all items", () ->
						clientThread.invoke(() ->
						{
							tagManager.removeTag(target);
							deleteTab(target);
						})
					)
					.option("2. Only tab", () -> clientThread.invoke(() -> deleteTab(target)))
					.option("3. Cancel", Runnables.doNothing())
					.build();
				break;
			case TAB_OP_EXPORT_TAB:
				final List<String> data = new ArrayList<>();
				final TagTab tagTab = tabManager.find(Text.removeTags(event.getOpbase()));
				data.add(tagTab.getTag());
				data.add(String.valueOf(tagTab.getIconItemId()));

				for (Integer item : tagManager.getItemsForTag(tagTab.getTag()))
				{
					data.add(String.valueOf(item));
				}

				final StringSelection stringSelection = new StringSelection(Text.toCSV(data));
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
				sendChatMessage("Tag tab " + tagTab.getTag() + " has been copied to your clipboard!");
				break;
			case TAB_OP_RENAME_TAB:
				String renameTarget = Text.standardize(event.getOpbase());
				renameTab(renameTarget);
				break;
		}
	}

	public void handleAdd(MenuEntryAdded event)
	{
		if (activeTab != null
			&& event.getActionParam1() == ComponentID.BANK_ITEM_CONTAINER
			&& event.getOption().equals("Examine"))
		{
			createMenuEntry(event, REMOVE_TAG + " (" + activeTab.getTag() + ")", event.getTarget());
		}
		else if (event.getActionParam1() == ComponentID.BANK_DEPOSIT_INVENTORY
			&& event.getOption().equals("Deposit inventory"))
		{
			createMenuEntry(event, TAG_INVENTORY, event.getTarget());

			if (activeTab != null)
			{
				createMenuEntry(event, TAG_INVENTORY, ColorUtil.wrapWithColorTag(activeTab.getTag(), HILIGHT_COLOR));
			}
		}
		else if (event.getActionParam1() == ComponentID.BANK_DEPOSIT_EQUIPMENT
			&& event.getOption().equals("Deposit worn items"))
		{
			createMenuEntry(event, TAG_GEAR, event.getTarget());

			if (activeTab != null)
			{
				createMenuEntry(event, TAG_GEAR, ColorUtil.wrapWithColorTag(activeTab.getTag(), HILIGHT_COLOR));
			}
		}
	}

	@Subscribe
	public void onMenuOptionClicked(MenuOptionClicked event)
	{
		// Close the chatbox input when clicking on things in the bank, to mimic how actions like withdrawing
		// items or changing tabs close the withdraw-x input or the bank search input.
		if (chatboxPanelManager.getCurrentInput() != null
			&& event.getWidget() != null
			&& !event.getMenuOption().equals(SCROLL_UP)
			&& !event.getMenuOption().equals(SCROLL_DOWN))
		{
			int interfaceId = WidgetUtil.componentToInterface(event.getWidget().getId());
			if (interfaceId == InterfaceID.BANK || interfaceId == InterfaceID.BANK_INVENTORY)
			{
				chatboxPanelManager.close();
			}
		}

		if (event.getMenuOption().startsWith("View tab") || event.getMenuOption().equals("View all items"))
		{
			closeTag(false);
		}
		else if (activeTab != null
			&& event.getParam1() == ComponentID.BANK_ITEM_CONTAINER
			&& event.getMenuAction() == MenuAction.RUNELITE
			&& event.getMenuOption().startsWith(REMOVE_TAG))
		{
			// Add "remove" menu entry to all items in bank while tab is selected
			event.consume();
			final ItemComposition item = getItem(event.getParam0());
			final int itemId = item.getId();
			tagManager.removeTag(itemId, activeTab.getTag());
			bankSearch.layoutBank(); // re-layout to filter the removed item out
		}
		else if (event.getMenuAction() == MenuAction.RUNELITE
			&& ((event.getParam1() == ComponentID.BANK_DEPOSIT_INVENTORY && event.getMenuOption().equals(TAG_INVENTORY))
			|| (event.getParam1() == ComponentID.BANK_DEPOSIT_EQUIPMENT && event.getMenuOption().equals(TAG_GEAR))))
		{
			handleDeposit(event, event.getParam1() == ComponentID.BANK_DEPOSIT_INVENTORY);
		}
	}

	@Subscribe
	public void onDraggingWidgetChanged(DraggingWidgetChanged event)
	{
		if (!enabled)
		{
			return;
		}

		Widget draggedOn = client.getDraggedOnWidget();
		Widget draggedWidget = client.getDraggedWidget();

		// Returning early or nulling the drag release listener has no effect. Hence, we need to
		// null the draggedOnWidget instead.
		if (draggedWidget.getId() == ComponentID.BANK_ITEM_CONTAINER && isActive()
			&& config.preventTagTabDrags())
		{
			client.setDraggedOnWidget(null);
		}

		final boolean isDragging = event.isDraggingWidget();
		final boolean shiftDown = client.isKeyPressed(KeyCode.KC_SHIFT);
		if (!isDragging || draggedOn == null)
		{
			return;
		}

		// is dragging widget and mouse button released
		if (client.getMouseCurrentButton() == 0)
		{
			if (!tagTabActive
				&& draggedWidget.getId() == ComponentID.BANK_ITEM_CONTAINER
				&& draggedWidget.getItemId() != -1
				&& draggedOn.getId() == tabLayer.getId())
			{
				// Tag an item dragged on a tag tab
				tagManager.addTag(draggedWidget.getItemId(), draggedOn.getName(), shiftDown);
				reloadActiveTab();
			}
			else if ((tagTabActive && draggedWidget.getId() == ComponentID.BANK_ITEM_CONTAINER && draggedOn.getId() == ComponentID.BANK_ITEM_CONTAINER)
				|| (tabLayer.getId() == draggedOn.getId() && tabLayer.getId() == draggedWidget.getId()))
			{
				// Reorder tag tabs
				moveTagTab(draggedWidget, draggedOn);
			}
		}
		else if (draggedWidget.getItemId() != -1)
		{
			MenuEntry[] entries = client.getMenuEntries();

			if (entries.length > 0)
			{
				MenuEntry entry = entries[entries.length - 1];

				if (draggedWidget.getItemId() > 0 && entry.getOption().equals(VIEW_TAB) && draggedOn.getId() != draggedWidget.getId())
				{
					entry.setOption(TAG_SEARCH + Text.removeTags(entry.getTarget()) + (shiftDown ? VAR_TAG_SUFFIX : ""));
					entry.setTarget(draggedWidget.getName());
				}

				if (entry.getOption().equals(SCROLL_UP))
				{
					scrollTick(-1);
				}
				else if (entry.getOption().equals(SCROLL_DOWN))
				{
					scrollTick(1);
				}
			}
		}
	}

	private void moveTagTab(final Widget source, final Widget dest)
	{
		if (Strings.isNullOrEmpty(dest.getName()))
		{
			return;
		}

		if (client.getVarbitValue(Varbits.BANK_REARRANGE_MODE) == 0)
		{
			tabManager.swap(source.getName(), dest.getName());
		}
		else
		{
			tabManager.insert(source.getName(), dest.getName());
		}

		tabManager.save();
		rebuildTabs();
		rebuildTagTabTab();
	}

	private void addTabActions(Widget w)
	{
		w.setAction(TAB_OP_OPEN_TAG, VIEW_TAB);
		w.setAction(TAB_OP_CHANGE_ICON, CHANGE_ICON);
		w.setAction(TAB_OP_DELETE_TAB, REMOVE_TAB);
		w.setAction(TAB_OP_EXPORT_TAB, EXPORT_TAB);
		w.setAction(TAB_OP_RENAME_TAB, RENAME_TAB);
		w.setHasListener(true);
		w.setOnOpListener((JavaScriptCallback) this::handleTagTab);
	}

	private void addTabOptions(Widget w)
	{
		int clickmask = w.getClickMask();
		clickmask |= WidgetConfig.DRAG;
		clickmask |= WidgetConfig.DRAG_ON;
		w.setClickMask(clickmask);
		w.setDragDeadTime(5);
		w.setDragDeadZone(5);
		w.setItemQuantity(10000);
		w.setItemQuantityMode(ItemQuantityMode.NEVER);
	}

	private void loadTab(String tag)
	{
		TagTab tagTab = tabManager.load(tag);
		tabManager.add(tagTab);
	}

	private void deleteTab(String tag)
	{
		if (activeTab != null && activeTab.getTag().equals(tag))
		{
			closeTag(true);
		}

		tabManager.remove(tag);
		tabManager.save();

		resizeTabLayer();
		rebuildTabs();
		rebuildTagTabTab();
		scrollTab(0);
	}

	private void renameTab(String oldTag)
	{
		chatboxPanelManager.openTextInput("Enter new tag name for tag \"" + oldTag + "\":")
			.addCharValidator(FILTERED_CHARS)
			.onDone((Consumer<String>) (newTag) -> clientThread.invoke(() ->
			{
				if (!Strings.isNullOrEmpty(newTag) && !newTag.equalsIgnoreCase(oldTag))
				{
					if (tabManager.find(newTag) == null)
					{
						TagTab tagTab = tabManager.find(oldTag);
						tagTab.setTag(newTag);

						tabManager.removeIcon(oldTag);
						tabManager.setIcon(newTag, Integer.toString(tagTab.getIconItemId()));

						tabManager.save();
						tagManager.renameTag(oldTag, newTag);

						rebuildTabs();
						rebuildTagTabTab();

						reloadActiveTab();
					}
					else
					{
						chatboxPanelManager.openTextMenuInput("The specified bank tag already exists.")
							.option("1. Merge into existing tag \"" + newTag + "\".", () ->
								clientThread.invoke(() ->
								{
									tagManager.renameTag(oldTag, newTag);
									final String activeTag = activeTab != null ? activeTab.getTag() : "";
									deleteTab(oldTag);

									if (activeTag.equals(oldTag))
									{
										openNamedTag(newTag, true);
									}
									else
									{
										reloadActiveTab();
									}
								})
							)
							.option("2. Choose a different name.", () ->
								clientThread.invoke(() ->
									renameTab(oldTag))
							)
							.build();
					}
				}
			}))
			.build();
	}

	private void scrollTick(int direction)
	{
		// This ensures that dragging on scroll buttons does not scroll too fast
		if (startScroll.until(Instant.now(), ChronoUnit.MILLIS) >= SCROLL_TICK)
		{
			startScroll = Instant.now();
			scrollTab(direction);
		}
	}

	private void scrollTab(int d)
	{
		currentTabIndex += d;

		int maxTabs = tabLayer.getHeight() / TAB_HEIGHT;
		int maxScroll = tabManager.size() - maxTabs;
		if (currentTabIndex > maxScroll)
		{
			currentTabIndex = maxScroll;
		}

		if (currentTabIndex < 0)
		{
			currentTabIndex = 0;
		}

		int amt = (MARGIN + TAB_HEIGHT) * currentTabIndex;
		tabLayer.setScrollY(amt);

		config.position(currentTabIndex);
	}

	private void openNamedTag(String name, boolean relayout)
	{
		activeTab = tabManager.find(name);
		tagTabActive = TAB_MENU_KEY.equals(name);
		config.tab(name);

		if (relayout)
		{
			bankSearch.reset(true);
		}
	}

	private void openTag(TagTab tab, boolean relayout)
	{
		activeTab = tab;
		tagTabActive = false;
		config.tab(tab != null ? tab.getTag() : "");

		if (relayout)
		{
			bankSearch.reset(true);
		}
	}

	private void closeTag(boolean relayout)
	{
		activeTab = null;
		tagTabActive = false;
		config.tab("");

		if (relayout)
		{
			bankSearch.reset(true);
		}
	}

	public void reloadActiveTab()
	{
		if (activeTab != null)
		{
			bankSearch.reset(true);
		}
	}

	private void resizeTabLayer()
	{
		Widget incinerator = client.getWidget(ComponentID.BANK_INCINERATOR);
		int incineratorHeight = 0;
		if (incinerator != null && !incinerator.isHidden())
		{
			incinerator.setOriginalHeight(INCINERATOR_HEIGHT);
			incinerator.setOriginalWidth(INCINERATOR_WIDTH);
			incinerator.setOriginalY(INCINERATOR_HEIGHT);

			// ~bankmain_build is run three times when the bank is opened, the first is from ~bankmain_viewbuttons
			// which is prior to the incinerator being setup.
			Widget child = incinerator.getChild(0);
			if (child != null)
			{
				child.setOriginalHeight(INCINERATOR_HEIGHT);
				child.setOriginalWidth(INCINERATOR_WIDTH);
				child.setWidthMode(WidgetSizeMode.ABSOLUTE);
				child.setHeightMode(WidgetSizeMode.ABSOLUTE);
				child.setType(WidgetType.GRAPHIC);
				child.setSpriteId(TabSprites.INCINERATOR.getSpriteId());
			}

			incinerator.revalidate();

			incineratorHeight = incinerator.getHeight();
		}

		Widget parent = tabLayer.getParent();
		tabLayer.setOriginalY(41 + BUTTON_HEIGHT);
		tabLayer.setOriginalWidth(TAB_WIDTH + MARGIN * 2);

		// Keep the tab layer height a multiple of the tab heights
		int tabLayerHeight = parent.getHeight() - tabLayer.getOriginalY() - 61 - incineratorHeight;
		int numTabs = tabLayerHeight / (TAB_HEIGHT + MARGIN);
		tabLayer.setOriginalHeight(numTabs * (TAB_HEIGHT + MARGIN));

		tabLayer.revalidate();

		upButton.setOriginalY(41);
		upButton.revalidate();

		downButton.setOriginalY(41 + BUTTON_HEIGHT + numTabs * (TAB_HEIGHT + MARGIN) + MARGIN);
		downButton.revalidate();
	}

	private void rebuildTabs()
	{
		int y = MARGIN;

		tabLayer.deleteAllChildren();
		for (TagTab tab : tabManager.getTabs())
		{
			Widget background = createGraphic(tabLayer, ColorUtil.wrapWithColorTag(tab.getTag(), HILIGHT_COLOR),
				(activeTab == tab ? TabSprites.TAB_BACKGROUND_ACTIVE : TabSprites.TAB_BACKGROUND).getSpriteId(),
				-1, TAB_WIDTH, TAB_HEIGHT, MARGIN, y);
			addTabActions(background);

			Widget icon = createGraphic(
				tabLayer,
				ColorUtil.wrapWithColorTag(tab.getTag(), HILIGHT_COLOR),
				-1,
				tab.getIconItemId(),
				Constants.ITEM_SPRITE_WIDTH, Constants.ITEM_SPRITE_HEIGHT,
				MARGIN + 3, y + 4);
			addTabOptions(icon);

			y += TAB_HEIGHT + MARGIN;
		}

		tabLayer.setScrollHeight(y);
	}

	private void rebuildTagTabTab()
	{
		int itemX = BANK_ITEM_START_X;
		int itemY = BANK_ITEM_START_Y;
		int rowIndex = 0;

		// tabs are stored at the end of the item container to avoid interfering with the real items,
		// this is easier than making a layer for them because the bank scrollbar has to be adjusted
		// otherwise for the new layer
		Widget parent = client.getWidget(ComponentID.BANK_ITEM_CONTAINER);
		if (tagTabFirstChildIdx == -1)
		{
			tagTabFirstChildIdx = parent.getChildren().length;
		}

		int idx = tagTabFirstChildIdx;
		Widget w;
		while ((w = parent.getChild(idx++)) != null)
		{
			w.setHidden(true);
		}

		if (!tagTabActive)
		{
			return;
		}

		idx = tagTabFirstChildIdx;
		for (TagTab tagTab : tabManager.getTabs())
		{
			Widget menu = parent.getChild(idx++);
			if (menu == null)
			{
				menu = parent.createChild(-1, WidgetType.GRAPHIC);
				menu.setOriginalWidth(BANK_ITEM_WIDTH);
				menu.setOriginalHeight(BANK_ITEM_HEIGHT);
			}
			menu.setHidden(false);
			menu.setOriginalX(itemX);
			menu.setOriginalY(itemY);
			menu.setName(ColorUtil.wrapWithColorTag(tagTab.getTag(), HILIGHT_COLOR));
			menu.setItemId(tagTab.getIconItemId());
			menu.setItemQuantity(-1);
			menu.setBorderType(1);
			addTabActions(menu);
			addTabOptions(menu);
			menu.revalidate();

			rowIndex++;
			if (rowIndex == BANK_ITEMS_PER_ROW)
			{
				itemX = BANK_ITEM_START_X;
				itemY += BANK_ITEM_Y_PADDING + BANK_ITEM_HEIGHT;
				rowIndex = 0;
			}
			else
			{
				itemX += BANK_ITEM_X_PADDING + BANK_ITEM_WIDTH;
			}
		}
	}

	private void hideBank()
	{
		// hide the items & the separators
		Widget parent = client.getWidget(ComponentID.BANK_ITEM_CONTAINER);
		for (Widget w : parent.getChildren())
		{
			w.setHidden(true);
		}
	}

	private Widget createGraphic(Widget container, String name, int spriteId, int itemId, int width, int height, int x, int y)
	{
		Widget widget = container.createChild(-1, WidgetType.GRAPHIC);
		widget.setOriginalWidth(width);
		widget.setOriginalHeight(height);
		widget.setOriginalX(x);
		widget.setOriginalY(y);

		widget.setSpriteId(spriteId);

		if (itemId > -1)
		{
			widget.setItemId(itemId);
			widget.setItemQuantity(-1);
			widget.setBorderType(1);
		}

		widget.setName(name);
		widget.revalidate();

		return widget;
	}

	private ItemComposition getItem(int idx)
	{
		ItemContainer bankContainer = client.getItemContainer(InventoryID.BANK);
		Item item = bankContainer.getItem(idx);
		return itemManager.getItemComposition(item.getId());
	}

	private void createMenuEntry(MenuEntryAdded event, String option, String target)
	{
		client.createMenuEntry(-1)
			.setParam0(event.getActionParam0())
			.setParam1(event.getActionParam1())
			.setTarget(target)
			.setOption(option)
			.setType(MenuAction.RUNELITE)
			.setIdentifier(event.getIdentifier());
	}

	private void sendChatMessage(final String message)
	{
		chatMessageManager.queue(QueuedMessage.builder()
			.type(ChatMessageType.CONSOLE)
			.runeLiteFormattedMessage(message)
			.build());
	}
}
