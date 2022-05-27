package net.unethicalite.api.query.items;

import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.query.Query;
import net.unethicalite.api.query.results.ItemQueryResults;
import net.runelite.api.Item;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ItemQuery extends Query<Item, ItemQuery, ItemQueryResults>
{
	private int[] ids = null;
	private int[] notedIds = null;
	private int[] slots = null;
	private String[] names = null;
	private String[] actions = null;
	private Boolean tradable = null;
	private Boolean stackable = null;
	private Boolean members = null;
	private Boolean noted = null;
	private Integer storePrice = null;

	public ItemQuery(Supplier<List<Item>> supplier)
	{
		super(supplier);
	}

	public ItemQuery ids(int... ids)
	{
		this.ids = ids;
		return this;
	}

	public ItemQuery notedIds(int... notedIds)
	{
		this.notedIds = notedIds;
		return this;
	}

	public ItemQuery slots(int... slots)
	{
		this.slots = slots;
		return this;
	}

	public ItemQuery names(String... names)
	{
		this.names = names;
		return this;
	}

	public ItemQuery actions(String... actions)
	{
		this.actions = actions;
		return this;
	}

	public ItemQuery tradable(boolean tradable)
	{
		this.tradable = tradable;
		return this;
	}

	public ItemQuery stackable(boolean stackable)
	{
		this.stackable = stackable;
		return this;
	}

	public ItemQuery members(boolean members)
	{
		this.members = members;
		return this;
	}

	public ItemQuery noted(boolean noted)
	{
		this.noted = noted;
		return this;
	}

	public ItemQuery storePrice(int storePrice)
	{
		this.storePrice = storePrice;
		return this;
	}

	@Override
	protected ItemQueryResults results(List<Item> list)
	{
		return new ItemQueryResults(list);
	}

	@Override
	public boolean test(Item item)
	{
		if (ids != null && !ArrayUtils.contains(ids, item.getId()))
		{
			return false;
		}

		if (notedIds != null && !ArrayUtils.contains(notedIds, item.getId()))
		{
			return false;
		}

		if (slots != null && !ArrayUtils.contains(slots, item.getSlot()))
		{
			return false;
		}

		if (names != null && !ArrayUtils.contains(names, item.getName()))
		{
			return false;
		}

		if (actions != null && Arrays.stream(actions).noneMatch(Predicates.texts(item.getActions())))
		{
			return false;
		}

		if (tradable != null && tradable != item.isTradable())
		{
			return false;
		}

		if (stackable != null && stackable != item.isStackable())
		{
			return false;
		}

		if (members != null && members != item.isMembers())
		{
			return false;
		}

		if (noted != null && noted != item.isNoted())
		{
			return false;
		}

		if (storePrice != null && storePrice != item.getStorePrice())
		{
			return false;
		}

		return super.test(item);
	}
}
