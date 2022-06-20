package net.unethicalite.api;

import net.runelite.api.coords.WorldPoint;

public interface Positionable
{
	int getWorldX();

	int getWorldY();

	int getPlane();

	default WorldPoint getWorldLocation()
	{
		return new WorldPoint(getWorldX(), getWorldY(), getPlane());
	}
}
