package net.unethicalite.api.movement.pathfinder.model.requirement;

import lombok.Value;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

import java.util.List;

@Value
public class ItemRequirement implements Requirement
{
    Reduction reduction;
    boolean equipped;
    List<Integer> ids;
    int amount;

    @Override
    public Boolean get()
    {
        switch (reduction)
        {
            case AND:
                if (equipped)
                {
                    return ids.stream().allMatch(it -> Equipment.getCount(true, it) >= amount);
                }
                else
                {
                    return ids.stream().allMatch(it -> Inventory.getCount(true, it) >= amount);
                }
            case OR:
                if (equipped)
                {
                    return ids.stream().anyMatch(it -> Equipment.getCount(true, it) >= amount);
                }
                else
                {
                    return ids.stream().anyMatch(it -> Inventory.getCount(true, it) >= amount);
                }
            case NOT:
                if (equipped)
                {
                    return ids.stream().noneMatch(it -> Equipment.getCount(true, it) >= amount);
                }
                else
                {
                    return ids.stream().noneMatch(it -> Inventory.getCount(true, it) >= amount);
                }
        }
        return false;
    }
}
