package dev.hoot.api.movement.pathfinder;

import net.runelite.api.coords.WorldPoint;

public interface CollisionMap {
    boolean n(int x, int y, int z);

    boolean e(int x, int y, int z);

    default boolean s(int x, int y, int z) {
        return n(x, y - 1, z);
    }

    default boolean w(int x, int y, int z) {
        return e(x - 1, y, z);
    }

    default boolean ne(int x, int y, int z) {
        return n(x, y, z) && e(x, y + 1, z) && e(x, y, z) && n(x + 1, y, z);
    }

    default boolean nw(int x, int y, int z) {
        return n(x, y, z) && w(x, y + 1, z) && w(x, y, z) && n(x - 1, y, z);
    }

    default boolean se(int x, int y, int z) {
        return s(x, y, z) && e(x, y - 1, z) && e(x, y, z) && s(x + 1, y, z);
    }

    default boolean sw(int x, int y, int z) {
        return s(x, y, z) && w(x, y - 1, z) && w(x, y, z) && s(x - 1, y, z);
    }


    default boolean n(WorldPoint worldPoint) {
        return n(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean s(WorldPoint worldPoint) {
        return s(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean w(WorldPoint worldPoint) {
        return w(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean e(WorldPoint worldPoint) {
        return e(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean ne(WorldPoint worldPoint) {
        return ne(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean nw(WorldPoint worldPoint) {
        return nw(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean se(WorldPoint worldPoint) {
        return se(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }

    default boolean sw(WorldPoint worldPoint) {
        return sw(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
    }
}
