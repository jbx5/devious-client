package net.unethicalite.api.items;

import java.time.Instant;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.query.items.ItemQuery;

public class Equipment extends Items
{
	private static final Equipment EQUIPMENT = new Equipment();

	private Equipment()
	{
		super(InventoryID.EQUIPMENT, item ->
		{
			WidgetInfo widgetInfo = getEquipmentWidgetInfo(item.getSlot());

			if (widgetInfo != null)
			{
				item.setWidgetId(widgetInfo.getPackedId());
				return true;
			}

			return false;
		});
	}

	public static ItemQuery query()
	{
		return query(Equipment::getAll);
	}

	public static ItemQuery query(Supplier<List<Item>> supplier)
	{
		return new ItemQuery(supplier);
	}

	public static List<Item> getAll()
	{
		return getAll(x -> true);
	}

	public static List<Item> getAll(Predicate<Item> filter)
	{
		return EQUIPMENT.all(filter);
	}

	public static List<Item> getAll(int... ids)
	{
		return EQUIPMENT.all(ids);
	}

	public static List<Item> getAll(String... names)
	{
		return EQUIPMENT.all(names);
	}

	public static Item getFirst(Predicate<Item> filter)
	{
		return EQUIPMENT.first(filter);
	}

	public static Item getFirst(int... ids)
	{
		return EQUIPMENT.first(ids);
	}

	public static Item getFirst(String... names)
	{
		return EQUIPMENT.first(names);
	}

	private static WidgetInfo getEquipmentWidgetInfo(int itemIndex)
	{
		for (EquipmentInventorySlot equipmentInventorySlot : EquipmentInventorySlot.values())
		{
			if (equipmentInventorySlot.getSlotIdx() == itemIndex)
			{
				return equipmentInventorySlot.getWidgetInfo();
			}
		}

		return null;
	}

	public static boolean contains(Predicate<Item> filter)
	{
		return EQUIPMENT.exists(filter);
	}

	public static boolean contains(int... id)
	{
		return EQUIPMENT.exists(id);
	}

	public static boolean contains(String... name)
	{
		return EQUIPMENT.exists(name);
	}

	public static int getCount(boolean stacks, Predicate<Item> filter)
	{
		return EQUIPMENT.count(stacks, filter);
	}

	public static int getCount(boolean stacks, int... ids)
	{
		return EQUIPMENT.count(stacks, ids);
	}

	public static int getCount(boolean stacks, String... names)
	{
		return EQUIPMENT.count(stacks, names);
	}

	public static int getCount(Predicate<Item> filter)
	{
		return EQUIPMENT.count(false, filter);
	}

	public static int getCount(int... ids)
	{
		return EQUIPMENT.count(false, ids);
	}

	public static int getCount(String... names)
	{
		return EQUIPMENT.count(false, names);
	}

	public static Item fromSlot(EquipmentInventorySlot slot)
	{
		return getFirst(x -> slot.getWidgetInfo().getPackedId() == x.getWidgetId());
	}

	public static @Nullable Instant getLastUpdated()
	{
		return EQUIPMENT.lastUpdated();
	}
}
