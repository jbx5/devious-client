package net.runelite.client.plugins.jrcbirdhouses.tasks;

import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.plugins.Task;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesPlugin;


@RequiredArgsConstructor
public abstract class BirdHouseTask implements Task
{
    protected static final WorldPoint FOSSIL_ISLAND_CHEST_POINT = new WorldPoint(3742, 3805, 0);

    @Delegate
    protected final JRCBirdHousesPlugin context;
}