package net.runelite.client.plugins.unethicalite;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.InventoryID;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.unethicalite.regions.RegionHandler;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.JewelryBox;
import net.unethicalite.api.plugins.SettingsPlugin;
import net.unethicalite.client.config.UnethicaliteConfig;

import javax.inject.Inject;
import java.awt.image.BufferedImage;
import java.util.Set;
import java.util.concurrent.ExecutorService;

@PluginDescriptor(
		name = "Unethicalite",
		hidden = true
)
@Slf4j
public class UnethicalitePlugin extends SettingsPlugin
{

	private static boolean INVENTORY_CHANGED = false;
	private static boolean EQUIPMENT_CHANGED = false;

	private static final Set<Integer> REFRESH_WIDGET_IDS = Set.of(
			WidgetInfo.QUEST_COMPLETED_NAME_TEXT.getGroupId(),
			WidgetInfo.LEVEL_UP_LEVEL.getGroupId()
	);

	@Inject
	private UnethicaliteConfig config;

	private static UnethicaliteConfig staticConfig = null;

	@Inject
	private EventBus eventBus;

	@Inject
	private RegionHandler regionHandler;

	@Inject
	private ExecutorService executorService;

	@Inject
	private ClientToolbar clientToolbar;

	@Inject
	private ConfigManager configManager;

	private UnethicalitePanel unethicalitePanel;
	private NavigationButton navButton;

	@Override
	protected void startUp() throws Exception
	{
		staticConfig = config;
		eventBus.register(regionHandler);

		unethicalitePanel = new UnethicalitePanel(config, configManager);

		eventBus.register(unethicalitePanel);

		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "openosrs.png");

		navButton = NavigationButton.builder()
				.tooltip("Unethicalite")
				.icon(icon)
				.priority(-1)
				.panel(unethicalitePanel)
				.build();

		clientToolbar.addNavigation(navButton);

		executorService.submit(TransportLoader::init);
	}

	@Override
	protected void shutDown() throws Exception
	{
		staticConfig = null;
		clientToolbar.removeNavigation(navButton);
		eventBus.unregister(regionHandler);
		eventBus.unregister(unethicalitePanel);
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
			INVENTORY_CHANGED = true;
			TransportLoader.refreshStaticTransports();
		}
		if (event.getContainerId() == InventoryID.EQUIPMENT.getId())
		{
			EQUIPMENT_CHANGED = true;
			TransportLoader.refreshStaticTransports();
		}
	}

	public static boolean shouldRefreshPath()
	{
		boolean refreshPath = INVENTORY_CHANGED || EQUIPMENT_CHANGED;
		EQUIPMENT_CHANGED = false;
		INVENTORY_CHANGED = false;
		return refreshPath;
	}

	public static boolean usePoh()
	{
		return staticConfig != null && staticConfig.usePoh();
	}
	public static boolean hasMountedGlory()
	{
		return staticConfig != null && staticConfig.hasMountedGlory();
	}

	public static boolean hasMountedDigsitePendant()
	{
		return staticConfig != null && staticConfig.hasMountedDigsitePendant();
	}

	public static boolean hasMountedMythicalCape()
	{
		return staticConfig != null && staticConfig.hasMountedMythicalCape();
	}
	public static boolean hasMountedXericsTalisman()
	{
		return staticConfig != null && staticConfig.hasMountedXericsTalisman();
	}
	public static JewelryBox hasJewelryBox()
	{
		return staticConfig == null ? JewelryBox.NONE : staticConfig.hasJewelryBox();
	}
}
