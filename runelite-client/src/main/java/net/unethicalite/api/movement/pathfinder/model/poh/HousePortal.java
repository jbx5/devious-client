package net.unethicalite.api.movement.pathfinder.model.poh;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@Getter
@AllArgsConstructor
public enum HousePortal
{
    ARCEUUS_LIBRARY(new WorldPoint(1634, 3836, 0), "Arceuus Library Portal", "Arceuus Library"),
    DRAYNOR_MANOR(new WorldPoint(3109, 3352, 0), "Draynor Manor Portal", "Draynor Manor"),
    BATTLEFRONT(new WorldPoint(1350, 3740, 0), "Battlefront Portal", "Battlefront"),
    VARROCK(new WorldPoint(3212, 3424, 0), "Varrock Portal", "Varrock"),
    MIND_ALTAR(new WorldPoint(2978, 3508, 0), "Mind Altar Portal", "Mind Altar"),
    LUMBRIDGE(new WorldPoint(3225, 3219, 0), "Lumbridge Portal", "Lumbridge"),
    FALADOR(new WorldPoint(2966, 3379, 0), "Falador Portal", "Falador"),
    SALVE_GRAVEYARD(new WorldPoint(3431, 3460, 0), "Salve Graveyard Portal", "Salve Graveyard"),
    CAMELOT(new WorldPoint(2757, 3479, 0), "Camelot Portal", "Camelot"),
    FENKENSTRAINS_CASTLE(new WorldPoint(3546, 3528, 0), "Fenkenstrain' Castle Portal", "Fenken' Castle"),
    EAST_ARDOUGNE(new WorldPoint(2661, 3300, 0), "Ardougne Portal", "Ardougne"),
    WATCHTOWER(new WorldPoint(2931, 4717, 2), "Yanille Watchtower Portal", "Watchtower"),
    SENNTISTEN(new WorldPoint(3321, 3335, 0), "Senntisten Portal", "Senntisten"),
    WEST_ARDOUGNE(new WorldPoint(2502, 3291, 0), "West Ardougne Portal", "West Ardougne"),
    MARIM(new WorldPoint(2796, 2791, 0), "Marim Portal", "Marim"),
    HARMONY_ISLAND(new WorldPoint(3799, 2867, 0), "Harmony Island Portal", "Harmony Island"),
    KHARYRLL(new WorldPoint(3493, 3474, 0), "Kharyrll Portal", "Kharyrll"),
    LUNAR_ISLE(new WorldPoint(2113, 3917, 0), "Lunar Isle Portal", "Lunar Isle"),
    KOUREND(new WorldPoint(1643, 3673, 0), "Kourend Portal", "Kourend Castle"),
    CEMETERY(new WorldPoint(2978, 3763, 0), "Cemetery Portal", "Cementry"),
    WATERBIRTH_ISLAND(new WorldPoint(2548, 3758, 0), "Waterbirth Island Portal", "Waterbirth Island"),
    BARROWS(new WorldPoint(3563, 3313, 0), "Barrows Portal", "Barrows"),
    CARRALLANGAR(new WorldPoint(3157, 3667, 0), "Carrallangar Portal", "Carrallangar"),
    FISHING_GUILD(new WorldPoint(2610, 3389, 0), "Fishing Guild Portal", "Fishing Guild"),
    CATHERBY(new WorldPoint(2802, 3449, 0), "Catherby Portal", "Catherby"),
    ANNAKARL(new WorldPoint(3288, 3888, 0), "Annakarl Portal", "Annakarl"),
    APE_ATOLL_DUNGEON(new WorldPoint(2769, 9100, 0), "Ape Atoll Dungeon Portal", "Ape Atoll Dungeon"),
    GHORROCK(new WorldPoint(2977, 3872, 0), "Ghorrock Portal", "Ghorrock"),
    TROLL_STRONGHOLD(new WorldPoint(2844, 3693, 0), "Troll Stronghold Portal", "Troll Stronghold"),
    WEISS(new WorldPoint(2846, 3940, 0), "Weiss Portal", "Weiss"),
    ;

    private final WorldPoint destination;
	private final String portalName;
	private final String nexusTarget;
}