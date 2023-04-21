package net.runelite.client.plugins.jrczulrah.tasks;

import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.widgets.Prayers;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.runelite.client.plugins.jrczulrah.data.Constants;
import net.runelite.client.plugins.jrczulrah.data.phases.ZulrahCycle;
import net.runelite.client.plugins.jrczulrah.framework.ZulrahTask;

import javax.inject.Inject;

import static net.runelite.client.plugins.jrczulrah.JRCZulrahPlugin.atZulrah;

public class TogglePrayers extends ZulrahTask
{

    private boolean enable = false;

    @Inject
    private JRCZulrahConfig config;

    @Override
    public boolean validate()
    {
        NPC zulrah = NPCs.getNearest(Constants.ZULRAH_NAME);
        if (!atZulrah())
        {
            if (enable)
            {
                enable = false;
            }
        }

        if (getZulrahCycle() != null && !enable && !getZulrahCycle().equals(ZulrahCycle.INITIAL))
        {
            enable = true;
        }

        return zulrah != null
                && zulrah.getHealthRatio() != 0
                && atZulrah()
                && (canToggleOffensive() || canToggleDefensive());
    }

    @Override
    public int execute()
    {
        if (canToggleDefensive())
        {
            Prayer defensive = getZulrahCycle().getZulrahType().getDefensivePrayer();
            if (getZulrahCycle() != null)
            {
                Prayers.toggle(defensive);
                Time.sleepUntil(() -> Prayers.isEnabled(defensive), 1200);
                return 300;
            }
        }

        if (canToggleOffensive())
        {
            Prayer offensive = getZulrahCycle().getZulrahType().getOffensivePrayer(config);
            if (getZulrahCycle() != null)
            {
                Prayers.toggle(offensive);
                Time.sleepUntil(() -> Prayers.isEnabled(offensive), 1200);
                return 300;
            }
        }

        return 100;
    }

    private boolean canToggleOffensive()
    {
        return getZulrahCycle() != null
                && atZulrah()
                && Prayers.getPoints() > 0
                && Skills.getLevel(Skill.PRAYER) >= 45
                && !Prayers.isEnabled(getZulrahCycle().getZulrahType().getOffensivePrayer(config));
    }

    private boolean canToggleDefensive()
    {
        return getZulrahCycle() != null
                && enable
                && atZulrah()
                && !getZulrahCycle().isJad()
                && !getZulrahCycle().isMelee()
                && Prayers.getPoints() > 0
                && !Prayers.isEnabled(getZulrahCycle().getZulrahType().getDefensivePrayer());
    }

    @Override
    public boolean isBlocking()
    {
        return false;
    }
}