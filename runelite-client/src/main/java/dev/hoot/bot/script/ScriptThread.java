package dev.hoot.bot.script;

import dev.hoot.api.commons.Time;
import dev.hoot.api.game.Game;
import dev.hoot.bot.Bot;
import dev.hoot.bot.script.events.ScriptChanged;
import dev.hoot.bot.script.events.ScriptState;
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
	private final BotScript botScript;

	private boolean onLogin;
	private final AtomicInteger ticks = new AtomicInteger(0);

	public ScriptThread(ScriptEntry scriptEntry, String... startArgs)
			throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
	{
		this.startArgs = startArgs;
		this.botScript = scriptEntry.getScriptClass().getDeclaredConstructor().newInstance();
	}

	@Override
	public void run()
	{
		try
		{
			Events.clear();
			Events.subscribe(botScript);
			Events.subscribe(this);
			Bot.getInjector().injectMembers(botScript);
			botScript.getPaint().clear();

			botScript.onStart(startArgs);
			Game.getClient().getCallbacks().post(new ScriptChanged(botScript.getClass().getSimpleName(), ScriptState.STARTED));

			while (botScript.isRunning())
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
						botScript.onLogin();
						continue;
					}

					if (botScript.isRestart())
					{
						botScript.setRestart(false);
						Game.getClient().getCallbacks().post(new ScriptChanged(botScript.getClass().getSimpleName(), ScriptState.RESTARTING));
						continue;
					}

					var loopSleep = botScript.outerLoop();

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

			botScript.onStop();
			Game.getClient().getCallbacks().post(new ScriptChanged(botScript.getClass().getSimpleName(), ScriptState.STOPPED));
			Events.clear();
			botScript.getPaint().clear();
		}
		catch (Exception e)
		{
			log.error("RS Crashed!!", e);
			System.exit(0);
		}
	}

	@Subscribe
	public void onGameTick(GameTick event)
	{
		ticks.incrementAndGet();
	}

	public BotScript getScript()
	{
		return botScript;
	}
}
