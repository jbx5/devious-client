package dev.unethicalite.client.config;

import dev.unethicalite.managers.interaction.InteractMethod;
import dev.unethicalite.managers.interaction.MouseBehavior;
import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;

@ConfigGroup("unethicalite")
public interface UnethicaliteConfig extends Config
{
	@ConfigSection(
			name = "Interaction",
			description = "Interaction settings",
			position = 0
	)
	String interactionManager = "Interaction";

	@ConfigItem(
			keyName = "interactMethod",
			name = "Interact method",
			description = "Interaction method",
			section = interactionManager,
			position = 0
	)
	default InteractMethod interactMethod()
	{
		return InteractMethod.MOUSE_EVENTS;
	}

	@ConfigItem(
			keyName = "forceForwarding",
			name = "Force mouse forwarding",
			description = "Forces mouse forwarding regardless of queued actions",
			section = interactionManager,
			position = 1,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_FORWARDING"
	)
	default boolean forceForwarding()
	{
		return false;
	}

	@ConfigItem(
			keyName = "forceForwardMovement",
			name = "Always forward movement",
			description = "Always forward mouse movement regardless of queued actions",
			section = interactionManager,
			position = 1,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_FORWARDING"
	)
	default boolean forceForwardMovement()
	{
		return false;
	}

	@ConfigItem(
			keyName = "forwardKeystrokes",
			name = "Forward keystrokes as clicks",
			description = "Converts keystrokes to mouse clicks and forwards them to the client",
			section = interactionManager,
			position = 1,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_FORWARDING"
	)
	default boolean forwardKeystrokes()
	{
		return false;
	}

	@ConfigItem(
			keyName = "selectedMonitorsOnly",
			name = "Forward from specific monitors",
			description = "Forwards mouse events from selected monitors only",
			section = interactionManager,
			position = 1,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_FORWARDING"
	)
	default boolean selectedMonitorsOnly()
	{
		return false;
	}

	@Range(min = 1, max = 10)
	@ConfigItem(
			keyName = "selectedMonitorIds",
			name = "Monitor IDs",
			description = "Selected monitor IDs",
			section = interactionManager,
			position = 1,
			hidden = true,
			unhide = "selectedMonitorsOnly"
	)
	default String selectedMonitorIds()
	{
		return "1,2";
	}

	@ConfigItem(
			keyName = "forwardLeftClick",
			name = "Forward all clicks as left click",
			description = "Converts all clicks to left mouse button and forwards them as a left click",
			section = interactionManager,
			position = 2,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_FORWARDING"
	)
	default boolean forwardLeftClick()
	{
		return false;
	}

	@ConfigItem(
			keyName = "naturalMouse",
			name = "Natural mouse",
			description = "Uses the 'natural mouse' algorithm to move and click",
			section = interactionManager,
			position = 3,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_EVENTS"
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
			position = 4
	)
	default boolean disableMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "mouseBehavior",
			name = "Mouse behavior",
			description = "Type of clicks to send to the server",
			section = interactionManager,
			position = 5,
			hidden = true,
			unhide = "interactMethod",
			unhideValue = "MOUSE_EVENTS"
	)
	default MouseBehavior mouseBehavior()
	{
		return MouseBehavior.CLICKBOXES;
	}

	@ConfigItem(
			position = 6,
			keyName = "neverLog",
			name = "Neverlog",
			description = "Skips idle checks",
			section = interactionManager
	)
	default boolean neverLog()
	{
		return false;
	}

	@ConfigItem(
			keyName = "drawMouse",
			name = "Draw mouse events",
			description = "Draws the sent mouse events on screen",
			section = interactionManager,
			position = 7
	)
	default boolean drawMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "debugMenuAction",
			name = "Debug menu actions",
			description = "Debugs attempted menu actions to the console",
			section = interactionManager,
			position = 8
	)
	default boolean debugMenuActions()
	{
		return false;
	}

	@ConfigItem(
			keyName = "debugDialogs",
			name = "Debug dialog interactions",
			description = "Debugs chat dialog actions to console",
			section = interactionManager,
			position = 9
	)
	default boolean debugDialogs()
	{
		return false;
	}

	@ConfigSection(
			name = "Pathfinder/Regions",
			position = 1,
			description = ""
	)
	String pathfinderSection = "Pathfinder/Regions";

	@ConfigItem(
			keyName = "apiKey",
			name = "API Key",
			description = "API Key used for contributing collision data to our backend.",
			secret = true,
			position = 0,
			section = pathfinderSection
	)
	default String apiKey()
	{
		return "";
	}

	@ConfigItem(
			keyName = "useTransports",
			name = "Use transports",
			description = "Include transport nodes when calculating paths",
			position = 2,
			section = pathfinderSection
	)
	default boolean useTransports()
	{
		return true;
	}

	@ConfigItem(
			keyName = "useTeleports",
			name = "Use teleports",
			description = "Include teleportation when calculating paths",
			position = 2,
			section = pathfinderSection
	)
	default boolean useTeleports()
	{
		return true;
	}

	@Range(max = 3)
	@ConfigItem(
			keyName = "collisionOverlayPlane",
			name = "Collision overlay plane",
			description = "Collision overlay plane",
			position = 1,
			section = pathfinderSection
	)
	default int collisionOverlayPlane()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "collisionOverlay",
			name = "Show collision overlay",
			description = "Show collision overlay",
			position = 2,
			section = pathfinderSection
	)
	default boolean collisionOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "transportsOverlay",
			name = "Show transports overlay",
			description = "Show transports overlay",
			position = 3,
			section = pathfinderSection
	)
	default boolean transportsOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "pathOverlay",
			name = "Show path overlay",
			description = "Show path overlay",
			position = 4,
			section = pathfinderSection
	)
	default boolean pathOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "downloadCollisionData",
			name = "Update collision data",
			description = "Downloads new collision data from the server and updates the currently used collision map",
			position = 5,
			section = pathfinderSection
	)
	default Button download()
	{
		return new Button();
	}

	@ConfigItem(
			keyName = "addTransportData",
			name = "Add new transport",
			description = "Add new transport",
			position = 6,
			section = pathfinderSection
	)
	default Button transport()
	{
		return new Button();
	}

	@ConfigSection(
			name = "Minimal Mode",
			position = 2,
			description = ""
	)
	String minimalSection = "Minimal Mode";

	@Range(
			min = 1,
			max = 50
	)
	@ConfigItem(
			position = 0,
			keyName = "fpsLimit",
			name = "FPS limit",
			description = "FPS limit",
			section = minimalSection
	)
	default int fpsLimit()
	{
		return 15;
	}

	@ConfigItem(
			position = 1,
			keyName = "renderOff",
			name = "Render off",
			description = "Render off",
			section = minimalSection
	)
	default boolean renderOff()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "minimized",
			name = "Start minimized",
			description = "Start minimized",
			section = minimalSection
	)
	default boolean minimized()
	{
		return false;
	}
}
