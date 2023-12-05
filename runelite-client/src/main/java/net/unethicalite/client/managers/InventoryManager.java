package net.unethicalite.client.managers;

import lombok.Getter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.ItemContainerSnapshot;

@Singleton
public class InventoryManager
{
	@Getter
	private static final Map<Integer, ItemContainerSnapshot> cachedContainers = new ConcurrentHashMap<>();

	@Inject
	private Client client;

	@Inject
	InventoryManager(EventBus eventBus)
	{
		eventBus.register(this);
	}

	@Subscribe(priority = Integer.MAX_VALUE)
	private void onItemContainerChanged(ItemContainerChanged e)
	{
		ItemContainerSnapshot items = new ItemContainerSnapshot(e);
		cachedContainers.put(e.getContainerId(), items);

		if (e.getContainerId() == InventoryID.INVENTORY.getId())
		{
			// Reload inventory
			client.runScript(6009, 9764864, 28, 1, -1);
		}
	}


}
