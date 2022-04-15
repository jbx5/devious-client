package net.runelite.client.plugins.regions;

import com.google.inject.Provides;
import dev.unethicalite.api.events.PlaneChanged;
import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import dev.unethicalite.api.movement.pathfinder.RegionManager;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.ClientTick;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.zip.GZIPInputStream;

@PluginDescriptor(name = "Regions")
@Slf4j
public class RegionPlugin extends Plugin
{
	@Inject
	@Named("unethicalite.api.url")
	private String apiUrl;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private RegionOverlay overlay;

	@Inject
	private AddTransportDialog transportDialog;

	@Inject
	private RegionManager regionManager;

	@Inject
	private GlobalCollisionMap collisionMap;

	@Inject
	private EventBus eventBus;

	@Inject
	private Client client;

	public static boolean selectingSourceTile = false;
	public static boolean selectingDestinationTile = false;
	public static boolean selectingObject = false;

	@Override
	public void startUp()
	{
		eventBus.register(transportDialog);
		eventBus.register(overlay);

		updateCollisionMap();

		overlayManager.add(overlay);
	}

	@Override
	public void shutDown()
	{
		overlayManager.remove(overlay);
		eventBus.unregister(transportDialog);
		eventBus.unregister(overlay);
	}

	@Subscribe
	public void onClientTick(ClientTick e)
	{
		if (selectingSourceTile)
		{
			client.createMenuEntry(-1)
					.setOption("Set")
					.setTarget("<col=00ff00>Source tile")
					.setIdentifier(TileSelection.SOURCE.id);

			return;
		}

		if (selectingDestinationTile)
		{
			client.createMenuEntry(-1)
					.setOption("Set")
					.setTarget("<col=00ff00>Destination tile")
					.setIdentifier(TileSelection.DESTINATION.id);
			return;
		}

		if (selectingObject)
		{
			client.createMenuEntry(-1)
					.setOption("Set")
					.setTarget("<col=00ff00>Transport object")
					.setIdentifier(TileSelection.OBJECT.id);
		}
	}

	@Subscribe
	public void onConfigButtonClicked(ConfigButtonClicked e)
	{
		if (!e.getGroup().equals("regions"))
		{
			return;
		}

		switch (e.getKey())
		{
			case "download":
				updateCollisionMap();
				break;
			case "transport":
				if (transportDialog == null)
				{
					log.error("Add transport UI was not loaded somehow");
					return;
				}

				transportDialog.display();
				break;
		}
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged e)
	{
		if (e.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		regionManager.sendRegion();
	}

	@Subscribe
	public void onPlaneChanged(PlaneChanged e)
	{
		if (Game.getState() != GameState.LOGGED_IN)
		{
			return;
		}

		regionManager.sendRegion();
	}

	private void updateCollisionMap()
	{
		try (InputStream is = new URL(apiUrl + "/regions").openStream())
		{
			collisionMap.overwrite(new GlobalCollisionMap(readGzip(is.readAllBytes())));
		}
		catch (IOException e)
		{
			log.error("Error downloading collision data: {}", e.getMessage());
		}
	}

	private byte[] readGzip(byte[] input) throws IOException
	{
		return new GZIPInputStream(new ByteArrayInputStream(input)).readAllBytes();
	}

	@Provides
	public RegionConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(RegionConfig.class);
	}

	enum TileSelection
	{
		SOURCE(-420),
		DESTINATION(-421),
		OBJECT(-422);

		@Getter
		private final int id;

		TileSelection(int id)
		{
			this.id = id;
		}
	}
}
