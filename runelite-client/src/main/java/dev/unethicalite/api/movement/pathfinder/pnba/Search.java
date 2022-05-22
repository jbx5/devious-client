package dev.unethicalite.api.movement.pathfinder.pnba;

import dev.unethicalite.api.movement.pathfinder.CollisionMap;
import dev.unethicalite.api.movement.pathfinder.Transport;
import lombok.Value;
import net.runelite.api.coords.WorldPoint;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.ToIntBiFunction;
import java.util.stream.Collectors;

import static java.lang.Math.addExact;
import static java.util.Comparator.comparingInt;

@Value
class Search implements Runnable
{
    WorldPoint start;
    WorldPoint end;
    AtomicBoolean finished;
    AtomicInteger bestPathLength;
    Set<WorldPoint> visited;
    AtomicStampedReference<WorldPoint> bestCompletePath;
    Map<WorldPoint, Path> paths1;
    Map<WorldPoint, Path> paths2;
    ToIntBiFunction<WorldPoint, WorldPoint> estimatedDistance;
    PriorityQueue<WorldPoint> nodesToVisit;
    Map<WorldPoint, List<Transport>> transportCoords;
    CollisionMap collisionMap;
    boolean reverse;

    Search(WorldPoint start,
           WorldPoint end,
           AtomicBoolean finished,
           AtomicInteger bestPathLength,
           Set<WorldPoint> visited,
           AtomicStampedReference<WorldPoint> bestCompletePath,
           Map<WorldPoint, Path> paths1,
           Map<WorldPoint, Path> paths2,
           ToIntBiFunction<WorldPoint, WorldPoint> estimatedDistance,
           Map<WorldPoint, List<Transport>> transportCoords,
           boolean reverse,
           CollisionMap collisionMap)
    {
        this.start = start;
        this.end = end;
        this.finished = finished;
        this.bestPathLength = bestPathLength;
        this.visited = visited;
        this.bestCompletePath = bestCompletePath;
        this.paths1 = paths1;
        this.paths2 = paths2;
        this.estimatedDistance = estimatedDistance;
        this.collisionMap = collisionMap;
        this.reverse = reverse;

        if (reverse)
        {
            this.transportCoords = transportCoords.values().stream()
                                                  .flatMap(Collection::stream)
                                                  .collect(Collectors.groupingBy(Transport::getDestination));
        }
        else
        {
            this.transportCoords = transportCoords;
        }

        nodesToVisit = new PriorityQueue<>(comparingInt(x -> paths1.get(x).getDistanceTravelled()));
    }

    @Override
    public void run()
    {
        var x = start;
        while (!finished.get() && bestPathLength.get() > paths1.get(x).getDistanceTravelled())
        {
            if (!visited(x))
            {
                visit(x);
            }
            if (nodesToVisit.isEmpty())
            {
                finished.set(true);
            }
            else
            {
                x = nodesToVisit.poll();
            }
        }
    }
    private void visit(WorldPoint x)
    {
        var xPath = paths1.get(x);
        if (shouldExpand(xPath))
        {
            for (var y : getNeighbours(x))
            {
                if (!visited(y))
                {
                    var yPathOld = paths1.get(y);

                    var dist = Math.min(2, Math.abs(x.getX() - y.getX()) + Math.abs(x.getY() - y.getY()));
                    var newTotalDistanceToY = addExact(xPath.getDistanceTravelled(), dist);

                    if (yPathOld == null || newTotalDistanceToY < yPathOld.getDistanceTravelled())
                    {
                        Path betterPathToY = xPath.prepend(y,
                                                           yPathOld == null ? estimatedDistanceToGoal(y) : yPathOld.getEstimatedDistanceToGoal(),
                                                           newTotalDistanceToY,
                                                           yPathOld == null ? estimateOfActualTravel(y) : yPathOld.getEstimateOfActualTravel());
                        paths1.put(y, betterPathToY);
                        nodesToVisit.remove(y);
                        nodesToVisit.add(y);
                        updateBestCompletePath(betterPathToY);
                    }
                }
            }
        }
        visited.add(x);
    }

    private boolean shouldExpand(Path xPath)
    {
        return bestCompletePath.getReference() == null
                || addExact(xPath.getDistanceTravelled(), xPath.getEstimatedDistanceToGoal()) < bestCompleteDistance();
    }

    private void updateBestCompletePath(Path path)
    {
        var success = false;
        WorldPoint newCommonNode = path.getValue();
        while (!success)
        {
            var oldCommonNode = bestCompletePath.getReference();
            var oldDistance = bestCompleteDistance();
            var connectingPath = paths2.get(newCommonNode);
            if (connectingPath == null)
            {
                return;
            }
            var newDistance = addExact(path.getDistanceTravelled(), connectingPath.getDistanceTravelled());
            if (newDistance >= oldDistance)
            {
                return;
            }
            success = bestCompletePath.compareAndSet(oldCommonNode, newCommonNode, oldDistance, newDistance);
        }
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean visited(WorldPoint node)
    {
        return visited.contains(node);
    }
    private int estimateOfActualTravel(WorldPoint y)
    {
        return estimatedDistance.applyAsInt(start, y);
    }

    private int estimatedDistanceToGoal(WorldPoint y)
    {
        return estimatedDistance.applyAsInt(y, end);
    }

    private int bestCompleteDistance()
    {
        return bestCompletePath.getStamp();
    }

    private List<WorldPoint> getNeighbours(WorldPoint position)
    {
        final List<WorldPoint> result = new ArrayList<>();
        for (Transport transport : transportCoords.getOrDefault(position, new ArrayList<>()))
        {
            if (reverse)
            {
                result.add(transport.getSource());
            }
            else
            {
                result.add(transport.getDestination());
            }
        }

        try
        {
            if (collisionMap.sw(position.getX(), position.getY(), position.getPlane()))
            {
                WorldPoint neighbor = position.dx(-1).dy(-1);
                result.add(neighbor);
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
                result.add(neighbor);
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
                result.add(neighbor);
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
                result.add(neighbor);
            }
        }
        catch (Exception ignored)
        {

        }

        try
        {
            if (collisionMap.w(position.getX(), position.getY(), position.getPlane()))
            {
                WorldPoint neighbor = position.dx(-1);
                result.add(neighbor);
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
                result.add(neighbor);
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
                result.add(neighbor);
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
                result.add(neighbor);
            }
        }
        catch (Exception ignored)
        {

        }

        return result;
    }
}
