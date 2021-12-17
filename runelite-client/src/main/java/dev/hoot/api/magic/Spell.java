package dev.hoot.api.magic;

import net.runelite.api.widgets.WidgetInfo;

public interface Spell {
    int getLevel();
    WidgetInfo getWidget();
}
