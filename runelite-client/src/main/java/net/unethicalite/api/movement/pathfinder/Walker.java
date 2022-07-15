package net.unethicalite.api.movement.pathfinder;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.Teleport;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.RegionManager;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

@Singleton
@Slf4j
public class Walker
{
	public static final int MAX_INTERACT_DISTANCE = 20;
	private static final int MIN_TILES_WALKED_IN_STEP = 7;
	private static final int MAX_TILES_WALKED_IN_STEP = 14;
	private static final int MAX_MIN_ENERGY = 50;
	private static final int MIN_ENERGY = 5;
	private static final int MAX_NEAREST_SEARCH_ITERATIONS = 10;

	private static final ExecutorService executor = Executors.newSingleThreadExecutor();
	private static Future<List<WorldPoint>> pathFuture = null;
	private static WorldPoint currentDestination = null;
	public static boolean walkTo(WorldPoint destination)
	{
		Player local = Players.getLocal();
		if (destination.equals(local.getWorldLocation()))
		{
			return true;
		}

		Map<WorldPoint, List<Transport>> transports = buildTransportLinks();
		LinkedHashMap<WorldPoint, Teleport> teleports = buildTeleportLinks(destination);
		List<WorldPoint> path = buildPath(destination);

		Static.getEntityRenderer().setCurrentPath(path);

		if (path == null)
		{
			log.error("Path is null");
			return false;
		}

		if (path.isEmpty())
		{
			return false;
		}

		WorldPoint startPosition = path.get(0);
		Teleport teleport = teleports.get(startPosition);
		boolean offPath = path.stream().noneMatch(t -> t.distanceTo(local.getWorldLocation()) <= 5);

		if (teleport != null && offPath)
		{
			log.debug("Casting teleport {}", teleport);
			if (Players.getLocal().isIdle())
			{
				teleport.getHandler().run();
			}
			Time.sleepUntil(() -> Players.getLocal().distanceTo(teleport.getDestination()) < 10, 500);
			return false;
		}

		// Refresh path if our direction changed
		if (!local.isAnimating() && offPath)
		{
			path = buildPath(destination, true);
		}

		return walkAlong(path, transports);
	}

	public static boolean walkAlong(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports)
	{
		List<WorldPoint> remainingPath = remainingPath(path);

		if (handleTransports(remainingPath, transports))
		{
			return false;
		}

		return stepAlong(remainingPath);
	}

	public static boolean stepAlong(List<WorldPoint> path)
	{
		List<WorldPoint> reachablePath = reachablePath(path);
		if (reachablePath.isEmpty())
		{
			return false;
		}
		int nextTileIdx = reachablePath.size() - 1;
		if (nextTileIdx <= MIN_TILES_WALKED_IN_STEP)
		{
			return step(reachablePath.get(nextTileIdx));
		}

		if (nextTileIdx > MAX_TILES_WALKED_IN_STEP)
		{
			nextTileIdx = MAX_TILES_WALKED_IN_STEP;
		}

		int targetDistance = Rand.nextInt(MIN_TILES_WALKED_IN_STEP, nextTileIdx);
		return step(reachablePath.get(targetDistance));
	}

	public static List<WorldPoint> reachablePath(List<WorldPoint> remainingPath)
	{
		Player local = Players.getLocal();
		List<WorldPoint> out = new ArrayList<>();
		for (WorldPoint p : remainingPath)
		{
			Tile tile = Tiles.getAt(p);
			if (tile == null)
			{
				break;
			}

			out.add(p);
		}

		if (out.isEmpty() || out.size() == 1 && out.get(0).equals(local.getWorldLocation()))
		{
			return Collections.emptyList();
		}

		return out;
	}

	public static boolean step(WorldPoint destination)
	{
		Player local = Players.getLocal();
		log.debug("Stepping towards " + destination);
		Movement.walk(destination);

		if (local.getWorldLocation().equals(destination))
		{
			return false;
		}

		if (!Movement.isRunEnabled() && (Static.getClient().getEnergy() >= Rand.nextInt(MIN_ENERGY, MAX_MIN_ENERGY) || (local.getHealthScale() > -1 && Static.getClient().getEnergy() > 0)))
		{
			Movement.toggleRun();
			Time.sleepUntil(Movement::isRunEnabled, 2000);
			return true;
		}

		if (!Movement.isRunEnabled() && Static.getClient().getEnergy() > 0 && Movement.isStaminaBoosted())
		{
			Movement.toggleRun();
			Time.sleepUntil(Movement::isRunEnabled, 2000);
			return true;
		}

		return true;
	}

	public static boolean handleTransports(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports)
	{
		for (int i = 0; i < MAX_INTERACT_DISTANCE; i++)
		{
			if (i + 1 >= path.size())
			{
				break;
			}

			WorldPoint a = path.get(i);
			WorldPoint b = path.get(i + 1);

			Tile tileA = Tiles.getAt(a);
			Tile tileB = Tiles.getAt(b);

			if (a.distanceTo(b) > 1
					|| (tileA != null && tileB != null && !Reachable.isWalkable(b)))
			{
				Transport transport = transports.getOrDefault(a, List.of()).stream()
						.filter(x -> x.getSource().equals(a))
						.filter(x -> x.getDestination().equals(b))
						.findFirst()
						.orElse(null);

				if (transport != null)
				{
					log.debug("Trying to use transport at {} to move {} -> {}", transport.getSource(), a, b);
					transport.getHandler().run();
					Time.sleepTick();
					return true;
				}
			}

			if (tileA == null)
			{
				return false;
			}

			if (Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() + b.getY()) > 1 && a.getPlane() == b.getPlane())
			{
				TileObject wall = TileObjects.getFirstAt(tileA, it ->
						!(it instanceof WallObject) && it.getName() != null && it.getName().equals("Door")
				);
				if (wall != null && wall.hasAction("Open"))
				{
					log.debug("Handling diagonal door {}", wall.getWorldLocation());
					wall.interact("Open");
					Time.sleepUntil(() -> !wall.hasAction("Open"), 2000);
					return true;
				}
			}

			if (tileB == null)
			{
				return false;
			}

			if (Reachable.isDoored(tileA, tileB))
			{
				WallObject wall = tileA.getWallObject();
				wall.interact("Open");
				log.debug("Handling door {}", wall.getWorldLocation());
				Time.sleepUntil(() -> tileA.getWallObject() == null
						|| !wall.hasAction("Open"), 2000);
				return true;
			}

			if (Reachable.isDoored(tileB, tileA))
			{
				WallObject wall = tileB.getWallObject();
				wall.interact("Open");
				log.debug("Handling door {}", wall.getWorldLocation());
				Time.sleepUntil(() -> tileB.getWallObject() == null
						|| !wall.hasAction("Open"), 2000);
				return true;
			}
		}

		return false;
	}

	public static WorldPoint nearestWalkableTile(WorldPoint source, Predicate<WorldPoint> filter)
	{
		CollisionMap cm = Static.getGlobalCollisionMap();

		if (!cm.fullBlock(source) && filter.test(source))
		{
			return source;
		}

		int currentIteration = 1;
		for (int radius = currentIteration; radius < MAX_NEAREST_SEARCH_ITERATIONS; radius++)
		{
			for (int x = -radius; x < radius; x++)
			{
				for (int y = -radius; y < radius; y++)
				{
					WorldPoint p = source.dx(x).dy(y);
					if (cm.fullBlock(p) || !filter.test(p))
					{
						continue;
					}
					return p;
				}
			}
		}
		log.debug("Could not find a walkable tile near {}", source);
		return null;
	}

	public static WorldPoint nearestWalkableTile(WorldPoint source)
	{
		return nearestWalkableTile(source, x -> true);
	}

	public static List<WorldPoint> remainingPath(List<WorldPoint> path)
	{
		Player local = Static.getClient().getLocalPlayer();
		if (local == null)
		{
			return Collections.emptyList();
		}

		var nearest = path.stream().min(Comparator.comparingInt(x -> x.distanceTo(local.getWorldLocation())))
				.orElse(null);
		if (nearest == null)
		{
			return Collections.emptyList();
		}

		return path.subList(path.indexOf(nearest), path.size());
	}

	private static List<WorldPoint> calculatePath(
			List<WorldPoint> startPoints,
			WorldPoint destination,
			boolean avoidWilderness,
			boolean forced
	)
	{
		if (pathFuture == null)
		{
			pathFuture = executor.submit(new Pathfinder(Static.getGlobalCollisionMap(), buildTransportLinks(), startPoints, destination, avoidWilderness));
			currentDestination = destination;
		}

		if (!destination.equals(currentDestination) || RegionManager.shouldRefreshPath() || forced)
		{
			pathFuture.cancel(true);
			pathFuture = executor.submit(new Pathfinder(Static.getGlobalCollisionMap(), buildTransportLinks(), startPoints, destination, avoidWilderness));
			currentDestination = destination;
		}

		try
		{
			// 16-17ms for 60fps, 6-7ms for 144fps
			return pathFuture.get(10, TimeUnit.MILLISECONDS);
		}
		catch (Exception e)
		{
			log.debug("Path is loading");
			return List.of();
		}
	}

	public static List<WorldPoint> buildPath(WorldPoint destination, boolean avoidWilderness, boolean forced)
	{
		Player local = Players.getLocal();
		LinkedHashMap<WorldPoint, Teleport> teleports = buildTeleportLinks(destination);
		List<WorldPoint> startPoints = new ArrayList<>(teleports.keySet());
		startPoints.add(local.getWorldLocation());

		return calculatePath(startPoints, destination, avoidWilderness, forced);
	}

	public static List<WorldPoint> buildPath(WorldPoint destination)
	{
		return buildPath(destination, RegionManager.avoidWilderness(), false);
	}

	public static List<WorldPoint> buildPath(WorldPoint destination, boolean forced)
	{
		return buildPath(destination, RegionManager.avoidWilderness(), forced);
	}

	public static Map<WorldPoint, List<Transport>> buildTransportLinks()
	{
		Map<WorldPoint, List<Transport>> out = new HashMap<>();
		if (!Static.getUnethicaliteConfig().useTransports())
		{
			return out;
		}

		for (Transport transport : TransportLoader.buildTransports())
		{
			out.computeIfAbsent(transport.getSource(), x -> new ArrayList<>()).add(transport);
		}

		return out;
	}

	public static LinkedHashMap<WorldPoint, Teleport> buildTeleportLinks(WorldPoint destination)
	{
		LinkedHashMap<WorldPoint, Teleport> out = new LinkedHashMap<>();
		if (!Static.getUnethicaliteConfig().useTeleports())
		{
			return out;
		}

		Player local = Players.getLocal();

		for (Teleport teleport : TeleportLoader.buildTeleports())
		{
			if (teleport.getDestination().distanceTo(local.getWorldLocation()) > 50
					&& local.getWorldLocation().distanceTo(destination) > teleport.getDestination().distanceTo(destination) + 20)
			{
				out.putIfAbsent(teleport.getDestination(), teleport);
			}
		}

		return out;
	}
}
