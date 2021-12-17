package dev.hoot.api.coords;

import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;

import java.util.Arrays;

public interface Area {
    boolean contains(WorldPoint worldPoint);

    static Area union(Area... areas) {
        return point -> Arrays.stream(areas).anyMatch(a -> a.contains(point));
    }

    static Area intersection(Area... areas) {
        return point -> Arrays.stream(areas).allMatch(a -> a.contains(point));
    }

    default Area minus(Area other) {
        return point -> Area.this.contains(point) && !other.contains(point);
    }

    default boolean contains(Locatable locatable) {
        return contains(locatable.getWorldLocation());
    }
}
