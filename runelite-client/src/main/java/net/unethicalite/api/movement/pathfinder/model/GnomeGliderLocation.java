package net.unethicalite.api.movement.pathfinder.model;

import lombok.Getter;
import net.runelite.api.coords.WorldPoint;
@Getter
public enum GnomeGliderLocation
{
    TA_QUIR_PRIW(new WorldPoint(2464, 3501, 3), 4),
    SINDARPOS(new WorldPoint(2845, 3499, 0), 7),
    LEMANTO_ANDRA(new WorldPoint(3321, 3431, 0), 10),
    KAR_HEWO(new WorldPoint(3284, 3211, 0), 13),
    GANDIUS(new WorldPoint(2970, 2972, 0), 16),
    LEMANTOLLY_UNDRI(new WorldPoint(2544, 2972, 0), 21),
    OOKOOKOLLY_UNDRI(new WorldPoint(2711, 2801, 0), 25)
    ;

    private final WorldPoint worldPoint;
    private final int widgetID;

    GnomeGliderLocation(WorldPoint worldPoint, int destinationID)
    {
        this.worldPoint = worldPoint;
        this.widgetID = destinationID;
    }
}
