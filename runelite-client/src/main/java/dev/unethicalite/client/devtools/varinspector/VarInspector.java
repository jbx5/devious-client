package dev.unethicalite.client.devtools.varinspector;

import com.google.common.collect.ImmutableMap;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.VarClientInt;
import net.runelite.api.VarClientStr;
import net.runelite.api.VarPlayer;
import net.runelite.api.Varbits;
import net.runelite.api.events.VarClientIntChanged;
import net.runelite.api.events.VarClientStrChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.FontManager;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Singleton
@Slf4j
public class VarInspector
{
	@Getter(AccessLevel.PACKAGE)
	private enum VarType
	{
		VARBIT("Varbit"),
		VARP("VarPlayer"),
		VARCINT("VarClientInt"),
		VARCSTR("VarClientStr");

		private final String name;
		private final JCheckBox checkBox;

		VarType(String name)
		{
			this.name = name;
			checkBox = new JCheckBox(name, true);
		}
	}

	private final static int MAX_LOG_ENTRIES = 10_000;
	private static final int VARBITS_ARCHIVE_ID = 14;
	private static final Map<Integer, String> VARBIT_NAMES;

	static
	{
		ImmutableMap.Builder<Integer, String> builder = new ImmutableMap.Builder<>();

		try
		{
			for (Field f : Varbits.class.getDeclaredFields())
			{
				builder.put(f.getInt(null), f.getName());
			}
		}
		catch (IllegalAccessException ex)
		{
			log.error("error setting up varbit names", ex);
		}

		VARBIT_NAMES = builder.build();
	}

	@Inject
	private Client client;

	@Inject
	private EventBus eventBus;

	private JPanel tracker;

	private int lastTick = 0;

	private int[] oldVarps = null;
	private int[] oldVarps2 = null;
	private int numVarbits = 10000;

	private Map<Integer, Object> varcs = null;

	private JFrame frame;

	@Inject
	private VarInspector()
	{

	}

	private void addVarLog(VarType type, String name, int old, int neew)
	{
		addVarLog(type, name, Integer.toString(old), Integer.toString(neew));
	}

	private void addVarLog(VarType type, String name, String old, String neew)
	{
		if (!type.getCheckBox().isSelected())
		{
			return;
		}

		int tick = client.getTickCount();
		SwingUtilities.invokeLater(() ->
		{
			if (tick != lastTick)
			{
				lastTick = tick;
				JLabel header = new JLabel("Tick " + tick);
				header.setFont(FontManager.getRunescapeSmallFont());
				header.setBorder(new CompoundBorder(
						BorderFactory.createMatteBorder(0, 0, 1, 0, ColorScheme.LIGHT_GRAY_COLOR),
						BorderFactory.createEmptyBorder(3, 6, 0, 0)
				));
				tracker.add(header);
			}
			tracker.add(new JLabel(String.format("%s %s changed: %s -> %s", type.getName(), name, old, neew)));

			// Cull very old stuff
			for (; tracker.getComponentCount() > MAX_LOG_ENTRIES; )
			{
				tracker.remove(0);
			}

			tracker.revalidate();
		});
	}

	@Subscribe
	private void onVarbitChanged(VarbitChanged ev)
	{
		int[] varps = client.getVarps();

		// Check varbits
		for (int i = 0; i < numVarbits; i++)
		{
			try
			{
				int old = client.getVarbitValue(oldVarps, i);
				int neew = client.getVarbitValue(varps, i);
				if (old != neew)
				{
					// Set the varbit so it doesn't show in the varp changes
					// However, some varbits share common bits, so we only do it in oldVarps2
					// Example: 4101 collides with 4104-4129
					client.setVarbitValue(oldVarps2, i, neew);

					final String name = VARBIT_NAMES.getOrDefault(i, Integer.toString(i));
					addVarLog(VarType.VARBIT, name, old, neew);
				}
			}
			catch (IndexOutOfBoundsException e)
			{
				// We don't know what the last varbit is, so we just hit the end, then set it for future iterations
				log.debug("Hit OOB at varbit {}", i);
				numVarbits = i;
				break;
			}
		}

		// Check varps
		for (int i = 0; i < varps.length; i++)
		{
			int old = oldVarps2[i];
			int neew = varps[i];
			if (old != neew)
			{
				String name = String.format("%d", i);
				for (VarPlayer varp : VarPlayer.values())
				{
					if (varp.getId() == i)
					{
						name = String.format("%s(%d)", varp.name(), i);
						break;
					}
				}
				addVarLog(VarType.VARP, name, old, neew);
			}
		}

		System.arraycopy(client.getVarps(), 0, oldVarps, 0, oldVarps.length);
		System.arraycopy(client.getVarps(), 0, oldVarps2, 0, oldVarps2.length);
	}

	@Subscribe
	private void onVarClientIntChanged(VarClientIntChanged e)
	{
		int idx = e.getIndex();
		int neew = (Integer) client.getVarcMap().getOrDefault(idx, 0);
		int old = (Integer) varcs.getOrDefault(idx, 0);
		varcs.put(idx, neew);

		if (old != neew)
		{
			String name = String.format("%d", idx);
			for (VarClientInt varc : VarClientInt.values())
			{
				if (varc.getIndex() == idx)
				{
					name = String.format("%s(%d)", varc.name(), idx);
					break;
				}
			}
			addVarLog(VarType.VARCINT, name, old, neew);
		}
	}

	@Subscribe
	private void onVarClientStrChanged(VarClientStrChanged e)
	{
		int idx = e.getIndex();
		String neew = (String) client.getVarcMap().getOrDefault(idx, "");
		String old = (String) varcs.getOrDefault(idx, "");
		varcs.put(idx, neew);

		if (!Objects.equals(old, neew))
		{
			String name = String.format("%d", idx);
			for (VarClientStr varc : VarClientStr.values())
			{
				if (varc.getIndex() == idx)
				{
					name = String.format("%s(%d)", varc.name(), idx);
					break;
				}
			}
			if (old != null)
			{
				old = "\"" + old + "\"";
			}
			else
			{
				old = "null";
			}
			if (neew != null)
			{
				neew = "\"" + neew + "\"";
			}
			else
			{
				neew = "null";
			}
			addVarLog(VarType.VARCSTR, name, old, neew);
		}
	}

	public void open()
	{
		if (tracker == null)
		{
			tracker = new JPanel();
		}

		if (frame != null && frame.isVisible())
		{
			close();
			return;
		}

		if (frame == null)
		{
			frame = new JFrame();
			frame.setAlwaysOnTop(true);
			frame.setTitle("Var Inspector");

			frame.setLayout(new BorderLayout());

			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			frame.addWindowListener(new WindowAdapter()
			{
				@Override
				public void windowClosing(WindowEvent e)
				{
					close();
				}
			});

			tracker.setLayout(new DynamicGridLayout(0, 1, 0, 3));

			final JPanel trackerWrapper = new JPanel();
			trackerWrapper.setLayout(new BorderLayout());
			trackerWrapper.add(tracker, BorderLayout.NORTH);

			final JScrollPane trackerScroller = new JScrollPane(trackerWrapper);
			trackerScroller.setPreferredSize(new Dimension(400, 400));

			final JScrollBar vertical = trackerScroller.getVerticalScrollBar();
			vertical.addAdjustmentListener(new AdjustmentListener()
			{
				int lastMaximum = actualMax();

				private int actualMax()
				{
					return vertical.getMaximum() - vertical.getModel().getExtent();
				}

				@Override
				public void adjustmentValueChanged(AdjustmentEvent e)
				{
					if (vertical.getValue() >= lastMaximum)
					{
						vertical.setValue(actualMax());
					}
					lastMaximum = actualMax();
				}
			});

			frame.add(trackerScroller, BorderLayout.CENTER);

			final JPanel trackerOpts = new JPanel();
			trackerOpts.setLayout(new FlowLayout());
			for (VarType cb : VarType.values())
			{
				trackerOpts.add(cb.getCheckBox());
			}

			final JButton clearBtn = new JButton("Clear");
			clearBtn.addActionListener(e ->
			{
				tracker.removeAll();
				tracker.revalidate();
			});
			trackerOpts.add(clearBtn);

			frame.add(trackerOpts, BorderLayout.SOUTH);
			frame.setLocationRelativeTo(client.getCanvas());
			frame.pack();
		}

		if (oldVarps == null)
		{
			oldVarps = new int[client.getVarps().length];
			oldVarps2 = new int[client.getVarps().length];
		}

		System.arraycopy(client.getVarps(), 0, oldVarps, 0, oldVarps.length);
		System.arraycopy(client.getVarps(), 0, oldVarps2, 0, oldVarps2.length);
		varcs = new HashMap<>(client.getVarcMap());

		eventBus.register(this);

		frame.setVisible(true);
		frame.toFront();
		frame.repaint();
	}

	public void close()
	{
		tracker.removeAll();
		eventBus.unregister(this);
		frame.setVisible(false);
	}
}
