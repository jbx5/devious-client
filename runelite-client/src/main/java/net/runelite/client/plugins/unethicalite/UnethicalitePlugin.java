package net.runelite.client.plugins.unethicalite;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.Config;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.unethicalite.regions.RegionHandler;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.plugins.SettingsPlugin;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.inject.Inject;
import java.util.Set;

@PluginDescriptor(
		name = "Unethicalite",
		hidden = true
)
@Slf4j
public class UnethicalitePlugin extends SettingsPlugin
{

	private static boolean INVENTORY_LOADED = false;
	private static boolean EQUIPMENT_LOADED = false;

	private static final Set<Integer> REFRESH_WIDGET_IDS = Set.of(
			WidgetInfo.QUEST_COMPLETED_NAME_TEXT.getGroupId(),
			WidgetInfo.LEVEL_UP_LEVEL.getGroupId()
	);

	private static final Set<GameState> RESET_GAME_STATES = Set.of(
			GameState.UNKNOWN,
			GameState.STARTING,
			GameState.LOGIN_SCREEN,
			GameState.LOGIN_SCREEN_AUTHENTICATOR,
			GameState.CONNECTION_LOST,
			GameState.HOPPING
	);

	@Inject
	private UnethicaliteConfig config;

	@Inject
	private EventBus eventBus;

	@Inject
	private RegionHandler regionHandler;

	@Override
	protected void startUp() throws Exception
	{
		eventBus.register(regionHandler);
	}

	@Override
	protected void shutDown() throws Exception
	{
		eventBus.unregister(regionHandler);
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

	@Subscribe
	public void onWidgetLoaded(WidgetLoaded event)
	{
		if (REFRESH_WIDGET_IDS.contains(event.getGroupId()))
		{
			TransportLoader.refreshStaticTransports();
		}
	}

	@Subscribe
	public void onItemContainerChanged(ItemContainerChanged event)
	{
		if (event.getContainerId() == InventoryID.INVENTORY.getId())
		{
			INVENTORY_LOADED = true;
			TransportLoader.refreshStaticTransports();
		}
		if (event.getContainerId() == InventoryID.EQUIPMENT.getId())
		{
			EQUIPMENT_LOADED = true;
			TransportLoader.refreshStaticTransports();
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged event)
	{
		if (RESET_GAME_STATES.contains(event.getGameState()))
		{
			log.info("Resetting pathfinder loaded state");
			EQUIPMENT_LOADED = false;
			INVENTORY_LOADED = false;
		}
	}

	public static boolean isPathfinderReady()
	{
		return INVENTORY_LOADED && EQUIPMENT_LOADED;
	}
}
