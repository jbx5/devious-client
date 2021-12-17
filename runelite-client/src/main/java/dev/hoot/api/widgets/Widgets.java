package dev.hoot.api.widgets;

import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Widgets {

    public static Widget get(WidgetInfo widgetInfo) {
        return Game.getClient().getWidget(widgetInfo);
    }

    public static Widget get(int group, int id) {
        return Game.getClient().getWidget(group, id);
    }

    public static Widget get(int group, int id, int child) {
        return get(group, id) == null ? null : get(group, id).getChild(child);
    }

    public static List<Widget> get(int group) {
        Widget[] widgets = Game.getClient().getWidgets()[group];
        if (widgets == null) {
            return Collections.emptyList();
        }

        return Arrays.asList(widgets);
    }

    public static Widget get(int group, Predicate<Widget> filter) {
        return get(group).stream().filter(filter).findFirst().orElse(null);
    }

    public static List<Widget> getChildren(Widget widget, Predicate<Widget> filter) {
        if (widget == null) {
            return Collections.emptyList();
        }

        Widget[] children = widget.getChildren();
        if (children == null) {
            return Collections.emptyList();
        }

        return Arrays.stream(children).filter(filter).collect(Collectors.toList());
    }

    public static List<Widget> getChildren(WidgetInfo widgetInfo, Predicate<Widget> filter) {
        return getChildren(get(widgetInfo), filter);
    }

    public static List<Widget> getChildren(int group, int child, Predicate<Widget> filter) {
        return getChildren(get(group, child), filter);
    }

    public static List<Widget> getAll(int group, Predicate<Widget> filter) {
        return get(group).stream().filter(filter).collect(Collectors.toList());
    }

    public static Widget fromId(int packedId) {
        return Game.getClient().getWidget(packedId);
    }

    public static boolean isVisible(Widget widget) {
        return widget != null && !GameThread.invokeLater(widget::isHidden);
    }
}
