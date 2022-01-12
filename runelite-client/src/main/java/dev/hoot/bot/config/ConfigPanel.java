package dev.hoot.bot.config;

import com.google.common.base.Strings;
import com.google.common.collect.ComparisonChain;
import com.google.common.primitives.Ints;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.miginfocom.swing.MigLayout;
import net.runelite.api.Client;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.util.Text;
import net.runelite.client.config.Button;
import net.runelite.client.config.*;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.config.FixedWidthPanel;
import net.runelite.client.plugins.config.UnitFormatter;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.DynamicGridLayout;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.ui.components.colorpicker.RuneliteColorPicker;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Slf4j
public class ConfigPanel extends PluginPanel
{
	private JFrame frame;

	private static final int SPINNER_FIELD_WIDTH = 6;

	private static final Map<ConfigSectionDescriptor, Boolean> sectionExpandStates = new HashMap<>();

	private final FixedWidthPanel mainPanel;
	private final JLabel title;

	private final ConfigManager configManager;
	private final EventBus eventBus;
	private final ConfigurationDescriptor configurationDescriptor;
	private final Client client;

	public ConfigPanel(
			ConfigManager configManager,
			EventBus eventBus,
			ConfigurationDescriptor configurationDescriptor,
			Client client)
	{
		super(false);
		this.configManager = configManager;
		this.eventBus = eventBus;
		this.configurationDescriptor = configurationDescriptor;
		this.client = client;

		eventBus.register(this);

		setLayout(new BorderLayout());

		JPanel topPanel = new JPanel();
		topPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		topPanel.setLayout(new BorderLayout(0, BORDER_OFFSET));
		add(topPanel, BorderLayout.NORTH);

		mainPanel = new FixedWidthPanel();
		mainPanel.setBorder(new EmptyBorder(8, 10, 10, 10));
		mainPanel.setLayout(new DynamicGridLayout(0, 1, 0, 5));
		mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

		JPanel northPanel = new FixedWidthPanel();
		northPanel.setLayout(new BorderLayout());
		northPanel.add(mainPanel, BorderLayout.NORTH);

		JScrollPane scrollPane = new JScrollPane(northPanel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(scrollPane, BorderLayout.CENTER);

		title = new JLabel();

		topPanel.add(title);
	}

	public void open()
	{
		if (frame != null)
		{
			frame.setVisible(!frame.isVisible());

			if (frame.isVisible())
			{
				frame.setLocationRelativeTo(client.getCanvas());
			}
		}
	}

	public void init()
	{
		String name = configurationDescriptor.getName();
		title.setText(name);
		title.setToolTipText("<html>" + name + ":<br>" + configurationDescriptor.getDescription() + "</html>");

		rebuild();

		frame = new JFrame(configurationDescriptor.getDescription());
		frame.setAlwaysOnTop(true);
		frame.setLayout(new MigLayout());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		frame.add(this);

		frame.pack();
	}

	private void rebuild()
	{
		mainPanel.removeAll();

		ConfigDescriptor cd = configurationDescriptor.getConfigDescriptor();

		final Map<String, JPanel> sectionWidgets = new HashMap<>();
		final Map<ConfigObject, JPanel> topLevelPanels = new TreeMap<>((a, b) ->
				ComparisonChain.start()
						.compare(a.position(), b.position())
						.compare(a.name(), b.name())
						.result());

		for (ConfigSectionDescriptor csd : cd.getSections())
		{
			ConfigSection cs = csd.getSection();
			final boolean isOpen = true; // sectionExpandStates.getOrDefault(csd, !cs.closedByDefault());

			final JPanel section = new JPanel();
			section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
			section.setMinimumSize(new Dimension(PANEL_WIDTH, 0));

			final JPanel sectionHeader = new JPanel();
			sectionHeader.setLayout(new BorderLayout());
			sectionHeader.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			// For whatever reason, the header extends out by a single pixel when closed. Adding a single pixel of
			// border on the right only affects the width when closed, fixing the issue.
			sectionHeader.setBorder(new CompoundBorder(
					new MatteBorder(0, 0, 1, 0, ColorScheme.MEDIUM_GRAY_COLOR),
					new EmptyBorder(0, 0, 3, 1)));
			section.add(sectionHeader, BorderLayout.NORTH);

			String name = cs.name();
			final JLabel sectionName = new JLabel(name);
			sectionName.setFont(FontManager.getRunescapeBoldFont());
			sectionName.setToolTipText("<html>" + name + ":<br>" + cs.description() + "</html>");
			sectionHeader.add(sectionName, BorderLayout.CENTER);

			final JPanel sectionContents = new JPanel();
			sectionContents.setLayout(new DynamicGridLayout(0, 1, 0, 5));
			sectionContents.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			sectionContents.setBorder(new CompoundBorder(
					new MatteBorder(0, 0, 1, 0, ColorScheme.MEDIUM_GRAY_COLOR),
					new EmptyBorder(BORDER_OFFSET, 0, BORDER_OFFSET, 0)));
			sectionContents.setVisible(isOpen);
			section.add(sectionContents, BorderLayout.SOUTH);

			sectionWidgets.put(csd.getKey(), sectionContents);

			topLevelPanels.put(csd, section);
		}

		for (ConfigItemDescriptor cid : cd.getItems())
		{
			if (cid.getItem().hidden())
			{
				continue;
			}

			JPanel item = new JPanel();
			item.setLayout(new BorderLayout());
			item.setMinimumSize(new Dimension(PANEL_WIDTH, 0));
			String name = cid.getItem().name();
			JLabel configEntryName = new JLabel(name);
			configEntryName.setToolTipText("<html>" + name + ":<br>" + cid.getItem().description() + "</html>");

			item.add(configEntryName, BorderLayout.CENTER);

			if (cid.getType() == Button.class)
			{
				try
				{
					ConfigItem cidItem = cid.getItem();
					JButton button = new JButton(cidItem.name());
					button.addActionListener((e) ->
					{
						ConfigButtonClicked event = new ConfigButtonClicked();
						event.setGroup(cd.getGroup().value());
						event.setKey(cid.getItem().keyName());
						eventBus.post(event);
					});
					item.add(button);
				}
				catch (Exception ex)
				{
					log.error("Adding action listener failed: {}", ex.getMessage());
					ex.printStackTrace();
				}
			}

			if (cid.getType() == boolean.class)
			{
				JCheckBox checkbox = new JCheckBox();
				checkbox.setSelected(Boolean.parseBoolean(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName())));
				checkbox.addActionListener(ae -> changeConfiguration(checkbox, cd, cid));

				item.add(checkbox, BorderLayout.EAST);
			}

			if (cid.getType() == int.class)
			{
				int value = Integer.parseInt(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));

				Range range = cid.getRange();
				int min = 0, max = Integer.MAX_VALUE;
				if (range != null)
				{
					min = range.min();
					max = range.max();
				}

				// Config may previously have been out of range
				value = Ints.constrainToRange(value, min, max);

				SpinnerModel model = new SpinnerNumberModel(value, min, max, 1);
				JSpinner spinner = new JSpinner(model);
				Component editor = spinner.getEditor();
				JFormattedTextField spinnerTextField = ((JSpinner.DefaultEditor) editor).getTextField();
				spinnerTextField.setColumns(SPINNER_FIELD_WIDTH);
				spinner.addChangeListener(ce -> changeConfiguration(spinner, cd, cid));

				Units units = cid.getUnits();
				if (units != null)
				{
					spinnerTextField.setFormatterFactory(new UnitFormatterFactory(units));
				}

				item.add(spinner, BorderLayout.EAST);
			}

			if (cid.getType() == String.class)
			{
				JTextComponent textField;

				if (cid.getItem().secret())
				{
					textField = new JPasswordField();
				}
				else
				{
					final JTextArea textArea = new JTextArea();
					textArea.setLineWrap(true);
					textArea.setWrapStyleWord(true);
					textField = textArea;
				}

				textField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
				textField.setText(configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));

				textField.addFocusListener(new FocusAdapter()
				{
					@Override
					public void focusLost(FocusEvent e)
					{
						changeConfiguration(textField, cd, cid);
					}
				});

				item.add(textField, BorderLayout.SOUTH);
			}

			if (cid.getType() == Dimension.class)
			{
				JPanel dimensionPanel = new JPanel();
				dimensionPanel.setLayout(new BorderLayout());

				String str = configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName());
				String[] splitStr = str.split("x");
				int width = Integer.parseInt(splitStr[0]);
				int height = Integer.parseInt(splitStr[1]);

				SpinnerModel widthModel = new SpinnerNumberModel(width, 0, Integer.MAX_VALUE, 1);
				JSpinner widthSpinner = new JSpinner(widthModel);
				Component widthEditor = widthSpinner.getEditor();
				JFormattedTextField widthSpinnerTextField = ((JSpinner.DefaultEditor) widthEditor).getTextField();
				widthSpinnerTextField.setColumns(4);

				SpinnerModel heightModel = new SpinnerNumberModel(height, 0, Integer.MAX_VALUE, 1);
				JSpinner heightSpinner = new JSpinner(heightModel);
				Component heightEditor = heightSpinner.getEditor();
				JFormattedTextField heightSpinnerTextField = ((JSpinner.DefaultEditor) heightEditor).getTextField();
				heightSpinnerTextField.setColumns(4);

				ChangeListener listener = e ->
						configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), widthSpinner.getValue() + "x" + heightSpinner.getValue());

				widthSpinner.addChangeListener(listener);
				heightSpinner.addChangeListener(listener);

				dimensionPanel.add(widthSpinner, BorderLayout.WEST);
				dimensionPanel.add(new JLabel(" x "), BorderLayout.CENTER);
				dimensionPanel.add(heightSpinner, BorderLayout.EAST);

				item.add(dimensionPanel, BorderLayout.EAST);
			}

			if (cid.getType() instanceof Class && ((Class<?>) cid.getType()).isEnum())
			{
				Class<? extends Enum> type = (Class<? extends Enum>) cid.getType();

				JComboBox<Enum<?>> box = new JComboBox<Enum<?>>(type.getEnumConstants()); // NOPMD: UseDiamondOperator
				// set renderer prior to calling box.getPreferredSize(), since it will invoke the renderer
				// to build components for each combobox element in order to compute the display size of the
				// combobox
				box.setRenderer(new ComboBoxListRenderer<>());
				box.setPreferredSize(new Dimension(box.getPreferredSize().width, 25));
				box.setFocusable(false);

				try
				{
					Enum<?> selectedItem = Enum.valueOf(type, configManager.getConfiguration(cd.getGroup().value(), cid.getItem().keyName()));
					box.setSelectedItem(selectedItem);
					box.setToolTipText(Text.titleCase(selectedItem));
				}
				catch (IllegalArgumentException ex)
				{
					log.debug("invalid seleced item", ex);
				}
				box.addItemListener(e ->
				{
					if (e.getStateChange() == ItemEvent.SELECTED)
					{
						changeConfiguration(box, cd, cid);
						box.setToolTipText(Text.titleCase((Enum<?>) box.getSelectedItem()));
					}
				});
				item.add(box, BorderLayout.EAST);
			}

			JPanel section = sectionWidgets.get(cid.getItem().section());
			if (section == null)
			{
				topLevelPanels.put(cid, item);
			}
			else
			{
				section.add(item);
			}
		}

		topLevelPanels.values().forEach(mainPanel::add);

		JButton backButton = new JButton("Exit");

		mainPanel.add(backButton);
		backButton.addActionListener(e -> frame.dispose());

		revalidate();
	}

	private void changeConfiguration(Component component, ConfigDescriptor cd, ConfigItemDescriptor cid)
	{
		final ConfigItem configItem = cid.getItem();

		if (!Strings.isNullOrEmpty(configItem.warning()))
		{
			final int result = JOptionPane.showOptionDialog(component, configItem.warning(),
					"Are you sure?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE,
					null, new String[]{"Yes", "No"}, "No");

			if (result != JOptionPane.YES_OPTION)
			{
				rebuild();
				return;
			}
		}

		if (component instanceof JCheckBox)
		{
			JCheckBox checkbox = (JCheckBox) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), "" + checkbox.isSelected());
		}
		else if (component instanceof JSpinner)
		{
			JSpinner spinner = (JSpinner) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), "" + spinner.getValue());
		}
		else if (component instanceof JTextComponent)
		{
			JTextComponent textField = (JTextComponent) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), textField.getText());
		}
		else if (component instanceof RuneliteColorPicker)
		{
			RuneliteColorPicker colorPicker = (RuneliteColorPicker) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), colorPicker.getSelectedColor().getRGB() + "");
		}
		else if (component instanceof JComboBox)
		{
			JComboBox jComboBox = (JComboBox) component;
			configManager.setConfiguration(cd.getGroup().value(), cid.getItem().keyName(), ((Enum) jComboBox.getSelectedItem()).name());
		}
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged e)
	{
		rebuild();
	}
}

@RequiredArgsConstructor
final class UnitFormatterFactory extends JFormattedTextField.AbstractFormatterFactory
{
	private final Units units;
	private final Map<JFormattedTextField, JFormattedTextField.AbstractFormatter> formatters = new HashMap<>();

	@Override
	public JFormattedTextField.AbstractFormatter getFormatter(final JFormattedTextField tf)
	{
		return formatters.computeIfAbsent(tf, (key) -> new UnitFormatter(units));
	}
}
