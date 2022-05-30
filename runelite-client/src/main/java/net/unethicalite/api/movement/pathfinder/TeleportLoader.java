package net.unethicalite.api.movement.pathfinder;

import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.client.Static;

import static net.unethicalite.api.movement.pathfinder.MovementConstants.*;

public class TeleportLoader
{
	private static int LAST_BUILD_TICK = 0;
	private static List<Teleport> LAST_TELEPORT_LIST = Collections.emptyList();

	public static List<Teleport> buildTeleports()
	{
		if (LAST_BUILD_TICK == Static.getClient().getTickCount())
		{
			return LAST_TELEPORT_LIST;
		}

		LAST_BUILD_TICK = Static.getClient().getTickCount();

		List<Teleport> teleports = new ArrayList<>();
		if (Worlds.inMembersWorld())
		{
			if (Game.getWildyLevel() <= 20)
			{
				if (ringOfDueling())
				{
					teleports.add(new Teleport(new WorldPoint(3315, 3235, 0), 6,
						() -> jewelryTeleport("Duel Arena", RING_OF_DUELING)));
					teleports.add(new Teleport(new WorldPoint(2440, 3090, 0), 2,
						() -> jewelryTeleport("Castle Wars", RING_OF_DUELING)));
					teleports.add(new Teleport(new WorldPoint(3151, 3635, 0), 2,
						() -> jewelryTeleport("Ferox Enclave", RING_OF_DUELING)));
				}

				if (gamesNecklace())
				{
					teleports.add(new Teleport(new WorldPoint(2898, 3553, 0), 2,
						() -> jewelryTeleport("Burthorpe", GAMES_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(2520, 3571, 0), 6,
						() -> jewelryTeleport("Barbarian Outpost", GAMES_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(2964, 4382, 2), 2,
						() -> jewelryTeleport("Corporeal Beast", GAMES_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(3244, 9501, 2), 2,
						() -> jewelryTeleport("Tears of Guthix", GAMES_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(1624, 3938, 0), 1,
						() -> jewelryTeleport("Wintertodt Camp", GAMES_NECKLACE)));
				}

				if (necklaceOfPassage())
				{
					teleports.add(new Teleport(new WorldPoint(3114, 3179, 0), 2,
						() -> jewelryTeleport("Wizards' Tower", NECKLACE_OF_PASSAGE)));
					teleports.add(new Teleport(new WorldPoint(2430, 3348, 0), 2,
						() -> jewelryTeleport("The Outpost", NECKLACE_OF_PASSAGE)));
					teleports.add(new Teleport(new WorldPoint(3405, 3157, 0), 2,
						() -> jewelryTeleport("Eagles' Eyrie", NECKLACE_OF_PASSAGE)));
				}

				if (xericsTalisman())
				{
					teleports.add(new Teleport(new WorldPoint(1576, 3530, 0), 6,
											   () -> jewelryTeleport("Xeric's Lookout", XERICS_TALISMAN)));
					teleports.add(new Teleport(new WorldPoint(1752, 3566, 0), 6,
											   () -> jewelryTeleport("Xeric's Glade", XERICS_TALISMAN)));
					teleports.add(new Teleport(new WorldPoint(1504, 3817, 0), 6,
											   () -> jewelryTeleport("Xeric's Inferno", XERICS_TALISMAN)));
					teleports.add(new Teleport(new WorldPoint(1640, 3674, 0), 6,
											   () -> jewelryTeleport("Xeric's Heart", XERICS_TALISMAN)));
				}

				if (slayerRing())
				{
					teleports.add(new Teleport(new WorldPoint(2432, 3423, 0), 2,
											   () -> jewelryTeleport("Stronghold Slayer Cave", SLAYER_RING)));
					teleports.add(new Teleport(new WorldPoint(3422, 3537, 0), 2,
											   () -> jewelryTeleport("Slayer Tower", SLAYER_RING)));
					teleports.add(new Teleport(new WorldPoint(2802, 10000, 0), 2,
											   () -> jewelryTeleport("Fremennik Slayer Dungeon", SLAYER_RING)));
					teleports.add(new Teleport(new WorldPoint(3185, 4601, 0), 2,
											   () -> jewelryTeleport("Tarn's Lair", SLAYER_RING)));
					teleports.add(new Teleport(new WorldPoint(2028, 4636, 0), 2,
											   () -> jewelryTeleport("Dark Beasts", SLAYER_RING)));
				}

				if (digsitePendant())
				{
					teleports.add(new Teleport(new WorldPoint(3341, 3445, 0), 2,
											   () -> jewelryTeleport("Digsite", DIGSITE_PENDANT)));
					teleports.add(new Teleport(new WorldPoint(3549, 10456, 0), 2,
											   () -> jewelryTeleport("Lithkren", DIGSITE_PENDANT)));
				}

				for (TeleportItem tele : TeleportItem.values())
				{
					if (tele.canUse() && tele.getDestination().distanceTo(Players.getLocal().getWorldLocation()) > 20)
					{
						teleports.add(new Teleport(tele.getDestination(), 5, () ->
						{
							Item item = Inventory.getFirst(tele.getItemId());
							if (item != null)
							{
								item.interact(tele.getAction());
							}
						}));
					}
				}
			}

			if (Game.getWildyLevel() <= 30)
			{
				if (combatBracelet())
				{
					teleports.add(new Teleport(new WorldPoint(2882, 3548, 0), 2,
						() -> jewelryTeleport("Warriors' Guild", COMBAT_BRACELET)));
					teleports.add(new Teleport(new WorldPoint(3191, 3367, 0), 2,
						() -> jewelryTeleport("Champions' Guild", COMBAT_BRACELET)));
					teleports.add(new Teleport(new WorldPoint(3052, 3488, 0), 2,
						() -> jewelryTeleport("Monastery", COMBAT_BRACELET)));
					teleports.add(new Teleport(new WorldPoint(2655, 3441, 0), 2,
						() -> jewelryTeleport("Ranging Guild", COMBAT_BRACELET)));
				}

				if (skillsNecklace())
				{
					teleports.add(new Teleport(new WorldPoint(2611, 3390, 0), 6,
						() -> jewelryPopupTeleport("Fishing Guild", SKILLS_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(3050, 9763, 0), 6,
						() -> jewelryPopupTeleport("Mining Guild", SKILLS_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(2933, 3295, 0), 6,
						() -> jewelryPopupTeleport("Crafting Guild", SKILLS_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(3143, 3440, 0), 6,
						() -> jewelryPopupTeleport("Cooking Guild", SKILLS_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(1662, 3505, 0), 6,
						() -> jewelryPopupTeleport("Woodcutting Guild", SKILLS_NECKLACE)));
					teleports.add(new Teleport(new WorldPoint(1249, 3718, 0), 6,
						() -> jewelryPopupTeleport("Farming Guild", SKILLS_NECKLACE)));
				}

				if (ringOfWealth())
				{
					teleports.add(new Teleport(new WorldPoint(3163, 3478, 0), 2,
						() -> jewelryTeleport("Grand Exchange", RING_OF_WEALTH)));
					teleports.add(new Teleport(new WorldPoint(2996, 3375, 0), 2,
						() -> jewelryTeleport("Falador", RING_OF_WEALTH)));
				}

				if (amuletOfGlory())
				{
					teleports.add(new Teleport(new WorldPoint(3087, 3496, 0), 0,
						() -> jewelryTeleport("Edgeville", AMULET_OF_GLORY)));
					teleports.add(new Teleport(new WorldPoint(2918, 3176, 0), 0,
						() -> jewelryTeleport("Karamja", AMULET_OF_GLORY)));
					teleports.add(new Teleport(new WorldPoint(3105, 3251, 0), 0,
						() -> jewelryTeleport("Draynor Village", AMULET_OF_GLORY)));
					teleports.add(new Teleport(new WorldPoint(3293, 3163, 0), 0,
						() -> jewelryTeleport("Al Kharid", AMULET_OF_GLORY)));
				}
			}
		}

		if (Game.getWildyLevel() <= 20)
		{
			for (TeleportSpell teleportSpell : TeleportSpell.values())
			{
				if (!teleportSpell.canCast() || teleportSpell.getPoint() == null)
				{
					continue;
				}

				if (teleportSpell.getPoint().distanceTo(Players.getLocal().getWorldLocation()) > 50)
				{
					teleports.add(new Teleport(teleportSpell.getPoint(), 5, () ->
					{
						final Spell spell = teleportSpell.getSpell();
						if (teleportSpell == TeleportSpell.TELEPORT_TO_HOUSE)
						{
							// Tele to outside
							Widget widget = Widgets.get(spell.getWidget());
							if (widget == null)
							{
								return;
							}
							widget.interact(1);
						}
						else
						{
							Magic.cast(spell);
						}
					}));
				}
			}
		}

		return List.copyOf(LAST_TELEPORT_LIST = teleports);
	}

	public static void jewelryTeleport(String target, int... ids)
	{
		Item inv = Inventory.getFirst(ids);

		if (inv != null)
		{
			if (Dialog.isViewingOptions())
			{
				Dialog.chooseOption(target);
				return;
			}

			inv.interact("Rub");
			return;
		}

		Item equipped = Equipment.getFirst(ids);
		if (equipped != null)
		{
			equipped.interact(target);
		}
	}

	public static void jewelryPopupTeleport(String target, int... ids)
	{
		Item inv = Inventory.getFirst(ids);

		if (inv != null)
		{
			Widget baseWidget = Widgets.get(187, 3);
			if (Widgets.isVisible(baseWidget))
			{
				Widget[] children = baseWidget.getChildren();
				if (children == null)
				{
					return;
				}

				for (int i = 0; i < children.length; i++)
				{
					Widget teleportItem = children[i];
					if (teleportItem.getText().contains(target))
					{
						Keyboard.type((i + 1));
						return;
					}
				}
			}

			inv.interact("Rub");
			return;
		}

		Item equipped = Equipment.getFirst(ids);
		if (equipped != null)
		{
			equipped.interact(target);
		}
	}

	public static boolean ringOfDueling()
	{
		return Inventory.getFirst(RING_OF_DUELING) != null
			|| Equipment.getFirst(RING_OF_DUELING) != null;
	}

	public static boolean gamesNecklace()
	{
		return Inventory.getFirst(GAMES_NECKLACE) != null
			|| Equipment.getFirst(GAMES_NECKLACE) != null;
	}

	public static boolean combatBracelet()
	{
		return Inventory.getFirst(COMBAT_BRACELET) != null
			|| Equipment.getFirst(COMBAT_BRACELET) != null;
	}

	public static boolean skillsNecklace()
	{
		return Inventory.getFirst(SKILLS_NECKLACE) != null
			|| Equipment.getFirst(SKILLS_NECKLACE) != null;
	}

	public static boolean ringOfWealth()
	{
		return Inventory.getFirst(RING_OF_WEALTH) != null
			|| Equipment.getFirst(RING_OF_WEALTH) != null;
	}

	public static boolean amuletOfGlory()
	{
		return Inventory.getFirst(AMULET_OF_GLORY) != null
			|| Equipment.getFirst(AMULET_OF_GLORY) != null;
	}

	public static boolean necklaceOfPassage()
	{
		return Inventory.getFirst(NECKLACE_OF_PASSAGE) != null
			|| Equipment.getFirst(NECKLACE_OF_PASSAGE) != null;
	}

	public static boolean xericsTalisman()
	{
		return Inventory.getFirst(XERICS_TALISMAN) != null
				|| Equipment.getFirst(XERICS_TALISMAN) != null;
	}

	public static boolean slayerRing()
	{
		return Inventory.getFirst(SLAYER_RING) != null
				|| Equipment.getFirst(SLAYER_RING) != null;
	}

	public static boolean digsitePendant()
	{
		return Inventory.getFirst(DIGSITE_PENDANT) != null
				|| Equipment.getFirst(DIGSITE_PENDANT) != null;
	}
}
