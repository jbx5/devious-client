package dev.hoot.api.movement.pathfinder;

import dev.hoot.api.game.Skills;
import dev.hoot.api.game.Vars;
import dev.hoot.api.game.Worlds;
import dev.hoot.api.magic.*;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;

public enum TeleportSpell
{
	TELEPORT_TO_HOUSE(
			Magic.SpellBook.REGULAR,
			Regular.TELEPORT_TO_HOUSE,
			40,
			null,
			true,
			"Teleport to House",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.AIR),
			new RuneRequirement(1, Rune.EARTH)),
	VARROCK_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.VARROCK_TELEPORT,
			25,
			new WorldPoint(3212, 3424, 0),
			false,
			"Varrock Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(3, Rune.AIR),
			new RuneRequirement(1, Rune.FIRE)),
	LUMBRIDGE_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.LUMBRIDGE_TELEPORT,
			31,
			new WorldPoint(3225, 3219, 0),
			false,
			"Lumbridge Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(3, Rune.AIR),
			new RuneRequirement(1, Rune.EARTH)),
	FALADOR_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.FALADOR_TELEPORT,
			37,
			new WorldPoint(2966, 3379, 0),
			false,
			"Falador Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(3, Rune.AIR),
			new RuneRequirement(1, Rune.WATER)),
	CAMELOT_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.CAMELOT_TELEPORT,
			45,
			new WorldPoint(2757, 3479, 0),
			true,
			"Camelot Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(5, Rune.AIR)),
	ARDOUGNE_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.ARDOUGNE_TELEPORT,
			51,
			new WorldPoint(2661, 3300, 0),
			true,
			"Ardougne Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.WATER)),
	WATCHTOWER_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.WATCHTOWER_TELEPORT,
			58,
			new WorldPoint(2931, 4717, 2),
			true,
			"Watchtower Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.EARTH)),
	TROLLHEIM_TELEPORT(
			Magic.SpellBook.REGULAR,
			Regular.TROLLHEIM_TELEPORT,
			61,
			new WorldPoint(2888, 367, 0),
			true,
			"Trollheim Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.FIRE)),
	TELEPORT_TO_KOUREND(
			Magic.SpellBook.REGULAR,
			Regular.TELEPORT_TO_KOUREND,
			69,
			new WorldPoint(1643, 3673, 0),
			true,
			"Kourend Castle Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(5, Rune.FIRE)),

	// ANCIENT TELEPORTS
	PADDEWWA_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.PADDEWWA_TELEPORT,
			54,
			new WorldPoint(3098, 9883, 0),
			true,
			"Paddewwa Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.AIR),
			new RuneRequirement(1, Rune.FIRE)),
	SENNTISTEN_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.SENNTISTEN_TELEPORT,
			60,
			new WorldPoint(3321, 3335, 0),
			true,
			"Senntisten Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.SOUL)),
	KHARYRLL_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.KHARYRLL_TELEPORT,
			66,
			new WorldPoint(3493, 3474, 0),
			true,
			"Kharyrll Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.BLOOD)),
	LASSAR_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.LASSAR_TELEPORT,
			72,
			new WorldPoint(3004, 3468, 0),
			true,
			"Lassar Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(4, Rune.WATER)),
	DAREEYAK_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.DAREEYAK_TELEPORT,
			78,
			null,
			true,
			"Dareeyak Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.AIR),
			new RuneRequirement(3, Rune.FIRE)),
	CARRALLANGER_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.CARRALLANGER_TELEPORT,
			84,
			null,
			true,
			"Carrallanger Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL)),
	ANNAKARL_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.ANNAKARL_TELEPORT,
			90,
			null,
			true,
			"Annakarl Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.BLOOD)),
	GHORROCK_TELEPORT(
			Magic.SpellBook.ANCIENT,
			Ancient.GHORROCK_TELEPORT,
			96,
			null,
			true,
			"Ghorrock Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(8, Rune.WATER)),

	// LUNAR TELEPORTS
	MOONCLAN_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.MOONCLAN_TELEPORT,
			Lunar.MOONCLAN_TELEPORT.getLevel(),
			new WorldPoint(2113, 3917, 0),
			true,
			"Moonclan Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(2, Rune.EARTH)),
	OURANIA_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.OURANIA_TELEPORT,
			Lunar.OURANIA_TELEPORT.getLevel(),
			new WorldPoint(2470, 3247, 0),
			true,
			"Ourania Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(6, Rune.EARTH)),
	WATERBIRTH_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.WATERBIRTH_TELEPORT,
			Lunar.WATERBIRTH_TELEPORT.getLevel(),
			new WorldPoint(2548, 3758, 0),
			true,
			"Waterbirth Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.WATER)),
	BARBARIAN_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.BARBARIAN_TELEPORT,
			Lunar.BARBARIAN_TELEPORT.getLevel(),
			new WorldPoint(2545, 3571, 0),
			true,
			"Barbarian Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(3, Rune.FIRE)),
	KHAZARD_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.KHAZARD_TELEPORT,
			Lunar.KHAZARD_TELEPORT.getLevel(),
			new WorldPoint(2637, 3168, 0),
			true,
			"Khazard Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(4, Rune.WATER)),
	FISHING_GUILD_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.FISHING_GUILD_TELEPORT,
			Lunar.FISHING_GUILD_TELEPORT.getLevel(),
			new WorldPoint(2610, 3389, 0),
			true,
			"Fishing Guild Teleport",
			new RuneRequirement(3, Rune.LAW),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(10, Rune.WATER)),
	CATHERBY_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.CATHERBY_TELEPORT,
			Lunar.CATHERBY_TELEPORT.getLevel(),
			new WorldPoint(2802, 3449, 0),
			true,
			"Catherby Teleport",
			new RuneRequirement(3, Rune.LAW),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(10, Rune.WATER)),
	ICE_PLATEAU_TELEPORT(
			Magic.SpellBook.LUNAR,
			Lunar.ICE_PLATEAU_TELEPORT,
			Lunar.ICE_PLATEAU_TELEPORT.getLevel(),
			null,
			true,
			"Ice Plateau Teleport",
			new RuneRequirement(3, Rune.LAW),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(8, Rune.WATER)),

	// NECROMANCY TELEPORTS

	ARCEUUS_HOME_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.ARCEUUS_HOME_TELEPORT,
			Necromancy.ARCEUUS_HOME_TELEPORT.getLevel(),
			new WorldPoint(1699, 3882, 0),
			true,
			"Arceuus Home Teleport"),
	ARCEUUS_LIBRARY_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.ARCEUUS_LIBRARY_TELEPORT,
			Necromancy.ARCEUUS_LIBRARY_TELEPORT.getLevel(),
			new WorldPoint(1634, 3836, 0),
			true,
			"Arceuus Library Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(2, Rune.EARTH)),
	DRAYNOR_MANOR_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.DRAYNOR_MANOR_TELEPORT,
			Necromancy.DRAYNOR_MANOR_TELEPORT.getLevel(),
			new WorldPoint(3109, 3352, 0),
			true,
			"Arceuus Library Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.EARTH),
			new RuneRequirement(1, Rune.WATER)),
	BATTLEFRONT_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.BATTLEFRONT_TELEPORT,
			Necromancy.BATTLEFRONT_TELEPORT.getLevel(),
			new WorldPoint(1350, 3740, 0),
			true,
			"Battlefront Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.EARTH),
			new RuneRequirement(1, Rune.FIRE)),
	MIND_ALTAR_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.MIND_ALTAR_TELEPORT,
			Necromancy.MIND_ALTAR_TELEPORT.getLevel(),
			new WorldPoint(2978, 3508, 0),
			true,
			"Mind Altar Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(2, Rune.MIND)),
	RESPAWN_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.RESPAWN_TELEPORT,
			Necromancy.RESPAWN_TELEPORT.getLevel(),
			new WorldPoint(3262, 6074, 0),
			true,
			"Respawn Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.SOUL)),
	SALVE_GRAVEYARD_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.SALVE_GRAVEYARD_TELEPORT,
			Necromancy.SALVE_GRAVEYARD_TELEPORT.getLevel(),
			new WorldPoint(3431, 3460, 0),
			true,
			"Salve Graveyard Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL)),
	FENKENSTRAINS_CASTLE_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.FENKENSTRAINS_CASTLE_TELEPORT,
			Necromancy.FENKENSTRAINS_CASTLE_TELEPORT.getLevel(),
			new WorldPoint(3546, 3528, 0),
			true,
			"Fenkenstrain's Castle Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.EARTH)),
	WEST_ARDOUGNE_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.WEST_ARDOUGNE_TELEPORT,
			Necromancy.WEST_ARDOUGNE_TELEPORT.getLevel(),
			new WorldPoint(2502, 3291, 0),
			true,
			"West Ardougne Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL)),
	HARMONY_ISLAND_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.HARMONY_ISLAND_TELEPORT,
			Necromancy.HARMONY_ISLAND_TELEPORT.getLevel(),
			new WorldPoint(3799, 2867, 0),
			true,
			"Harmony Island Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.NATURE)),
	CEMETERY_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.CEMETERY_TELEPORT,
			Necromancy.CEMETERY_TELEPORT.getLevel(),
			null,
			true,
			"Cemetery Teleport",
			new RuneRequirement(1, Rune.LAW),
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.BLOOD)),
	BARROWS_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.BARROWS_TELEPORT,
			Necromancy.BARROWS_TELEPORT.getLevel(),
			new WorldPoint(3563, 3313, 0),
			true,
			"Barrows Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(1, Rune.BLOOD)),
	APE_ATOLL_TELEPORT(
			Magic.SpellBook.NECROMANCY,
			Necromancy.APE_ATOLL_TELEPORT,
			Necromancy.APE_ATOLL_TELEPORT.getLevel(),
			new WorldPoint(2769, 9100, 0),
			true,
			"Ape Atoll Teleport",
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(2, Rune.BLOOD)),

	;

	private final Magic.SpellBook spellBook;
	private final Spell spell;
	private final int requiredLevel;
	private final WorldPoint point;
	private final boolean members;
	private final String spellName;
	private final RuneRequirement[] requirements;

	TeleportSpell(Magic.SpellBook spellBook, Spell spell, int level, WorldPoint point, boolean members, String spellName, RuneRequirement... requirements)
	{
		this.spellBook = spellBook;
		this.spell = spell;
		this.requiredLevel = level;
		this.point = point;
		this.members = members;
		this.spellName = spellName;
		this.requirements = requirements;
	}

	public Magic.SpellBook getSpellBook()
	{
		return spellBook;
	}

	public Spell getSpell()
	{
		return spell;
	}

	public int getRequiredLevel()
	{
		return requiredLevel;
	}

	public WorldPoint getPoint()
	{
		return point;
	}

	public boolean isMembers()
	{
		return members;
	}

	public String getSpellName()
	{
		return spellName;
	}

	public RuneRequirement[] getRequirements()
	{
		return requirements;
	}

	public boolean canCast()
	{
		if (Magic.SpellBook.getCurrent() != spellBook)
		{
			return false;
		}

		if (members && !Worlds.inMembersWorld())
		{
			return false;
		}

		if (requiredLevel > Skills.getLevel(Skill.MAGIC))
		{
			return false;
		}

		if (this == ARDOUGNE_TELEPORT && Vars.getVarp(165) < 30)
		{
			return false;
		}

		return haveRunesAvailable();
	}

	public boolean haveRunesAvailable()
	{
		for (RuneRequirement req : requirements)
		{
			if (!req.meetsRequirements())
			{
				return false;
			}
		}

		return true;
	}
}
