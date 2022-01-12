package net.runelite.client.plugins.interaction;

import dev.hoot.bot.managers.interaction.InteractionManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Interaction",
		description = "Interaction plugin",
		tags = {"automation", "interaction", "interact"}
)
public class InteractionPlugin extends Plugin
{
	@Inject
	private OverlayManager overlayManager;

	@Inject
	private EventBus eventBus;

	@Inject
	private InteractionManager interactionManager;

	@Inject
	private InteractionOverlay interactionOverlay;

	@Inject
	private MouseManager mouseManager;

	@Override
	public void startUp()
	{
		overlayManager.add(interactionOverlay);
		mouseManager.registerMouseListener(interactionOverlay);
		eventBus.register(interactionManager);
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(interactionOverlay);
		mouseManager.unregisterMouseListener(interactionOverlay);
		eventBus.unregister(interactionManager);
	}
}
