package dev.hoot.api.magic;

import dev.hoot.api.game.Skills;
import dev.hoot.api.game.Worlds;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;

public enum Lunar implements Spell
{
	// Teleport spells
	LUNAR_HOME_TELEPORT(
			0,
			WidgetInfo.SPELL_LUNAR_HOME_TELEPORT
	),
	MOONCLAN_TELEPORT(
			69,
			WidgetInfo.SPELL_MOONCLAN_TELEPORT,
			new RuneRequirement(2, Rune.EARTH),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	TELE_GROUP_MOONCLAN(
			70,
			WidgetInfo.SPELL_TELE_GROUP_MOONCLAN,
			new RuneRequirement(4, Rune.EARTH),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	OURANIA_TELEPORT(
			71,
			WidgetInfo.SPELL_OURANIA_TELEPORT,
			new RuneRequirement(6, Rune.EARTH),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	WATERBIRTH_TELEPORT(
			72,
			WidgetInfo.SPELL_WATERBIRTH_TELEPORT,
			new RuneRequirement(1, Rune.WATER),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	TELE_GROUP_WATERBIRTH(
			73,
			WidgetInfo.SPELL_TELE_GROUP_WATERBIRTH,
			new RuneRequirement(5, Rune.WATER),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	BARBARIAN_TELEPORT(
			75,
			WidgetInfo.SPELL_BARBARIAN_TELEPORT,
			new RuneRequirement(3, Rune.FIRE),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(2, Rune.LAW)
	),
	TELE_GROUP_BARBARIAN(
			76,
			WidgetInfo.SPELL_TELE_GROUP_BARBARIAN,
			new RuneRequirement(6, Rune.FIRE),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(2, Rune.LAW)
	),
	KHAZARD_TELEPORT(
			78,
			WidgetInfo.SPELL_KHAZARD_TELEPORT,
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(2, Rune.LAW)
	),
	TELE_GROUP_KHAZARD(
			79,
			WidgetInfo.SPELL_TELE_GROUP_KHAZARD,
			new RuneRequirement(8, Rune.WATER),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(2, Rune.LAW)
	),
	FISHING_GUILD_TELEPORT(
			85,
			WidgetInfo.SPELL_FISHING_GUILD_TELEPORT,
			new RuneRequirement(10, Rune.WATER),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW)
	),
	TELE_GROUP_FISHING_GUILD(
			86,
			WidgetInfo.SPELL_TELE_GROUP_FISHING_GUILD,
			new RuneRequirement(14, Rune.WATER),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW)
	),
	CATHERBY_TELEPORT(
			87,
			WidgetInfo.SPELL_CATHERBY_TELEPORT,
			new RuneRequirement(10, Rune.WATER),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW)
	),
	TELE_GROUP_CATHERBY(
			88,
			WidgetInfo.SPELL_TELE_GROUP_CATHERBY,
			new RuneRequirement(15, Rune.WATER),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW)
	),
	ICE_PLATEAU_TELEPORT(
			89,
			WidgetInfo.SPELL_ICE_PLATEAU_TELEPORT,
			new RuneRequirement(8, Rune.WATER),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW)
	),
	TELE_GROUP_ICE_PLATEAU(
			90,
			WidgetInfo.SPELL_TELE_GROUP_ICE_PLATEAU,
			new RuneRequirement(16, Rune.WATER),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW)
	),

	// Combat spells
	MONSTER_EXAMINE(
			66,
			WidgetInfo.SPELL_MONSTER_EXAMINE,
			new RuneRequirement(1, Rune.MIND),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(1, Rune.ASTRAL)
	),
	CURE_OTHER(
			66,
			WidgetInfo.SPELL_CURE_OTHER,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(1, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	CURE_ME(
			66,
			WidgetInfo.SPELL_CURE_ME,
			new RuneRequirement(2, Rune.COSMIC),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	CURE_GROUP(
			66,
			WidgetInfo.SPELL_CURE_GROUP,
			new RuneRequirement(2, Rune.COSMIC),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(2, Rune.LAW)
	),
	STAT_SPY(
			66,
			WidgetInfo.SPELL_STAT_SPY,
			new RuneRequirement(5, Rune.BODY),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	DREAM(
			66,
			WidgetInfo.SPELL_DREAM,
			new RuneRequirement(5, Rune.BODY),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	STAT_RESTORE_POT_SHARE(
			66,
			WidgetInfo.SPELL_STAT_RESTORE_POT_SHARE,
			new RuneRequirement(10, Rune.WATER),
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	BOOST_POTION_SHARE(
			66,
			WidgetInfo.SPELL_BOOST_POTION_SHARE,
			new RuneRequirement(10, Rune.WATER),
			new RuneRequirement(12, Rune.EARTH),
			new RuneRequirement(3, Rune.ASTRAL)
	),
	ENERGY_TRANSFER(
			66,
			WidgetInfo.SPELL_ENERGY_TRANSFER,
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(1, Rune.NATURE),
			new RuneRequirement(2, Rune.LAW)
	),
	HEAL_OTHER(
			66,
			WidgetInfo.SPELL_HEAL_OTHER,
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.LAW),
			new RuneRequirement(1, Rune.BLOOD)
	),
	VENGEANCE_OTHER(
			66,
			WidgetInfo.SPELL_VENGEANCE_OTHER,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(2, Rune.DEATH)
	),
	VENGEANCE(
			66,
			WidgetInfo.SPELL_VENGEANCE,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(4, Rune.ASTRAL),
			new RuneRequirement(2, Rune.DEATH)
	),
	HEAL_GROUP(
			66,
			WidgetInfo.SPELL_HEAL_GROUP,
			new RuneRequirement(4, Rune.ASTRAL),
			new RuneRequirement(6, Rune.LAW),
			new RuneRequirement(3, Rune.BLOOD)
	),

	// Utility spells
	BAKE_PIE(
			66,
			WidgetInfo.SPELL_BAKE_PIE,
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(5, Rune.FIRE),
			new RuneRequirement(1, Rune.ASTRAL)
	),
	GEOMANCY(
			66,
			WidgetInfo.SPELL_GEOMANCY,
			new RuneRequirement(8, Rune.EARTH),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(3, Rune.NATURE)
	),
	CURE_PLANT(
			66,
			WidgetInfo.SPELL_CURE_PLANT,
			new RuneRequirement(8, Rune.EARTH),
			new RuneRequirement(1, Rune.ASTRAL)
	),
	NPC_CONTACT(
			66,
			WidgetInfo.SPELL_NPC_CONTACT,
			new RuneRequirement(2, Rune.AIR),
			new RuneRequirement(1, Rune.COSMIC),
			new RuneRequirement(1, Rune.ASTRAL)
	),
	HUMIDIFY(
			66,
			WidgetInfo.SPELL_HUMIDIFY,
			new RuneRequirement(3, Rune.WATER),
			new RuneRequirement(1, Rune.FIRE),
			new RuneRequirement(1, Rune.ASTRAL)
	),
	HUNTER_KIT(
			66,
			WidgetInfo.SPELL_HUNTER_KIT,
			new RuneRequirement(2, Rune.EARTH),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	SPIN_FLAX(
			66,
			WidgetInfo.SPELL_SPIN_FLAX,
			new RuneRequirement(5, Rune.AIR),
			new RuneRequirement(1, Rune.ASTRAL),
			new RuneRequirement(2, Rune.NATURE)
	),
	SUPERGLASS_MAKE(
			66,
			WidgetInfo.SPELL_SUPERGLASS_MAKE,
			new RuneRequirement(10, Rune.AIR),
			new RuneRequirement(6, Rune.FIRE),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	TAN_LEATHER(
			66,
			WidgetInfo.SPELL_TAN_LEATHER,
			new RuneRequirement(5, Rune.FIRE),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.NATURE)
	),
	STRING_JEWELLERY(
			66,
			WidgetInfo.SPELL_STRING_JEWELLERY,
			new RuneRequirement(10, Rune.EARTH),
			new RuneRequirement(5, Rune.WATER),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	MAGIC_IMBUE(
			66,
			WidgetInfo.SPELL_MAGIC_IMBUE,
			new RuneRequirement(7, Rune.WATER),
			new RuneRequirement(7, Rune.FIRE),
			new RuneRequirement(2, Rune.ASTRAL)
	),
	FERTILE_SOIL(
			66,
			WidgetInfo.SPELL_FERTILE_SOIL,
			new RuneRequirement(15, Rune.EARTH),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(2, Rune.NATURE)
	),
	PLANK_MAKE(
			66,
			WidgetInfo.SPELL_PLANK_MAKE,
			new RuneRequirement(15, Rune.EARTH),
			new RuneRequirement(2, Rune.ASTRAL),
			new RuneRequirement(1, Rune.NATURE)
	),
	RECHARGE_DRAGONSTONE(
			66,
			WidgetInfo.SPELL_RECHARGE_DRAGONSTONE,
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(1, Rune.ASTRAL),
			new RuneRequirement(1, Rune.SOUL)
	),
	SPELLBOOK_SWAP(
			66,
			WidgetInfo.SPELL_SPELLBOOK_SWAP,
			new RuneRequirement(2, Rune.COSMIC),
			new RuneRequirement(3, Rune.ASTRAL),
			new RuneRequirement(1, Rune.LAW)
	),
	;

	private final int level;
	private final WidgetInfo widgetInfo;
	private final RuneRequirement[] requirements;

	Lunar(int level, WidgetInfo widgetInfo, RuneRequirement... requirements)
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
		if (Magic.SpellBook.getCurrent() != Magic.SpellBook.LUNAR)
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
