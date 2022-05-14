package dev.unethicalite.api.movement.pathfinder.pnba;

import com.google.common.collect.ImmutableList;
import dev.unethicalite.api.movement.pathfinder.CollisionMap;
import dev.unethicalite.api.movement.pathfinder.Transport;
import lombok.AllArgsConstructor;
import lombok.Value;
import net.runelite.api.coords.WorldPoint;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.function.Function;

import static java.util.Collections.reverse;

@Value
@AllArgsConstructor
public class ParallelShortestPathFinder {

    CollisionMap collisionMap;
    Map<WorldPoint, List<Transport>> transportCoords;
    Function<Runnable, Future<?>> executor;

    public ParallelShortestPathFinder(Map<WorldPoint, List<Transport>> transportCoords, CollisionMap collisionMap)
    {
        this(collisionMap, transportCoords, a -> ForkJoinPool.commonPool().submit(a));
    }

    public List<WorldPoint> search(List<WorldPoint> start, WorldPoint end)
    {
        var finished = new AtomicBoolean(false);
        var visited = ConcurrentHashMap.<WorldPoint>newKeySet();
        var bestCompletePath = new AtomicStampedReference<WorldPoint>(null, Integer.MAX_VALUE);

        ForkJoinPool pool = ForkJoinPool.commonPool();

        return start.stream()
                    .map(s -> pool.submit(() -> search(s, end, finished, visited, bestCompletePath)))
                    .map(fut -> {
                        List<WorldPoint> out;
                        try
                        {
                            out = fut.get();
                        }
                        catch (Exception e)
                        {
                            out = List.of();
                        }
                        return out;
                    })
                    .min(Comparator.comparingInt(List::size))
                    .orElse(null);

    }

    private List<WorldPoint> search(WorldPoint start,
                                    WorldPoint end,
                                    AtomicBoolean finished,
                                    Set<WorldPoint> visited,
                                    AtomicStampedReference<WorldPoint> bestCompletePath)
    {
        var paths1 = new ConcurrentHashMap<WorldPoint, Path>();
        var paths2 = new ConcurrentHashMap<WorldPoint, Path>();

        paths1.put(start, new Path(start, heuristic(start, end)));
        paths2.put(end, new Path(end, heuristic(start, end)));

        var result1 = new ArrayList<WorldPoint>();
        Future<?> future = executor.apply(() -> {
            new Search(start,
                       end,
                       finished,
                       visited,
                       bestCompletePath,
                       paths1,
                       paths2,
                       this::getNeighbours,
                       this::heuristic).run();
            var commonNode = bestCompletePath.getReference();
            if (commonNode != null)
            {
                Path previous = paths1.get(commonNode).getPrevious();
                if (previous != null)
                {
                    previous.collectInto(result1);
                }
                reverse(result1);
            }
        });

        var result2 = new ArrayList<WorldPoint>();
        new Search(end,
                   start,
                   finished,
                   visited,
                   bestCompletePath,
                   paths2,
                   paths1,
                   this::getNeighbours,
                   this::heuristic).run();
        var commonNode = bestCompletePath.getReference();
        if (commonNode == null)
        {
            future.cancel(true);
            return ImmutableList.of();
        }

        Path p = paths2.get(commonNode);
        p.collectInto(result2);
        boolean thisThreadFoundFullPath = p.getValue().equals(start);
        if (thisThreadFoundFullPath)
        {
            future.cancel(true);
        }
        else
        {
            try
            {
                future.get();
            } catch (InterruptedException | ExecutionException e)
            {
                throw new RuntimeException(e);
            }
        }

        //noinspection UnstableApiUsage
        return ImmutableList.<WorldPoint>builderWithExpectedSize(paths1.size() + paths2.size())
                            .addAll(result1)
                            .addAll(result2)
                            .build();
    }

    private int heuristic(WorldPoint a, WorldPoint b)
    {
        return (int) (a.distanceTo2DHypotenuse(b));
    }

    private List<WorldPoint> getNeighbours(WorldPoint position)
    {
        final List<WorldPoint> result = new ArrayList<>();
        for (Transport transport : transportCoords.getOrDefault(position, new ArrayList<>()))
        {
            final WorldPoint transportDest = transport.getDestination();
            result.add(transportDest);
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

        try {
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

        return result;
    }
}
