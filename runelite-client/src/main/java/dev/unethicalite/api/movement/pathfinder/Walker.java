package dev.unethicalite.api.movement.pathfinder;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import dev.unethicalite.api.commons.Rand;
import dev.unethicalite.api.commons.Time;
import dev.unethicalite.api.entities.Players;
import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.movement.Movement;
import dev.unethicalite.api.movement.Reachable;
import dev.unethicalite.api.scene.Tiles;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;
import org.jetbrains.annotations.NotNull;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

@Singleton
@Slf4j
public class Walker
{
	private static final int MAX_INTERACT_DISTANCE = 20;
	private static final int MIN_TILES_WALKED_IN_STEP = 7;
	private static final int MAX_TILES_WALKED_IN_STEP = 14;
	private static final int MIN_TILES_WALKED_BEFORE_RECHOOSE = 10;
	private static final int MIN_TILES_LEFT_BEFORE_RECHOOSE = 3;
	private static final int MAX_MIN_ENERGY = 50;
	private static final int MIN_ENERGY = 5;
	private static final int MAX_NEAREST_SEARCH_ITERATIONS = 10;

	public static final LoadingCache<WorldPoint, List<WorldPoint>> PATH_CACHE = CacheBuilder.newBuilder()
			.expireAfterWrite(5, TimeUnit.MINUTES)
			.build(new CacheLoader<>()
			{
				@Override
				public List<WorldPoint> load(@NotNull WorldPoint key)
				{
					log.debug("Loading path to {}", key);
					return buildPath(key, false);
				}
			});
	public static final LoadingCache<WorldPoint, List<WorldPoint>> LOCAL_PATH_CACHE = CacheBuilder.newBuilder()
			.expireAfterWrite(5, TimeUnit.MINUTES)
			.build(new CacheLoader<>()
			{
				@Override
				public List<WorldPoint> load(@NotNull WorldPoint key)
				{
					log.debug("Loading local path to {}", key);
					return buildPath(key, true);
				}
			});

	public static boolean walkTo(WorldPoint destination, boolean localRegion)
	{
		Player local = Players.getLocal();
		if (destination.equals(local.getWorldLocation()))
		{
			return true;
		}

		if (destination.isInScene(Game.getClient()) && Reachable.isWalkable(destination))
		{
			Movement.walk(destination);
			return false;
		}

		Map<WorldPoint, List<Transport>> transports = buildTransportLinks();
		LinkedHashMap<WorldPoint, Teleport> teleports = buildTeleportLinks(destination);
		List<WorldPoint> path;

		if (!localRegion)
		{
			try
			{
				path = PATH_CACHE.get(destination);
			}
			catch (ExecutionException e)
			{
				log.error("Failed to get cached path", e);
				return false;
			}
		}
		else
		{
			try
			{
				path = LOCAL_PATH_CACHE.get(destination);
			}
			catch (ExecutionException e)
			{
				log.error("Failed to get cached path", e);
				return false;
			}
		}

		if (path == null)
		{
			log.error("Path is null");
			return false;
		}

		if (path.isEmpty())
		{
			log.error("Path was empty");
			return false;
		}

		WorldPoint startPosition = path.get(0);
		Teleport teleport = teleports.get(startPosition);

		if (teleport != null)
		{
			log.debug("Casting teleport {}", teleport);
			teleport.getHandler().run();
			Time.sleepUntil(() -> Players.getLocal().distanceTo(teleport.getDestination()) < 10, 5000);
			return false;
		}

		// Refresh path if our direction changed
		if (!local.isAnimating() && !path.contains(local.getWorldLocation()))
		{
			log.debug("Direction changed, resetting cached path towards {}", destination);
			if (!localRegion)
			{
				PATH_CACHE.refresh(destination);
			}
			else
			{
				LOCAL_PATH_CACHE.refresh(destination);
			}

			return false;
		}

		return walkAlong(destination, path, transports);
	}

	public static boolean walkAlong(WorldPoint destination, List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports)
	{
		Player local = Players.getLocal();
		WorldPoint endTile = path.get(path.size() - 1);

		if (!endTile.equals(destination) && endTile.distanceTo(destination) > 5)
		{
			log.debug("Destination {} was not in path, recalculating", destination);
			PATH_CACHE.refresh(destination);
			LOCAL_PATH_CACHE.refresh(destination);
		}

		if (local.getWorldLocation().distanceTo(endTile) > 0)
		{
			List<WorldPoint> remainingPath = remainingPath(path);

			if (handleTransports(remainingPath, transports))
			{
				return false;
			}

			return stepAlong(remainingPath);
		}

		return false;
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

		if (!Movement.isRunEnabled() && (Game.getClient().getEnergy() >= Rand.nextInt(MIN_ENERGY, MAX_MIN_ENERGY) || (local.getHealthScale() > -1 && Game.getClient().getEnergy() > 0)))
		{
			Movement.toggleRun();
			Time.sleepUntil(Movement::isRunEnabled, 2000);
			return true;
		}

		if (!Movement.isRunEnabled() && Game.getClient().getEnergy() > 0 && Movement.isStaminaBoosted())
		{
			Movement.toggleRun();
			Time.sleepUntil(Movement::isRunEnabled, 2000);
			return true;
		}

		return true;
	}

	public static int recalculateDistance(int targetDistance)
	{
		int rechoose = MIN_TILES_WALKED_BEFORE_RECHOOSE + Rand.nextInt(0, targetDistance - MIN_TILES_WALKED_BEFORE_RECHOOSE + 1);
		rechoose = Math.min(rechoose, targetDistance - MIN_TILES_LEFT_BEFORE_RECHOOSE);
		return rechoose;
	}

	public static boolean handleTransports(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports)
	{
		Player local = Players.getLocal();
		for (int i = 0; i < MAX_INTERACT_DISTANCE; i++)
		{
			if (i + 1 >= path.size())
			{
				break;
			}

			WorldPoint a = path.get(i);
			WorldPoint b = path.get(i + 1);
			Tile tileA = Tiles.getAt(a);
			if (tileA == null)
			{
				return false;
			}

			List<Transport> transportTargets = transports.get(a);
			if (transportTargets != null)
			{
				Transport transport = transportTargets.stream().filter(x -> x.getDestination().equals(b)).findFirst().orElse(null);

				if (transport != null && local.getWorldLocation().distanceTo(transport.getSource()) <= transport.getSourceRadius())
				{
					log.debug("Trying to use transport at {}", transport.getSource());
					transport.getHandler().run();
					Time.sleep(2800);
					return true;
				}
			}

			Tile tileB = Tiles.getAt(b);
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
		CollisionMap cm = Game.getGlobalCollisionMap();

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
		Player local = Game.getClient().getLocalPlayer();
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

	public static List<WorldPoint> calculatePath(
			List<WorldPoint> startPoints,
			WorldPoint destination,
			Map<WorldPoint, List<Transport>> transports,
			boolean local
	)
	{
		CollisionMap collisionMap = local ? new LocalCollisionMap() : Game.getGlobalCollisionMap();
		if (collisionMap == null)
		{
			return Collections.emptyList();
		}

		log.debug("Calculating path towards {}", destination);

		return new Pathfinder(collisionMap, transports, startPoints,
				destination).find();
	}

	public static Map<WorldPoint, List<Transport>> buildTransportLinks()
	{
		Map<WorldPoint, List<Transport>> out = new HashMap<>();
		for (Transport transport : TransportLoader.buildTransports())
		{
			out.computeIfAbsent(transport.getSource(), x -> new ArrayList<>()).add(transport);
		}

		return out;
	}

	public static List<WorldPoint> buildPath(WorldPoint destination, boolean localRegion)
	{
		Player local = Players.getLocal();
		Map<WorldPoint, List<Transport>> transports = buildTransportLinks();
		LinkedHashMap<WorldPoint, Teleport> teleports = buildTeleportLinks(destination);
		List<WorldPoint> startPoints = new ArrayList<>(teleports.keySet());
		startPoints.add(local.getWorldLocation());

		return calculatePath(startPoints, destination, transports, localRegion);
	}

	public static LinkedHashMap<WorldPoint, Teleport> buildTeleportLinks(WorldPoint destination)
	{
		LinkedHashMap<WorldPoint, Teleport> out = new LinkedHashMap<>();
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
