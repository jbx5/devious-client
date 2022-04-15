package dev.unethicalite.api.magic;

import dev.unethicalite.api.game.Skills;
import dev.unethicalite.api.game.Worlds;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;

public enum Necromancy implements Spell
{
	// Teleport spells
	ARCEUUS_HOME_TELEPORT(
			1,
			WidgetInfo.SPELL_ARCEUUS_HOME_TELEPORT
	),
	ARCEUUS_LIBRARY_TELEPORT(
			6,
			WidgetInfo.SPELL_ARCEUUS_LIBRARY_TELEPORT,
			new RuneRequirement(2, Rune.EARTH),
			new RuneRequirement(1, Rune.LAW)
	),
	DRAYNOR_MANOR_TELEPORT(
			17,
			WidgetInfo.SPELL_DRAYNOR_MANOR_TELEPORT,
			new RuneRequirement(1, Rune.EARTH),
			new RuneRequirement(1, Rune.WATER),
			new RuneRequirement(1, Rune.LAW)
	),
	BATTLEFRONT_TELEPORT(
			23,
			WidgetInfo.SPELL_BATTLEFRONT_TELEPORT,
			new RuneRequirement(1, Rune.EARTH),
			new RuneRequirement(1, Rune.FIRE),
			new RuneRequirement(1, Rune.LAW)
	),
	MIND_ALTAR_TELEPORT(
			28,
			WidgetInfo.SPELL_MIND_ALTAR_TELEPORT,
			new RuneRequirement(2, Rune.MIND),
			new RuneRequirement(1, Rune.LAW)
	),
	RESPAWN_TELEPORT(
			34,
			WidgetInfo.SPELL_RESPAWN_TELEPORT,
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.LAW)
	),
	SALVE_GRAVEYARD_TELEPORT(
			40,
			WidgetInfo.SPELL_SALVE_GRAVEYARD_TELEPORT,
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(1, Rune.LAW)
	),
	FENKENSTRAINS_CASTLE_TELEPORT(
			48,
			WidgetInfo.SPELL_FENKENSTRAINS_CASTLE_TELEPORT,
			new RuneRequirement(1, Rune.EARTH),
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.LAW)
	),
	WEST_ARDOUGNE_TELEPORT(
			61,
			WidgetInfo.SPELL_WEST_ARDOUGNE_TELEPORT,
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(2, Rune.LAW)
	),
	HARMONY_ISLAND_TELEPORT(
			65,
			WidgetInfo.SPELL_HARMONY_ISLAND_TELEPORT,
			new RuneRequirement(1, Rune.NATURE),
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.LAW)
	),
	CEMETERY_TELEPORT(
			71,
			WidgetInfo.SPELL_CEMETERY_TELEPORT,
			new RuneRequirement(1, Rune.BLOOD),
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.LAW)
	),
	BARROWS_TELEPORT(
			83,
			WidgetInfo.SPELL_BARROWS_TELEPORT,
			new RuneRequirement(1, Rune.BLOOD),
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(2, Rune.LAW)
	),
	APE_ATOLL_TELEPORT(
			90,
			WidgetInfo.SPELL_APE_ATOLL_TELEPORT,
			new RuneRequirement(2, Rune.BLOOD),
			new RuneRequirement(2, Rune.SOUL),
			new RuneRequirement(2, Rune.LAW)
	),

	// Combat spells
	GHOSTLY_GRASP(
			35,
			WidgetInfo.SPELL_GHOSTLY_GRASP,
			new RuneRequirement(4, Rune.AIR),
			new RuneRequirement(1, Rune.CHAOS)
	),
	SKELETAL_GRASP(
			56,
			WidgetInfo.SPELL_SKELETAL_GRASP,
			new RuneRequirement(8, Rune.EARTH),
			new RuneRequirement(1, Rune.DEATH)
	),
	UNDEAD_GRASP(
			79,
			WidgetInfo.SPELL_UNDEAD_GRASP,
			new RuneRequirement(12, Rune.FIRE),
			new RuneRequirement(1, Rune.BLOOD)
	),
	INFERIOR_DEMONBANE(
			44,
			WidgetInfo.SPELL_INFERIOR_DEMONBANE,
			new RuneRequirement(4, Rune.FIRE),
			new RuneRequirement(1, Rune.CHAOS)
	),
	SUPERIOR_DEMONBANE(
			62,
			WidgetInfo.SPELL_SUPERIOR_DEMONBANE,
			new RuneRequirement(8, Rune.FIRE),
			new RuneRequirement(1, Rune.SOUL)
	),
	DARK_DEMONBANE(
			82,
			WidgetInfo.SPELL_DARK_DEMONBANE,
			new RuneRequirement(12, Rune.FIRE),
			new RuneRequirement(2, Rune.SOUL)
	),
	LESSER_CORRUPTION(
			64,
			WidgetInfo.SPELL_LESSER_CORRUPTION,
			new RuneRequirement(1, Rune.DEATH),
			new RuneRequirement(2, Rune.SOUL)
	),
	GREATER_CORRUPTION(
			85,
			WidgetInfo.SPELL_GREATER_CORRUPTION,
			new RuneRequirement(1, Rune.BLOOD),
			new RuneRequirement(3, Rune.SOUL)
	),
	RESURRECT_LESSER_GHOST(
			38,
			WidgetInfo.SPELL_RESURRECT_LESSER_GHOST,
			new RuneRequirement(10, Rune.AIR),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.MIND)
	),
	RESURRECT_LESSER_SKELETON(
			38,
			WidgetInfo.SPELL_RESURRECT_LESSER_SKELETON,
			new RuneRequirement(10, Rune.AIR),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.MIND)
	),
	RESURRECT_LESSER_ZOMBIE(
			38,
			WidgetInfo.SPELL_RESURRECT_LESSER_ZOMBIE,
			new RuneRequirement(10, Rune.AIR),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.MIND)
	),
	RESURRECT_SUPERIOR_GHOST(
			57,
			WidgetInfo.SPELL_RESURRECT_SUPERIOR_GHOST,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.DEATH)
	),
	RESURRECT_SUPERIOR_SKELETON(
			57,
			WidgetInfo.SPELL_RESURRECT_SUPERIOR_SKELETON,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.DEATH)
	),
	RESURRECT_SUPERIOR_ZOMBIE(
			57,
			WidgetInfo.SPELL_RESURRECT_SUPERIOR_ZOMBIE,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.DEATH)
	),
	RESURRECT_GREATER_GHOST(
			76,
			WidgetInfo.SPELL_RESURRECT_GREATER_GHOST,
			new RuneRequirement(10, Rune.FIRE),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.BLOOD)
	),
	RESURRECT_GREATER_SKELETON(
			76,
			WidgetInfo.SPELL_RESURRECT_GREATER_SKELETON,
			new RuneRequirement(10, Rune.FIRE),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.BLOOD)
	),
	RESURRECT_GREATER_ZOMBIE(
			76,
			WidgetInfo.SPELL_RESURRECT_GREATER_ZOMBIE,
			new RuneRequirement(10, Rune.FIRE),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(5, Rune.BLOOD)
	),
	DARK_LURE(
			50,
			WidgetInfo.SPELL_DARK_LURE,
			new RuneRequirement(1, Rune.DEATH),
			new RuneRequirement(1, Rune.NATURE)
	),
	MARK_OF_DARKNESS(
			59,
			WidgetInfo.SPELL_MARK_OF_DARKNESS,
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(1, Rune.SOUL)
	),
	WARD_OF_ARCEUUS(
			73,
			WidgetInfo.SPELL_WARD_OF_ARCEUUS,
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(2, Rune.NATURE),
			new RuneRequirement(4, Rune.SOUL)
	),

	// Utility spells
	BASIC_REANIMATION(
			16,
			WidgetInfo.SPELL_BASIC_REANIMATION,
			new RuneRequirement(4, Rune.BODY),
			new RuneRequirement(2, Rune.NATURE)
	),
	ADEPT_REANIMATION(
			41,
			WidgetInfo.SPELL_ADEPT_REANIMATION,
			new RuneRequirement(4, Rune.BODY),
			new RuneRequirement(3, Rune.NATURE),
			new RuneRequirement(1, Rune.SOUL)
	),
	EXPERT_REANIMATION(
			72,
			WidgetInfo.SPELL_EXPERT_REANIMATION,
			new RuneRequirement(1, Rune.BLOOD),
			new RuneRequirement(3, Rune.NATURE),
			new RuneRequirement(2, Rune.SOUL)
	),
	MASTER_REANIMATION(
			90,
			WidgetInfo.SPELL_MASTER_REANIMATION,
			new RuneRequirement(2, Rune.BLOOD),
			new RuneRequirement(4, Rune.NATURE),
			new RuneRequirement(4, Rune.SOUL)
	),
	DEMONIC_OFFERING(
			84,
			WidgetInfo.SPELL_DEMONIC_OFFERING,
			new RuneRequirement(1, Rune.SOUL),
			new RuneRequirement(1, Rune.WRATH)
	),
	SINISTER_OFFERING(
			92,
			WidgetInfo.SPELL_SINISTER_OFFERING,
			new RuneRequirement(1, Rune.BLOOD),
			new RuneRequirement(1, Rune.WRATH)
	),
	SHADOW_VEIL(
			47,
			WidgetInfo.SPELL_SHADOW_VEIL,
			new RuneRequirement(5, Rune.EARTH),
			new RuneRequirement(5, Rune.FIRE),
			new RuneRequirement(5, Rune.COSMIC)
	),
	VILE_VIGOUR(
			66,
			WidgetInfo.SPELL_VILE_VIGOUR,
			new RuneRequirement(3, Rune.AIR),
			new RuneRequirement(1, Rune.SOUL)
	),
	DEGRIME(
			70,
			WidgetInfo.SPELL_DEGRIME,
			new RuneRequirement(4, Rune.EARTH),
			new RuneRequirement(2, Rune.NATURE)
	),
	RESURRECT_CROPS(
			78,
			WidgetInfo.SPELL_RESURRECT_CROPS,
			new RuneRequirement(25, Rune.EARTH),
			new RuneRequirement(8, Rune.BLOOD),
			new RuneRequirement(12, Rune.NATURE),
			new RuneRequirement(8, Rune.SOUL)
	),
	DEATH_CHARGE(
			80,
			WidgetInfo.SPELL_DEATH_CHARGE,
			new RuneRequirement(1, Rune.BLOOD),
			new RuneRequirement(1, Rune.DEATH),
			new RuneRequirement(1, Rune.SOUL)
	),
	;

	private final int level;
	private final WidgetInfo widgetInfo;
	private final RuneRequirement[] requirements;

	Necromancy(int level, WidgetInfo widgetInfo, RuneRequirement... requirements)
	{
		this.level = level;
		this.widgetInfo = widgetInfo;
		this.requirements = requirements;
	}

	@Override
	public int getLevel()
	{
		return level;
	}

	@Override
	public WidgetInfo getWidget()
	{
		return widgetInfo;
	}

	public boolean canCast()
	{
		if (Magic.SpellBook.getCurrent() != Magic.SpellBook.NECROMANCY)
		{
			return false;
		}

		if (!Worlds.inMembersWorld())
		{
			return false;
		}

		if (level > Skills.getLevel(Skill.MAGIC) || level > Skills.getBoostedLevel(Skill.MAGIC))
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
