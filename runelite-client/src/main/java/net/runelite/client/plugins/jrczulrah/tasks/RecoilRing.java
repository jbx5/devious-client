package net.runelite.client.plugins.jrczulrah.tasks;

import com.google.inject.Inject;
import net.runelite.api.Item;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.runelite.client.plugins.jrczulrah.framework.ZulrahTask;

import java.util.function.Predicate;

public class RecoilRing extends ZulrahTask
{
    @Inject
    private JRCZulrahConfig config;
    private static final Predicate<Item> RECOIL_PREDICATE = i -> i.getName().contains("Ring of recoil")
            || i.getName().contains("Ring of suffering");

    @Override
    public boolean validate()
    {
        return !Equipment.contains(RECOIL_PREDICATE) && Inventory.contains(RECOIL_PREDICATE);
    }

    @Override
    public int execute()
    {
        Inventory.getFirst(RECOIL_PREDICATE).interact("Wear");
        return 500;
    }

    @Override
    public boolean isBlocking()
    {
        return false;
    }
}