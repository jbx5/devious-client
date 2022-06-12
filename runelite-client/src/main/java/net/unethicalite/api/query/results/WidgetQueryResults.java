package net.unethicalite.api.query.results;

import net.runelite.api.widgets.Widget;

import java.util.List;

public class WidgetQueryResults extends QueryResults<Widget, WidgetQueryResults>
{
	public WidgetQueryResults(List<Widget> results)
	{
		super(results);
	}
}
