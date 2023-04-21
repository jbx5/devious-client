package net.runelite.client.plugins.jrcbirdhouses.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum BirdHouseState
{
    SEEDED,
    BUILT,
    EMPTY,
    UNKNOWN;

    /**
     * Gets the {@code BirdHouseState} corresponding to the given {@code VarPlayer} value.
     */
    public static BirdHouseState fromVarpValue(int varp)
    {
        if (varp < 0 || varp > BirdHouseType.values().length * 3)
        {
            return UNKNOWN;
        }
        else if (varp == 0)
        {
            return EMPTY;
        }
        else if (varp % 3 == 0)
        {
            return SEEDED;
        }
        else
        {
            return BUILT;
        }
    }
}