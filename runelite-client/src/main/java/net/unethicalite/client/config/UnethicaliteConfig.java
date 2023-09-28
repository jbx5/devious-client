package net.unethicalite.client.config;

import java.util.Set;
import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import static net.unethicalite.client.config.UnethicaliteConfig.CONFIG_GROUP;
import net.unethicalite.client.managers.interaction.InteractMethod;
import net.unethicalite.client.managers.interaction.MouseBehavior;

@ConfigGroup(CONFIG_GROUP)
public interface UnethicaliteConfig extends Config
{
	String CONFIG_GROUP = "unethicalite";

	@ConfigItem(
			keyName = "interactMethod",
			name = "Interact method",
			description = "Interaction method",
			hidden = true,
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
			hidden = true
	)
	default boolean forceForwarding()
	{
		return false;
	}

	@ConfigItem(
			keyName = "forwardMovement",
			name = "Forward mouse movement",
			description = "Forward mouse movement events",
			hidden = true
	)
	default boolean forwardMovement()
	{
		return false;
	}

	@ConfigItem(
			keyName = "clickLocation",
			name = "Click coordinates",
			description = "When not forwarding, specify client window coords to click on",
			hidden = true
	)
	default String clickLocation()
	{
		return "0 0";
	}

	@ConfigItem(
			keyName = "forceForwardMovement",
			name = "Always forward movement",
			description = "Always forward mouse movement regardless of queued actions",
			hidden = true
	)
	default boolean forceForwardMovement()
	{
		return false;
	}

	@ConfigItem(
			keyName = "forwardKeystrokes",
			name = "Forward keystrokes as clicks",
			description = "Converts keystrokes to mouse clicks and forwards them to the client",
			hidden = true
	)
	default boolean forwardKeystrokes()
	{
		return false;
	}

	@ConfigItem(
			keyName = "selectedMonitorsOnly",
			name = "Forward from specific monitors",
			description = "Forwards mouse events from selected monitors only",
			hidden = true
	)
	default boolean selectedMonitorsOnly()
	{
		return false;
	}

	@ConfigItem(
			keyName = "selectedMonitorIds",
			name = "Monitor IDs",
			description = "Selected monitor IDs",
			hidden = true
	)
	default String selectedMonitorIds()
	{
		return "1,2";
	}

	@ConfigItem(
			keyName = "selectedButtonsOnly",
			name = "Forward only specific mouse buttons",
			description = "Forward only specific mouse buttons",
			hidden = true
	)
	default boolean selectedButtonsOnly()
	{
		return false;
	}

	@ConfigItem(
			keyName = "selectedButtons",
			name = "Button IDs",
			description = "Selected button IDs",
			hidden = true
	)
	default String selectedButtonIds()
	{
		return "1,2";
	}

	@ConfigItem(
			keyName = "forwardLeftClick",
			name = "Forward all clicks as left click",
			description = "Converts all clicks to left mouse button and forwards them as a left click",
			hidden = true
	)
	default boolean forwardLeftClick()
	{
		return false;
	}

	@ConfigItem(
			keyName = "naturalMouse",
			name = "Natural mouse",
			description = "Uses the 'natural mouse' algorithm to move and click",
			hidden = true
	)
	default boolean naturalMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "disableMouse",
			name = "Disable manual input",
			description = "Disables manual input if a script/looped plugin is running",
			hidden = true
	)
	default boolean disableMouse()
	{
		return false;
	}

	@ConfigItem(
			keyName = "mouseBehavior",
			name = "Mouse behavior",
			description = "Type of clicks to send to the server",
			hidden = true
	)
	default MouseBehavior mouseBehavior()
	{
		return MouseBehavior.CLICKBOXES;
	}

	@ConfigItem(
			position = 22,
			keyName = "neverLog",
			name = "Neverlog",
			description = "Skips idle checks",
			hidden = true
	)
	default boolean neverLog()
	{
		return false;
	}

	@ConfigItem(
			position = 23,
			keyName = "sendClickPacket",
			name = "Send Click Packet",
			description = "Sends click packet before interacting",
			hidden = true
	)
	default boolean sendClickPacket()
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
			keyName = "minTileDistance",
			name = "Min step distance",
			description = "",
			position = 1,
			section = pathfinderSection
	)
	default int minStepDistance()
	{
		return 7;
	}

	@ConfigItem(
			keyName = "maxTileDistance",
			name = "Max step distance",
			description = "",
			position = 2,
			section = pathfinderSection
	)
	default int maxStepDistance()
	{
		return 14;
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

	@ConfigItem(
			keyName = "avoidWilderness",
			name = "Avoid Wilderness",
			description = "Avoids walking in the wilderness if the destination is not in the wildy",
			position = 3,
			section = pathfinderSection
	)
	default boolean avoidWilderness()
	{
		return false;
	}

	@ConfigItem(
			keyName = "downloadCollisionData",
			name = "Download collision data",
			description = "Downloads new collision data from the server and updates the currently used collision map",
			position = 5,
			section = pathfinderSection
	)
	default Button download()
	{
		return new Button();
	}

	@ConfigItem(
			keyName = "localCollisionData",
			name = "Load cached collision data",
			description = "Loads the locally stored collision data",
			position = 6,
			section = pathfinderSection
	)
	default Button reload()
	{
		return new Button();
	}

	@ConfigItem(
			keyName = "usePoh",
			name = "Use POH",
			description = "",
			position = 3,
			section = pathfinderSection
	)
	default boolean usePoh()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hasMountedGlory",
			name = "Mounted Glory",
			description = "",
			position = 4,
			section = pathfinderSection
	)
	default boolean hasMountedGlory()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hasMountedDigsitePendant",
			name = "Mounted Digsite Pendant",
			description = "",
			position = 4,
			section = pathfinderSection
	)
	default boolean hasMountedDigsitePendant()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hasMountedMythicalCape",
			name = "Mounted Mythical Cape",
			description = "",
			position = 4,
			section = pathfinderSection
	)
	default boolean hasMountedMythicalCape()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hasMountedXericsTalisman",
			name = "Mounted Xerics Talisman",
			description = "",
			position = 4,
			section = pathfinderSection
	)
	default boolean hasMountedXericsTalisman()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hasJewelryBox",
			name = "Jewelry Box",
			description = "",
			position = 4,
			section = pathfinderSection
	)
	default JewelryBox hasJewelryBox()
	{
		return JewelryBox.NONE;
	}

	@ConfigItem(
		keyName = "useEquipmentJewellery",
		name = "Use jewellery from equipment",
		description = "",
		position = 4,
		section = pathfinderSection
	)
	default boolean useEquipmentJewellery()
	{
		return true;
	}

	@ConfigItem(
		keyName = "useEquipmentTeleports",
		name = "Use teleports from equipment",
		description = "",
		position = 4,
		section = pathfinderSection
	)
	default boolean useEquipmentTeleports()
	{
		return true;
	}

	@ConfigItem(
		keyName = "useMinigameTeleports",
		name = "Use minigames teleports",
		description = "",
		position = 4,
		section = pathfinderSection
	)
	default boolean useMinigameTeleports()
	{
		return true;
	}

	@ConfigItem(
			keyName = "housePortals",
			name = "House Portals",
			description = "",
			position = 4,
			section = pathfinderSection
	)
	default Set<HousePortal> housePortals()
	{
		return Set.of();
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

	@ConfigSection(
			name = "Data collection",
			position = 3,
			description = ""
	)
	String dataCollection = "Data collection";

	@ConfigItem(
			position = 0,
			keyName = "session",
			name = "Send session (online users)",
			description = "Sends your online status & your client mode to the backend.",
			section = dataCollection
	)
	default boolean session()
	{
		return true;
	}

	@ConfigItem(
			position = 0,
			keyName = "regions",
			name = "Send region",
			description = "Sends your local region data to the backend.",
			section = dataCollection
	)
	default boolean regions()
	{
		return true;
	}

	@ConfigSection(
			name = "Other settings",
			position = 3,
			description = ""
	)
	String otherSettings = "Other settings";

	@ConfigItem(
			position = 0,
			keyName = "disableGroups",
			name = "Disable Groups/Party",
			description = "Disables the Party functionality (needs a restart).",
			section = otherSettings
	)
	default boolean disableGroups()
	{
		return false;
	}
}
