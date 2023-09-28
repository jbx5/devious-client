package net.runelite.client.plugins.unethicaldevtools;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.Teleport;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.api.utils.CoordUtils;
import net.unethicalite.api.utils.DrawUtils;
import net.unethicalite.api.widgets.Widgets;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

import static net.unethicalite.api.movement.pathfinder.Walker.buildTeleportLinks;

@Singleton
@Slf4j
public class RegionOverlay extends Overlay
{
	private static final Color RED_TRANSLUCENT = new Color(255, 0, 0, 128);

	private final UnethicalDevToolsConfig config;
	private final GlobalCollisionMap collisionMap;
	private final Client client;
	private final ExecutorService executorService;
	private WorldPoint startTile;

	private List<WorldPoint> path = new ArrayList<>();

	@Inject
	public RegionOverlay(UnethicalDevToolsConfig config, GlobalCollisionMap collisionMap, Client client, ExecutorService executorService)
	{
		this.config = config;
		this.collisionMap = collisionMap;
		this.client = client;
		this.executorService = executorService;

		setPosition(OverlayPosition.DYNAMIC);
		setLayer(OverlayLayer.ABOVE_WIDGETS);
		setPriority(OverlayPriority.LOW);
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
		if (worldMap != null)
		{
			Rectangle mapBounds = worldMap.getBounds();
			graphics.setClip(mapBounds);

			if (config.transportsOverlay())
			{
				List<Transport> transports = TransportLoader.buildTransports();
				for (Transport transport : transports)
				{
					DrawUtils.drawOnMap(graphics, transport.getDestination(), Color.magenta);
					Point center = CoordUtils.worldPointToWorldMap(transport.getSource());
					if (center == null)
					{
						continue;
					}

					Point linkCenter = CoordUtils.worldPointToWorldMap(transport.getDestination());
					if (linkCenter == null)
					{
						continue;
					}

					graphics.drawLine(center.getX(), center.getY(), linkCenter.getX(), linkCenter.getY());
				}
			}

			if (config.collisionOverlay())
			{
				Collection<WorldPoint> worldMapTiles = Tiles.getWorldMapTiles();
				for (WorldPoint worldMapTile : worldMapTiles)
				{
					if (worldMapTile != null && collisionMap.fullBlock(worldMapTile))
					{
						DrawUtils.drawOnMap(graphics, worldMapTile, RED_TRANSLUCENT);
					}
				}
			}

			if (config.pathOverlay() && !path.isEmpty())
			{
				for (WorldPoint tile : path)
				{
					DrawUtils.drawOnMap(graphics, tile, Color.RED);
				}

				DrawUtils.drawOnMap(graphics, path.get(path.size() - 1), Color.GREEN);
			}

			return null;
		}

		if (config.transportsOverlay())
		{
			DrawUtils.drawTransports(graphics);
		}

		if (config.collisionOverlay())
		{
			DrawUtils.drawCollisions(graphics);
		}

		if (config.pathOverlay() && !path.isEmpty())
		{
			for (WorldPoint tile : path)
			{
				tile.outline(client, graphics, Color.RED);
			}

			path.get(path.size() - 1).outline(client, graphics, Color.GREEN, "Destination");
		}

		return null;
	}

	@Subscribe
	public void onMenuOpened(MenuOpened event)
	{
		if (!config.pathOverlay())
		{
			return;
		}
		Point mouse = client.getMouseCanvasPosition();

		Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
		if (worldMap == null)
		{
			if (!event.getFirstEntry().getOption().equals("Walk here"))
			{
				return;
			}
			Tile clickPoint = Tiles.getHoveredTile();
			if (clickPoint == null)
			{
				return;
			}
			generateMenu(clickPoint.getWorldLocation());
		}
		else
		{
			if (!worldMap.getBounds().contains(mouse.getX(), mouse.getY()))
			{
				return;
			}
			WorldPoint clickPoint = CoordUtils.worldMapToWorldPoint(mouse);
			if (clickPoint == null)
			{
				return;
			}
			generateMenu(clickPoint);
		}
	}

	private void generateMenu(WorldPoint clickPoint)
	{
		client.createMenuEntry(1)
			.setOption("<col=00ff00>Debug:</col>")
			.setTarget("Calculate path")
			.setType(MenuAction.RUNELITE_OVERLAY)
			.onClick(e -> {
				if (startTile == null)
				{
					executorService.execute(() -> path = Walker.calculatePath(clickPoint));
				}
				else
				{
					LinkedHashMap<WorldPoint, Teleport> teleports = buildTeleportLinks(clickPoint.toWorldArea());
					List<WorldPoint> startPoints = new ArrayList<>(teleports.keySet());
					startPoints.add(startTile);
					executorService.execute(() -> path = Walker.calculatePath(
						startPoints, clickPoint));
				}
			});
		if (!path.isEmpty())
		{
			client.createMenuEntry(1)
				.setOption("<col=00ff00>Debug:</col>")
				.setTarget("Set start")
				.setType(MenuAction.RUNELITE_OVERLAY)
				.onClick(e -> {
						startTile = clickPoint;
						LinkedHashMap<WorldPoint, Teleport> teleports = buildTeleportLinks(clickPoint.toWorldArea());
						List<WorldPoint> startPoints = new ArrayList<>(teleports.keySet());
						startPoints.add(startTile);
						executorService.execute(() -> path = Walker.calculatePath(
							startPoints, path.get(path.size() - 1)));
					}
				);
			client.createMenuEntry(2)
				.setOption("<col=00ff00>Debug:</col>")
				.setTarget("Clear path")
				.setType(MenuAction.RUNELITE_OVERLAY)
				.onClick(e ->
					{
						executorService.execute(() -> path.clear());
						startTile = null;
					}
				);
		}
	}
}
