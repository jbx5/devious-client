package dev.hoot.api.plugins;

import dev.hoot.api.commons.Rand;
import dev.hoot.api.commons.Time;
import dev.hoot.api.game.Game;
import dev.hoot.api.input.naturalmouse.NaturalMouse;
import dev.hoot.bot.managers.interaction.InteractionConfig;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginManager;

import javax.inject.Inject;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class LoopedPlugin extends Plugin
{
    @Inject
    private PluginManager pluginManager;

    @Inject
    private Client client;

    @Inject
    private InteractionConfig interactionConfig;

    @Inject
    private NaturalMouse naturalMouse;

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

                if (interactionConfig.mouseOffScreen()
                        && interactionConfig.naturalMouse()
                        && client.getLastInteractionTime().plusMillis(Rand.nextInt(2_000, 10_000)).isBefore(Instant.now())
                        && client.getMouseHandler().getCurrentX() != -1
                        && client.getMouseHandler().getCurrentY() != -1)
                {
                    naturalMouse.moveOffScreen();
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
