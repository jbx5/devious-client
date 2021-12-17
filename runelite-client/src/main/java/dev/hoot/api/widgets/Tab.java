package dev.hoot.api.widgets;

import net.runelite.api.widgets.WidgetInfo;

public enum Tab {
    COMBAT(WidgetInfo.FIXED_VIEWPORT_COMBAT_TAB, WidgetInfo.FIXED_VIEWPORT_COMBAT_TAB.getChildId()),
    SKILLS(WidgetInfo.FIXED_VIEWPORT_STATS_TAB, WidgetInfo.FIXED_VIEWPORT_STATS_TAB.getChildId()),
    QUESTS(WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB, WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB.getChildId()),
    INVENTORY(WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB, WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB.getChildId()),
    EQUIPMENT(WidgetInfo.FIXED_VIEWPORT_EQUIPMENT_TAB, WidgetInfo.FIXED_VIEWPORT_EQUIPMENT_TAB.getChildId()),
    PRAYER(WidgetInfo.FIXED_VIEWPORT_PRAYER_TAB, WidgetInfo.FIXED_VIEWPORT_PRAYER_TAB.getChildId()),
    MAGIC(WidgetInfo.FIXED_VIEWPORT_MAGIC_TAB, WidgetInfo.FIXED_VIEWPORT_MAGIC_TAB.getChildId()),
    CLAN_CHAT(WidgetInfo.FIXED_VIEWPORT_FRIENDS_CHAT_TAB, WidgetInfo.FIXED_VIEWPORT_FRIENDS_CHAT_TAB.getChildId()),
    ACCOUNT(WidgetInfo.FIXED_VIEWPORT_IGNORES_TAB, WidgetInfo.FIXED_VIEWPORT_IGNORES_TAB.getChildId()),
    FRIENDS(WidgetInfo.FIXED_VIEWPORT_FRIENDS_TAB, WidgetInfo.FIXED_VIEWPORT_FRIENDS_TAB.getChildId()),
    LOG_OUT(WidgetInfo.FIXED_VIEWPORT_LOGOUT_TAB, WidgetInfo.FIXED_VIEWPORT_LOGOUT_TAB.getChildId()),
    OPTIONS(WidgetInfo.FIXED_VIEWPORT_OPTIONS_TAB, WidgetInfo.FIXED_VIEWPORT_OPTIONS_TAB.getChildId()),
    EMOTES(WidgetInfo.FIXED_VIEWPORT_EMOTES_TAB, WidgetInfo.FIXED_VIEWPORT_EMOTES_TAB.getChildId()),
    MUSIC(WidgetInfo.FIXED_VIEWPORT_MUSIC_TAB, WidgetInfo.FIXED_VIEWPORT_MUSIC_TAB.getChildId())
    ;
    
    private final WidgetInfo widgetInfo;
    private final int childId;

    Tab(WidgetInfo widgetInfo, int childId) {
        this.widgetInfo = widgetInfo;
        this.childId = childId;
    }

    public WidgetInfo getWidgetInfo() {
        return widgetInfo;
    }

    public int getChildId() {
        return childId;
    }
}
