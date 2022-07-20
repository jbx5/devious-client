package net.unethicalite.client.managers;

import javax.inject.Singleton;

@Singleton
public class MinimalFpsManager implements Runnable
{
	private static final int SAMPLE_SIZE = 4;
	private final long[] lastDelays = new long[SAMPLE_SIZE];
	private long targetDelay = 0;
	private long lastMillis = 0;
	private int lastDelayIndex = 0;
	private long sleepDelay = 0;

	public void reloadConfig(int fps)
	{
		lastMillis = System.currentTimeMillis();

		targetDelay = 1000 / Math.max(1, fps);

		sleepDelay = targetDelay;

		for (int i = 0; i < SAMPLE_SIZE; i++)
		{
			lastDelays[i] = targetDelay;
		}
	}

	@Override
	public void run()
	{
		// We can't trust client.getFPS to get frame-perfect FPS knowledge
		// If we do try to use client.getFPS, we will end up oscillating
		// So we rely on currentTimeMillis which is occasionally cached by the JVM unlike nanotime
		// Its caching will not cause oscillation as it is granular enough for our uses here
		final long before = lastMillis;
		final long now = System.currentTimeMillis();

		lastMillis = now;
		lastDelayIndex = (lastDelayIndex + 1) % SAMPLE_SIZE;
		lastDelays[lastDelayIndex] = now - before;

		// We take a sampling approach because sometimes the game client seems to repaint
		// after only running 1 game cycle, and then runs repaint again after running 30 cycles
		long averageDelay = 0;
		for (int i = 0; i < SAMPLE_SIZE; i++)
		{
			averageDelay += lastDelays[i];
		}
		averageDelay /= lastDelays.length;

		// Sleep delay is a moving target due to the nature of how and when the engine
		// decides to run cycles.
		// This will also keep us safe from time spent in plugins conditionally
		// as some plugins and overlays are only appropriate in some game areas
		if (averageDelay > targetDelay)
		{
			sleepDelay--;
		}
		else if (averageDelay < targetDelay)
		{
			sleepDelay++;
		}

		if (sleepDelay > 0)
		{
			try
			{
				Thread.sleep(sleepDelay);
			}
			catch (InterruptedException e)
			{
				// Can happen on shutdown
			}
		}
	}
}
