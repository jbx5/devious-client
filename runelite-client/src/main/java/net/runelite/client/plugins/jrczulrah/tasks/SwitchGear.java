package net.runelite.client.plugins.jrczulrah.tasks;

import com.google.inject.Inject;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.runelite.client.plugins.jrczulrah.framework.ZulrahTask;

public class SwitchGear extends ZulrahTask
{
    @Inject
    private JRCZulrahConfig config;
    @Override
    public boolean validate()
    {
        return getZulrahCycle() != null && getZulrahCycle().getZulrahType().getSetup().anyUnequipped();
    }

    @Override
    public int execute()
    {
        getZulrahCycle().getZulrahType().getSetup().switchGear(50);
        return 100;
    }

    @Override
    public boolean isBlocking()
    {
        return false;
    }
}