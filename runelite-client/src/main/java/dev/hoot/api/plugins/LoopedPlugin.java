package dev.hoot.api.plugins;

import dev.hoot.api.commons.Time;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginManager;

import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class LoopedPlugin extends Plugin
{
    @Inject
    private PluginManager pluginManager;

    private final AtomicInteger ticks = new AtomicInteger(0);

    @Override
    protected void startUp() throws Exception {
        log.info("Started looped plugin");
        new Thread(this::outerLoop).start();
    }

    @Override
    protected void shutDown() throws Exception {
        log.info("Stopped looped plugin");
    }

    private void outerLoop()
    {
        log.info("Starting outerloop");
        while (pluginManager.isPluginEnabled(this))
        {
            try {
                int loopSleep = loop();
                if (loopSleep == -1000)
                {
                    break;
                }

                if (loopSleep < 0)
                {
                    int startTicks = ticks.get();
                    Time.sleepUntil(() -> ticks.get() - startTicks >= Math.abs(loopSleep), 10, 30_000);
                }
                else
                {
                    Time.sleep(loopSleep == 0 ? 1000 : loopSleep);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        log.info("Stopping outerloop");
    }

    protected abstract int loop();

    @Subscribe
    private void tickCounter(GameTick gameTick)
    {
        ticks.incrementAndGet();
    }
}
