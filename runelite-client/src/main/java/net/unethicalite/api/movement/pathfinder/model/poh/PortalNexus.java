package net.unethicalite.api.movement.pathfinder.model.poh;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
@AllArgsConstructor
public enum PortalNexus
{
    ARCEUUS_LIBRARY(new WorldPoint(1634, 3836, 0)),
    DRAYNOR_MANOR(new WorldPoint(3109, 3352, 0)),
    BATTLEFRONT(new WorldPoint(1350, 3740, 0)),
    VARROCK(new WorldPoint(3212, 3424, 0)),
    MIND_ALTAR(new WorldPoint(2978, 3508, 0)),
    LUMBRIDGE(new WorldPoint(3225, 3219, 0)),
    FALADOR(new WorldPoint(2966, 3379, 0)),
    SALVE_GRAVEYARD(new WorldPoint(3431, 3460, 0)),
    CAMELOT(new WorldPoint(2757, 3479, 0)),
    FENKENSTRAINS_CASTLE(new WorldPoint(3546, 3528, 0)),
    EAST_ARDOUGNE(new WorldPoint(2661, 3300, 0)),
    WATCHTOWER(new WorldPoint(2931, 4717, 2)),
    SENNTISTEN(new WorldPoint(3321, 3335, 0)),
    WEST_ARDOUGNE(new WorldPoint(2502, 3291, 0)),
    MARIM(new WorldPoint(2796, 2791, 0)),
    HARMONY_ISLAND(new WorldPoint(3799, 2867, 0)),
    KHARYRLL(new WorldPoint(3493, 3474, 0)),
    LUNAR_ISLE(new WorldPoint(2113, 3917, 0)),
    KOUREND(new WorldPoint(1643, 3673, 0)),
    CEMETERY(new WorldPoint(2978, 3763, 0)),
    WATERBIRTH_ISLAND(new WorldPoint(2548, 3758, 0)),
    BARROWS(new WorldPoint(3563, 3313, 0)),
    CARRALLANGAR(new WorldPoint(3157, 3667, 0)),
    FISHING_GUILD(new WorldPoint(2610, 3389, 0)),
    CATHERBY(new WorldPoint(2802, 3449, 0)),
    ANNAKARL(new WorldPoint(3288, 3888, 0)),
    APE_ATOLL_DUNGEON(new WorldPoint(2769, 9100, 0)),
    GHORROCK(new WorldPoint(2977, 3872, 0)),
    TROLL_STRONGHOLD(new WorldPoint(2844, 3693, 0)),
    WEISS(new WorldPoint(2846, 3940, 0)),
    ;

    private final WorldPoint destination;
}
