package dev.unethicalite.api.movement.pathfinder.pnba;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

import static java.lang.Math.addExact;
import static java.util.Comparator.comparingInt;

@Value
class Search implements Runnable
{
    WorldPoint start;
    WorldPoint end;
    AtomicBoolean finished;
    AtomicBoolean allDone;
    Set<WorldPoint> visited;
    AtomicStampedReference<WorldPoint> bestCompletePath;
    Map<WorldPoint, Path> paths1;
    Map<WorldPoint, Path> paths2;
    Function<WorldPoint, Iterable<WorldPoint>> connectedNodes;
    ToIntBiFunction<WorldPoint, WorldPoint> estimatedDistance;
    PriorityQueue<WorldPoint> nodesToVisit;

    Search(WorldPoint start,
           WorldPoint end,
           AtomicBoolean finished,
           AtomicBoolean allDone,
           Set<WorldPoint> visited,
           AtomicStampedReference<WorldPoint> bestCompletePath,
           Map<WorldPoint, Path> paths1,
           Map<WorldPoint, Path> paths2,
           Function<WorldPoint, Iterable<WorldPoint>> connectedNodes,
           ToIntBiFunction<WorldPoint, WorldPoint> estimatedDistance)
    {
        this.start = start;
        this.end = end;
        this.finished = finished;
        this.allDone = allDone;
        this.visited = visited;
        this.bestCompletePath = bestCompletePath;
        this.paths1 = paths1;
        this.paths2 = paths2;
        this.connectedNodes = connectedNodes;
        this.estimatedDistance = estimatedDistance;
        nodesToVisit = new PriorityQueue<>(comparingInt(x -> paths1.get(x).getDistanceTravelled()));
    }

    @Override
    public void run()
    {
        var x = start;
        while (!finished.get() && !allDone.get())
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
            for (var y : connectedNodes(x))
            {
                if (!visited(y))
                {
                    var yPathOld = paths1.get(y);
                    var newTotalDistanceToY = addExact(xPath.getDistanceTravelled(), 1);
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

    private Iterable<WorldPoint> connectedNodes(WorldPoint x)
    {
        return connectedNodes.apply(x);
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
}
