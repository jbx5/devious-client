package dev.hoot.api.movement.pathfinder;

import dev.hoot.api.game.Game;
import dev.hoot.api.movement.Reachable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
public class Pathfinder
{
	private final CollisionMap collisionMap;
	private final Map<WorldPoint, List<Transport>> transportCoords;
	private final List<WorldPoint> startCoords;
	private final WorldPoint destination;
	private final Deque<WorldPoint> boundary = new ArrayDeque<>();
	private final CoordMap predecessors = new CoordMap();
	private WorldPoint nearest = null;

	public List<WorldPoint> find()
	{
		boundary.addAll(startCoords);
		float bestDistance = 69_420_69;

		for (WorldPoint start : startCoords)
		{
			predecessors.put(start, null);
		}

		while (!boundary.isEmpty())
		{
			WorldPoint current = boundary.removeFirst();

			if (current.equals(destination))
			{
				LinkedList<WorldPoint> result = new LinkedList<>();
				while (current != null)
				{
					result.add(0, current);
					current = predecessors.get(current);
				}

				return result;
			}

			float distance = current.distanceToHypotenuse(destination);
			if (nearest == null || distance < bestDistance)
			{
				nearest = current;
				bestDistance = distance;
			}

			try
			{
				if (distance == bestDistance && distance == 1 && !Reachable.isWalled(current, destination))
				{
					nearest = current;
				}
			}
			catch (NullPointerException e)
			{
				Walker.LOCAL_PATH_CACHE.refresh(destination);
				Walker.PATH_CACHE.refresh(destination);
			}

			if ((destination.isInScene(Game.getClient())
					&& Reachable.isObstacle(destination) && boundary.size() > 200) || boundary.size() > 50_000)
			{
				log.debug("Path is too long, cancelling calculation");
				break;
			}

			addNeighbours(current);
		}

		if (nearest != null)
		{
			LinkedList<WorldPoint> result = new LinkedList<>();
			WorldPoint node = nearest;
			while (node != null)
			{
				result.add(0, node);
				node = predecessors.get(node);
			}

			return result;
		}

		return Collections.emptyList();
	}

	private void addNeighbours(WorldPoint position)
	{
		for (Transport transport : transportCoords.getOrDefault(position, new ArrayList<>()))
		{
			if (predecessors.containsKey(transport.getDestination()))
			{
				continue;
			}

			predecessors.put(transport.getDestination(), position);
			boundary.addLast(transport.getDestination());
		}

		if (collisionMap.w(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dx(-1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putE(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.e(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dx(1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putW(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.s(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dy(-1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putN(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.n(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dy(1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putS(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.sw(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dx(-1).dy(-1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putNE(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.se(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dx(1).dy(-1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putNW(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.nw(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dx(-1).dy(1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putSE(neighbor);
				boundary.addLast(neighbor);
			}
		}

		if (collisionMap.ne(position.getX(), position.getY(), position.getPlane()))
		{
			WorldPoint neighbor = position.dx(1).dy(1);
			if (!predecessors.containsKey(neighbor))
			{
				predecessors.putSW(neighbor);
				boundary.addLast(neighbor);
			}
		}
	}
}
