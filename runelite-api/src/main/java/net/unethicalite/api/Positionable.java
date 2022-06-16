package net.unethicalite.api;

import net.runelite.api.coords.WorldPoint;

public interface Positionable
{
	int getX();

	int getY();

	int getPlane();

	default WorldPoint getWorldLocation()
	{
		return new WorldPoint(getX(), getY(), getPlane());
	}
}
