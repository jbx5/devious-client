package net.runelite.client.plugins.jrcbirdhouses.tasks;

import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.runelite.client.plugins.jrcbirdhouses.JRCBirdHousesPlugin;

public class WaitAtBank extends BirdHouseTask
{
    public WaitAtBank(JRCBirdHousesPlugin context)
    {
        super(context);
    }

    @Override
    public boolean validate()
    {
        return !FOSSIL_ISLAND_CHEST_POINT.dx(-1).equals(Players.getLocal().getWorldLocation());
    }

    @Override
    public int execute()
    {
        if (Movement.isWalking())
        {
            return -1;
        }

        Movement.walkTo(FOSSIL_ISLAND_CHEST_POINT.dx(-1));
        return -3;
    }
}