package dev.hoot.api.items;

import dev.hoot.api.game.Game;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.widgets.WidgetInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Equipment extends Items
{
	private Equipment()
	{
	}

	private static final Equipment EQUIPMENT = new Equipment();

	@Override
	protected List<Item> all(Predicate<Item> filter)
	{
		List<Item> items = new ArrayList<>();
		ItemContainer container = Game.getClient().getItemContainer(InventoryID.EQUIPMENT);
		if (container == null)
		{
			return items;
		}

		Inventory.cacheItems(container);

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++)
		{
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null"))
			{
				WidgetInfo widgetInfo = getEquipmentWidgetInfo(item.getSlot());
				item.setActionParam(-1);
				item.setSlot(i);

				if (widgetInfo != null)
				{
					item.setWidgetId(widgetInfo.getPackedId());

					if (filter.test(item))
					{
						items.add(item);
					}
				}
			}
		}

		return items;
	}

	public static List<Item> getAll(Predicate<Item> filter)
	{
		return EQUIPMENT.all(filter);
	}

	public static List<Item> getAll()
	{
		return getAll(x -> true);
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

	public static int count(Predicate<Item> filter)
	{
		return getAll(filter).stream().mapToInt(Item::getQuantity).sum();
	}

	public static int count(int... id)
	{
		return getAll(id).stream().mapToInt(Item::getQuantity).sum();
	}

	public static int count(String... name)
	{
		return getAll(name).stream().mapToInt(Item::getQuantity).sum();
	}

	public static Item fromSlot(EquipmentInventorySlot slot)
	{
		return getFirst(x -> slot.getWidgetInfo().getPackedId() == x.getWidgetId());
	}
}
