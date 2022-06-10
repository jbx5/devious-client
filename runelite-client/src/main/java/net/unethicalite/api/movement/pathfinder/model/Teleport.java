package net.unethicalite.api.movement.pathfinder.model;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

@Value
public class Teleport
{
	WorldPoint destination;
	int radius;
	Runnable handler;
}
