package net.runelite.rs.api;

import net.runelite.mapping.Import;

public interface RSCoord
{
	@Import("plane")
	int getPlane();

	@Import("x")
	int getX();

	@Import("y")
	int getY();
}
