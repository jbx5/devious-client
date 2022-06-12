package net.unethicalite.api.widgets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.widgets.WidgetInfo;

@AllArgsConstructor
@Getter
public enum Tab
{
	COMBAT(WidgetInfo.FIXED_VIEWPORT_COMBAT_TAB, WidgetInfo.FIXED_VIEWPORT_COMBAT_TAB.getChildId(), 0),
	SKILLS(WidgetInfo.FIXED_VIEWPORT_STATS_TAB, WidgetInfo.FIXED_VIEWPORT_STATS_TAB.getChildId(), 1),
	QUESTS(WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB, WidgetInfo.FIXED_VIEWPORT_QUESTS_TAB.getChildId(), 2),
	INVENTORY(WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB, WidgetInfo.FIXED_VIEWPORT_INVENTORY_TAB.getChildId(), 3),
	EQUIPMENT(WidgetInfo.FIXED_VIEWPORT_EQUIPMENT_TAB, WidgetInfo.FIXED_VIEWPORT_EQUIPMENT_TAB.getChildId(), 4),
	PRAYER(WidgetInfo.FIXED_VIEWPORT_PRAYER_TAB, WidgetInfo.FIXED_VIEWPORT_PRAYER_TAB.getChildId(), 5),
	MAGIC(WidgetInfo.FIXED_VIEWPORT_MAGIC_TAB, WidgetInfo.FIXED_VIEWPORT_MAGIC_TAB.getChildId(), 6),
	CLAN_CHAT(WidgetInfo.FIXED_VIEWPORT_FRIENDS_CHAT_TAB, WidgetInfo.FIXED_VIEWPORT_FRIENDS_CHAT_TAB.getChildId(), 7),
	ACCOUNT(WidgetInfo.FIXED_VIEWPORT_IGNORES_TAB, WidgetInfo.FIXED_VIEWPORT_IGNORES_TAB.getChildId(), 8),
	FRIENDS(WidgetInfo.FIXED_VIEWPORT_FRIENDS_TAB, WidgetInfo.FIXED_VIEWPORT_FRIENDS_TAB.getChildId(), 9),
	LOG_OUT(WidgetInfo.FIXED_VIEWPORT_LOGOUT_TAB, WidgetInfo.FIXED_VIEWPORT_LOGOUT_TAB.getChildId(), 10),
	OPTIONS(WidgetInfo.FIXED_VIEWPORT_OPTIONS_TAB, WidgetInfo.FIXED_VIEWPORT_OPTIONS_TAB.getChildId(), 11),
	EMOTES(WidgetInfo.FIXED_VIEWPORT_EMOTES_TAB, WidgetInfo.FIXED_VIEWPORT_EMOTES_TAB.getChildId(), 12),
	MUSIC(WidgetInfo.FIXED_VIEWPORT_MUSIC_TAB, WidgetInfo.FIXED_VIEWPORT_MUSIC_TAB.getChildId(), 13);

	private final WidgetInfo widgetInfo;
	private final int childId;
	private final int index;
}
