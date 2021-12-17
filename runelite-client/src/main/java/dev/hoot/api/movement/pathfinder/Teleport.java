package dev.hoot.api.movement.pathfinder;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

@Value
public class Teleport {
    WorldPoint destination;
    int radius;
    Runnable handler;
}
