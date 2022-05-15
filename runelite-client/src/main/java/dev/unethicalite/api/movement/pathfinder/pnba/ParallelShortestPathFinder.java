package dev.unethicalite.api.movement.pathfinder.pnba;

import com.google.common.collect.ImmutableList;
import dev.unethicalite.api.movement.pathfinder.CollisionMap;
import dev.unethicalite.api.movement.pathfinder.Transport;
import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicStampedReference;

import static java.util.Collections.reverse;

@Slf4j
@Value
@AllArgsConstructor
public class ParallelShortestPathFinder
{

    Map<WorldPoint, List<Transport>> transportCoords;
    CollisionMap collisionMap;
    ExecutorService pool = ForkJoinPool.commonPool();

    public List<WorldPoint> search(List<WorldPoint> start, WorldPoint end)
    {

        AtomicBoolean allDone = new AtomicBoolean(false);

        return start.stream()
                    .map(s -> pool.submit(() -> search(s, end, allDone)))
                    .map(fut ->
                         {
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
                        }
                    )
                    .filter(l -> !l.isEmpty())
                    .min(Comparator.comparingInt(List::size))
                    .orElse(null);

    }

    private List<WorldPoint> search(WorldPoint start,
                                    WorldPoint end,
                                    AtomicBoolean allDone)
    {
        Map<WorldPoint, Path> paths1 = new ConcurrentHashMap<>();
        Map<WorldPoint, Path> paths2 = new ConcurrentHashMap<>();

        AtomicBoolean finished = new AtomicBoolean(false);
        Set<WorldPoint> visited = ConcurrentHashMap.newKeySet();
        AtomicStampedReference<WorldPoint> bestCompletePath = new AtomicStampedReference<>(null, Integer.MAX_VALUE);

        paths1.put(start, new Path(start, heuristic(start, end)));
        paths2.put(end, new Path(end, heuristic(start, end)));

        List<WorldPoint> result1 = new ArrayList<>();
        Future<?> future = pool.submit(() -> {
            new Search(start,
                       end,
                       finished,
                       allDone,
                       visited,
                       bestCompletePath,
                       paths1,
                       paths2,
                       this::getNeighbours,
                       this::heuristic).run();
            WorldPoint commonNode = bestCompletePath.getReference();
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

        List<WorldPoint>  result2 = new ArrayList<WorldPoint>();
        new Search(end,
                   start,
                   finished,
                   allDone,
                   visited,
                   bestCompletePath,
                   paths2,
                   paths1,
                   this::getNeighbours,
                   this::heuristic).run();

        WorldPoint commonNode = bestCompletePath.getReference();
        if (commonNode == null)
        {
            future.cancel(true);
            return ImmutableList.of();
        }

        allDone.set(true);

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
            }
            catch (InterruptedException | ExecutionException e)
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
