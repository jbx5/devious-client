package net.runelite.client.plugins.jrczulrah.tasks;

import com.google.inject.Inject;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Task;

public class EnterZulrah implements Task
{
    @Inject
    private JRCZulrahConfig config;
    private static final WorldPoint BOAT_LOC = new WorldPoint(2215, 3057, 0);

    @Override
    public boolean validate()
    {
        return TileObjects.getFirstSurrounding(BOAT_LOC, 10, x -> x.hasAction("Quick-Board")) != null;
    }

    @Override
    public int execute()
    {
        TileObject boat = TileObjects.getFirstSurrounding(BOAT_LOC, 10, x -> x.hasAction("Quick-Board"));
        if (Movement.isWalking())
        {
            return 1000;
        }

        if (boat != null)
        {
            boat.interact("Quick-Board");
        }

        return 1000;
    }
}