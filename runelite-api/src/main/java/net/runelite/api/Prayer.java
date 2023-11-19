/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import net.runelite.api.annotations.Varbit;
import net.runelite.api.widgets.WidgetInfo;

/**
 * An enumeration of prayers.
 */
public enum Prayer
{
	/**
	 * Thick Skin (Level 1, Defence).
	 */
	THICK_SKIN(Varbits.PRAYER_THICK_SKIN, WidgetInfo.PRAYER_THICK_SKIN),
	/**
	 * Burst of Strength (Level 4, Strength).
	 */
	BURST_OF_STRENGTH(Varbits.PRAYER_BURST_OF_STRENGTH, WidgetInfo.PRAYER_BURST_OF_STRENGTH),
	/**
	 * Clarity of Thought (Level 7, Attack).
	 */
	CLARITY_OF_THOUGHT(Varbits.PRAYER_CLARITY_OF_THOUGHT, WidgetInfo.PRAYER_CLARITY_OF_THOUGHT),
	/**
	 * Sharp Eye (Level 8, Ranging).
	 */
	SHARP_EYE(Varbits.PRAYER_SHARP_EYE, WidgetInfo.PRAYER_SHARP_EYE),
	/**
	 * Mystic Will (Level 9, Magic).
	 */
	MYSTIC_WILL(Varbits.PRAYER_MYSTIC_WILL, WidgetInfo.PRAYER_MYSTIC_WILL),
	/**
	 * Rock Skin (Level 10, Defence).
	 */
	ROCK_SKIN(Varbits.PRAYER_ROCK_SKIN, WidgetInfo.PRAYER_ROCK_SKIN),
	/**
	 * Superhuman Strength (Level 13, Strength).
	 */
	SUPERHUMAN_STRENGTH(Varbits.PRAYER_SUPERHUMAN_STRENGTH, WidgetInfo.PRAYER_SUPERHUMAN_STRENGTH),
	/**
	 * Improved Reflexes (Level 16, Attack).
	 */
	IMPROVED_REFLEXES(Varbits.PRAYER_IMPROVED_REFLEXES, WidgetInfo.PRAYER_IMPROVED_REFLEXES),
	/**
	 * Rapid Restore (Level 19, Stats).
	 */
	RAPID_RESTORE(Varbits.PRAYER_RAPID_RESTORE, WidgetInfo.PRAYER_RAPID_RESTORE),
	/**
	 * Rapid Heal (Level 22, Hitpoints).
	 */
	RAPID_HEAL(Varbits.PRAYER_RAPID_HEAL, WidgetInfo.PRAYER_RAPID_HEAL),
	/**
	 * Protect Item (Level 25).
	 */
	PROTECT_ITEM(Varbits.PRAYER_PROTECT_ITEM, WidgetInfo.PRAYER_PROTECT_ITEM),
	/**
	 * Hawk Eye (Level 26, Ranging).
	 */
	HAWK_EYE(Varbits.PRAYER_HAWK_EYE, WidgetInfo.PRAYER_HAWK_EYE),
	/**
	 * Mystic Lore (Level 27, Magic).
	 */
	MYSTIC_LORE(Varbits.PRAYER_MYSTIC_LORE, WidgetInfo.PRAYER_MYSTIC_LORE),
	/**
	 * Steel Skin (Level 28, Defence).
	 */
	STEEL_SKIN(Varbits.PRAYER_STEEL_SKIN, WidgetInfo.PRAYER_STEEL_SKIN),
	/**
	 * Ultimate Strength (Level 31, Strength).
	 */
	ULTIMATE_STRENGTH(Varbits.PRAYER_ULTIMATE_STRENGTH, WidgetInfo.PRAYER_ULTIMATE_STRENGTH),
	/**
	 * Incredible Reflexes (Level 34, Attack).
	 */
	INCREDIBLE_REFLEXES(Varbits.PRAYER_INCREDIBLE_REFLEXES, WidgetInfo.PRAYER_INCREDIBLE_REFLEXES),
	/**
	 * Protect from Magic (Level 37).
	 */
	PROTECT_FROM_MAGIC(Varbits.PRAYER_PROTECT_FROM_MAGIC, WidgetInfo.PRAYER_PROTECT_FROM_MAGIC),
	/**
	 * Protect from Missiles (Level 40).
	 */
	PROTECT_FROM_MISSILES(Varbits.PRAYER_PROTECT_FROM_MISSILES, WidgetInfo.PRAYER_PROTECT_FROM_MISSILES),
	/**
	 * Protect from Melee (Level 43).
	 */
	PROTECT_FROM_MELEE(Varbits.PRAYER_PROTECT_FROM_MELEE, WidgetInfo.PRAYER_PROTECT_FROM_MELEE),
	/**
	 * Eagle Eye (Level 44, Ranging).
	 */
	EAGLE_EYE(Varbits.PRAYER_EAGLE_EYE, WidgetInfo.PRAYER_EAGLE_EYE),
	/**
	 * Mystic Might (Level 45, Magic).
	 */
	MYSTIC_MIGHT(Varbits.PRAYER_MYSTIC_MIGHT, WidgetInfo.PRAYER_MYSTIC_MIGHT),
	/**
	 * Retribution (Level 46).
	 */
	RETRIBUTION(Varbits.PRAYER_RETRIBUTION, WidgetInfo.PRAYER_RETRIBUTION),
	/**
	 * Redemption (Level 49).
	 */
	REDEMPTION(Varbits.PRAYER_REDEMPTION, WidgetInfo.PRAYER_REDEMPTION),
	/**
	 * Smite (Level 52).
	 */
	SMITE(Varbits.PRAYER_SMITE, WidgetInfo.PRAYER_SMITE),
	/**
	 * Chivalry (Level 60, Defence/Strength/Attack).
	 */
	CHIVALRY(Varbits.PRAYER_CHIVALRY, WidgetInfo.PRAYER_CHIVALRY),
	/**
	 * Piety (Level 70, Defence/Strength/Attack).
	 */
	PIETY(Varbits.PRAYER_PIETY, WidgetInfo.PRAYER_PIETY),
	/**
	 * Preserve (Level 55).
	 */
	PRESERVE(Varbits.PRAYER_PRESERVE, WidgetInfo.PRAYER_PRESERVE),
	/**
	 * Rigour (Level 74, Ranging/Damage/Defence).
	 */
	RIGOUR(Varbits.PRAYER_RIGOUR, WidgetInfo.PRAYER_RIGOUR),
	/**
	 * Augury (Level 77, Magic/Magic Def./Defence).
	 */
	AUGURY(Varbits.PRAYER_AUGURY, WidgetInfo.PRAYER_AUGURY),

	/**
	 * Ruinous Powers Rejuvenation (Level 60).
	 */
	RP_REJUVENATION(Varbits.PRAYER_RP_REJUVENATION, null),
	/**
	 * Ruinous Powers Ancient Strength (Level 61).
	 */
	RP_ANCIENT_STRENGTH(Varbits.PRAYER_RP_ANCIENT_STRENGTH, null),
	/**
	 * Ruinous Powers Ancient Sight (Level 62).
	 */
	RP_ANCIENT_SIGHT(Varbits.PRAYER_RP_ANCIENT_SIGHT, null),
	/**
	 * Ruinous Powers Ancient Will (Level 63).
	 */
	RP_ANCIENT_WILL(Varbits.PRAYER_RP_ANCIENT_WILL, null),
	/**
	 * Ruinous Powers Protect Item (Level 65).
	 */
	RP_PROTECT_ITEM(Varbits.PRAYER_RP_PROTECT_ITEM, null),
	/**
	 * Ruinous Powers Ruinous Grace (Level 66).
	 */
	RP_RUINOUS_GRACE(Varbits.PRAYER_RP_RUINOUS_GRACE, null),
	/**
	 * Ruinous Powers Dampen Magic (Level 67).
	 */
	RP_DAMPEN_MAGIC(Varbits.PRAYER_RP_DAMPEN_MAGIC, null),
	/**
	 * Ruinous Powers Dampen Ranged (Level 69).
	 */
	RP_DAMPEN_RANGED(Varbits.PRAYER_RP_DAMPEN_RANGED, null),
	/**
	 * Ruinous Powers Dampen Melee (Level 71).
	 */
	RP_DAMPEN_MELEE(Varbits.PRAYER_RP_DAMPEN_MELEE, null),
	/**
	 * Ruinous Powers Trinitas (Level 72).
	 */
	RP_TRINITAS(Varbits.PRAYER_RP_TRINITAS, null),
	/**
	 * Ruinous Powers Berserker (Level 74).
	 */
	RP_BERSERKER(Varbits.PRAYER_RP_BERSERKER, null),
	/**
	 * Ruinous Powers Purge (Level 75).
	 */
	RP_PURGE(Varbits.PRAYER_RP_PURGE, null),
	/**
	 * Ruinous Powers Metabolise (Level 77).
	 */
	RP_METABOLISE(Varbits.PRAYER_RP_METABOLISE, null),
	/**
	 * Ruinous Powers Rebuke (Level 78).
	 */
	RP_REBUKE(Varbits.PRAYER_RP_REBUKE, null),
	/**
	 * Ruinous Powers Vindication (Level 80).
	 */
	RP_VINDICATION(Varbits.PRAYER_RP_VINDICATION, null),
	/**
	 * Ruinous Powers Decimate (Level 82).
	 */
	RP_DECIMATE(Varbits.PRAYER_RP_DECIMATE, null),
	/**
	 * Ruinous Powers Annihilate (Level 84).
	 */
	RP_ANNIHILATE(Varbits.PRAYER_RP_ANNIHILATE, null),
	/**
	 * Ruinous Powers Vaporise (Level 86).
	 */
	RP_VAPORISE(Varbits.PRAYER_RP_VAPORISE, null),
	/**
	 * Ruinous Powers Fumus' Vow (Level 87).
	 */
	RP_FUMUS_VOW(Varbits.PRAYER_RP_FUMUS_VOW, null),
	/**
	 * Ruinous Powers Umbra's Vow (Level 88).
	 */
	RP_UMBRA_VOW(Varbits.PRAYER_RP_UMBRA_VOW, null),
	/**
	 * Ruinous Powers Cruor's Vow (Level 89).
	 */
	RP_CRUORS_VOW(Varbits.PRAYER_RP_CRUORS_VOW, null),
	/**
	 * Ruinous Powers Glacies' Vow (Level 90).
	 */
	RP_GLACIES_VOW(Varbits.PRAYER_RP_GLACIES_VOW, null),
	/**
	 * Ruinous Powers Wrath (Level 91).
	 */
	RP_WRATH(Varbits.PRAYER_RP_WRATH, null),
	/**
	 * Ruinous Powers Intensify (Level 92).
	 */
	RP_INTENSIFY(Varbits.PRAYER_RP_INTENSIFY, null),
	;

	private final int varbit;
	private final WidgetInfo widgetInfo;

	Prayer(@Varbit int varbit, WidgetInfo widgetInfo)
	{
		this.varbit = varbit;
		this.widgetInfo = widgetInfo;
	}

	/**
	 * Gets the varbit that stores whether the prayer is active or not.
	 *
	 * @return the prayer active varbit
	 */
	@Varbit
	public int getVarbit()
	{
		return varbit;
	}

	public WidgetInfo getWidgetInfo()
	{
		return widgetInfo;
	}
}