package net.unethicalite.api.plugins;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Game;

import javax.swing.SwingUtilities;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public abstract class LoopedPlugin extends Plugin implements Runnable
{
	private static final ScheduledExecutorService EXECUTOR = new LoggableExecutor(1);
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

		while (isRunning())
		{
			if (task.isDone())
			{
				task = EXECUTOR.schedule(loopTask(), nextSleep, TimeUnit.MILLISECONDS);
				continue;
			}

			Time.sleep(10);
		}
		task = null;
	}

	private Runnable loopTask()
	{
		return () ->
		{
			try
			{
				int currentTick = ticks.get();
				if (sleepUntil > 0 && sleepUntil > currentTick && Game.isLoggedIn())
				{
					return;
				}

				sleepUntil = 0;

				currentSleep = this instanceof Script ? ((Script) this).outerLoop() : loop();
			}
			catch (PluginStoppedException e)
			{
				SwingUtilities.invokeLater(() -> Plugins.stopPlugin(this));
			}
			finally
			{
				if (sleepUntil == 0)
				{
					if (currentSleep < 0 && Game.isLoggedIn())
					{
						int currentTick = ticks.get();
						sleepUntil = currentTick + Math.abs(currentSleep);
						nextSleep = 0;
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
		if (isRunning())
		{
			task.cancel(true);
		}
	}

	private static class LoggableExecutor extends ScheduledThreadPoolExecutor
	{
		public LoggableExecutor(int corePoolSize)
		{
			super(corePoolSize);
		}

		protected void afterExecute(Runnable r, Throwable t)
		{
			super.afterExecute(r, t);

			if (t == null && r instanceof Future<?>)
			{
				try
				{
					Future<?> future = (Future<?>) r;
					if (future.isDone())
					{
						future.get();
					}
				}
				catch (CancellationException ignored)
				{

				}
				catch (ExecutionException ee)
				{
					t = ee.getCause();
				}
				catch (InterruptedException ie)
				{
					Thread.currentThread().interrupt();
				}
			}

			if (t != null)
			{
				log.error("Error in loop", t);
			}
		}
	}

	@Subscribe
	private void tickCounter(GameTick gameTick)
	{
		ticks.incrementAndGet();
	}
}
