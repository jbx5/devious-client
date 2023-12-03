package net.unethicalite.api.items;

import java.time.Instant;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.client.managers.InventoryManager;

public class Inventory extends Items
{
	private Inventory()
	{
		super(InventoryID.INVENTORY, item ->
		{
			item.setWidgetId(WidgetInfo.INVENTORY.getPackedId());
			return true;
		});
	}

	private static final Inventory INVENTORY = new Inventory();

	public static ItemQuery query()
	{
		return query(Inventory::getAll);
	}

	public static ItemQuery query(Supplier<List<Item>> supplier)
	{
		return new ItemQuery(supplier);
	}

	public static List<Item> getAll(Predicate<Item> filter)
	{
		return INVENTORY.all(filter);
	}

	public static List<Item> getAll()
	{
		return getAll(x -> true);
	}

	public static List<Item> getAll(int... ids)
	{
		return INVENTORY.all(ids);
	}

	public static List<Item> getAll(String... names)
	{
		return INVENTORY.all(names);
	}

	public static Item getFirst(Predicate<Item> filter)
	{
		return INVENTORY.first(filter);
	}

	public static Item getFirst(int... ids)
	{
		return INVENTORY.first(ids);
	}

	public static Item getFirst(String... names)
	{
		return INVENTORY.first(names);
	}

	public static Item getItem(int slot)
	{
		ItemContainerSnapshot containerSnapshot = InventoryManager.getCachedContainers().get(InventoryID.INVENTORY.getId());
		if (containerSnapshot == null)
		{
			return null;
		}

		Item[] items = containerSnapshot.getItems();

		Item item = items[slot];
		if (item == null || item.getId() == -1 || item.getName() == null || item.getName().equals("null"))
		{
			return null;
		}

		item.setWidgetId(WidgetInfo.INVENTORY.getPackedId());
		return item;
	}

	public static boolean contains(Predicate<Item> filter)
	{
		return INVENTORY.exists(filter);
	}

	public static boolean contains(int... id)
	{
		return INVENTORY.exists(id);
	}

	public static boolean contains(String... name)
	{
		return INVENTORY.exists(name);
	}

	public static int getCount(boolean stacks, Predicate<Item> filter)
	{
		return INVENTORY.count(stacks, filter);
	}

	public static int getCount(boolean stacks, int... ids)
	{
		return INVENTORY.count(stacks, ids);
	}

	public static int getCount(boolean stacks, String... names)
	{
		return INVENTORY.count(stacks, names);
	}

	public static int getCount(Predicate<Item> filter)
	{
		return INVENTORY.count(false, filter);
	}

	public static int getCount(int... ids)
	{
		return INVENTORY.count(false, ids);
	}

	public static int getCount(String... names)
	{
		return INVENTORY.count(false, names);
	}

	public static boolean isFull()
	{
		return getFreeSlots() == 0;
	}

	public static boolean isEmpty()
	{
		return getFreeSlots() == 28;
	}

	public static int getFreeSlots()
	{
		return 28 - getAll().size();
	}

	public static @Nullable Instant getLastUpdated()
	{
		return INVENTORY.lastUpdated();
	}
}
