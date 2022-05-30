package net.unethicalite.api.movement;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.movement.pathfinder.BankLocation;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Player;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Movement
{
	private static final Logger logger = LoggerFactory.getLogger(Movement.class);

	private static final int STAMINA_VARBIT = 25;
	private static final int RUN_VARP = 173;

	public static final LoadingCache<List<WorldPoint>, WorldPoint> WORLD_AREA_POINT_CACHE = CacheBuilder.newBuilder()
			.expireAfterWrite(5, TimeUnit.MINUTES)
			.build(new CacheLoader<>()
			{
				@Override
				public WorldPoint load(@NotNull List<WorldPoint> key)
				{
					List<WorldPoint> wpList = new ArrayList<>(key);
					CollisionMap cm = Static.getGlobalCollisionMap();
					wpList.removeIf(cm::fullBlock);
					return wpList.get(Rand.nextInt(0, wpList.size()));
				}
			});

	public static void setDestination(int sceneX, int sceneY)
	{
		Static.getClient().setSelectedSceneTileX(sceneX);
		Static.getClient().setSelectedSceneTileY(sceneY);
		Static.getClient().setViewportWalking(true);
	}

	public static WorldPoint getDestination()
	{
		Client client = Static.getClient();
		if (client.getDestinationX() == 0 && client.getDestinationY() == 0)
		{
			return null;
		}

		return new WorldPoint(
				client.getDestinationX() + client.getBaseX(),
				client.getDestinationY() + client.getBaseY(),
				client.getPlane()
		);
	}

	public static boolean isWalking()
	{
		Player local = Players.getLocal();
		WorldPoint destination = getDestination();
		return local.isMoving()
				&& destination != null
				&& destination.distanceTo(local) > 4;
	}

	public static void walk(WorldPoint worldPoint)
	{
		Client client = Static.getClient();
		Player local = client.getLocalPlayer();
		if (local == null)
		{
			return;
		}

		WorldPoint walkPoint = worldPoint;
		Tile destinationTile = Tiles.getAt(worldPoint);
		// Check if tile is in loaded client scene
		if (destinationTile == null)
		{
			logger.debug("Destination {} is not in scene", worldPoint);
			Tile nearestInScene = Tiles.getAll()
					.stream()
					.min(Comparator.comparingInt(x -> x.getWorldLocation().distanceTo(local.getWorldLocation())))
					.orElse(null);
			if (nearestInScene == null)
			{
				logger.debug("Couldn't find nearest walkable tile");
				return;
			}

			walkPoint = nearestInScene.getWorldLocation();
		}

		int sceneX = walkPoint.getX() - client.getBaseX();
		int sceneY = walkPoint.getY() - client.getBaseY();
		Point canv = Perspective.localToCanvas(client, LocalPoint.fromScene(sceneX, sceneY), client.getPlane());
		int x = canv != null ? canv.getX() : -1;
		int y = canv != null ? canv.getY() : -1;

		client.interact(
				0,
				MenuAction.WALK.getId(),
				sceneX,
				sceneY,
				x,
				y
		);
	}

	public static void walk(WorldArea worldArea)
	{
		Player local = Players.getLocal();

		if (worldArea.contains(local.getWorldLocation()))
		{
			return;
		}

		var points = worldArea.toWorldPointList();
		walk(points.get(Rand.nextInt(0, points.size())));
	}

	public static void walk(Locatable locatable)
	{
		walk(locatable.getWorldLocation());
	}

	public static boolean walkTo(WorldPoint worldPoint, int radius)
	{
		WorldArea worldArea = new WorldArea(
				worldPoint.dx(-radius).dy(-radius),
				worldPoint.dx(radius).dy(radius)
		);

		return Movement.walkTo(worldArea);
	}

	public static boolean walkTo(WorldArea worldArea)
	{
		try
		{
			WorldPoint wp = WORLD_AREA_POINT_CACHE.get(worldArea.toWorldPointList());
			return Walker.walkTo(wp, false);
		}
		catch (ExecutionException e)
		{
			log.error("Failed to get cached WorldPoint", e);
			return false;
		}
	}

	public static boolean walkTo(WorldPoint worldPoint)
	{
		return Walker.walkTo(worldPoint, false);
	}

	public static boolean walkTo(Locatable locatable)
	{
		return walkTo(locatable.getWorldLocation());
	}

	public static boolean walkTo(BankLocation bankLocation)
	{
		return walkTo(bankLocation.getArea());
	}

	public static boolean walkTo(int x, int y)
	{
		return walkTo(x, y, Static.getClient().getPlane());
	}

	public static boolean walkTo(int x, int y, int plane)
	{
		return walkTo(new WorldPoint(x, y, plane));
	}

	public static boolean isRunEnabled()
	{
		return Vars.getVarp(RUN_VARP) == 1;
	}

	public static void toggleRun()
	{
		Widget widget = Widgets.get(WidgetInfo.MINIMAP_TOGGLE_RUN_ORB);
		if (widget != null)
		{
			widget.interact("Toggle Run");
		}
	}

	public static boolean isStaminaBoosted()
	{
		return Vars.getBit(STAMINA_VARBIT) == 1;
	}

	public static int getRunEnergy()
	{
		return Static.getClient().getEnergy();
	}

	public static int calculateDistance(WorldPoint destination)
	{
		return calculateDistance(destination, false);
	}

	public static int calculateDistance(WorldPoint destination, boolean localRegion)
	{
		List<WorldPoint> path = Walker.buildPath(destination, localRegion);

		if (path.size() < 2)
		{
			return 0;
		}

		Iterator<WorldPoint> it = path.iterator();
		WorldPoint prev = it.next();
		WorldPoint current;
		int distance = 0;

		// WorldPoint#distanceTo() returns max int when planes are different, but since the pathfinder can traverse
		// obstacles, we just add one to the distance to account for whatever obstacle is in between the current point
		// and the next.
		while (it.hasNext())
		{
			current = it.next();
			if (prev.getPlane() != current.getPlane())
			{
				distance += 1;
			}
			else
			{
				distance += Math.max(Math.abs(prev.getX() - current.getX()), Math.abs(prev.getY() - current.getY()));
			}
		}

		return distance;
	}

	/**
	 * Uses the regional collisionmap
	 */
	public static class Local
	{
		public static boolean walkTo(WorldPoint worldPoint)
		{
			return Walker.walkTo(worldPoint, true);
		}

		public static boolean walkTo(Locatable locatable)
		{
			return walkTo(locatable.getWorldLocation());
		}

		public static boolean walkTo(BankLocation bankLocation)
		{
			return walkTo(bankLocation.getArea().toWorldPoint());
		}

		public static boolean walkTo(int x, int y)
		{
			return walkTo(x, y, Static.getClient().getPlane());
		}

		public static boolean walkTo(int x, int y, int plane)
		{
			return walkTo(new WorldPoint(x, y, plane));
		}
	}
}
