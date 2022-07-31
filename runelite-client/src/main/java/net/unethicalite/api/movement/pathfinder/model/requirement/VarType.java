package net.unethicalite.api.movement.pathfinder.model.requirement;

import net.unethicalite.api.game.Vars;

import java.util.function.Function;

public enum VarType implements Function<Integer, Integer>
{
    VARBIT,
    VARP;

    @Override
    public Integer apply(Integer index)
    {
        switch (this)
        {
            case VARBIT:
                return Vars.getBit(index);
            case VARP:
                return Vars.getVarp(index);
        }
        return 0;
    }
}
