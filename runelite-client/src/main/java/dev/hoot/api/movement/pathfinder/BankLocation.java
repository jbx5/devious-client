package dev.hoot.api.movement.pathfinder;

import dev.hoot.api.movement.Movement;
import net.runelite.api.coords.WorldArea;

import java.util.Arrays;
import java.util.Comparator;

public enum BankLocation {
    LUMBRIDGE_BANK(new WorldArea(3207, 3215, 4, 8, 2)),
    VARROCK_WEST_BANK(new WorldArea(3180, 3433, 6, 15, 0)),
    VARROCK_EAST_BANK(new WorldArea(3250, 3419, 8, 6, 0)),
    GRAND_EXCHANGE_BANK(new WorldArea(3154, 3480, 22, 22, 0)),
    EDGEVILLE_BANK(new WorldArea(3091, 3488, 8, 12, 0)),
    FALADOR_EAST_BANK(new WorldArea(3009, 3355, 13, 4, 0)),
    FALADOR_WEST_BANK(new WorldArea(2943, 3368, 7, 6, 0)),
    DRAYNOR_BANK(new WorldArea(3092, 3240, 6, 7, 0)),
    DUEL_ARENA_BANK(new WorldArea(3380, 3267, 5, 7, 0)),
    SHANTAY_PASS_BANK(new WorldArea(3299, 3118, 11, 10, 0)),
    AL_KHARID_BANK(new WorldArea(3269, 3161, 4, 13, 0)),
    CATHERBY_BANK(new WorldArea(2806, 3438, 7, 4, 0)),
    SEERS_VILLAGE_BANK(new WorldArea(2721, 3487, 10, 7, 0)),
    ARDOUGNE_NORTH_BANK(new WorldArea(2612, 3330, 10, 6, 0)),
    ARDOUGNE_SOUTH_BANK(new WorldArea(2649, 3280, 7, 8, 0)),
    PORT_KHAZARD_BANK(new WorldArea(2658, 3156, 7, 9, 0)),
    YANILLE_BANK(new WorldArea(2609, 3088, 6, 10, 0)),
    CORSAIR_COVE_BANK(new WorldArea(2567, 2862, 7, 7, 0)),
    CASTLE_WARS_BANK(new WorldArea(2435, 3081, 12, 18, 0)),
    LLETYA_BANK(new WorldArea(2349, 3160, 8, 7, 0)),
    GRAND_TREE_WEST_BANK(new WorldArea(2436, 3484, 9, 8, 1)),
    GRAND_TREE_SOUTH_BANK(new WorldArea(2446, 3476, 8, 8, 1)),
    TREE_GNOME_STRONGHOLD_BANK(new WorldArea(2441, 3414, 11, 23, 1)),
    SHILO_VILLAGE_BANK(new WorldArea(2842, 2951, 20, 8, 0)),
    NEITIZNOT_BANK(new WorldArea(2334, 3805, 6, 2, 0)),
    JATIZSO_BANK(new WorldArea(2413, 3798, 7, 7, 0)),
    BARBARIAN_OUTPOST_BANK(new WorldArea(2532, 3570, 6, 10, 0)),
    ETCETERIA_BANK(new WorldArea(2618, 3893, 4, 4, 0)),
    DARKMEYER_BANK(new WorldArea(3601, 3365, 9, 3, 0)),
    CHARCOAL_BURNERS_BANK(new WorldArea(1711, 3460, 14, 10, 0)),
    HOSIDIUS_BANK(new WorldArea(1748, 3594, 5, 8, 0)),
    PORT_PISCARILIUS_BANK(new WorldArea(1794, 3784, 18, 7, 0)),
    HALLOWED_SEPULCHRE_BANK(new WorldArea(2393, 5975, 15, 15, 0)),
    CANIFIS_BANK(new WorldArea(3508, 3474, 6, 10, 0)),
    BURGH_DE_ROTT_BANK(new WorldArea(3492, 3208, 10, 6, 0)),
    VER_SINHAZA_BANK(new WorldArea(3646, 3204, 10, 13, 0));

    private final WorldArea area;

    BankLocation(WorldArea area) {
        this.area = area;
    }

    public WorldArea getArea() {
        return area;
    }

    public static BankLocation getNearest() {
        return getNearest(false);
    }

    public static BankLocation getNearest(boolean localRegion) {
        return Arrays.stream(values())
                .min(Comparator.comparingInt(x -> Movement.calculateDistance(x.getArea().toWorldPoint(), localRegion)))
                .orElse(null);
    }
}
