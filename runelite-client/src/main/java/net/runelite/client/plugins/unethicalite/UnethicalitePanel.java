package net.runelite.client.plugins.unethicalite;

import lombok.extern.slf4j.Slf4j;
import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.util.Text;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.MouseBehavior;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.text.JTextComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;

@Slf4j
public class UnethicalitePanel extends PluginPanel
{
	private final UnethicaliteConfig config;
	private final ConfigManager configManager;

	private final JPanel interactionContainer = new JPanel(new MigLayout());

	public UnethicalitePanel(UnethicaliteConfig config, ConfigManager configManager)
	{
		this.config = config;
		this.configManager = configManager;

		setLayout(new BorderLayout());

		interactionContainer.setBorder(new TitledBorder("Interaction settings"));
		add(interactionContainer);

		rebuild();
	}

	private void rebuild()
	{
		interactionContainer.removeAll();

		interactionContainer.add(createComboBoxSection("Interact type", "interactMethod", InteractMethod.class),
				"wrap");

		switch (config.interactMethod())
		{
			case MOUSE_EVENTS:
				JPanel mouseEventsContainer = new JPanel(new MigLayout());
				mouseEventsContainer.setBorder(new TitledBorder("Mouse events"));
				mouseEventsContainer.add(createCheckBox("Natural mouse", "naturalMouse"), "wrap");
				mouseEventsContainer.add(createComboBoxSection("Mouse behavior", "mouseBehavior", MouseBehavior.class), "wrap");
				interactionContainer.add(mouseEventsContainer, "wrap");
				break;

			case MOUSE_FORWARDING:
				JPanel mouseFwContainer = new JPanel(new MigLayout());

				mouseFwContainer.setBorder(new TitledBorder("Mouse forwarding"));
				mouseFwContainer.add(createCheckBox("Force mouse forwarding", "forceForwarding"), "wrap");
				mouseFwContainer.add(createCheckBox("Forward movement", "forwardMovement"), "wrap");

				if (!config.forwardMovement())
				{
					mouseFwContainer.add(createTextSection("Click location", "clicklocation", false));
				}

				mouseFwContainer.add(createCheckBox("Always forward movement", "forceForwardMovement"), "wrap");
				mouseFwContainer.add(createCheckBox("Forward keystrokes as clicks", "forwardKeystrokes"), "wrap");
				mouseFwContainer.add(createCheckBox("Forward from specific monitors", "selectedMonitorsOnly"), "wrap");

				if (config.selectedMonitorsOnly())
				{
					mouseFwContainer.add(createTextSection("Monitor IDs", "selectedMonitorIds", false), "wrap, grow");
				}

				mouseFwContainer.add(createCheckBox("Forward specific mouse buttons", "selectedButtonsOnly"), "wrap");

				if (config.selectedButtonsOnly())
				{
					mouseFwContainer.add(createTextSection("Button IDs", "selectedButtons", false), "wrap, grow");
				}

				mouseFwContainer.add(createCheckBox("Forward as left click", "forwardLeftClick"), "wrap");

				interactionContainer.add(mouseFwContainer, "wrap");
				break;
		}

		interactionContainer.add(createCheckBox("Disable manual input", "disableMouse"), "wrap");
		interactionContainer.add(createCheckBox("Never Log", "neverLog"), "wrap");

		interactionContainer.revalidate();
	}

	private JCheckBox createCheckBox(String text, String configKey)
	{
		JCheckBox checkBox = new JCheckBox(text);
		checkBox.setSelected(configManager.getConfiguration(UnethicaliteConfig.CONFIG_GROUP, configKey, Boolean.class));
		checkBox.addChangeListener(l -> configManager.setConfiguration(UnethicaliteConfig.CONFIG_GROUP, configKey,
				((JCheckBox) l.getSource()).isSelected()));
		return checkBox;
	}

	private JPanel createComboBoxSection(String text, String key, Class<? extends Enum> type)
	{
		JPanel section = new JPanel();
		section.add(new JLabel(text));
		JComboBox<Enum<?>> box = new JComboBox<>(type.getEnumConstants());
		box.setRenderer(new ComboBoxListRenderer<>());
		box.setForeground(Color.WHITE);
		box.setFocusable(false);

		try
		{
			Enum<?> selectedItem = Enum.valueOf(type, configManager.getConfiguration(UnethicaliteConfig.CONFIG_GROUP,
					key));
			box.setSelectedItem(selectedItem);
			box.setToolTipText(Text.titleCase(selectedItem));
		}
		catch (IllegalArgumentException ignored)
		{
		}
		box.addItemListener(e ->
		{
			if (e.getStateChange() == ItemEvent.SELECTED)
			{
				configManager.setConfiguration(UnethicaliteConfig.CONFIG_GROUP, key, e.getItem());
				box.setToolTipText(Text.titleCase((Enum<?>) box.getSelectedItem()));
			}
		});

		section.add(box);

		return section;
	}

	private JPanel createTextSection(String text, String key, boolean secret)
	{
		JPanel section = new JPanel();
		section.add(new JLabel(text));

		JTextComponent textField;

		if (secret)
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
		textField.setText(configManager.getConfiguration(UnethicaliteConfig.CONFIG_GROUP, key));

		textField.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusLost(FocusEvent e)
			{
				configManager.setConfiguration(UnethicaliteConfig.CONFIG_GROUP, key, textField.getText());
			}
		});

		section.add(textField);

		return section;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged e)
	{
		if (!e.getGroup().equals(UnethicaliteConfig.CONFIG_GROUP))
		{
			return;
		}

		SwingUtilities.invokeLater(this::rebuild);
	}
}
