package dev.hoot.api.coords;

import dev.hoot.api.commons.Rand;
import net.runelite.api.coords.WorldPoint;

public class RectangularArea implements Area {
	private final int minX;
	private final int maxX;
	private final int minY;
	private final int maxY;
	private final int plane;

	public RectangularArea(int x1, int y1, int x2, int y2, int plane) {
		this.plane = plane;

		if (x1 <= x2) {
			minX = x1;
			maxX = x2;
		} else {
			minX = x2;
			maxX = x1;
		}

		if (y1 <= y2) {
			minY = y1;
			maxY = y2;
		} else {
			minY = y2;
			maxY = y1;
		}
	}

	public RectangularArea(int x1, int y1, int x2, int y2) {
		this(x1, y1, x2, y2, 0);
	}

	public WorldPoint getRandomTile() {
		return new WorldPoint(Rand.nextInt(minX, maxX), Rand.nextInt(minY, maxY), plane);
	}

	public WorldPoint getCenter() {
		return new WorldPoint((minX + maxX) / 2, (minY + maxY) / 2, plane);
	}

	@Override
	public boolean contains(WorldPoint worldPoint) {
		if (worldPoint.getPlane() == -1 || worldPoint.getPlane() != plane) {
			return false;
		}

		int x = worldPoint.getX();
		int y = worldPoint.getY();
		return x >= minX && y >= minY && x <= maxX && y <= maxY;
	}
}
