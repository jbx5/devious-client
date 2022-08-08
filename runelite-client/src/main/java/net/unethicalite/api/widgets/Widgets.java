package net.unethicalite.api.widgets;

import net.unethicalite.api.query.widgets.WidgetQuery;
import net.unethicalite.client.Static;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Widgets
{
	public static WidgetQuery query()
	{
		return new WidgetQuery(() -> Arrays.stream(Static.getClient().getWidgets())
				.flatMap(Arrays::stream)
				.collect(Collectors.toList()));
	}

	public static WidgetQuery query(int group)
	{
		return new WidgetQuery(() -> get(group));
	}

	public static Widget get(WidgetInfo widgetInfo)
	{
		return Static.getClient().getWidget(widgetInfo);
	}

	public static Widget get(int group, int id)
	{
		return Static.getClient().getWidget(group, id);
	}

	public static Widget get(int group, int id, int child)
	{
		return get(group, id) == null ? null : get(group, id).getChild(child);
	}

	public static List<Widget> get(int group)
	{
		Widget[][] all = Static.getClient().getWidgets();
		if (all == null)
		{
			return Collections.emptyList();
		}

		Widget[] widgets = all[group];
		if (widgets == null)
		{
			return Collections.emptyList();
		}

		return Arrays.asList(widgets);
	}

	public static Widget get(int group, Predicate<Widget> filter)
	{
		return get(group).stream().filter(filter).findFirst().orElse(null);
	}

	public static List<Widget> getChildren(Widget widget, Predicate<Widget> filter)
	{
		if (widget == null)
		{
			return Collections.emptyList();
		}

		Widget[] children = widget.getChildren();
		if (children == null)
		{
			return Collections.emptyList();
		}

		return Arrays.stream(children).filter(filter).collect(Collectors.toList());
	}

	public static List<Widget> getChildren(WidgetInfo widgetInfo, Predicate<Widget> filter)
	{
		return getChildren(get(widgetInfo), filter);
	}

	public static List<Widget> getChildren(int group, int child, Predicate<Widget> filter)
	{
		return getChildren(get(group, child), filter);
	}

	public static List<Widget> getAll(int group, Predicate<Widget> filter)
	{
		return get(group).stream().filter(filter).collect(Collectors.toList());
	}

	public static Widget fromId(int packedId)
	{
		return Static.getClient().getWidget(packedId);
	}

	public static boolean isVisible(Widget widget)
	{
		return widget != null && widget.isVisible();
	}
}
