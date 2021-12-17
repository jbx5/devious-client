package dev.hoot.api.magic;

import net.runelite.api.widgets.WidgetInfo;

public enum Necromancy implements Spell {
    ARCEUUS_HOME_TELEPORT(1, WidgetInfo.SPELL_ARCEUUS_HOME_TELEPORT),
    BATTLEFRONT_TELEPORT(23, WidgetInfo.SPELL_BATTLEFRONT_TELEPORT),

    ;

    private final int level;
    private final WidgetInfo widgetInfo;

    Necromancy(int level, WidgetInfo widgetInfo) {
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
