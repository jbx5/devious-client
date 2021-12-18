package net.runelite.client.plugins.entityinspector;

import com.google.inject.Provides;
import dev.hoot.api.events.PacketSent;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Entity Inspector",
		description = "Shows entity information",
		enabledByDefault = false
)
public class EntityInspectorPlugin extends Plugin
{
	@Inject
	private EntityInspectorConfig config;

	@Inject
	private EntityInspectorOverlay overlay;

	@Inject
	private OverlayManager overlayManager;

	@Override
	public void startUp()
	{
		overlayManager.add(overlay);
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(overlay);
	}

	@Provides
	public EntityInspectorConfig getConfig(ConfigManager configManager)
	{
		return configManager.getConfig(EntityInspectorConfig.class);
	}

	@Subscribe
	public void onPacketSent(PacketSent e)
	{
		if (!config.packets())
		{
			return;
		}

		System.out.println(e.hexDump());
	}
}
