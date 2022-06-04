package net.unethicalite.api.movement.pathfinder.model;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;

@Value
public class Transport
{
	WorldPoint source;
	WorldPoint destination;
	int sourceRadius;
	int destinationRadius;
	Runnable handler;
	List<TransportRequirement> requirements = new ArrayList<>();
}
