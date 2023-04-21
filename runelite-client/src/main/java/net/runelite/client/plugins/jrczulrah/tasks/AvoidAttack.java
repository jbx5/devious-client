package net.runelite.client.plugins.jrczulrah.tasks;

import com.google.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.runelite.client.plugins.jrczulrah.data.Constants;
import net.runelite.client.plugins.jrczulrah.data.phases.ZulrahCycle;
import net.runelite.client.plugins.jrczulrah.framework.ZulrahTask;

import java.util.List;

public class AvoidAttack extends ZulrahTask
{
    @Inject
    private JRCZulrahConfig config;
    private static final List<Integer> DANGEROUS_ROTATIONS = List.of(1944, 1641, 2048, 2492, 2550);
    private WorldPoint initial;
    private WorldPoint avoid;

    @Override
    public boolean validate()
    {
        return getZulrahCycle() != null
                && (getZulrahCycle() == ZulrahCycle.MAGMA_CENTER_NW || getZulrahCycle() == ZulrahCycle.MAGMA_CENTER_NE)
                && (Players.getLocal().getInteracting() != null || inCloud()
                || getZulrahCycle().getSafeSpot(getOrigin()).distanceTo(Players.getLocal()) > 4)
                && !Movement.isWalking();
    }

    @Override
    public int execute()
    {
        NPC zulrah = NPCs.getNearest(Constants.ZULRAH_NAME);
        initial = getZulrahCycle().getSafeSpot(getOrigin());
        WorldPoint myPos = Players.getLocal().getWorldLocation();

        if (zulrah != null)
        {
            int sum = zulrah.getOrientation() + Players.getLocal().getOrientation();
            if (getZulrahCycle() == ZulrahCycle.MAGMA_CENTER_NW)
            {
                avoid = initial.dx(-1).dy(-3);
            }
            else
            {
                avoid = initial.dx(-2).dy(0);
            }

            if (!DANGEROUS_ROTATIONS.contains(sum))
            {
                if (initial.distanceTo(myPos) > 4 && !Movement.isWalking())
                {
                    Movement.walk(avoid);
                }
            }
            else
            {
                if (avoid.equals(myPos)
                        && !Movement.isWalking())
                {
                    Movement.walk(initial);
                }
                else if (!Movement.isWalking())
                {
                    Movement.walk(avoid);
                }
            }
        }
        else if (!myPos.equals(initial) && !Movement.isWalking())
        {
            Movement.walk(initial);
        }

        return 300;
    }
}