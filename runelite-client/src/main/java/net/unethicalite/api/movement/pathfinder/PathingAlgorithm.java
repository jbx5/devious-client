package net.unethicalite.api.movement.pathfinder;

import java.util.List;
import net.runelite.api.coords.WorldPoint;

public interface PathingAlgorithm
{
	List<WorldPoint> find();
}
