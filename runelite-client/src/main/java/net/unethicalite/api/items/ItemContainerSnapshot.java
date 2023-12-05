package net.unethicalite.api.items;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.time.Instant;
import net.runelite.api.Item;
import net.runelite.api.events.ItemContainerChanged;

@Getter
@RequiredArgsConstructor
public class ItemContainerSnapshot
{
    /**
     * ID of the container the snapshot was taken of.
     */
    private final int containerId;

    /**
     * Items within the inventory at the given snapshot.
     */
    private final Item[] items;

    /**
     * Snapshot creation timestamp.
     */
    private final Instant timestamp;

    public ItemContainerSnapshot(ItemContainerChanged event)
    {
        this.containerId = event.getContainerId();
        this.items = event.getItemContainer().getItems();
        this.timestamp = Instant.now();
    }

}
