package net.runelite.client.plugins.jrczulrah.data.phases;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.coords.WorldPoint;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public enum ZulrahCycle
{
    INITIAL(ZulrahType.RANGE, SafeSpot.NORTH_EAST, ZulrahPosition.CENTER),

    GREEN_EAST_NE(ZulrahType.RANGE, SafeSpot.NORTH_EAST, ZulrahPosition.EAST),
    GREEN_EAST_CE(ZulrahType.RANGE, SafeSpot.CENTER_EAST, ZulrahPosition.EAST),
    GREEN_EAST_E(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.EAST),

    GREEN_CENTER_W(ZulrahType.RANGE, SafeSpot.WEST, ZulrahPosition.CENTER),
    GREEN_CENTER_E(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.CENTER),

    GREEN_WEST_W(ZulrahType.RANGE, SafeSpot.WEST, ZulrahPosition.WEST),

    GREEN_SOUTH_E_W(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.SOUTH),
    GREEN_SOUTH_W(ZulrahType.RANGE, SafeSpot.WEST, ZulrahPosition.SOUTH),
    GREEN_SOUTH_E(ZulrahType.RANGE, SafeSpot.EAST, ZulrahPosition.SOUTH),

    TANZ_EAST_NE(ZulrahType.MAGIC, SafeSpot.NORTH_EAST, ZulrahPosition.EAST),
    TANZ_EAST_E(ZulrahType.MAGIC, SafeSpot.EAST, ZulrahPosition.EAST),

    TANZ_WEST_W(ZulrahType.MAGIC, SafeSpot.WEST, ZulrahPosition.WEST),

    TANZ_CENTER_NE(ZulrahType.MAGIC, SafeSpot.NORTH_EAST, ZulrahPosition.CENTER),
    TANZ_CENTER_E(ZulrahType.MAGIC, SafeSpot.EAST, ZulrahPosition.CENTER),

    TANZ_SOUTH_E_CW(ZulrahType.MAGIC, SafeSpot.EAST_PLUS_1, ZulrahPosition.SOUTH),
    TANZ_SOUTH_CW(ZulrahType.MAGIC, SafeSpot.CENTER_WEST, ZulrahPosition.SOUTH),
    TANZ_SOUTH_C(ZulrahType.MAGIC, SafeSpot.CENTER, ZulrahPosition.SOUTH),
    TANZ_SOUTH_W(ZulrahType.MAGIC, SafeSpot.WEST, ZulrahPosition.SOUTH),

    MAGMA_CENTER_E(ZulrahType.MELEE, SafeSpot.EAST, ZulrahPosition.CENTER),
    MAGMA_CENTER_NW(ZulrahType.MELEE, SafeSpot.NORTH_WEST, ZulrahPosition.CENTER),
    MAGMA_CENTER_NE(ZulrahType.MELEE, SafeSpot.NORTH_EAST, ZulrahPosition.CENTER),
    MAGMA_CENTER_W(ZulrahType.MELEE, SafeSpot.WEST, ZulrahPosition.CENTER),

    JAD_PHASE_E(ZulrahType.JAD_MAGIC_FIRST, SafeSpot.EAST, ZulrahPosition.EAST),
    JAD_PHASE_W(ZulrahType.JAD_RANGE_FIRST, SafeSpot.WEST, ZulrahPosition.WEST);


    private final ZulrahType zulrahType;
    private final SafeSpot safeSpot;
    private final ZulrahPosition zulrahPos;

    public WorldPoint getSafeSpot(WorldPoint origin)
    {
        return origin.dx(safeSpot.getOffsetX()).dy(safeSpot.getOffsetY());
    }

    public WorldPoint getZulrahPosition(WorldPoint origin)
    {
        return origin.dx(zulrahPos.getOffsetX()).dy(zulrahPos.getOffsetY());
    }

    public boolean isJad()
    {
        return zulrahType == ZulrahType.JAD_RANGE_FIRST || zulrahType == ZulrahType.JAD_MAGIC_FIRST;
    }

    public boolean isMagic()
    {
        return zulrahType == ZulrahType.MAGIC;
    }

    public boolean isRange()
    {
        return zulrahType == ZulrahType.RANGE;
    }

    public boolean isMelee()
    {
        return zulrahType == ZulrahType.MELEE;
    }

    public boolean isCenter()
    {
        return zulrahPos == ZulrahPosition.CENTER;
    }
}