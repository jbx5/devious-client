package dev.unethicalite.client.script;

import dev.unethicalite.api.commons.Time;
import dev.unethicalite.api.game.Game;
import dev.unethicalite.client.MinimalClient;
import dev.unethicalite.client.script.events.ScriptChanged;
import dev.unethicalite.client.script.events.ScriptState;
import net.runelite.api.GameState;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

public class ScriptThread extends Thread
{
	private static final Logger log = LoggerFactory.getLogger(ScriptThread.class);
	private final String[] startArgs;
	private final Script script;

	private boolean onLogin;
	private final AtomicInteger ticks = new AtomicInteger(0);

	public ScriptThread(ScriptEntry scriptEntry, String... startArgs)
			throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
	{
		this.startArgs = startArgs;
		this.script = scriptEntry.getScriptClass().getDeclaredConstructor().newInstance();
	}

	@Override
	public void run()
	{
		try
		{
			onStart();

			while (script.isRunning())
			{
				try
				{
					var clientThread = Game.getClient().getClientThread();
					if (clientThread != null && !clientThread.isAlive())
					{
						log.error("Client thread died");
						System.exit(0);
					}

					if (Game.getState() == GameState.LOGGED_IN && !onLogin)
					{
						onLogin = true;
						script.onLogin();
						continue;
					}

					if (script.isRestart())
					{
						script.setRestart(false);
						Game.getClient().getCallbacks().post(new ScriptChanged(script.getClass().getSimpleName(), ScriptState.RESTARTING));
						continue;
					}

					var loopSleep = script.outerLoop();

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
						Time.sleep(loopSleep);
					}
				}
				catch (Exception e)
				{
					log.warn("Exception in script: ", e);
					Time.sleep(1000);
				}
			}

			onStop();
		}
		catch (Exception e)
		{
			log.error("RS Crashed!!", e);
			System.exit(0);
		}
	}

	private void onStart()
	{
		ScriptEventBus.clear();
		ScriptEventBus.subscribe(script);
		ScriptEventBus.subscribe(this);
		MinimalClient.getInjector().injectMembers(script);
		script.getPaint().clear();

		script.onStart(startArgs);
		Game.getClient().getCallbacks().post(new ScriptChanged(script.getClass().getSimpleName(), ScriptState.STARTED));
	}

	private void onStop()
	{
		script.onStop();
		Game.getClient().getCallbacks().post(new ScriptChanged(script.getClass().getSimpleName(), ScriptState.STOPPED));
		ScriptEventBus.clear();
		script.getPaint().clear();
	}

	@Subscribe
	public void tickCounter(GameTick event)
	{
		ticks.incrementAndGet();
	}

	public Script getScript()
	{
		return script;
	}
}
