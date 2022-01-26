package dev.hoot.api.game;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.callback.ClientThread;

import javax.inject.Inject;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Slf4j
public class GameThread
{
	private static final long TIMEOUT = 1000;

	@Inject
	private static ClientThread clientThread;

	@Inject
	private static Client client;

	public static void invoke(Runnable runnable)
	{
		if (client.isClientThread())
		{
			runnable.run();
		}
		else
		{
			clientThread.invokeLater(runnable);
		}
	}

	public static <T> T invokeLater(Callable<T> callable)
	{
		if (client.isClientThread())
		{
			try
			{
				return callable.call();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		try
		{
			FutureTask<T> futureTask = new FutureTask<>(callable);
			clientThread.invokeLater(futureTask);
			return futureTask.get(TIMEOUT, TimeUnit.MILLISECONDS);
		}
		catch (ExecutionException | InterruptedException | TimeoutException e)
		{
			e.printStackTrace();
			throw new RuntimeException("Client thread invoke timed out after " + TIMEOUT + " ms");
		}
	}
}

