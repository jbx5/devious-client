package net.unethicalite.api.movement.pathfinder.model.requirement;

import java.util.function.BiFunction;

public enum Comparison implements BiFunction<Integer, Integer, Boolean>
{
    LESS_THAN,
    LESS_THAN_EQUAL,
    GREATER_THAN,
    GREATER_THAN_EQUAL,
    EQUAL,
    ;

    @Override
    public Boolean apply(Integer value, Integer expected)
    {
        switch (this)
        {
            case LESS_THAN:
                return value < expected;
            case LESS_THAN_EQUAL:
                return value <= expected;
            case GREATER_THAN:
                return value > expected;
            case GREATER_THAN_EQUAL:
                return value >= expected;
            case EQUAL:
                return value.equals(expected);
        }
        return false;
    }
}
