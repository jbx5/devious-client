package net.unethicalite.api.script.blocking_events;

import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

public class ResizableEvent extends BlockingEvent
{
	@Override
	public boolean validate()
	{
		Client client = Static.getClient();
		if (Game.getState() != GameState.LOGGED_IN)
		{
			return false;
		}

		return client.getWindowedMode() != 1 || client.getPreferences().getWindowMode() != 1;
	}

	@Override
	public int loop()
	{
		Client client = Static.getClient();
		if (client.getWindowedMode() != 1)
		{
			client.setWindowedMode(1);
			return 1000;
		}

		if (client.getPreferences().getWindowMode() != 1)
		{
			client.getPreferences().setWindowMode(1);
		}

		return 1000;
	}
}
