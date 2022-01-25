package dev.hoot.api.plugins;

import dev.hoot.api.commons.Time;
import dev.hoot.api.game.Game;
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
        new Thread(() -> {
            try {
                outerLoop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
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
            int loopSleep = 1000;
            try {
                loopSleep = loop();
                if (loopSleep == -1000)
                {
                    break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (loopSleep < 0 && Game.isLoggedIn())
                {
                    int startTicks = ticks.get();
                    int finalLoopSleep = loopSleep;
                    Time.sleepUntil(() -> ticks.get() - startTicks >= Math.abs(finalLoopSleep), 10, 30_000);
                }
                else
                {
                    Time.sleep(loopSleep < 0 ? 1000 : loopSleep);
                }
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
