package dev.unethicalite.api.movement.pathfinder.pnba;

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

final class Search implements Runnable {
    private final WorldPoint start;
    private final WorldPoint end;
    private final AtomicBoolean finished;
    private final Set<WorldPoint> visited;
    private final AtomicStampedReference<WorldPoint> bestCompletePath;
    private final PriorityQueue<WorldPoint> nodesToVisit;
    private final Map<WorldPoint, Path> paths1;
    private final Map<WorldPoint, Path> paths2;
    private final Function<WorldPoint, Iterable<WorldPoint>> connectedNodes;
    private final ToIntBiFunction<WorldPoint, WorldPoint> estimatedDistance;

    Search(WorldPoint start, WorldPoint end, AtomicBoolean finished, Set<WorldPoint> visited, AtomicStampedReference<WorldPoint> bestCompletePath, Map<WorldPoint, Path> paths1, Map<WorldPoint, Path> paths2, Function<WorldPoint, Iterable<WorldPoint>> connectedNodes, ToIntBiFunction<WorldPoint, WorldPoint> estimatedDistance) {
        this.start = start;
        this.end = end;
        this.finished = finished;
        this.visited = visited;
        this.bestCompletePath = bestCompletePath;
        this.nodesToVisit = new PriorityQueue<>(comparingInt(x -> paths1.get(x).distanceTravelled));
        this.paths1 = paths1;
        this.paths2 = paths2;
        this.connectedNodes = connectedNodes;
        this.estimatedDistance = estimatedDistance;
    }

    @Override
    public void run() {
        var x = start;
        while (!finished.get()) {
            if (!visited(x)) {
                visit(x);
            }
            if (nodesToVisit.isEmpty()) {
                finished.set(true);
            } else {
                x = nodesToVisit.poll();
            }
        }
    }

    private void visit(WorldPoint x) {
        var xPath = paths1.get(x);
        if (shouldExpand(xPath)) {
            for (var y : connectedNodes(x)) {
                if (!visited(y)) {
                    var yPathOld = paths1.get(y);
                    var newTotalDistanceToY = addExact(xPath.distanceTravelled, 1);
                    if (yPathOld == null || newTotalDistanceToY < yPathOld.distanceTravelled) {
                        Path betterPathToY = xPath.prepend(y, yPathOld == null ? estimatedDistanceToGoal(y) : yPathOld.estimatedDistanceToGoal, newTotalDistanceToY, yPathOld == null ? estimateOfActualTravel(y) : yPathOld.estimateOfActualTravel);
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

    private boolean shouldExpand(Path xPath) {
        return bestCompletePath.getReference() == null
                || addExact(xPath.distanceTravelled, xPath.estimatedDistanceToGoal) < bestCompleteDistance();
    }

    private void updateBestCompletePath(Path path) {
        var success = false;
        WorldPoint newCommonNode = path.value;
        while (!success) {
            var oldCommonNode = bestCompletePath.getReference();
            var oldDistance = bestCompleteDistance();
            var connectingPath = paths2.get(newCommonNode);
            if (connectingPath == null) {
                return;
            }
            var newDistance = addExact(path.distanceTravelled, connectingPath.distanceTravelled);
            if (newDistance >= oldDistance) {
                return;
            }
            success = bestCompletePath.compareAndSet(oldCommonNode, newCommonNode, oldDistance, newDistance);
        }
    }

    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean visited(WorldPoint node) {
        return visited.contains(node);
    }

    private Iterable<WorldPoint> connectedNodes(WorldPoint x) {
        return connectedNodes.apply(x);
    }

    private int estimateOfActualTravel(WorldPoint y) {
        return estimatedDistance.applyAsInt(start, y);
    }

    private int estimatedDistanceToGoal(WorldPoint y) {
        return estimatedDistance.applyAsInt(y, end);
    }

    private int bestCompleteDistance() {
        return bestCompletePath.getStamp();
    }
}
