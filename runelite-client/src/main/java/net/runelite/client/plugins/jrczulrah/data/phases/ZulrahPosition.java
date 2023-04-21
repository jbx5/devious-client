package net.runelite.client.plugins.jrczulrah.data.phases;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public enum ZulrahPosition
{
    EAST(8, 3),
    WEST(-12, 3),
    CENTER(-2, 5),
    SOUTH(-2, -6);

    private final int offsetX;
    private final int offsetY;
}