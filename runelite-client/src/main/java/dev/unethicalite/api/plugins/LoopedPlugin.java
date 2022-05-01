package dev.unethicalite.api.plugins;

import dev.unethicalite.api.commons.Time;
import dev.unethicalite.api.game.Game;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class LoopedPlugin extends Plugin implements Runnable
{
	private final AtomicInteger ticks = new AtomicInteger(0);

	@Getter
	@Setter
	private boolean running;

	protected abstract int loop();

	@Override
	public void run()
	{
		while (running)
		{
			int loopSleep = 1000;
			try
			{
				loopSleep = this instanceof Script ? ((Script) this).outerLoop() : loop();
				if (loopSleep == -1000)
				{
					break;
				}
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
	}

	@Subscribe
	private void tickCounter(GameTick gameTick)
	{
		ticks.incrementAndGet();
	}
}
