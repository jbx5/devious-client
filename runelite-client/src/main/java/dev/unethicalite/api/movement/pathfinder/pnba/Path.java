package dev.unethicalite.api.movement.pathfinder.pnba;

import net.runelite.api.coords.WorldPoint;

import java.util.Collection;

final class Path {
    final WorldPoint value;
    final Path previous;
    final int distanceTravelled;
    final int estimateOfActualTravel;
    final int estimatedDistanceToGoal;

    Path(WorldPoint value, int estimatedDistanceToGoal) {
        this(value, estimatedDistanceToGoal, null, 0, 0);
    }

    private Path(WorldPoint value, int estimatedDistanceToGoal, Path previous, int distanceTravelled, int estimateOfActualTravel) {
        this.value = value;
        this.previous = previous;
        this.distanceTravelled = distanceTravelled;
        this.estimateOfActualTravel = estimateOfActualTravel;
        this.estimatedDistanceToGoal = estimatedDistanceToGoal;
    }

    Path prepend(WorldPoint value, int estimatedDistanceToGoal, int newTotalDistanceTravelled, int estimateOfActualTravel) {
        return new Path(value, estimatedDistanceToGoal, this, newTotalDistanceTravelled, estimateOfActualTravel);
    }

    void collectInto(Collection<WorldPoint> accumulator) {
        var current = this;
        while (current != null) {
            accumulator.add(current.value);
            current = current.previous;
        }
    }
}
