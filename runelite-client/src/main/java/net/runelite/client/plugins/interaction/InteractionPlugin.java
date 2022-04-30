package net.runelite.client.plugins.interaction;

import dev.unethicalite.api.plugins.SettingsPlugin;
import dev.unethicalite.managers.interaction.InteractionConfig;
import net.runelite.client.config.Config;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Interaction Plugin",
		hidden = true
)
public class InteractionPlugin extends SettingsPlugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private InteractionOverlay interactionOverlay;

	@Inject
	private InteractionConfig interactionConfig;

	@Override
	public void startUp() throws Exception
	{
		overlayManager.add(interactionOverlay);
	}

	@Override
	public Config getConfig()
	{
		return interactionConfig;
	}

	@Override
	public String getPluginName()
	{
		return "Interaction";
	}

	@Override
	public String getPluginDescription()
	{
		return "Interaction configuration";
	}

	@Override
	public String[] getPluginTags()
	{
		return new String[]{"interact", "automation"};
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(interactionOverlay);
	}
}
