package net.unethicalite.api.items;

import lombok.Getter;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.InventoryManager;

public abstract class Items
{
	@Getter
	private final InventoryID inventoryID;
	private final Function<Item, Boolean> modification;

	protected Items(InventoryID inventoryID, Function<Item, Boolean> modification)
	{
		this.inventoryID = inventoryID;
		this.modification = modification;
	}

	protected List<Item> all(Predicate<Item> filter)
	{
		List<Item> items = new ArrayList<>();
		ItemContainerSnapshot containerSnapshot = getSnapshot();
		if (containerSnapshot == null)
		{
			return items;
		}

		Item[] snapshotItems = containerSnapshot.getItems();

		cacheUncachedItems(snapshotItems);

		for (int i = 0; i < snapshotItems.length; i++)
		{
			Item item = snapshotItems[i];

			if (item == null || item.getId() == -1 || "null".equals(item.getName()))
			{
				continue;
			}

			item.setSlot(i);

			if (modification.apply(item) && filter.test(item))
			{
				items.add(item);
			}
		}

		return items;
	}

	protected List<Item> all(String... names)
	{
		return all(Predicates.names(names));
	}

	protected List<Item> all(int... ids)
	{
		return all(Predicates.ids(ids));
	}

	protected Item first(Predicate<Item> filter)
	{
		return all(filter).stream().findFirst().orElse(null);
	}

	protected Item first(int... ids)
	{
		return first(Predicates.ids(ids));
	}

	protected Item first(String... names)
	{
		return first(Predicates.names(names));
	}

	protected boolean exists(Predicate<Item> filter)
	{
		return first(filter) != null;
	}

	protected boolean exists(String... name)
	{
		return first(name) != null;
	}

	protected boolean exists(int... id)
	{
		return first(id) != null;
	}

	protected int count(boolean stacks, Predicate<Item> filter)
	{
		return all(filter).stream().mapToInt(x -> stacks ? x.getQuantity() : 1).sum();
	}

	protected int count(boolean stacks, int... ids)
	{
		return all(ids).stream().mapToInt(x -> stacks ? x.getQuantity() : 1).sum();
	}

	protected int count(boolean stacks, String... names)
	{
		return all(names).stream().mapToInt(x -> stacks ? x.getQuantity() : 1).sum();
	}

	protected void cacheUncachedItems(Item[] items)
	{
		Client client = Static.getClient();
		List<Item> uncachedItems = Arrays.stream(items)
			.filter(i -> !client.isItemDefinitionCached(i.getId()))
			.collect(Collectors.toList());
		if (!uncachedItems.isEmpty())
		{
			GameThread.invoke(() ->
			{
				for (Item uncachedItem : uncachedItems)
				{
					int id = uncachedItem.getId();
					client.cacheItem(id, client.getItemComposition(id));
				}
			});
		}
	}

	protected @Nullable Instant lastUpdated()
	{
		final ItemContainerSnapshot snapshot = getSnapshot();

		if (snapshot == null)
		{
			return null;
		}

		return snapshot.getTimestamp();
	}

	private @Nullable ItemContainerSnapshot getSnapshot()
	{
		return InventoryManager.getCachedContainers().get(inventoryID.getId());
	}
}
