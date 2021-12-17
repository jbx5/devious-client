package dev.hoot.api.coords;

import net.runelite.api.coords.WorldPoint;

import java.awt.*;

public class PolygonalArea implements Area {
	private final Polygon polygon;
	private final int plane;

	public PolygonalArea(int plane, WorldPoint... points) {
		this.plane = plane;
		this.polygon = new Polygon();

		for (WorldPoint point : points) {
			polygon.addPoint(point.getX(), point.getY());
		}
	}

	@Override
	public boolean contains(WorldPoint worldPoint) {
		if (worldPoint.getPlane() == -1 || worldPoint.getPlane() != plane) {
			return false;
		}

		return polygon.contains(worldPoint.getX(), worldPoint.getY());
	}
}
