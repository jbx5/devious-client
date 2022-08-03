package net.unethicalite.api.movement.pathfinder.model;

import net.runelite.api.ItemID;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.movement.pathfinder.TransportLoader;

import java.util.List;

public class MovementConstants
{
    public static final List<TransportLoader.SpiritTree> SPIRIT_TREES = List.of(
            new TransportLoader.SpiritTree(new WorldPoint(2542, 3170, 0), "Tree Gnome Village"),
            new TransportLoader.SpiritTree(new WorldPoint(2461, 3444, 0), "Gnome Stronghold"),
            new TransportLoader.SpiritTree(new WorldPoint(2555, 3259, 0), "Battlefield of Khazard"),
            new TransportLoader.SpiritTree(new WorldPoint(3185, 3508, 0), "Grand Exchange"),
            new TransportLoader.SpiritTree(new WorldPoint(2488, 2850, 0), "Feldip Hills")
    );
    public static final List<TransportLoader.MagicMushtree> MUSHTREES = List.of(
            new TransportLoader.MagicMushtree(new WorldPoint(3676, 3871, 0), WidgetInfo.FOSSIL_MUSHROOM_MEADOW),
            new TransportLoader.MagicMushtree(new WorldPoint(3764, 3879, 1), WidgetInfo.FOSSIL_MUSHROOM_HOUSE),
            new TransportLoader.MagicMushtree(new WorldPoint(3676, 3755, 0), WidgetInfo.FOSSIL_MUSHROOM_SWAMP),
            new TransportLoader.MagicMushtree(new WorldPoint(3760, 3758, 0), WidgetInfo.FOSSIL_MUSHROOM_VALLEY)
    );

    public static final WorldArea WILDERNESS_ABOVE_GROUND = new WorldArea(2944, 3523, 448, 448, 0);
    public static final WorldArea WILDERNESS_UNDERGROUND = new WorldArea(2944, 9918, 320, 442, 0);
    public static WorldPoint HOUSE_POINT = new WorldPoint(10000, 4000, 1);

    public static final int[] RING_OF_DUELING = new int[]
            {
                    ItemID.RING_OF_DUELING8,
                    ItemID.RING_OF_DUELING7,
                    ItemID.RING_OF_DUELING6,
                    ItemID.RING_OF_DUELING5,
                    ItemID.RING_OF_DUELING4,
                    ItemID.RING_OF_DUELING3,
                    ItemID.RING_OF_DUELING2,
                    ItemID.RING_OF_DUELING1,
            };

    public static final int[] GAMES_NECKLACE = new int[]
            {
                    ItemID.GAMES_NECKLACE8,
                    ItemID.GAMES_NECKLACE7,
                    ItemID.GAMES_NECKLACE6,
                    ItemID.GAMES_NECKLACE5,
                    ItemID.GAMES_NECKLACE4,
                    ItemID.GAMES_NECKLACE3,
                    ItemID.GAMES_NECKLACE2,
                    ItemID.GAMES_NECKLACE1,
            };

    public static final int[] COMBAT_BRACELET = new int[]
            {
                    ItemID.COMBAT_BRACELET1,
                    ItemID.COMBAT_BRACELET2,
                    ItemID.COMBAT_BRACELET3,
                    ItemID.COMBAT_BRACELET4,
                    ItemID.COMBAT_BRACELET5,
                    ItemID.COMBAT_BRACELET6,
            };

    public static final int[] RING_OF_WEALTH = new int[]
            {
                    ItemID.RING_OF_WEALTH_5,
                    ItemID.RING_OF_WEALTH_4,
                    ItemID.RING_OF_WEALTH_3,
                    ItemID.RING_OF_WEALTH_2,
                    ItemID.RING_OF_WEALTH_1,
            };

    public static final int[] AMULET_OF_GLORY = new int[]
            {
                    ItemID.AMULET_OF_GLORY6,
                    ItemID.AMULET_OF_GLORY5,
                    ItemID.AMULET_OF_GLORY4,
                    ItemID.AMULET_OF_GLORY3,
                    ItemID.AMULET_OF_GLORY2,
                    ItemID.AMULET_OF_GLORY1,
            };

    public static final int[] NECKLACE_OF_PASSAGE = new int[]
            {
                    ItemID.NECKLACE_OF_PASSAGE1,
                    ItemID.NECKLACE_OF_PASSAGE2,
                    ItemID.NECKLACE_OF_PASSAGE3,
                    ItemID.NECKLACE_OF_PASSAGE4,
                    ItemID.NECKLACE_OF_PASSAGE5,
            };

    public static final int[] BURNING_AMULET = new int[]
            {
                    ItemID.BURNING_AMULET5,
                    ItemID.BURNING_AMULET4,
                    ItemID.BURNING_AMULET3,
                    ItemID.BURNING_AMULET2,
                    ItemID.BURNING_AMULET1,
            };

    public static final int[] XERICS_TALISMAN = new int[]
            {
                    ItemID.XERICS_TALISMAN
            };

    public static final int[] SLAYER_RING = new int[]
            {
                    ItemID.SLAYER_RING_ETERNAL,
                    ItemID.SLAYER_RING_8,
                    ItemID.SLAYER_RING_7,
                    ItemID.SLAYER_RING_6,
                    ItemID.SLAYER_RING_5,
                    ItemID.SLAYER_RING_4,
                    ItemID.SLAYER_RING_3,
                    ItemID.SLAYER_RING_2,
                    ItemID.SLAYER_RING_1,
            };

    public static final int[] DIGSITE_PENDANT = new int[]
            {
                    ItemID.DIGSITE_PENDANT_5,
                    ItemID.DIGSITE_PENDANT_4,
                    ItemID.DIGSITE_PENDANT_3,
                    ItemID.DIGSITE_PENDANT_2,
                    ItemID.DIGSITE_PENDANT_1,
            };

    public static final int[] DRAKANS_MEDALLION = new int[]
            {
                    ItemID.DRAKANS_MEDALLION
            };

    public static final int[] SKILLS_NECKLACE = new int[]
            {
                    ItemID.SKILLS_NECKLACE6,
                    ItemID.SKILLS_NECKLACE5,
                    ItemID.SKILLS_NECKLACE4,
                    ItemID.SKILLS_NECKLACE3,
                    ItemID.SKILLS_NECKLACE2,
                    ItemID.SKILLS_NECKLACE1,
            };

    public static final int[] TELEPORT_CRYSTAL = new int[]
            {
                    ItemID.ETERNAL_TELEPORT_CRYSTAL,
                    ItemID.TELEPORT_CRYSTAL_5,
                    ItemID.TELEPORT_CRYSTAL_4,
                    ItemID.TELEPORT_CRYSTAL_5,
                    ItemID.TELEPORT_CRYSTAL_2,
                    ItemID.TELEPORT_CRYSTAL_1
            };

    public static final int[] ENCHANTED_LYRE = new int[]
            {
                    ItemID.ENCHANTED_LYREI,
                    ItemID.ENCHANTED_LYRE5,
                    ItemID.ENCHANTED_LYRE4,
                    ItemID.ENCHANTED_LYRE3,
                    ItemID.ENCHANTED_LYRE2,
                    ItemID.ENCHANTED_LYRE1
            };

}
