package net.unethicalite.client.managers;

import net.runelite.api.Client;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.unethicalite.client.minimal.config.DisableRenderCallbacks;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SettingsManager
{
	private static final DisableRenderCallbacks DISABLE_RENDERING = new DisableRenderCallbacks();

	@Inject
	private Client client;

	@Subscribe(priority = Integer.MAX_VALUE)
	private void onConfigChanged(ConfigChanged event)
	{
		if (!event.getGroup().equals("unethicalite"))
		{
			return;
		}

		if ("renderOff".equals(event.getKey()))
		{
			boolean enabled = Boolean.parseBoolean(event.getNewValue());
			client.setLowCpu(enabled);

			if (enabled)
			{
				client.setDrawCallbacks(DISABLE_RENDERING);
			}
			else
			{
				client.setDrawCallbacks(null);
			}
		}
	}
}
