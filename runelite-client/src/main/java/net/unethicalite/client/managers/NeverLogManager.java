package net.unethicalite.client.managers;

import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.event.KeyEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

import static java.awt.event.InputEvent.BUTTON1_DOWN_MASK;

@Singleton
public class NeverLogManager
{
	@Inject
	private Client client;

	@Inject
	private UnethicaliteConfig config;

	private long randomDelay = 0;

	@Inject
	NeverLogManager(EventBus eventBus)
	{
		eventBus.register(this);
	}

	@Subscribe
	private void onGameTick(GameTick e)
	{
		if (config.neverLog() && checkIdle())
		{
			randomDelay = randomDelay();
			Executors.newSingleThreadExecutor()
					.submit(this::pressKey);
		}
	}

	private long randomDelay()
	{
		return (long) clamp(Math.round(ThreadLocalRandom.current().nextGaussian() * 8000));
	}

	private double clamp(double value)
	{
		return Math.max(1, Math.min(13000, value));
	}

	private void pressKey()
	{
		KeyEvent keyPress = new KeyEvent(client.getCanvas(), KeyEvent.KEY_PRESSED, System.currentTimeMillis(), BUTTON1_DOWN_MASK, KeyEvent.VK_BACK_SPACE);
		client.getCanvas().dispatchEvent(keyPress);
		KeyEvent keyRelease = new KeyEvent(client.getCanvas(), KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0, KeyEvent.VK_BACK_SPACE);
		client.getCanvas().dispatchEvent(keyRelease);
		KeyEvent keyTyped = new KeyEvent(client.getCanvas(), KeyEvent.KEY_TYPED, System.currentTimeMillis(), 0, KeyEvent.VK_BACK_SPACE);
		client.getCanvas().dispatchEvent(keyTyped);
	}

	private boolean checkIdle()
	{
		int idleClientTicks = client.getKeyboardIdleTicks();
		if (client.getMouseIdleTicks() < idleClientTicks)
		{
			idleClientTicks = client.getMouseIdleTicks();
		}

		return idleClientTicks >= randomDelay;
	}
}
