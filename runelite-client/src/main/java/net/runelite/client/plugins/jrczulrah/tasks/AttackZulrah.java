package net.runelite.client.plugins.jrczulrah.tasks;

import com.google.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.runelite.client.plugins.jrczulrah.data.Constants;
import net.runelite.client.plugins.jrczulrah.data.phases.ZulrahCycle;
import net.runelite.client.plugins.jrczulrah.framework.ZulrahTask;

public class AttackZulrah extends ZulrahTask
{
    @Inject
    private JRCZulrahConfig config;
    @Override
    public boolean validate()
    {
        boolean canAttack =
                NPCs.getNearest(x -> x.getName().contains(Constants.ZULRAH_NAME) && x.getHealthRatio() != 0) != null
                        && NPCs.getNearest(Constants.ZULRAH_NAME).getAnimation() != Constants.DISAPPEAR_ANIMATION
                        && NPCs.getNearest(Constants.ZULRAH_NAME).getAnimation() != Constants.APPEAR_ANIMATION;

        return (getZulrahCycle() != null
                && Players.getLocal().getInteracting() == null
                && (getZulrahCycle().getSafeSpot(getOrigin()).distanceTo(Players.getLocal()) <= 8
                || getZulrahCycle().equals(ZulrahCycle.TANZ_SOUTH_CW))
                && !inCloud()
                && canAttack)
                && attackCondition();
    }

    @Override
    public int execute()
    {
        NPC zulrah = NPCs.getNearest(x -> x.getName().equals(Constants.ZULRAH_NAME) && x.getHealthRatio() != 0);
        if (zulrah != null)
        {
            zulrah.interact("Attack");
        }

        return 555;
    }

    private boolean attackCondition()
    {
        return getZulrahCycle() != ZulrahCycle.GREEN_SOUTH_E || !Players.getLocal().isMoving();
    }
}