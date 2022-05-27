package net.unethicalite.api.query.widgets;

import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.query.Query;
import net.unethicalite.api.query.results.WidgetQueryResults;
import net.runelite.api.widgets.Widget;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class WidgetQuery extends Query<Widget, WidgetQuery, WidgetQueryResults>
{
	private int[] widgetIds = null;
	private int[] types = null;
	private String[] texts = null;
	private String[] actions = null;
	private Boolean visible = null;

	public WidgetQuery(Supplier<List<Widget>> supplier)
	{
		super(supplier);
	}

	@Override
	protected WidgetQueryResults results(List<Widget> list)
	{
		return new WidgetQueryResults(list);
	}

	public WidgetQuery ids(int... ids)
	{
		this.widgetIds = ids;
		return this;
	}

	public WidgetQuery types(int... types)
	{
		this.types = types;
		return this;
	}

	public WidgetQuery texts(String... texts)
	{
		this.texts = texts;
		return this;
	}

	public WidgetQuery actions(String... actions)
	{
		this.actions = actions;
		return this;
	}

	public WidgetQuery visible(Boolean visible)
	{
		this.visible = visible;
		return this;
	}

	@Override
	public boolean test(Widget widget)
	{
		if (widgetIds != null && !ArrayUtils.contains(widgetIds, widget.getId()))
		{
			return false;
		}

		if (types != null && !ArrayUtils.contains(types, widget.getType()))
		{
			return false;
		}

		if (texts != null && !ArrayUtils.contains(texts, widget.getText()))
		{
			return false;
		}

		if (actions != null && Arrays.stream(actions).noneMatch(Predicates.texts(widget.getActions())))
		{
			return false;
		}

		if (visible != null && visible != widget.isVisible())
		{
			return false;
		}

		return super.test(widget);
	}
}
