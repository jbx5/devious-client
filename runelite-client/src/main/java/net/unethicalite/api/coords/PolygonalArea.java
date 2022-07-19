package net.unethicalite.api.coords;

import net.runelite.api.geometry.SimplePolygon;
import net.runelite.api.model.Jarvis;
import net.unethicalite.api.commons.Rand;
import net.runelite.api.coords.WorldPoint;

import java.awt.*;
import java.util.ArrayList;

public class PolygonalArea implements Area
{
	private final Polygon polygon;
	private final int plane;

	public PolygonalArea(int plane, WorldPoint... points)
	{
		this.plane = plane;
		this.polygon = new Polygon();

		for (WorldPoint point : points)
		{
			polygon.addPoint(point.getX(), point.getY());
		}
	}

	@Override
	public boolean contains(WorldPoint worldPoint)
	{
		if (worldPoint.getPlane() == -1 || worldPoint.getPlane() != plane)
		{
			return false;
		}

		return polygon.contains(worldPoint.getX(), worldPoint.getY());
	}

	@Override
	public WorldPoint getRandom() {
		int x, y;
		Rectangle r = polygon.getBounds();
		do {
			x = Rand.nextInt(r.x, r.x + r.width);
			y = Rand.nextInt(r.y, r.y + r.height);
		} while (!polygon.contains(x, y));
		return new WorldPoint(x, y, plane);
	}

	@Override
	public WorldPoint getCenter() {
		Rectangle r = polygon.getBounds();
		return new WorldPoint(r.x + r.width / 2, r.y + r.height / 2, plane);
	}
}
