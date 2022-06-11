package net.unethicalite.api.movement.pathfinder.model;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

import java.util.List;

@Value
public class PathfinderPath
{
	List<WorldPoint> tiles;
	WorldPoint destination;
}
