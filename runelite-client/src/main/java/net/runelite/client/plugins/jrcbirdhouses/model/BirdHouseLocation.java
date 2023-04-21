package net.runelite.client.plugins.jrcbirdhouses.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.VarPlayer;
import net.runelite.api.coords.WorldPoint;

@RequiredArgsConstructor
@Getter
public enum BirdHouseLocation
{
    MEADOW_SOUTH(new WorldPoint(3679, 3815, 0), VarPlayer.BIRD_HOUSE_MEADOW_SOUTH),
    MEADOW_NORTH(new WorldPoint(3677, 3882, 0), VarPlayer.BIRD_HOUSE_MEADOW_NORTH),
    VALLEY_SOUTH(new WorldPoint(3763, 3755, 0), VarPlayer.BIRD_HOUSE_VALLEY_SOUTH),
    VALLEY_NORTH(new WorldPoint(3768, 3761, 0), VarPlayer.BIRD_HOUSE_VALLEY_NORTH);

    private final WorldPoint worldPoint;
    private final VarPlayer varp;


    @Override
    public String toString()
    {
        return name().substring(0, 1).toUpperCase() + name().toLowerCase().substring(1).replace("_", " ");
    }
}