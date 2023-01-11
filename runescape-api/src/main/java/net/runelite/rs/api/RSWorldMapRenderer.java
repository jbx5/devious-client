package net.runelite.rs.api;

import net.runelite.api.worldmap.WorldMapRenderer;
import net.runelite.mapping.Import;

public interface RSWorldMapRenderer extends WorldMapRenderer
{
	@Import("isLoaded")
	@Override
	boolean isLoaded();

	@Import("regions")
	@Override
	RSWorldMapRegion[][] getMapRegions();

	@Import("tileX")
	int getSurfaceOffsetX();

	@Import("tileY")
	int getSurfaceOffsetY();

	@Import("getPixelsPerTile")
	float getPixelsPerTile(int graphicsDiff, int worldDiff);
}
