package dev.unethicalite.api.plugins;

import dev.unethicalite.api.commons.Time;
import dev.unethicalite.api.game.Game;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class LoopedPlugin extends Plugin implements Runnable
{
	private static final ScheduledExecutorService EXECUTOR = Executors.newSingleThreadScheduledExecutor();
	private final AtomicInteger ticks = new AtomicInteger(0);

	private volatile int nextSleep = 1000;
	private int currentSleep = 1000;
	private int sleepUntil = 0;

	protected abstract int loop();

	private Future<?> task;

	@Override
	public void run()
	{
		task = EXECUTOR.schedule(loopTask(), nextSleep, TimeUnit.MILLISECONDS);

		while (task != null && !task.isCancelled())
		{
			if (task.isCancelled())
			{
				task = null;
				return;
			}

			if (task == null || task.isDone())
			{
				task = EXECUTOR.schedule(loopTask(), nextSleep, TimeUnit.MILLISECONDS);
				continue;
			}

			Time.sleep(10);
		}
	}

	private Runnable loopTask()
	{
		return () ->
		{
			try
			{
				if (nextSleep == -1000)
				{
					stop();
					return;
				}

				int currentTick = ticks.get();
				if (sleepUntil > 0 && sleepUntil > currentTick)
				{
					return;
				}

				sleepUntil = 0;

				currentSleep = this instanceof Script ? ((Script) this).outerLoop() : loop();
			}
			catch (Exception e)
			{
				log.error("Error in loop", e);
			}
			finally
			{
				if (sleepUntil == 0)
				{
					if (currentSleep < 0 && Game.isLoggedIn())
					{
						int currentTick = ticks.get();
						sleepUntil = currentTick + Math.abs(currentSleep);
					}
					else
					{
						nextSleep = currentSleep < 0 ? 1000 : currentSleep;
					}
				}
			}
		};
	}

	public boolean isRunning()
	{
		return task != null && !task.isCancelled();
	}

	public void stop()
	{
		task.cancel(true);
	}

	@Subscribe
	private void tickCounter(GameTick gameTick)
	{
		ticks.incrementAndGet();
	}
}
