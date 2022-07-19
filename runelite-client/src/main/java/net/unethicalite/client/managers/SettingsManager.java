package net.unethicalite.client.managers;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.unethicalite.client.minimal.config.DisableRenderCallbacks;

import javax.inject.Inject;

@Slf4j
public class SettingsManager
{
	private static final DisableRenderCallbacks DISABLE_RENDERING = new DisableRenderCallbacks();

	private final Client client;

	@Inject
	SettingsManager(Client client) {
		this.client = client;
	}

	@Subscribe
	private void onConfigChanged(ConfigChanged event)
	{
		log.debug("Config changed: {} {}", event.getGroup(), event.getKey());
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
