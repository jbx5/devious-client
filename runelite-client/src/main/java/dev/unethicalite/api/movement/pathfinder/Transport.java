package dev.unethicalite.api.movement.pathfinder;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

@Value
public class Transport
{
	WorldPoint source;
	WorldPoint destination;
	int sourceRadius;
	int destinationRadius;
	Runnable handler;
	String[] actions;
}
