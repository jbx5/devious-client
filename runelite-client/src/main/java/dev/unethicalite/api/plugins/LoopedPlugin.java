package dev.unethicalite.api.plugins;

import dev.unethicalite.api.commons.Time;
import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.input.naturalmouse.NaturalMouse;
import dev.unethicalite.managers.LoopedPluginManager;
import dev.unethicalite.managers.interaction.InteractionConfig;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;

import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class LoopedPlugin extends Plugin implements Runnable
{
	@Inject
	private Client client;

	@Inject
	private InteractionConfig interactionConfig;

	@Inject
	private NaturalMouse naturalMouse;

	@Inject
	private LoopedPluginManager loopedPluginManager;

	private final AtomicInteger ticks = new AtomicInteger(0);

	@Getter
	@Setter
	private boolean running;

	@Override
	protected void startUp() throws Exception
	{
		log.debug("Started looped plugin");

		loopedPluginManager.submit(this);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.debug("Stopped looped plugin");

		loopedPluginManager.stop();
	}

	@Override
	public void run()
	{
		log.debug("Starting outerloop");

		while (running)
		{
			int loopSleep = 1000;
			try
			{
				loopSleep = loop();
				if (loopSleep == -1000)
				{
					break;
				}

//				if (interactionConfig.mouseOffScreen()
//						&& interactionConfig.naturalMouse()
//						&& client.getLastInteractionTime().plusMillis(Rand.nextInt(2_000, 10_000)).isBefore(Instant.now())
//						&& client.getMouseHandler().getCurrentX() != -1
//						&& client.getMouseHandler().getCurrentY() != -1)
//				{
//					naturalMouse.moveOffScreen();
//				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
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

		log.debug("Stopping outerloop");
	}

	protected abstract int loop();

	@Subscribe
	private void tickCounter(GameTick gameTick)
	{
		ticks.incrementAndGet();
	}
}
