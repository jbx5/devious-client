package net.unethicalite.api.movement.pathfinder;

import net.unethicalite.api.entities.Players;
import net.unethicalite.client.Static;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;

@Slf4j
@RequiredArgsConstructor
public class AStarPathfinder implements PathingAlgorithm
{
	private static final int MAX_EXPLORATION_FACTOR = 5;
	private static final long TIMEOUT = 3000;
	private static final int MAX_DESTINATION_BLOOM = 6;
	private static final int DEFAULT_TRANSPORT_COST = 20;
	private final CollisionMap collisionMap;
	private final Map<WorldPoint, List<Transport>> transportCoords;
	private final List<WorldPoint> startCoords;
	private final WorldPoint destination;
	private final CoordMap predecessors = new CoordMap();
	private final Map<Integer, List<Transport>> transportRegions = new HashMap<>();

	public List<WorldPoint> find()
	{
		long startTime = System.currentTimeMillis();
		if (destination.isInScene(Static.getClient()))
		{
			log.debug("Destination is in scene, skipping A*");
			return null;
		}

		if (startCoords.isEmpty())
		{
			return Collections.emptyList();
		}

		//WorldPoint destination = getUnblockedDestination();
		WorldPoint destination = this.destination;
		if (destination == null)
		{
			return null;
		}

		transportCoords.forEach((k, v) -> transportRegions.put(k.getRegionID(), v));


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

		log.debug("Starting A* after initialization of {} ms", System.currentTimeMillis() - startTime);
		long start = System.currentTimeMillis();
		while (!visiting.isEmpty())
		{
			if (System.currentTimeMillis() - start > TIMEOUT)
			{
				break;
			}

			final double maxExploration = distanceMap.containsKey(destination)
				? distanceMap.get(destination) * Math.sqrt(MAX_EXPLORATION_FACTOR) : approximatedDistanceMap.get(destination) * MAX_EXPLORATION_FACTOR;
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
				if (approx > maxExploration)
				{
					continue;
				}

				predecessors.put(neighbour, current);
				distanceMap.put(neighbour, newDistance);
				visiting.add(neighbour);
			}
		}

		if (!predecessors.containsKey(destination))
		{
			return null;
		}

		LinkedList<WorldPoint> result = new LinkedList<>();
		WorldPoint node = predecessors.get(destination);
		while (node != null)
		{
			result.add(0, node);
			node = predecessors.get(node);
		}

		log.debug("Found path from {} to {} (length {}), in {} ms", Players.getLocal().getWorldLocation(), destination, result.size(), System.currentTimeMillis() - start);
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
		int tImprovement = hScore - tScore;
		if (tImprovement > DEFAULT_TRANSPORT_COST)
		{
			return tScore;
		}

		return hScore;
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

	private WorldPoint getUnblockedDestination()
	{
		WorldPoint destination = this.destination;
		Stack<WorldPoint> destinations = new Stack<>();
		destinations.add(destination);
		Set<WorldPoint> checked = new HashSet<>();
		while (!destinations.isEmpty())
		{
			WorldPoint current = destinations.pop();
			if (checked.contains(current))
			{
				continue;
			}

			checked.add(current);
			if (!collisionMap.fullBlock(current))
			{
				return current;
			}

			final float bloom = current.distanceTo2D(destination);
			if (bloom > MAX_DESTINATION_BLOOM)
			{
				break;
			}

			destinations.add(current.dx(-1));
			destinations.add(current.dx(1));
			destinations.add(current.dy(-1));
			destinations.add(current.dy(1));
		}

		return destination;
	}


	private Map<WorldPoint, Float> getNeighbours(WorldPoint position)
	{
		final Map<WorldPoint, Float> result = new HashMap<>();
		for (Transport transport : transportCoords.getOrDefault(position, new ArrayList<>()))
		{
			final WorldPoint transportDest = transport.getDestination();
			result.put(transportDest, 2f);
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
