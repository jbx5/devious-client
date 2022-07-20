package net.unethicalite.api.coords;

import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import lombok.Getter;
import net.runelite.api.coords.WorldPoint;

public class RectangularArea implements Area
{
	@Getter
	private final int minX;
	@Getter
	private final int maxX;
	@Getter
	private final int minY;
	@Getter
	private final int maxY;
	@Getter
	private final int plane;

	public RectangularArea(int x1, int y1, int x2, int y2, int plane)
	{
		this.plane = plane;

		if (x1 <= x2)
		{
			minX = x1;
			maxX = x2;
		}
		else
		{
			minX = x2;
			maxX = x1;
		}

		if (y1 <= y2)
		{
			minY = y1;
			maxY = y2;
		}
		else
		{
			minY = y2;
			maxY = y1;
		}
	}

	public RectangularArea(int x1, int y1, int x2, int y2)
	{
		this(x1, y1, x2, y2, 0);
	}

	public RectangularArea(WorldPoint sw, int width, int height)
	{
		this(sw.getX(), sw.getY(), sw.getX() + width, sw.getY() + height, sw.getPlane());
	}

	public RectangularArea(WorldPoint sw, WorldPoint ne)
	{
		this(sw.getX(), sw.getY(), ne.getX(), ne.getY(), sw.getPlane());
	}

	@Override
	public WorldPoint getRandomTile()
	{
		return new WorldPoint(Rand.nextInt(minX, maxX), Rand.nextInt(minY, maxY), plane);
	}

	public WorldPoint getCenter()
	{
		return new WorldPoint((minX + maxX) / 2, (minY + maxY) / 2, plane);
	}

	public WorldPoint getNearest()
	{
		final WorldPoint current = Players.getLocal().getWorldLocation();

		if (contains(current))
		{
			return current;
		}

		int x;

		if (current.getX() <= minX)
		{
			x = minX;
		}
		else if (current.getX() >= maxX)
		{
			x = maxX;
		}
		else
		{
			x = current.getX();
		}

		int y;

		if (current.getY() <= minY)
		{
			y = minY;
		}
		else if (current.getY() >= maxY)
		{
			y = maxY;
		}
		else
		{
			y = current.getY();
		}

		return new WorldPoint(x, y, plane);
	}

	@Override
	public boolean contains(WorldPoint worldPoint)
	{
		if (worldPoint.getPlane() == -1 || worldPoint.getPlane() != plane)
		{
			return false;
		}

		int x = worldPoint.getX();
		int y = worldPoint.getY();
		return x >= minX && y >= minY && x <= maxX && y <= maxY;
	}
}
