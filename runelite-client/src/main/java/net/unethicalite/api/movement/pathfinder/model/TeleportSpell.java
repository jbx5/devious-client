package net.unethicalite.api.movement.pathfinder.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@AllArgsConstructor
@Getter
public enum TeleportSpell
{
	LUMBRIDGE_HOME_TELEPORT(
			SpellBook.Standard.HOME_TELEPORT,
			new WorldPoint(3225, 3219, 0)
	),
	TELEPORT_TO_HOUSE(
			SpellBook.Standard.TELEPORT_TO_HOUSE,
			MovementConstants.HOUSE_POINT()
	),
	VARROCK_TELEPORT(
			SpellBook.Standard.VARROCK_TELEPORT,
			new WorldPoint(3212, 3424, 0)
	),
	LUMBRIDGE_TELEPORT(
			SpellBook.Standard.LUMBRIDGE_TELEPORT,
			new WorldPoint(3225, 3219, 0)
	),
	FALADOR_TELEPORT(
			SpellBook.Standard.FALADOR_TELEPORT,
			new WorldPoint(2966, 3379, 0)
	),
	CAMELOT_TELEPORT(
			SpellBook.Standard.CAMELOT_TELEPORT,
			new WorldPoint(2757, 3479, 0)
	),
	ARDOUGNE_TELEPORT(
			SpellBook.Standard.ARDOUGNE_TELEPORT,
			new WorldPoint(2661, 3300, 0)
	),
	WATCHTOWER_TELEPORT(
			SpellBook.Standard.WATCHTOWER_TELEPORT,
			new WorldPoint(2931, 4717, 2)
	),
	TROLLHEIM_TELEPORT(
			SpellBook.Standard.TROLLHEIM_TELEPORT,
			new WorldPoint(2888, 367, 0)
	),
	TELEPORT_TO_KOUREND(
			SpellBook.Standard.TELEPORT_TO_KOUREND,
			new WorldPoint(1643, 3673, 0)
	),
	TELEPORT_TO_APE_ATOLL(
			SpellBook.Standard.TELEPORT_TO_APE_ATOLL,
			new WorldPoint(2796, 2791, 0)
	),

	// ANCIENT TELEPORTS
	EDGEVILLE_HOME_TELEPORT(
			SpellBook.Ancient.EDGEVILLE_HOME_TELEPORT,
			new WorldPoint(3087, 3496, 0)
	),
	PADDEWWA_TELEPORT(
			SpellBook.Ancient.PADDEWWA_TELEPORT,
			new WorldPoint(3098, 9883, 0)
	),
	SENNTISTEN_TELEPORT(
			SpellBook.Ancient.SENNTISTEN_TELEPORT,
			new WorldPoint(3321, 3335, 0)
	),
	KHARYRLL_TELEPORT(
			SpellBook.Ancient.KHARYRLL_TELEPORT,
			new WorldPoint(3493, 3474, 0)
	),
	LASSAR_TELEPORT(
			SpellBook.Ancient.LASSAR_TELEPORT,
			new WorldPoint(3004, 3468, 0)
	),
	DAREEYAK_TELEPORT(
			SpellBook.Ancient.DAREEYAK_TELEPORT,
			new WorldPoint(2969, 3695, 0)
	),
	CARRALLANGER_TELEPORT(
			SpellBook.Ancient.CARRALLANGER_TELEPORT,
			new WorldPoint(3157, 3667, 0)
	),
	ANNAKARL_TELEPORT(
			SpellBook.Ancient.ANNAKARL_TELEPORT,
			new WorldPoint(3288, 3888, 0)
	),
	GHORROCK_TELEPORT(
			SpellBook.Ancient.GHORROCK_TELEPORT,
			new WorldPoint(2977, 3872, 0)
	),

	// LUNAR TELEPORTS
	LUNAR_HOME_TELEPORT(
			SpellBook.Lunar.LUNAR_HOME_TELEPORT,
			new WorldPoint(2094, 3914, 0)
	),
	MOONCLAN_TELEPORT(
			SpellBook.Lunar.MOONCLAN_TELEPORT,
			new WorldPoint(2113, 3917, 0)
	),
	OURANIA_TELEPORT(
			SpellBook.Lunar.OURANIA_TELEPORT,
			new WorldPoint(2470, 3247, 0)),
	WATERBIRTH_TELEPORT(
			SpellBook.Lunar.WATERBIRTH_TELEPORT,
			new WorldPoint(2548, 3758, 0)
	),
	BARBARIAN_TELEPORT(
			SpellBook.Lunar.BARBARIAN_TELEPORT,
			new WorldPoint(2545, 3571, 0)
	),
	KHAZARD_TELEPORT(
			SpellBook.Lunar.KHAZARD_TELEPORT,
			new WorldPoint(2637, 3168, 0)
	),
	FISHING_GUILD_TELEPORT(
			SpellBook.Lunar.FISHING_GUILD_TELEPORT,
			new WorldPoint(2610, 3389, 0)
	),
	CATHERBY_TELEPORT(
			SpellBook.Lunar.CATHERBY_TELEPORT,
			new WorldPoint(2802, 3449, 0)
	),
	ICE_PLATEAU_TELEPORT(
			SpellBook.Lunar.ICE_PLATEAU_TELEPORT,
			new WorldPoint(2973, 3939, 0)
	),

	// NECROMANCY TELEPORTS
	ARCEUUS_HOME_TELEPORT(
			SpellBook.Necromancy.ARCEUUS_HOME_TELEPORT,
			new WorldPoint(1699, 3882, 0)
	),
	ARCEUUS_LIBRARY_TELEPORT(
			SpellBook.Necromancy.ARCEUUS_LIBRARY_TELEPORT,
			new WorldPoint(1634, 3836, 0)
	),
	DRAYNOR_MANOR_TELEPORT(
			SpellBook.Necromancy.DRAYNOR_MANOR_TELEPORT,
			new WorldPoint(3109, 3352, 0)
	),
	BATTLEFRONT_TELEPORT(
			SpellBook.Necromancy.BATTLEFRONT_TELEPORT,
			new WorldPoint(1350, 3740, 0)
	),
	MIND_ALTAR_TELEPORT(
			SpellBook.Necromancy.MIND_ALTAR_TELEPORT,
			new WorldPoint(2978, 3508, 0)
	),
	RESPAWN_TELEPORT(
			SpellBook.Necromancy.RESPAWN_TELEPORT,
			new WorldPoint(3262, 6074, 0)
	),
	SALVE_GRAVEYARD_TELEPORT(
			SpellBook.Necromancy.SALVE_GRAVEYARD_TELEPORT,
			new WorldPoint(3431, 3460, 0)
	),
	FENKENSTRAINS_CASTLE_TELEPORT(
			SpellBook.Necromancy.FENKENSTRAINS_CASTLE_TELEPORT,
			new WorldPoint(3546, 3528, 0)
	),
	WEST_ARDOUGNE_TELEPORT(
			SpellBook.Necromancy.WEST_ARDOUGNE_TELEPORT,
			new WorldPoint(2502, 3291, 0)
	),
	HARMONY_ISLAND_TELEPORT(
			SpellBook.Necromancy.HARMONY_ISLAND_TELEPORT,
			new WorldPoint(3799, 2867, 0)
	),
	CEMETERY_TELEPORT(
			SpellBook.Necromancy.CEMETERY_TELEPORT,
			new WorldPoint(2978, 3763, 0)
	),
	BARROWS_TELEPORT(
			SpellBook.Necromancy.BARROWS_TELEPORT,
			new WorldPoint(3563, 3313, 0)
	),
	APE_ATOLL_TELEPORT(
			SpellBook.Necromancy.APE_ATOLL_TELEPORT,
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
