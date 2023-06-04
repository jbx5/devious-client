package net.unethicalite.api.movement;

import net.runelite.api.CollisionData;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Tile;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.Positionable;
import net.unethicalite.api.scene.Tiles;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Reachable
{
	private static final int MAX_ATTEMPTED_TILES = 64 * 64;

	public static boolean check(int flag, int checkFlag)
	{
		return (flag & checkFlag) != 0;
	}

	public static boolean isObstacle(int endFlag)
	{
		return check(endFlag, 0x100 | 0x20000 | 0x200000 | 0x1000000);
	}

	public static boolean isObstacle(WorldPoint worldPoint)
	{
		return isObstacle(getCollisionFlag(worldPoint));
	}

	public static int getCollisionFlag(WorldPoint point)
	{
		CollisionData[] collisionMaps = Static.getClient().getCollisionMaps();
		if (collisionMaps == null)
		{
			return 0xFFFFFF;
		}

		CollisionData collisionData = collisionMaps[Static.getClient().getPlane()];
		if (collisionData == null)
		{
			return 0xFFFFFF;
		}

		LocalPoint localPoint = LocalPoint.fromWorld(Static.getClient(), point);
		if (localPoint == null)
		{
			return 0xFFFFFF;
		}

		return collisionData.getFlags()[localPoint.getSceneX()][localPoint.getSceneY()];
	}

	public static boolean isWalled(Direction direction, int startFlag)
	{
		switch (direction)
		{
			case NORTH:
				return check(startFlag, 0x2);
			case SOUTH:
				return check(startFlag, 0x20);
			case WEST:
				return check(startFlag, 0x80);
			case EAST:
				return check(startFlag, 0x8);
			default:
				throw new IllegalArgumentException();
		}
	}

	public static boolean isWalled(WorldPoint source, WorldPoint destination)
	{
		return isWalled(Tiles.getAt(source), Tiles.getAt(destination));
	}

	public static boolean isWalled(Tile source, Tile destination)
	{
		WallObject wall = source.getWallObject();
		if (wall == null)
		{
			return false;
		}

		WorldPoint a = source.getWorldLocation();
		WorldPoint b = destination.getWorldLocation();

		switch (wall.getOrientationA())
		{
			case 1:
				return a.dx(-1).equals(b) || a.dx(-1).dy(1).equals(b) || a.dx(-1).dy(-1).equals(b);
			case 2:
				return a.dy(1).equals(b) || a.dx(-1).dy(1).equals(b) || a.dx(1).dy(1).equals(b);
			case 4:
				return a.dx(1).equals(b) || a.dx(1).dy(1).equals(b) || a.dx(1).dy(-1).equals(b);
			case 8:
				return a.dy(-1).equals(b) || a.dx(-1).dy(-1).equals(b) || a.dx(-1).dy(1).equals(b);
			default:
				return false;
		}
	}

	public static boolean hasDoor(WorldPoint source, Direction direction)
	{
		Tile tile = Tiles.getAt(source);
		if (tile == null)
		{
			return false;
		}

		return hasDoor(tile, direction);
	}

	public static boolean hasDoor(Tile source, Direction direction)
	{
		WallObject wall = source.getWallObject();
		if (wall == null)
		{
			return false;
		}

		return isWalled(direction, getCollisionFlag(source.getWorldLocation())) && wall.hasAction("Open", "Close");
	}

	public static boolean isDoored(Tile source, Tile destination)
	{
		WallObject wall = source.getWallObject();
		if (wall == null)
		{
			return false;
		}

		return isWalled(source, destination) && wall.hasAction("Open");
	}

	public static boolean canWalk(Direction direction, int startFlag, int endFlag)
	{
		if (isObstacle(endFlag))
		{
			return false;
		}

		return !isWalled(direction, startFlag);
	}

	public static WorldPoint getNeighbour(Direction direction, WorldPoint source)
	{
		switch (direction)
		{
			case NORTH:
				return source.dy(1);
			case SOUTH:
				return source.dy(-1);
			case WEST:
				return source.dx(-1);
			case EAST:
				return source.dx(1);
			default:
				throw new IllegalArgumentException();
		}
	}

	public static List<WorldPoint> getNeighbours(Positionable destination, Positionable current)
	{
		List<WorldPoint> out = new ArrayList<>();
		WorldPoint dest = current instanceof WorldPoint ? (WorldPoint) current : current.getWorldLocation();
		for (Direction dir : Direction.values())
		{
			WorldPoint neighbour = getNeighbour(dir, dest);
			if (!neighbour.isInScene(Static.getClient()))
			{
				continue;
			}

			if (destination instanceof Locatable)
			{
				Locatable targetObject = (Locatable) destination;
				boolean containsPoint;
				if (targetObject instanceof GameObject)
				{
					containsPoint = ((GameObject) targetObject).getWorldArea().contains(neighbour);
				}
				else
				{
					containsPoint = targetObject.getWorldLocation().equals(neighbour);
				}

				if (containsPoint
						&& (!isWalled(dir, getCollisionFlag(dest)) || targetObject instanceof WallObject))
				{
					out.add(neighbour);
					continue;
				}
			}

			if (!canWalk(dir, getCollisionFlag(dest), getCollisionFlag(neighbour)))
			{
				continue;
			}

			out.add(neighbour);
		}

		return out;
	}

	public static List<WorldPoint> getVisitedTiles(Positionable destination)
	{
		Player local = Static.getClient().getLocalPlayer();
		WorldPoint dest = destination instanceof WorldPoint ? (WorldPoint) destination : destination.getWorldLocation();
		if (local == null || !dest.isInScene(Static.getClient()))
		{
			return Collections.emptyList();
		}

		List<WorldPoint> visitedTiles = new ArrayList<>();
		LinkedList<WorldPoint> queue = new LinkedList<>();

		if (local.getWorldLocation().getPlane() != dest.getPlane())
		{
			return visitedTiles;
		}

		queue.add(local.getWorldLocation());

		while (!queue.isEmpty())
		{
			if (visitedTiles.size() > MAX_ATTEMPTED_TILES)
			{
				return visitedTiles;
			}

			WorldPoint current = queue.pop();
			visitedTiles.add(current);

			if (current.equals(dest))
			{
				return visitedTiles;
			}

			List<WorldPoint> neighbours = getNeighbours(destination, current)
					.stream().filter(x -> !visitedTiles.contains(x) && !queue.contains(x))
					.collect(Collectors.toList());
			queue.addAll(neighbours);
		}

		return visitedTiles;
	}

	/*
	 * Temp, for compatibility
	 */
	public static List<WorldPoint> getVisitedTiles(Locatable locatable)
	{
		return getVisitedTiles((Positionable) locatable);
	}

	/*
	 * Temp, for compatibility
	 */
	public static List<WorldPoint> getVisitedTiles(WorldPoint worldPoint)
	{
		return getVisitedTiles((Positionable) worldPoint);
	}

	public static boolean isInteractable(Locatable locatable)
	{
		return getInteractable(locatable).stream().anyMatch(Reachable::isWalkable);
	}

	public static List<WorldPoint> getInteractable(Locatable locatable)
	{
		WorldArea locatableArea = locatable.getWorldArea();
		WorldArea surrounding = locatableArea.offset(1);

		// List of tiles that can interact with worldArea and can be walked on
		return surrounding.toWorldPointList().stream()
			.filter(p -> !locatableArea.contains(p))
			.filter(p -> locatableArea.canMelee(Static.getClient(), p.toWorldArea()))
			.filter(p -> !isObstacle(p))
			.collect(Collectors.toList());
	}

	public static boolean isWalkable(WorldPoint worldPoint)
	{
		return getVisitedTiles(worldPoint).contains(worldPoint);
	}
}
