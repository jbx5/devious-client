package dev.hoot.api.magic;

import net.runelite.api.widgets.WidgetInfo;

public enum Ancient implements Spell {
    EDGEVILLE_HOME_TELEPORT(0, WidgetInfo.SPELL_EDGEVILLE_HOME_TELEPORT),
    PADDEWWA_TELEPORT(54, WidgetInfo.SPELL_PADDEWWA_TELEPORT),
    SENNTISTEN_TELEPORT(60, WidgetInfo.SPELL_SENNTISTEN_TELEPORT),
    KHARYRLL_TELEPORT(66, WidgetInfo.SPELL_KHARYRLL_TELEPORT),
    LASSAR_TELEPORT(72, WidgetInfo.SPELL_LASSAR_TELEPORT),
    DAREEYAK_TELEPORT(78, WidgetInfo.SPELL_DAREEYAK_TELEPORT),
    CARRALLANGER_TELEPORT(84, WidgetInfo.SPELL_CARRALLANGER_TELEPORT),
    BOUNTY_TARGET_TELEPORT(85, WidgetInfo.SPELL_BOUNTY_TARGET_TELEPORT),
    ANNAKARL_TELEPORT(90, WidgetInfo.SPELL_ANNAKARL_TELEPORT),
    GHORROCK_TELEPORT(96, WidgetInfo.SPELL_GHORROCK_TELEPORT),

    // Rush Spells
    SMOKE_RUSH(50, WidgetInfo.SPELL_SMOKE_RUSH),
    SHADOW_RUSH(52, WidgetInfo.SPELL_SHADOW_RUSH),
    BLOOD_RUSH(56, WidgetInfo.SPELL_BLOOD_RUSH),
    ICE_RUSH(58, WidgetInfo.SPELL_ICE_RUSH),

    // Burst Spells
    SMOKE_BURST(62, WidgetInfo.SPELL_SMOKE_BURST),
    SHADOW_BURST(64, WidgetInfo.SPELL_SHADOW_BURST),
    BLOOD_BURST(68, WidgetInfo.SPELL_BLOOD_BURST),
    ICE_BURST(70, WidgetInfo.SPELL_ICE_BURST),

    // Blitz Spells
    SMOKE_BLITZ(74, WidgetInfo.SPELL_SMOKE_BLITZ),
    SHADOW_BLITZ(76, WidgetInfo.SPELL_SHADOW_BLITZ),
    BLOOD_BLITZ(80, WidgetInfo.SPELL_BLOOD_BLITZ),
    ICE_BLITZ(82, WidgetInfo.SPELL_ICE_BLITZ),

    // Barrage Spells
    SMOKE_BARRAGE(86, WidgetInfo.SPELL_SMOKE_BARRAGE),
    SHADOW_BARRAGE(88, WidgetInfo.SPELL_SHADOW_BARRAGE),
    BLOOD_BARRAGE(92, WidgetInfo.SPELL_BLOOD_BARRAGE),
    ICE_BARRAGE(94, WidgetInfo.SPELL_ICE_BARRAGE)
    ;

    private final int level;
    private final WidgetInfo widgetInfo;

    Ancient(int level, WidgetInfo widgetInfo) {
        this.level = level;
        this.widgetInfo = widgetInfo;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public WidgetInfo getWidget() {
        return widgetInfo;
    }
}
