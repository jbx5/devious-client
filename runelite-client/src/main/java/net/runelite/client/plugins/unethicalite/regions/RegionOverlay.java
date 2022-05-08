package net.runelite.client.plugins.unethicalite.regions;

import dev.unethicalite.api.movement.pathfinder.GlobalCollisionMap;
import dev.unethicalite.api.movement.pathfinder.Transport;
import dev.unethicalite.api.movement.pathfinder.TransportLoader;
import dev.unethicalite.api.movement.pathfinder.Walker;
import dev.unethicalite.api.scene.Tiles;
import dev.unethicalite.api.utils.CoordUtils;
import dev.unethicalite.api.utils.DrawUtils;
import dev.unethicalite.api.widgets.Widgets;
import dev.unethicalite.client.config.UnethicaliteConfig;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.RenderOverview;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.MenuOpened;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

@Singleton
public class RegionOverlay extends Overlay
{
	private static final Color RED_TRANSLUCENT = new Color(255, 0, 0, 128);

	private final UnethicaliteConfig regionConfig;
	private final GlobalCollisionMap collisionMap;
	private final Client client;
	private final ExecutorService executorService;

	private List<WorldPoint> path = new ArrayList<>();

	@Inject
	public RegionOverlay(UnethicaliteConfig regionConfig, GlobalCollisionMap collisionMap, Client client, ExecutorService executorService)
	{
		this.regionConfig = regionConfig;
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

			if (regionConfig.transportsOverlay())
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

			if (regionConfig.collisionOverlay())
			{
				List<WorldPoint> worldMapTiles = Tiles.getWorldMapTiles(regionConfig.collisionOverlayPlane());
				for (WorldPoint worldMapTile : worldMapTiles)
				{
					if (worldMapTile != null && collisionMap.fullBlock(worldMapTile))
					{
						DrawUtils.drawOnMap(graphics, worldMapTile, RED_TRANSLUCENT);
					}
				}
			}

			if (regionConfig.pathOverlay() && !path.isEmpty())
			{
				for (WorldPoint tile : path)
				{
					DrawUtils.drawOnMap(graphics, tile, Color.RED);
				}

				DrawUtils.drawOnMap(graphics, path.get(path.size() - 1), Color.GREEN);
			}

			return null;
		}

		if (regionConfig.transportsOverlay())
		{
			DrawUtils.drawTransports(graphics);
		}

		if (regionConfig.collisionOverlay())
		{
			DrawUtils.drawCollisions(graphics);
		}

		if (regionConfig.pathOverlay() && !path.isEmpty())
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
	public void onMenuEntryAdded(MenuOpened event)
	{
		Widget worldMap = Widgets.get(WidgetInfo.WORLD_MAP_VIEW);
		if (worldMap == null)
		{
			return;
		}

		Point mouse = client.getMouseCanvasPosition();
		if (!worldMap.getBounds().contains(mouse.getX(), mouse.getY()))
		{
			return;
		}

		client.createMenuEntry(-1)
				.setOption("Set")
				.setTarget("<col=00ff00>Destination")
				.setType(MenuAction.RUNELITE_OVERLAY)
				.onClick(e ->
				{
					Point click = client.getMouseCanvasPosition();
					WorldPoint clickPoint = calculateMapPoint(click);
					if (clickPoint == null)
					{
						return;
					}

					executorService.execute(() ->
					{
						try
						{
							path = Walker.PATH_CACHE.get(clickPoint);
						}
						catch (ExecutionException ex)
						{
							ex.printStackTrace();
						}
					});
				});
	}

	private WorldPoint calculateMapPoint(Point point)
	{
		float zoom = client.getRenderOverview().getWorldMapZoom();
		RenderOverview renderOverview = client.getRenderOverview();
		final WorldPoint mapPoint = new WorldPoint(renderOverview.getWorldMapPosition().getX(), renderOverview.getWorldMapPosition().getY(), 0);
		final Point middle = CoordUtils.worldPointToWorldMap(mapPoint);
		if (middle == null)
		{
			return null;
		}

		final int dx = (int) ((point.getX() - middle.getX()) / zoom);
		final int dy = (int) ((-(point.getY() - middle.getY())) / zoom);

		return mapPoint.dx(dx).dy(dy);
	}
}
