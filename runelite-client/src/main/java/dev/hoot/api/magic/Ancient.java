package dev.hoot.api.magic;

import dev.hoot.api.game.Skills;
import dev.hoot.api.game.Worlds;
import net.runelite.api.Skill;
import net.runelite.api.widgets.WidgetInfo;

public enum Ancient implements Spell
{
	// Teleport spells
	EDGEVILLE_HOME_TELEPORT(
			0,
			WidgetInfo.SPELL_EDGEVILLE_HOME_TELEPORT
	),
	PADDEWWA_TELEPORT(
			54,
			WidgetInfo.SPELL_PADDEWWA_TELEPORT,
			new RuneRequirement(1, Rune.AIR),
			new RuneRequirement(1, Rune.FIRE),
			new RuneRequirement(2, Rune.LAW)
	),
	SENNTISTEN_TELEPORT(
			60,
			WidgetInfo.SPELL_SENNTISTEN_TELEPORT,
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.SOUL)
	),
	KHARYRLL_TELEPORT(
			66,
			WidgetInfo.SPELL_KHARYRLL_TELEPORT,
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(1, Rune.BLOOD)
	),
	LASSAR_TELEPORT(
			72,
			WidgetInfo.SPELL_LASSAR_TELEPORT,
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(2, Rune.LAW)
	),
	DAREEYAK_TELEPORT(
			78,
			WidgetInfo.SPELL_DAREEYAK_TELEPORT,
			new RuneRequirement(2, Rune.AIR),
			new RuneRequirement(3, Rune.FIRE),
			new RuneRequirement(2, Rune.LAW)
	),
	CARRALLANGER_TELEPORT(
			84,
			WidgetInfo.SPELL_CARRALLANGER_TELEPORT,
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.SOUL)
	),
	BOUNTY_TARGET_TELEPORT(
			85,
			WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT,
			new RuneRequirement(1, Rune.CHAOS),
			new RuneRequirement(1, Rune.DEATH),
			new RuneRequirement(1, Rune.LAW)
	),
	ANNAKARL_TELEPORT(
			90,
			WidgetInfo.SPELL_ANNAKARL_TELEPORT,
			new RuneRequirement(2, Rune.LAW),
			new RuneRequirement(2, Rune.BLOOD)
	),
	GHORROCK_TELEPORT(
			96,
			WidgetInfo.SPELL_GHORROCK_TELEPORT,
			new RuneRequirement(8, Rune.WATER),
			new RuneRequirement(2, Rune.LAW)
	),

	// Rush Spells
	SMOKE_RUSH(
			50,
			WidgetInfo.SPELL_SMOKE_RUSH,
			new RuneRequirement(1, Rune.AIR),
			new RuneRequirement(1, Rune.FIRE),
			new RuneRequirement(2, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH)
	),
	SHADOW_RUSH(
			52,
			WidgetInfo.SPELL_SHADOW_RUSH,
			new RuneRequirement(1, Rune.AIR),
			new RuneRequirement(2, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(1, Rune.SOUL)
	),
	BLOOD_RUSH(
			56,
			WidgetInfo.SPELL_BLOOD_RUSH,
			new RuneRequirement(2, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(1, Rune.BLOOD)
	),
	ICE_RUSH(
			58,
			WidgetInfo.SPELL_ICE_RUSH,
			new RuneRequirement(2, Rune.WATER),
			new RuneRequirement(2, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH)
	),

	// Burst Spells
	SMOKE_BURST(
			62,
			WidgetInfo.SPELL_SMOKE_BURST,
			new RuneRequirement(2, Rune.AIR),
			new RuneRequirement(2, Rune.FIRE),
			new RuneRequirement(4, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH)
	),
	SHADOW_BURST(
			64,
			WidgetInfo.SPELL_SHADOW_BURST,
			new RuneRequirement(1, Rune.AIR),
			new RuneRequirement(4, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(2, Rune.SOUL)
	),
	BLOOD_BURST(
			68,
			WidgetInfo.SPELL_BLOOD_BURST,
			new RuneRequirement(2, Rune.CHAOS),
			new RuneRequirement(4, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD)
	),
	ICE_BURST(
			70,
			WidgetInfo.SPELL_ICE_BURST,
			new RuneRequirement(4, Rune.WATER),
			new RuneRequirement(4, Rune.CHAOS),
			new RuneRequirement(2, Rune.DEATH)
	),

	// Blitz Spells
	SMOKE_BLITZ(
			74,
			WidgetInfo.SPELL_SMOKE_BLITZ,
			new RuneRequirement(2, Rune.AIR),
			new RuneRequirement(2, Rune.FIRE),
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD)
	),
	SHADOW_BLITZ(
			76,
			WidgetInfo.SPELL_SHADOW_BLITZ,
			new RuneRequirement(2, Rune.AIR),
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD),
			new RuneRequirement(2, Rune.SOUL)
	),
	BLOOD_BLITZ(
			80,
			WidgetInfo.SPELL_BLOOD_BLITZ,
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(4, Rune.BLOOD)
	),
	ICE_BLITZ(
			82,
			WidgetInfo.SPELL_ICE_BLITZ,
			new RuneRequirement(3, Rune.WATER),
			new RuneRequirement(2, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD)
	),

	// Barrage Spells
	SMOKE_BARRAGE(
			86,
			WidgetInfo.SPELL_SMOKE_BARRAGE,
			new RuneRequirement(4, Rune.AIR),
			new RuneRequirement(4, Rune.FIRE),
			new RuneRequirement(4, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD)
	),
	SHADOW_BARRAGE(
			88,
			WidgetInfo.SPELL_SHADOW_BARRAGE,
			new RuneRequirement(4, Rune.AIR),
			new RuneRequirement(4, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD),
			new RuneRequirement(3, Rune.SOUL)
	),
	BLOOD_BARRAGE(
			92,
			WidgetInfo.SPELL_BLOOD_BARRAGE,
			new RuneRequirement(4, Rune.DEATH),
			new RuneRequirement(4, Rune.BLOOD),
			new RuneRequirement(1, Rune.SOUL)
	),
	ICE_BARRAGE(
			94,
			WidgetInfo.SPELL_ICE_BARRAGE,
			new RuneRequirement(6, Rune.WATER),
			new RuneRequirement(4, Rune.DEATH),
			new RuneRequirement(2, Rune.BLOOD)
	)
	;

	private final int level;
	private final WidgetInfo widgetInfo;
	private final RuneRequirement[] requirements;

	Ancient(int level, WidgetInfo widgetInfo, RuneRequirement... requirements)
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
		if (Magic.SpellBook.getCurrent() != Magic.SpellBook.ANCIENT)
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
