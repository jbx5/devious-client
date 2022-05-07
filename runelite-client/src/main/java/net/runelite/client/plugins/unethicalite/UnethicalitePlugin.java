package net.runelite.client.plugins.unethicalite;

import dev.unethicalite.api.plugins.SettingsPlugin;
import dev.unethicalite.client.config.UnethicaliteConfig;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.unethicalite.regions.RegionHandler;
import net.runelite.client.plugins.unethicalite.interaction.InteractionOverlay;
import net.runelite.client.plugins.unethicalite.regions.RegionOverlay;
import net.runelite.client.config.Config;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Unethicalite",
		hidden = true
)
@Slf4j
public class UnethicalitePlugin extends SettingsPlugin
{
	@Inject
	private UnethicaliteConfig config;

	@Inject
	private EventBus eventBus;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private InteractionOverlay interactionOverlay;

	@Inject
	private RegionOverlay regionOverlay;

	@Inject
	private RegionHandler regionHandler;

	@Override
	protected void startUp() throws Exception
	{
		eventBus.register(regionOverlay);
		eventBus.register(regionHandler);

		overlayManager.add(interactionOverlay);
		overlayManager.add(regionOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(regionOverlay);
		eventBus.unregister(regionHandler);

		overlayManager.remove(interactionOverlay);
		overlayManager.remove(regionOverlay);
	}

	@Override
	public Config getConfig()
	{
		return config;
	}

	@Override
	public String getPluginName()
	{
		return "Unethicalite";
	}

	@Override
	public String getPluginDescription()
	{
		return "Unethicalite settings";
	}

	@Override
	public String[] getPluginTags()
	{
		return new String[]{"unethicalite"};
	}
}
