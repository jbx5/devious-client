package dev.unethicalite.managers.interaction;

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
			position = 0
	)
	String interactionManager = "Interaction manager";

	@ConfigItem(
			keyName = "interactMethod",
			name = "Interact method",
			description = "Interaction method",
			section = interactionManager,
			position = 1
	)
	default InteractMethod interactMethod()
	{
		return InteractMethod.MOUSE_EVENTS;
	}

	@ConfigItem(
			keyName = "naturalMouse",
			name = "Natural mouse",
			description = "Uses the 'natural mouse' algorithm to move and click",
			section = interactionManager,
			position = 2
	)
	default boolean naturalMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "disableMouse",
			name = "Disable manual input",
			description = "Disables manual input if a script/looped plugin is running",
			section = interactionManager,
			position = 3
	)
	default boolean disableMouse()
	{
		return true;
	}

	@ConfigItem(
			keyName = "mouseBehavior",
			name = "Mouse behavior",
			description = "Type of clicks to send to the server",
			section = interactionManager,
			position = 4
	)
	default MouseBehavior mouseBehavior()
	{
		return MouseBehavior.CLICKBOXES;
	}

	@ConfigItem(
			keyName = "drawMouse",
			name = "Draw mouse events",
			description = "Draws the sent mouse events on screen",
			section = interactionManager,
			position = 5
	)
	default boolean drawMouse()
	{
		return false;
	}
}
