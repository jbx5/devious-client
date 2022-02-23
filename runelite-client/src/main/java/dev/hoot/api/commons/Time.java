package dev.hoot.api.commons;

import dev.hoot.api.game.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.function.BooleanSupplier;

public class Time
{
	private static final Logger logger = LoggerFactory.getLogger(Time.class);
	private static final int DEFAULT_POLLING_RATE = 100;

	public static boolean sleep(long ms)
	{
		if (Game.getClient().isClientThread())
		{
			logger.debug("Tried to sleep on client thread!");
			return false;
		}

		try
		{
			Thread.sleep(ms);
			return true;
		}
		catch (InterruptedException e)
		{
			logger.debug("Sleep interrupted");
		}

		return false;
	}

	public static boolean sleep(int min, int max)
	{
		return sleep(Rand.nextInt(min, max));
	}

	public static boolean sleepUntil(BooleanSupplier supplier, int pollingRate, int timeOut)
	{
		if (Game.getClient().isClientThread())
		{
			logger.debug("Tried to sleepUntil on client thread!");
			return false;
		}

		long start = System.currentTimeMillis();
		while (!supplier.getAsBoolean())
		{
			if (System.currentTimeMillis() > start + timeOut)
			{
				return false;
			}

			if (!sleep(pollingRate))
			{
				return false;
			}
		}

		return true;
	}

	public static boolean sleepUntil(BooleanSupplier supplier, int timeOut)
	{
		return sleepUntil(supplier, DEFAULT_POLLING_RATE, timeOut);
	}

	public static String format(Duration duration)
	{
		long secs = Math.abs(duration.getSeconds());
		return String.format("%02d:%02d:%02d", secs / 3600L, secs % 3600L / 60L, secs % 60L);
	}
}
