package net.unethicalite.api.movement.pathfinder;

import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.runelite.api.ItemID;
import net.runelite.api.coords.WorldPoint;

public enum TeleportItem
{
	// Tabs
	VARROCK_TELEPORT_TAB(new WorldPoint(3212, 3424, 0), "Varrock teleport", ItemID.VARROCK_TELEPORT, "Break"),
	LUMBRIDGE_TELEPORT_TAB(new WorldPoint(3225, 3219, 0), "Lumbridge teleport", ItemID.LUMBRIDGE_TELEPORT, "Break"),
	FALADOR_TELEPORT_TAB(new WorldPoint(2966, 3379, 0), "Falador teleport", ItemID.FALADOR_TELEPORT, "Break"),
	CAMELOT_TELEPORT_TAB(new WorldPoint(2757, 3479, 0), "Camelot teleport", ItemID.CAMELOT_TELEPORT, "Break"),
	ARDOUGNE_TELEPORT_TAB(new WorldPoint(2661, 3300, 0), "Ardougne teleport", ItemID.ARDOUGNE_TELEPORT, "Break"),
	WEST_ARDOUGNE_TELEPORT_TAB(new WorldPoint(2500, 3290, 0), "West ardougne teleport", ItemID.WEST_ARDOUGNE_TELEPORT, "Break"),
	RIMMINGTON_TELEPORT_TAB(new WorldPoint(2954, 3224, 0), "Rimmington teleport", ItemID.RIMMINGTON_TELEPORT, "Break"),
	TAVERLEY_TELEPORT_TAB(new WorldPoint(2894, 3465, 0), "Taverley teleport", ItemID.TAVERLEY_TELEPORT, "Break"),
	RELLEKKA_TELEPORT_TAB(new WorldPoint(2668, 3631, 0), "Rellekka teleport", ItemID.RELLEKKA_TELEPORT, "Break"),
	BRIMHAVEN_TELEPORT_TAB(new WorldPoint(2758, 3178, 0), "Brimhaven teleport", ItemID.BRIMHAVEN_TELEPORT, "Break"),
	POLLNIVNEACH_TELEPORT_TAB(new WorldPoint(3340, 3004, 0), "Pollnivneach teleport", ItemID.POLLNIVNEACH_TELEPORT, "Break"),
	YANILLE_TELEPORT_TAB(new WorldPoint(2544, 3095, 0), "Yanille teleport", ItemID.YANILLE_TELEPORT, "Break"),
	HOSIDIUS_TELEPORT_TAB(new WorldPoint(1744, 3517, 0), "Hosidius teleport", ItemID.HOSIDIUS_TELEPORT, "Break"),
	SALVE_GRAVEYARD_TELEPORT_TAB(new WorldPoint(3432, 3460, 0), "Salve Graveyard teleport",
			ItemID.SALVE_GRAVEYARD_TELEPORT, "Break"),

	// Scrolls
	FELDIP_HILLS_TELEPORT(new WorldPoint(2541, 2925, 0), "Feldip hills teleport", ItemID.FELDIP_HILLS_TELEPORT,
			"Teleport"),
	PISCATORIS_TELEPORT(new WorldPoint(2342, 3647, 0), "Piscatoris teleport", ItemID.PISCATORIS_TELEPORT,
			"Teleport"),

	// Items
	ECTOPHIAL(new WorldPoint(3659, 3523, 0), "Ectophial", ItemID.ECTOPHIAL, "Empty"),

	;

	private final WorldPoint destination;
	private final String itemName;
	private final int itemId;
	private final String action;

	TeleportItem(WorldPoint destination, String itemName, int itemId, String action)
	{
		this.destination = destination;
		this.itemName = itemName;
		this.itemId = itemId;
		this.action = action;
	}

	public WorldPoint getDestination()
	{
		return destination;
	}

	public String getItemName()
	{
		return itemName;
	}

	public int getItemId()
	{
		return itemId;
	}

	public String getAction()
	{
		return action;
	}

	public boolean canUse()
	{
		return hasRequirements() && Inventory.getFirst(itemId) != null;
	}

	public boolean hasRequirements()
	{
		return (this != ARDOUGNE_TELEPORT_TAB || Vars.getVarp(165) >= 30)
				&& (this != SALVE_GRAVEYARD_TELEPORT_TAB || Vars.getVarp(302) >= 61);
	}
}
