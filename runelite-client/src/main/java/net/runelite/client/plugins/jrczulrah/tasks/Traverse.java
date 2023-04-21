package net.runelite.client.plugins.jrczulrah.tasks;

import com.google.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.runelite.client.plugins.jrczulrah.data.phases.ZulrahCycle;
import net.runelite.client.plugins.jrczulrah.framework.ZulrahTask;

public class Traverse extends ZulrahTask
{
    @Inject
    private JRCZulrahConfig config;
    @Override
    public boolean validate()
    {
        return getZulrahCycle() != null
                && (!Players.getLocal().isMoving() || Players.getLocal().getInteracting() != null)
                && !isCloud(getZulrahCycle().getSafeSpot(getOrigin()))
                && (!getZulrahCycle().getSafeSpot(getOrigin()).equals(Players.getLocal().getWorldLocation())
                && getZulrahCycle() != ZulrahCycle.MAGMA_CENTER_NW
                && getZulrahCycle() != ZulrahCycle.MAGMA_CENTER_NE);
    }

    @Override
    public int execute()
    {
        Player local = Players.getLocal();
        WorldPoint westPillar = getOrigin().dx(-3).dy(3);
        WorldPoint eastPillar = getOrigin().dx(3).dy(3);

        if (getZulrahCycle().isCenter() && !Players.getLocal().getWorldLocation().equals(getZulrahCycle().getSafeSpot(getOrigin())))
        {
            if (westPillar.distanceTo(local) > eastPillar.distanceTo(local))
            {
                Movement.walkTo(getZulrahCycle().getSafeSpot(getOrigin()));
                return 1200;
            }

            Movement.walk(getZulrahCycle().getSafeSpot(getOrigin()));
            return 1200;
        }

        Movement.walk(getZulrahCycle().getSafeSpot(getOrigin()));
        return 500;
    }

    @Override
    public boolean isBlocking()
    {
        return false;
    }
}