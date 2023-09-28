package net.unethicalite.api.movement.pathfinder;

import lombok.Data;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.pathfinder.model.Transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import static net.unethicalite.api.movement.pathfinder.model.MovementConstants.*;

@Data
@Slf4j
public class Pathfinder implements Callable<List<WorldPoint>>
{
	final CollisionMap map;
	final Map<WorldPoint, List<Transport>> transports;
	private List<Node> start;
	private WorldArea target;
	private List<WorldPoint> targetTiles;
	private final List<Node> boundary = new LinkedList<>();
	private final Set<WorldPoint> visited = new HashSet<>();
	private Node nearest;
	boolean avoidWilderness;

	private static boolean isInWilderness(WorldPoint location)
	{
		return location.isInArea2D(WILDERNESS_ABOVE_GROUND, WILDERNESS_UNDERGROUND) &&
			!location.isInArea2D(FEROX_ENCLAVE);
	}

	public Pathfinder(CollisionMap collisionMap, Map<WorldPoint, List<Transport>> transports, List<WorldPoint> start, WorldPoint target, boolean avoidWilderness)
	{
		this(collisionMap, transports, start, target.toWorldArea(), avoidWilderness);
	}

	public Pathfinder(CollisionMap collisionMap, Map<WorldPoint, List<Transport>> transports, List<WorldPoint> start, WorldArea target, boolean avoidWilderness)
	{
		this.map = collisionMap;
		this.transports = transports;
		this.target = target;
		this.targetTiles = target.toWorldPointList();
		this.start = new ArrayList<>();
		this.start.addAll(start.stream().map(point -> new Node(point, null)).collect(Collectors.toList()));
		this.nearest = null;
		this.avoidWilderness = avoidWilderness;
		if (targetTiles.stream().allMatch(collisionMap::fullBlock))
		{
			log.warn("Walking to a {}, pathfinder will be slow", targetTiles.size() == 1 ? "blocked tile" : "fully blocked area");
		}
	}

	private void addNeighbors(Node node)
	{
		int x = node.position.getX();
		int y = node.position.getY();
		int plane = node.position.getPlane();

		if (map.w(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x - 1, y, plane));
		}

		if (map.e(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x + 1, y, plane));
		}

		if (map.s(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x, y - 1, plane));
		}

		if (map.n(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x, y + 1, plane));
		}

		if (map.sw(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x - 1, y - 1, plane));
		}

		if (map.se(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x + 1, y - 1, plane));
		}

		if (map.nw(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x - 1, y + 1, plane));
		}

		if (map.ne(x, y, plane))
		{
			addNeighbor(node, new WorldPoint(x + 1, y + 1, plane));
		}

		for (Transport transport : transports.getOrDefault(node.position, new ArrayList<>()))
		{
			addNeighbor(node, transport.getDestination());
		}
	}

	private void addNeighbor(Node node, WorldPoint neighbor)
	{
		if (avoidWilderness && isInWilderness(neighbor) && !isInWilderness(node.position) && targetTiles.stream().noneMatch(Pathfinder::isInWilderness))
		{
			return;
		}

		if (!visited.add(neighbor))
		{
			return;
		}

		boundary.add(new Node(neighbor, node));
	}

	public List<WorldPoint> find()
	{
		long startTime = System.currentTimeMillis();
		List<WorldPoint> path = find(5_000_000);
		String targetStr = targetTiles.size() == 1 ? target.toWorldPoint().toString() :
			String.format("WorldArea(x=%s, y=%s, width=%s, height=%s, plane=%s)",
				target.getX(), target.getY(), target.getWidth(), target.getHeight(), target.getPlane());
		log.debug("Path calculation took {} ms to {}", System.currentTimeMillis() - startTime, targetStr);
		return path;
	}

	public List<WorldPoint> find(int maxSearch)
	{
		boundary.addAll(start);

		int bestDistance = Integer.MAX_VALUE;

		while (!boundary.isEmpty())
		{
			if (Thread.interrupted())
			{
				return List.of();
			}

			if (visited.size() >= maxSearch)
			{
				return nearest.path();
			}

			Node node = boundary.remove(0);

			if (target.contains(node.position))
			{
				return node.path();
			}

			int distance = target.distanceTo(node.position);
			if (nearest == null || distance < bestDistance)
			{
				nearest = node;
				bestDistance = distance;
			}

			addNeighbors(node);
		}

		if (nearest != null)
		{
			return nearest.path();
		}
		return List.of();
	}

	@Override
	public List<WorldPoint> call() throws Exception
	{
		return find();
	}

	@Value
	private static class Node
	{
		WorldPoint position;
		Node previous;


		public List<WorldPoint> path()
		{
			List<WorldPoint> path = new LinkedList<>();
			Node node = this;

			while (node != null)
			{
				path.add(0, node.position);
				node = node.previous;
			}

			return new ArrayList<>(path);
		}
	}
}
