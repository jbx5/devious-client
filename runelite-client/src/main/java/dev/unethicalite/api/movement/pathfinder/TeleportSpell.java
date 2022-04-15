package dev.unethicalite.api.movement.pathfinder;

import dev.unethicalite.api.magic.Ancient;
import dev.unethicalite.api.magic.Lunar;
import dev.unethicalite.api.magic.Necromancy;
import dev.unethicalite.api.magic.Regular;
import dev.unethicalite.api.magic.Spell;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

@AllArgsConstructor
@Getter
public enum TeleportSpell
{
	TELEPORT_TO_HOUSE(
			Regular.TELEPORT_TO_HOUSE,
			null
	),
	VARROCK_TELEPORT(
			Regular.VARROCK_TELEPORT,
			new WorldPoint(3212, 3424, 0)
	),
	LUMBRIDGE_TELEPORT(
			Regular.LUMBRIDGE_TELEPORT,
			new WorldPoint(3225, 3219, 0)
	),
	FALADOR_TELEPORT(
			Regular.FALADOR_TELEPORT,
			new WorldPoint(2966, 3379, 0)
	),
	CAMELOT_TELEPORT(
			Regular.CAMELOT_TELEPORT,
			new WorldPoint(2757, 3479, 0)
	),
	ARDOUGNE_TELEPORT(
			Regular.ARDOUGNE_TELEPORT,
			new WorldPoint(2661, 3300, 0)
	),
	WATCHTOWER_TELEPORT(
			Regular.WATCHTOWER_TELEPORT,
			new WorldPoint(2931, 4717, 2)
	),
	TROLLHEIM_TELEPORT(
			Regular.TROLLHEIM_TELEPORT,
			new WorldPoint(2888, 367, 0)
	),
	TELEPORT_TO_KOUREND(
			Regular.TELEPORT_TO_KOUREND,
			new WorldPoint(1643, 3673, 0)
	),

	// ANCIENT TELEPORTS
	PADDEWWA_TELEPORT(
			Ancient.PADDEWWA_TELEPORT,
			new WorldPoint(3098, 9883, 0)
	),
	SENNTISTEN_TELEPORT(
			Ancient.SENNTISTEN_TELEPORT,
			new WorldPoint(3321, 3335, 0)
	),
	KHARYRLL_TELEPORT(
			Ancient.KHARYRLL_TELEPORT,
			new WorldPoint(3493, 3474, 0)
	),
	LASSAR_TELEPORT(
			Ancient.LASSAR_TELEPORT,
			new WorldPoint(3004, 3468, 0)
	),
	DAREEYAK_TELEPORT(
			Ancient.DAREEYAK_TELEPORT,
			null
	),
	CARRALLANGER_TELEPORT(
			Ancient.CARRALLANGER_TELEPORT,
			null
	),
	ANNAKARL_TELEPORT(
			Ancient.ANNAKARL_TELEPORT,
			null
	),
	GHORROCK_TELEPORT(
			Ancient.GHORROCK_TELEPORT,
			null
	),

	// LUNAR TELEPORTS
	MOONCLAN_TELEPORT(
			Lunar.MOONCLAN_TELEPORT,
			new WorldPoint(2113, 3917, 0)
	),
	OURANIA_TELEPORT(
			Lunar.OURANIA_TELEPORT,
			new WorldPoint(2470, 3247, 0)),
	WATERBIRTH_TELEPORT(
			Lunar.WATERBIRTH_TELEPORT,
			new WorldPoint(2548, 3758, 0)
	),
	BARBARIAN_TELEPORT(
			Lunar.BARBARIAN_TELEPORT,
			new WorldPoint(2545, 3571, 0)
	),
	KHAZARD_TELEPORT(
			Lunar.KHAZARD_TELEPORT,
			new WorldPoint(2637, 3168, 0)
	),
	FISHING_GUILD_TELEPORT(
			Lunar.FISHING_GUILD_TELEPORT,
			new WorldPoint(2610, 3389, 0)
	),
	CATHERBY_TELEPORT(
			Lunar.CATHERBY_TELEPORT,
			new WorldPoint(2802, 3449, 0)
	),
	ICE_PLATEAU_TELEPORT(
			Lunar.ICE_PLATEAU_TELEPORT,
			null
	),

	// NECROMANCY TELEPORTS

	ARCEUUS_HOME_TELEPORT(
			Necromancy.ARCEUUS_HOME_TELEPORT,
			new WorldPoint(1699, 3882, 0)
	),
	ARCEUUS_LIBRARY_TELEPORT(
			Necromancy.ARCEUUS_LIBRARY_TELEPORT,
			new WorldPoint(1634, 3836, 0)
	),
	DRAYNOR_MANOR_TELEPORT(
			Necromancy.DRAYNOR_MANOR_TELEPORT,
			new WorldPoint(3109, 3352, 0)
	),
	BATTLEFRONT_TELEPORT(
			Necromancy.BATTLEFRONT_TELEPORT,
			new WorldPoint(1350, 3740, 0)
	),
	MIND_ALTAR_TELEPORT(
			Necromancy.MIND_ALTAR_TELEPORT,
			new WorldPoint(2978, 3508, 0)
	),
	RESPAWN_TELEPORT(
			Necromancy.RESPAWN_TELEPORT,
			new WorldPoint(3262, 6074, 0)
	),
	SALVE_GRAVEYARD_TELEPORT(
			Necromancy.SALVE_GRAVEYARD_TELEPORT,
			new WorldPoint(3431, 3460, 0)
	),
	FENKENSTRAINS_CASTLE_TELEPORT(
			Necromancy.FENKENSTRAINS_CASTLE_TELEPORT,
			new WorldPoint(3546, 3528, 0)
	),
	WEST_ARDOUGNE_TELEPORT(
			Necromancy.WEST_ARDOUGNE_TELEPORT,
			new WorldPoint(2502, 3291, 0)
	),
	HARMONY_ISLAND_TELEPORT(
			Necromancy.HARMONY_ISLAND_TELEPORT,
			new WorldPoint(3799, 2867, 0)
	),
	CEMETERY_TELEPORT(
			Necromancy.CEMETERY_TELEPORT,
			null
	),
	BARROWS_TELEPORT(
			Necromancy.BARROWS_TELEPORT,
			new WorldPoint(3563, 3313, 0)
	),
	APE_ATOLL_TELEPORT(
			Necromancy.APE_ATOLL_TELEPORT,
			new WorldPoint(2769, 9100, 0)
	),
	;

	private final Spell spell;
	private final WorldPoint point;

	public boolean canCast()
	{
		return spell.canCast();
	}
}
