package net.runelite.client.plugins.interaction;

import com.google.inject.Provides;
import dev.hoot.api.entities.Players;
import dev.hoot.api.game.Game;
import dev.hoot.api.movement.Movement;
import net.runelite.api.GameState;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
		name = "Interaction",
		description = "Automation plugin",
		tags = {"automation", "interaction", "interact", "bot"}
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

	@Provides
	InteractionConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(InteractionConfig.class);
	}

	@Subscribe
	public void onConfigChanged(ConfigChanged e)
	{
		if (!e.getGroup().equals("interaction"))
		{
			return;
		}

		if (Game.getState() != GameState.LOGGED_IN)
		{
			return;
		}

		Movement.walk(Players.getLocal().getWorldLocation().dx(5));
	}
}
