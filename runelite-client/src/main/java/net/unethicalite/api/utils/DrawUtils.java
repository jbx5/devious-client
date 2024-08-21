package net.unethicalite.api.utils;

import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.worldmap.WorldMap;
import net.runelite.client.ui.overlay.OverlayUtil;
import net.unethicalite.api.movement.pathfinder.CollisionMap;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.scene.Tiles;
import net.unethicalite.client.Static;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.List;

public class DrawUtils
{
	private static final Color TRANSPORT_COLOR = new Color(0, 255, 0, 128);
	private static final Color TILE_BLOCKED_COLOR = new Color(0, 128, 255, 128);

	public static void drawOnMap(Graphics2D graphics, Locatable locatable, Color color)
	{
		drawOnMap(graphics, locatable.getWorldLocation(), color);
	}

	public static void drawOnMap(Graphics2D graphics, Tile tile, Color color)
	{
		drawOnMap(graphics, tile.getWorldLocation(), color);
	}

	public static void drawOnMap(Graphics2D graphics, WorldPoint point, Color color)
	{
		WorldMap wm = Static.getClient().getWorldMap();

		float pixelsPerTile = wm.getWorldMapZoom();
		int tileCenterPixel = (int) Math.ceil(pixelsPerTile / 2);

		Point tile = CoordUtils.worldPointToWorldMap(point);
		Point bottomRightTile = CoordUtils.worldPointToWorldMap(point.dx(1).dy(-1));

		if (tile == null || bottomRightTile == null)
		{
			return;
		}

		Point topLeft = tile.offset(-tileCenterPixel, -tileCenterPixel);
		Point bottomRight = bottomRightTile.offset(-tileCenterPixel, -tileCenterPixel);

		graphics.setColor(color);
		graphics.fillRect(topLeft.getX(), topLeft.getY(), bottomRight.getX() - topLeft.getX(), bottomRight.getY() - topLeft.getY());
	}

	public static void drawTransports(Graphics2D graphics2D)
	{
		Client client = Static.getClient();
		List<Transport> transports = TransportLoader.buildTransports();

		for (Transport transport : transports)
		{
			WorldPoint instanceSource = transport.getSource();
			WorldPoint instanceDestination = transport.getDestination();

			if (client.isInInstancedRegion())
			{
				instanceSource = WorldPoint.toLocalInstance(client, instanceSource).stream().findFirst().orElse(instanceSource);
				instanceDestination = WorldPoint.toLocalInstance(client, instanceDestination).stream().findFirst().orElse(instanceDestination);
			}

			OverlayUtil.fillTile(graphics2D, client, instanceSource, TRANSPORT_COLOR);
			Point center = Perspective.tileCenter(client, instanceSource);
			if (center == null)
			{
				continue;
			}

			Point linkCenter = Perspective.tileCenter(client, instanceDestination);
			if (linkCenter == null)
			{
				continue;
			}

			graphics2D.drawLine(center.getX(), center.getY(), linkCenter.getX(), linkCenter.getY());
		}
	}

	public static void drawPath(Graphics2D graphics2D, List<WorldPoint> path)
	{
		path.forEach(t -> t.outline(Static.getClient(), graphics2D, Color.RED));
	}

	public static void drawCollisions(Graphics2D graphics2D, CollisionMap collisionMap)
	{
		Client client = Static.getClient();
		List<Tile> tiles = Tiles.getAll();

		if (tiles.isEmpty())
		{
			return;
		}

		if (collisionMap == null)
		{
			return;
		}

		for (Tile tile : tiles)
		{
			Polygon poly = Perspective.getCanvasTilePoly(client, tile.getLocalLocation());
			if (poly == null)
			{
				continue;
			}

			StringBuilder sb = new StringBuilder("");
			graphics2D.setColor(Color.WHITE);
			if (!collisionMap.n(tile.getWorldLocation()))
			{
				sb.append("n");
			}

			if (!collisionMap.s(tile.getWorldLocation()))
			{
				sb.append("s");
			}

			if (!collisionMap.w(tile.getWorldLocation()))
			{
				sb.append("w");
			}

			if (!collisionMap.e(tile.getWorldLocation()))
			{
				sb.append("e");
			}

			String s = sb.toString();
			if (s.isEmpty())
			{
				continue;
			}

			if (!s.equals("nswe"))
			{
				graphics2D.setColor(Color.WHITE);
				if (s.contains("n"))
				{
					graphics2D.drawLine(poly.xpoints[3], poly.ypoints[3], poly.xpoints[2], poly.ypoints[2]);
				}

				if (s.contains("s"))
				{
					graphics2D.drawLine(poly.xpoints[0], poly.ypoints[0], poly.xpoints[1], poly.ypoints[1]);
				}

				if (s.contains("w"))
				{
					graphics2D.drawLine(poly.xpoints[0], poly.ypoints[0], poly.xpoints[3], poly.ypoints[3]);
				}

				if (s.contains("e"))
				{
					graphics2D.drawLine(poly.xpoints[1], poly.ypoints[1], poly.xpoints[2], poly.ypoints[2]);
				}

				continue;
			}

			graphics2D.setColor(TILE_BLOCKED_COLOR);
			graphics2D.fill(poly);
		}
	}

	public static void drawCollisions(Graphics2D graphics2D)
	{
		drawCollisions(graphics2D, Static.getGlobalCollisionMap());
	}
}
