package net.runelite.client.plugins.jrczulrah.data.phases;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public enum SafeSpot
{
    NORTH_EAST(6, 9),
    NORTH_WEST(-4, 10),
    WEST(-4, 4),
    EAST(4, 4),
    EAST_PLUS_1(4, 3),
    CENTER_WEST(-4, 1),
    CENTER_EAST(4, 1),
    CENTER(0, 0);

    private final int offsetX;
    private final int offsetY;
}