package net.runelite.client.plugins.interaction;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup("interaction")
public interface InteractionConfig extends Config
{
	@ConfigSection(
			name = "Interaction manager",
			description = "Interaction settings",
			closedByDefault = true,
			position = 3
	)
	String interactionManager = "Interaction manager";

	@ConfigItem(
			keyName = "mouseEvents",
			name = "Mouse events",
			description = "Sends mouse events before interaction",
			section = interactionManager,
			position = 0
	)
	default boolean mouseEvents()
	{
		return false;
	}

	@ConfigItem(
			keyName = "interactType",
			name = "Interact click type",
			description = "Type of clicks to send to the server",
			section = interactionManager,
			position = 0
	)
	default InteractType interactType()
	{
		return InteractType.CLICKBOXES;
	}

	@ConfigItem(
			keyName = "drawMouse",
			name = "Draw mouse events",
			description = "Draws the sent mouse events on screen",
			section = interactionManager,
			position = 1
	)
	default boolean drawMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "debugInteractions",
			name = "Debug interactions",
			description = "Prints interactions to console",
			section = interactionManager,
			position = 2
	)
	default boolean debugInteractions()
	{
		return false;
	}

	@ConfigItem(
			keyName = "debugDialogs",
			name = "Debug dialogs",
			description = "Prints dialog actions to console",
			section = interactionManager,
			position = 3
	)
	default boolean debugDialogs()
	{
		return false;
	}
}
