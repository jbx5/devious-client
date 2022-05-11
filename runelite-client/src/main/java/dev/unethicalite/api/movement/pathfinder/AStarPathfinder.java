package dev.unethicalite.api.movement.pathfinder;

import dev.unethicalite.api.entities.Players;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import dev.unethicalite.client.Static;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;

@Slf4j
@RequiredArgsConstructor
public class AStarPathfinder implements PathingAlgorithm
{
	private static final int MAX_EXPLORATION_FACTOR = 2;
	private static final long TIMEOUT = 3000;
	private final CollisionMap collisionMap;
	private final Map<WorldPoint, List<Transport>> transportCoords;
	private final List<WorldPoint> startCoords;
	private final WorldPoint destination;
	private final CoordMap predecessors = new CoordMap();
	private final Map<Integer, List<Transport>> transportRegions = new HashMap<>();

	public List<WorldPoint> find()
	{
		if (destination.isInScene(Static.getClient()))
		{
			// DFS if destination is in scene
			return null;
		}

		if (startCoords.isEmpty())
		{
			return Collections.emptyList();
		}

		transportCoords.forEach((k, v) -> transportRegions.put(k.getRegionID(), v));

		long startTime = System.currentTimeMillis();
		final Map<WorldPoint, Integer> distanceMap = new HashMap<>();
		final Map<WorldPoint, Integer> approximatedDistanceMap = new HashMap<>();

		final PriorityQueue<WorldPoint> visiting = new PriorityQueue<>(
			(o1, o2) -> {
				float first = approximatedDistanceMap.get(o1);
				float second = approximatedDistanceMap.get(o2);
				return (int) (first - second);
			}
		);

		approximatedDistanceMap.put(destination, heuristic(Players.getLocal().getWorldLocation(), destination));

		for (WorldPoint start : startCoords)
		{
			distanceMap.put(start, 0);
			final int heuristic = heuristic(start, destination);
			approximatedDistanceMap.put(start, heuristic);
			predecessors.put(start, null);

			visiting.add(start);
		}

		long start = System.currentTimeMillis();
		while (!visiting.isEmpty())
		{
			if (System.currentTimeMillis() - start > TIMEOUT)
			{
				return null;
			}
			final WorldPoint current = visiting.poll();
			final int distance = distanceMap.get(current);
			final Map<WorldPoint, Float> neighbours = getNeighbours(current);
			for (WorldPoint neighbour : neighbours.keySet())
			{

				int newDistance = (int) (distance + neighbours.get(neighbour));
				int oldDistance = distanceMap.getOrDefault(neighbour, Integer.MAX_VALUE);
				if (newDistance >= oldDistance)
				{
					continue;
				}

				int approx = newDistance + heuristicTransports(neighbour, destination);
				approximatedDistanceMap.put(neighbour, approx);
				if (approx > approximatedDistanceMap.get(destination) * MAX_EXPLORATION_FACTOR)
				{
					continue;
				}

				predecessors.put(neighbour, current);
				distanceMap.put(neighbour, newDistance);
				visiting.add(neighbour);
			}
		}

		LinkedList<WorldPoint> result = new LinkedList<>();
		WorldPoint node = predecessors.getNearestWorldPointTo(destination).orElse(destination);
		while (node != null)
		{
			result.add(0, node);
			node = predecessors.get(node);
		}

		log.debug("Found path from {} to {} (length {}), in {} ms", Players.getLocal().getWorldLocation(), destination, result.size(), System.currentTimeMillis() - startTime);
		return result;
	}

	private int heuristic(WorldPoint a, WorldPoint b)
	{
		return (int) (a.distanceTo2DHypotenuse(b));
	}

	private int heuristicTransports(WorldPoint a, WorldPoint b)
	{
		int hScore = heuristic(a, b);
		int tScore = transportBased(a, b);
		return Math.min(hScore, tScore);
	}

	private int transportBased(WorldPoint a, WorldPoint b)
	{
		int regionA = a.getRegionID();
		return transportRegions.getOrDefault(regionA, Collections.emptyList())
			.stream()
			.mapToInt(t -> heuristic(a, t.getSource()) + heuristic(t.getDestination(), b))
			.min()
			.orElse(Integer.MAX_VALUE);
	}


	private Map<WorldPoint, Float> getNeighbours(WorldPoint position)
	{
		final Map<WorldPoint, Float> result = new HashMap<>();
		for (Transport transport : transportCoords.getOrDefault(position, new ArrayList<>()))
		{
			final WorldPoint transportDest = transport.getDestination();
			result.put(transportDest, 5f);
			//TODO: Add transport costs
		}

		try
		{
			if (collisionMap.w(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dx(-1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.e(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dx(1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.s(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dy(-1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.n(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dy(1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.sw(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dx(-1).dy(-1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.se(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dx(1).dy(-1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.nw(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dx(-1).dy(1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		try
		{
			if (collisionMap.ne(position.getX(), position.getY(), position.getPlane()))
			{
				WorldPoint neighbor = position.dx(1).dy(1);
				result.put(neighbor, 1f);
			}
		}
		catch (Exception ignored)
		{

		}

		return result;
	}
}
