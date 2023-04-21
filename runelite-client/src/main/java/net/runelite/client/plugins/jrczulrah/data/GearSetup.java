package net.runelite.client.plugins.jrczulrah.data;

import com.google.inject.Inject;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.Item;
import net.runelite.client.plugins.jrczulrah.JRCZulrahConfig;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public final class GearSetup
{
    @Inject
    private JRCZulrahConfig config;
    private final List<String> items;

    public boolean anyUnequipped()
    {
        for (String item : items)
        {
            if (Inventory.contains(e -> e.getName().contains(item)))
            {
                return true;
            }
        }

        return false;
    }

    public boolean allInInv()
    {
        for (String item : items)
        {
            if (!Inventory.contains(e -> e.getName().contains(item)))
            {
                return false;
            }
        }

        return true;
    }

    public boolean hasItem(String item)
    {
        return items.stream().anyMatch(x -> x.contains(item));
    }

    public boolean hasAnyItem(String... item)
    {
        for (String i : items)
        {
            for (String j : item)
            {
                if (i.contains(j))
                {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean carryingAllItems()
    {
        for (String item : items)
        {
            if (!Inventory.contains(e -> e.getName().contains(item)) && !Equipment.contains(e -> e.getName().contains(item)))
            {
                return false;
            }
        }

        return true;
    }

    public boolean hasExactItem(String item)
    {
        return items.stream().anyMatch(x -> x.equals(item));
    }

    public int switchGear(int delay)
    {
        List<Item> ordered = Inventory.getAll().stream()
                .filter(e -> items.stream().anyMatch(g -> e.getName().contains(g)))
                .sorted(Comparator.comparingInt(e -> e.getSlot() % 4))
                .collect(Collectors.toList());

        for (Item i : ordered)
        {
            i.interact(x -> x != null && (x.toLowerCase().contains("wear")
                    || x.toLowerCase().contains("wield")
                    || x.toLowerCase().contains("equip")));
            Time.sleep(delay);
        }

        return 50;
    }
}