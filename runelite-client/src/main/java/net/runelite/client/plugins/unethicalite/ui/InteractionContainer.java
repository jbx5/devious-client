package net.runelite.client.plugins.unethicalite.ui;

import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.unethicalite.client.config.UnethicaliteConfig;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.MouseBehavior;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class InteractionContainer extends PanelContainer
{
	public InteractionContainer(UnethicaliteConfig config, ConfigManager configManager)
	{
		super("Interaction settings", config, configManager);
	}

	@Override
	protected void rebuild()
	{
		removeAll();

		add(createComboBoxSection("Interact type", "interactMethod", InteractMethod.class), "wrap");

		switch (config.interactMethod())
		{
			case MOUSE_EVENTS:
				JPanel mouseEventsContainer = new JPanel(new MigLayout());
				mouseEventsContainer.setBorder(new TitledBorder("Mouse events"));
				mouseEventsContainer.add(createCheckBox("Natural mouse", "naturalMouse"), "wrap");
				mouseEventsContainer.add(createComboBoxSection("Mouse behavior", "mouseBehavior", MouseBehavior.class), "wrap");
				add(mouseEventsContainer, "wrap");
				break;

			case MOUSE_FORWARDING:
				JPanel mouseFwContainer = new JPanel(new MigLayout());

				mouseFwContainer.setBorder(new TitledBorder("Mouse forwarding"));
				mouseFwContainer.add(createCheckBox("Force mouse forwarding", "forceForwarding"), "wrap");
				mouseFwContainer.add(createCheckBox("Forward movement", "forwardMovement"), "wrap");

				if (!config.forwardMovement())
				{
					mouseFwContainer.add(createTextSection("Click location", "clickLocation", false));
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

				add(mouseFwContainer, "wrap");
				break;

			case INVOKE:
			case PACKETS:
				add(createCheckBox("Send Click Packet", "sendClickPacket"), "wrap");
				break;
		}

		add(createCheckBox("Disable manual input", "disableMouse"), "wrap");
		add(createCheckBox("Never Log", "neverLog"), "wrap");

		revalidate();
	}
}
