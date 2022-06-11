package net.unethicalite.client.managers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.MovementAutomated;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Pathfinder;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.PathfinderPath;
import net.unethicalite.api.movement.pathfinder.model.Teleport;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Singleton
@Slf4j
public class WalkerManager
{
	public static final int MAX_INTERACT_DISTANCE = 20;
	private static final int MIN_TILES_WALKED_IN_STEP = 7;
	private static final int MAX_TILES_WALKED_IN_STEP = 14;
	private static final int MIN_TILES_WALKED_BEFORE_RECHOOSE = 10;
	private static final int MIN_TILES_LEFT_BEFORE_RECHOOSE = 3;
	private static final int MAX_MIN_ENERGY = 50;
	private static final int MIN_ENERGY = 5;

	private static final ExecutorService executor = Executors.newSingleThreadExecutor();
	private static Future<List<WorldPoint>> pathFuture = null;
	private static WorldPoint currentDestination = null;

	private PathfinderPath cachedPath = null;

	@Inject
	WalkerManager(EventBus eventBus)
	{
		eventBus.register(this);
	}

	@Subscribe
	private void onMovementAutomated(MovementAutomated e)
	{
		Player local = Players.getLocal();
		if (e.getDestination().equals(local.getWorldLocation()))
		{
			return;
		}

		if (cachedPath == null
				|| (!cachedPath.getTiles().contains(Players.getLocal().getWorldLocation())
				|| !cachedPath.getDestination().equals(e.getDestination())))
		{
			cachedPath = new PathfinderPath(Movement.buildPath(e.getDestination()), e.getDestination());
		}

		walk(cachedPath);
	}

	private void walk(PathfinderPath path)
	{
		Player local = Players.getLocal();
		Map<WorldPoint, List<Transport>> transports = TransportLoader.buildTransportLinks();
		LinkedHashMap<WorldPoint, Teleport> teleports = TeleportLoader.buildTeleportLinks(path.getDestination());

		Static.getEntityRenderer().setCurrentPath(path);

		List<WorldPoint> tilePath = path.getTiles();

		if (tilePath == null)
		{
			log.error("Path was null");
			return;
		}

		if (tilePath.isEmpty())
		{
			log.error("Path was empty");
			return;
		}

		WorldPoint startPosition = tilePath.get(0);
		Teleport teleport = teleports.get(startPosition);
		boolean offPath = tilePath.stream().noneMatch(t -> t.distanceTo(local.getWorldLocation()) <= 5);

		if (teleport != null && offPath)
		{
			log.debug("Casting teleport {}", teleport);
			if (Players.getLocal().isIdle())
			{
				teleport.getHandler().run();
			}

			Time.sleepUntil(() -> Players.getLocal().distanceTo(teleport.getDestination()) < 10, 500);
			return;
		}

		// Refresh path if our direction changed
		if (!local.isAnimating() && offPath)
		{
			log.debug("Movement direction changed");
			tilePath = Movement.buildPath(path.getDestination());
			cachedPath = new PathfinderPath(tilePath, path.getDestination());
		}

		walk(tilePath, transports);
	}

	private boolean walk(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports)
	{
		List<WorldPoint> remainingPath = remainingPath(path);

		if (handleTransports(remainingPath, transports))
		{
			return false;
		}

		return stepAlong(remainingPath);
	}

	private boolean stepAlong(List<WorldPoint> path)
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

	private List<WorldPoint> reachablePath(List<WorldPoint> remainingPath)
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

	private boolean step(WorldPoint destination)
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

	private int recalculateDistance(int targetDistance)
	{
		int rechoose = MIN_TILES_WALKED_BEFORE_RECHOOSE + Rand.nextInt(0, targetDistance - MIN_TILES_WALKED_BEFORE_RECHOOSE + 1);
		rechoose = Math.min(rechoose, targetDistance - MIN_TILES_LEFT_BEFORE_RECHOOSE);
		return rechoose;
	}

	private boolean handleTransports(List<WorldPoint> path, Map<WorldPoint, List<Transport>> transports)
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
					|| (tileA != null && tileB != null && Reachable.isWalled(tileA, tileB)))
			{
				Transport transport = transports.getOrDefault(a, List.of()).stream()
						.filter(x -> x.getSource().equals(a))
						.filter(x -> x.getDestination().equals(b))
						.findFirst()
						.orElse(null);

				if (transport != null)
				{
					log.debug("Trying to use transport {}", transport);
					transport.getHandler().run();
					Time.sleep(2800);
					return true;
				}
			}

			if (tileA == null)
			{
				return false;
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


	private List<WorldPoint> remainingPath(List<WorldPoint> path)
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

	public static List<WorldPoint> calculatePath(
			List<WorldPoint> startPoints,
			WorldPoint destination
	)
	{
		if (pathFuture == null)
		{
			pathFuture = executor.submit(new Pathfinder(Static.getGlobalCollisionMap(),
					TransportLoader.buildTransportLinks(),
					startPoints, destination));
			currentDestination = destination;
		}

		if (!destination.equals(currentDestination))
		{
			pathFuture.cancel(true);
			pathFuture = executor.submit(new Pathfinder(Static.getGlobalCollisionMap(),
					TransportLoader.buildTransportLinks(),
					startPoints, destination));
			currentDestination = destination;
		}

		if (!pathFuture.isDone())
		{
			return List.of();
		}

		try
		{
			return pathFuture.get();
		}
		catch (Exception e)
		{
			log.error("Error getting path", e);
			return List.of();
		}
	}
}
