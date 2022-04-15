package dev.unethicalite.client.script;

import dev.unethicalite.api.game.Game;
import dev.unethicalite.client.script.blocking_events.BlockingEvent;
import dev.unethicalite.client.script.blocking_events.BlockingEventManager;
import dev.unethicalite.client.script.events.ScriptChanged;
import dev.unethicalite.client.script.events.ScriptState;
import dev.unethicalite.client.script.paint.Paint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

public abstract class Script
{
	protected final Logger logger;
	private volatile int loopSleep = 0;
	private volatile boolean looping = true;

	private boolean restart;
	private boolean paused;

	public Script()
	{
		logger = LoggerFactory.getLogger(getClass());
	}

	@Inject
	private Paint paint;
	private final BlockingEventManager blockingEventManager = new BlockingEventManager();

	protected abstract int loop();

	protected abstract void onStart(String... args);

	public void onStop()
	{

	}

	public void onLogin()
	{

	}

	public int outerLoop()
	{
		loopSleep = 0;
		if (!looping)
		{
			return -1;
		}

		if (paused)
		{
			return loopSleep != 0 ? loopSleep : 1000;
		}

		if (!blockingEventManager.getBlockingEvents().isEmpty())
		{
			for (BlockingEvent event : blockingEventManager.getBlockingEvents())
			{
				if (event.validate())
				{
					return event.loop();
				}
			}
		}

		loopSleep = loop();
		return loopSleep != 0 ? loopSleep : 1000;
	}

	public void pauseScript()
	{
		paused = !paused;
		if (!paused)
		{
			Game.getClient().getCallbacks().post(new ScriptChanged(getClass().getSimpleName(), ScriptState.STARTED));
		}
		else
		{
			Game.getClient().getCallbacks().post(new ScriptChanged(getClass().getSimpleName(), ScriptState.PAUSED));
		}
	}

	public boolean isRunning()
	{
		return looping;
	}

	public boolean stopLooping()
	{
		return looping = false;
	}

	public boolean isRestart()
	{
		return restart;
	}

	public void setRestart(boolean restart)
	{
		this.restart = restart;
	}

	public boolean isPaused()
	{
		return paused;
	}

	public void setPaused(boolean paused)
	{
		this.paused = paused;
	}

	public Paint getPaint()
	{
		return paint;
	}

	public BlockingEventManager getBlockingEventManager()
	{
		return blockingEventManager;
	}
}
