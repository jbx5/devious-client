package dev.hoot.api.plugins;

import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public abstract class LoopedPlugin extends Plugin
{
    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private Future<?> future;

    @Subscribe
    private void outerLoop(GameTick event)
    {
        if (future == null || future.isDone() || future.isCancelled())
        {
            future = executor.submit(this::loop);
        }
    }

    protected abstract void loop();
}
