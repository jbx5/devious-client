package net.runelite.client.plugins.interaction;

import dev.unethicalite.api.plugins.SettingsPlugin;
import dev.unethicalite.managers.DefinitionManager;
import dev.unethicalite.managers.interaction.InteractionConfig;
import dev.unethicalite.managers.interaction.InteractionManager;
import net.runelite.client.config.Config;
import net.runelite.client.eventbus.EventBus;
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
	private EventBus eventBus;

	@Inject
	private InteractionManager interactionManager;

	@Inject
	private DefinitionManager definitionManager;

	@Inject
	private InteractionOverlay interactionOverlay;

	@Inject
	private InteractionConfig interactionConfig;

	@Override
	public void startUp() throws Exception
	{
		super.startUp();
		overlayManager.add(interactionOverlay);
		eventBus.register(interactionManager);
		eventBus.register(definitionManager);
	}

	@Override
	protected Config getConfig()
	{
		return interactionConfig;
	}

	@Override
	protected String getPluginName()
	{
		return "Interaction";
	}

	@Override
	protected String getPluginDescription()
	{
		return "Interaction configuration";
	}

	@Override
	protected String[] getPluginTags()
	{
		return new String[]{"interact", "automation"};
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(interactionOverlay);
		eventBus.unregister(interactionManager);
		eventBus.unregister(definitionManager);
	}
}
