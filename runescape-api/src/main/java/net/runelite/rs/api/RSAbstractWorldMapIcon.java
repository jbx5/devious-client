package net.runelite.rs.api;

import net.runelite.api.worldmap.WorldMapIcon;
import net.runelite.mapping.Import;

public interface RSAbstractWorldMapIcon extends WorldMapIcon
{
	@Import("getElement")
	@Override
	int getType();

	@Import("coord1")
	RSCoord getRSCoordinate();
}
