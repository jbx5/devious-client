package net.runelite.client.plugins.jrcbirdhouses.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.ItemID;

@RequiredArgsConstructor
@Getter
public enum SeedType
{
    // Hops
    BARLEY_SEED(ItemID.BARLEY_SEED, 10),
    HAMMERSTONE_SEED(ItemID.HAMMERSTONE_SEED, 10),
    ASGARNIAN_SEED(ItemID.ASGARNIAN_SEED, 10),
    JUTE_SEED(ItemID.JUTE_SEED, 10),
    YANILLIAN_SEED(ItemID.YANILLIAN_SEED, 10),
    KRANDORIAN_SEED(ItemID.KRANDORIAN_SEED, 10),
    WILDBLOOD_SEED(ItemID.WILDBLOOD_SEED, 5),

    // Herbs
    GUAM_SEED(ItemID.GUAM_SEED, 10),
    MARRENTILL_SEED(ItemID.MARRENTILL_SEED, 10),
    TARROMIN_SEED(ItemID.TARROMIN_SEED, 10),
    HARRALANDER_SEED(ItemID.HARRALANDER_SEED, 10),
    RANARR_SEED(ItemID.RANARR_SEED, 5),
    TOADFLAX_SEED(ItemID.TOADFLAX_SEED, 5),
    IRIT_SEED(ItemID.IRIT_SEED, 5),
    AVANTOE_SEED(ItemID.AVANTOE_SEED, 5),
    KWUARM_SEED(ItemID.KWUARM_SEED, 5),
    SNAPDRAGON_SEED(ItemID.SNAPDRAGON_SEED, 5),
    CADANTINE_SEED(ItemID.CADANTINE_SEED, 5),
    LANTADYME_SEED(ItemID.LANTADYME_SEED, 5),
    DWARF_WEED(ItemID.DWARF_WEED, 5),
    TORSTOL_SEED(ItemID.TORSTOL_SEED, 5);

    private final int itemId;
    private final int quantity;
}