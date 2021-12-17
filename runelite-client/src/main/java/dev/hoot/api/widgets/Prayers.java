package dev.hoot.api.widgets;

import dev.hoot.api.game.Skills;
import dev.hoot.api.game.Vars;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.Varbits;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

public class Prayers {
    public static boolean isEnabled(Prayer prayer) {
        return Vars.getBit(prayer.getVarbit()) == 1;
    }

    public static void toggle(Prayer prayer) {
        Widget widget = Widgets.get(prayer.getWidgetInfo());
        if (widget != null) {
            widget.interact(0);
        }
    }

    public static int getPoints() {
        return Skills.getBoostedLevel(Skill.PRAYER);
    }

    public static void toggleQuickPrayer(boolean enabled) {
        Widget widget = Widgets.get(WidgetInfo.MINIMAP_QUICK_PRAYER_ORB);
        if (widget != null) {
            widget.interact(enabled ? "Activate" : "Deactivate");
        }
    }

    public static boolean isQuickPrayerEnabled() {
        return Vars.getBit(Varbits.QUICK_PRAYER) == 1;
    }
}
