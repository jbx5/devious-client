package net.runelite.rs.api;

import net.runelite.api.RenderOverview;
import net.runelite.api.worldmap.WorldMap;
import net.runelite.api.worldmap.WorldMapData;
import net.runelite.mapping.Import;

public interface RSWorldMap extends WorldMap, RenderOverview
{
	@Import("centerTileX")
	int getWorldMapX();

	@Import("centerTileY")
	int getWorldMapY();

	@Import("zoom")
	float getWorldMapZoom();

	@Import("worldMapTargetX")
	int getWorldMapTargetX();

	@Import("worldMapTargetY")
	int getWorldMapTargetY();

	@Import("worldMapDisplayWidth")
	int getWorldMapDisplayWidth();

	@Import("worldMapDisplayHeight")
	int getWorldMapDisplayHeight();

	@Import("worldMapDisplayX")
	int getWorldMapDisplayX();

	@Import("worldMapDisplayY")
	int getWorldMapDisplayY();

	@Import("setWorldMapPosition")
	void setWorldMapPosition(int worldMapX, int worldMapY, boolean changedSurface);

	@Import("setWorldMapPositionTarget")
	void setWorldMapPositionTarget(int worldPointX, int worldPointY);

	@Import("worldMapRenderer")
	@Override
	RSWorldMapRenderer getWorldMapRenderer();

	@Import("initializeWorldMap")
	@Override
	void initializeWorldMap(WorldMapData worldMapData);

	@Import("getCurrentMapArea")
	@Override
	RSWorldMapArea getWorldMapData();

	@Import("mouseCoord")
	RSCoord getMouseCoord();

	@Import("getDisplayX")
	int getDisplayX();

	@Import("getDisplayY")
	int getDisplayY();
}
