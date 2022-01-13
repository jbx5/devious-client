package net.runelite.client.plugins.interaction;

import dev.hoot.api.plugins.FakePlugin;
import dev.hoot.bot.managers.interaction.InteractionConfig;
import dev.hoot.bot.managers.interaction.InteractionManager;
import net.runelite.client.config.Config;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Interaction Plugin",
		hidden = true
)
public class InteractionPlugin extends FakePlugin
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

	@Inject
	private InteractionConfig interactionConfig;

	@Override
	public void startUp() throws Exception
	{
		super.startUp();
		overlayManager.add(interactionOverlay);
		mouseManager.registerMouseListener(interactionOverlay);
		eventBus.register(interactionManager);
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
		mouseManager.unregisterMouseListener(interactionOverlay);
		eventBus.unregister(interactionManager);
	}
}
