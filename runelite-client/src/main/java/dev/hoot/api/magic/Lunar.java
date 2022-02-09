package dev.hoot.api.magic;

import net.runelite.api.widgets.WidgetInfo;

public enum Lunar implements Spell
{
	// Teleport spells
	LUNAR_HOME_TELEPORT(0, WidgetInfo.SPELL_LUNAR_HOME_TELEPORT),
	MOONCLAN_TELEPORT(69, WidgetInfo.SPELL_MOONCLAN_TELEPORT),
	TELE_GROUP_MOONCLAN(70, WidgetInfo.SPELL_TELE_GROUP_MOONCLAN),
	OURANIA_TELEPORT(71, WidgetInfo.SPELL_OURANIA_TELEPORT),
	WATERBIRTH_TELEPORT(72, WidgetInfo.SPELL_WATERBIRTH_TELEPORT),
	TELE_GROUP_WATERBIRTH(73, WidgetInfo.SPELL_TELE_GROUP_WATERBIRTH),
	BARBARIAN_TELEPORT(75, WidgetInfo.SPELL_BARBARIAN_TELEPORT),
	TELE_GROUP_BARBARIAN(76, WidgetInfo.SPELL_TELE_GROUP_BARBARIAN),
	KHAZARD_TELEPORT(78, WidgetInfo.SPELL_KHAZARD_TELEPORT),
	TELE_GROUP_KHAZARD(79, WidgetInfo.SPELL_TELE_GROUP_KHAZARD),
	FISHING_GUILD_TELEPORT(85, WidgetInfo.SPELL_FISHING_GUILD_TELEPORT),
	TELE_GROUP_FISHING_GUILD(86, WidgetInfo.SPELL_TELE_GROUP_FISHING_GUILD),
	CATHERBY_TELEPORT(87, WidgetInfo.SPELL_CATHERBY_TELEPORT),
	TELE_GROUP_CATHERBY(88, WidgetInfo.SPELL_TELE_GROUP_CATHERBY),
	ICE_PLATEAU_TELEPORT(89, WidgetInfo.SPELL_ICE_PLATEAU_TELEPORT),
	TELE_GROUP_ICE_PLATEAU(90, WidgetInfo.SPELL_TELE_GROUP_ICE_PLATEAU),

	;

	private final int level;
	private final WidgetInfo widgetInfo;

	Lunar(int level, WidgetInfo widgetInfo)
	{
		this.level = level;
		this.widgetInfo = widgetInfo;
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
}
