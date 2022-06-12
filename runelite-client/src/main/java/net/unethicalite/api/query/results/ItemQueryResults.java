package net.unethicalite.api.query.results;

import net.runelite.api.Item;

import java.util.List;

public class ItemQueryResults extends QueryResults<Item, ItemQueryResults>
{
	public ItemQueryResults(List<Item> results)
	{
		super(results);
	}
}
