package net.runelite.client.plugins.jrcbirdhouses.tasks;

import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesPlugin;
import net.runelite.client.plugins.jrcbirdhouses.model.BirdHouse;

public class WalkToBirdHouse extends BirdHouseTask
{
    public WalkToBirdHouse(JRCBirdHousesPlugin context)
    {
        super(context);
    }

    @Override
    public boolean validate()
    {
        return getNextBirdHouse()
                .map(BirdHouse::getWorldPoint)
                .map(point -> Players.getLocal().distanceTo(point) > 10)
                .orElse(false);
    }

    @Override
    public int execute()
    {
        if (!Movement.isWalking())
        {
            getNextBirdHouse().ifPresent(house -> Movement.walkTo(house.getWorldPoint()));
        }

        return -1;
    }
}