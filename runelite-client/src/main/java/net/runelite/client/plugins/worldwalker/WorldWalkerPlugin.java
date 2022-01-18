package net.runelite.client.plugins.worldwalker;

import dev.hoot.api.entities.Players;
import dev.hoot.api.game.Game;
import dev.hoot.api.movement.Movement;
import dev.hoot.api.utils.CoordUtils;
import dev.hoot.api.widgets.Widgets;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Singleton;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@PluginDescriptor(
        name = "World Walker",
        description = "Right click anywhere within the World Map to walk there",
        enabledByDefault = false
)
@Singleton
@Slf4j
public class WorldWalkerPlugin extends Plugin
{

    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private Future<?> future = null;

    private WorldPoint mapPoint;

    @Override
    public void shutDown()
    {
        mapPoint = null;
        future.cancel(true);
    }

    @Subscribe
    public void onGameTick(GameTick event)
    {
        if (future == null || future.isDone() || future.isCancelled())
        {
            future = executor.submit(this::walk);
        }
    }

    private void walk()
    {
        if (Movement.isWalking())
        {
            return;
        }

        if (mapPoint == null || mapPoint.distanceTo(Players.getLocal().getWorldLocation()) <= 2)
        {
            mapPoint = null;
            return;
        }

        Movement.walkTo(mapPoint);
    }

    @Subscribe
    public void onMenuEntryAdded(MenuEntryAdded event)
    {

        if (mapPoint != null)
        {
            Game.getClient()
                    .createMenuEntry(-2)
                    .setOption("<col=00ff00>Clear destination")
                    .setTarget(event.getTarget())
                    .setType(MenuAction.RUNELITE)
                    .onClick(e -> {
                        mapPoint = null;
                        log.debug("Cleared destination");
                    });
        }

        Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
        if (worldMap == null)
        {
            return;
        }

        Point mouse = Game.getClient().getMouseCanvasPosition();
        if (!worldMap.getBounds().contains(mouse.getX(), mouse.getY()))
        {
            return;
        }

        Game.getClient()
                .createMenuEntry(-2)
                .setOption("<col=00ff00>Walk to")
                .setTarget(event.getTarget())
                .setType(MenuAction.RUNELITE)
                .onClick(e -> {
                    mapPoint = CoordUtils.calculateMapPoint(Game.getClient().getMouseCanvasPosition());
                    log.debug("Walking to {}", mapPoint);
                });
    }
}
