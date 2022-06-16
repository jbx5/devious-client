package net.unethicalite.mixins;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSCoord;
import net.runelite.rs.api.RSWorldMap;
import net.runelite.rs.api.RSWorldMapArea;

@Mixin(RSWorldMap.class)
public abstract class HWorldMapMixin implements RSWorldMap
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	public WorldPoint getMouseLocation()
	{
		RSCoord coord = getMouseCoord();
		if (coord == null)
		{
			return null;
		}

		return new WorldPoint(coord.getX(), coord.getY(), coord.getPlane());
	}

	@Inject
	public int getX(int canvasX)
	{
		return (int) (getWorldMapX() + ((canvasX + getWorldMapDisplayX()) - getWorldMapDisplayWidth() * getWorldMapZoom() / 2.0F) / getWorldMapZoom());
	}

	@Inject
	public int getY(int canvasY)
	{
		return (int) (getWorldMapY() - ((canvasY - getWorldMapDisplayY()) - getWorldMapDisplayHeight() * getWorldMapZoom() / 2.0F) / getWorldMapZoom());
	}

	@Inject
	public WorldPoint getWorldPoint(int canvasX, int canvasY)
	{
		RSWorldMapArea worldMapData = getWorldMapData();
		if (worldMapData == null)
		{
			return null;
		}

		RSCoord coord = worldMapData.coord(getX(canvasX) + worldMapData.getRegionLowX() * 64, getY(canvasY) + worldMapData.getRegionLowY() * 64);
		if (coord == null)
		{
			return null;
		}

		return new WorldPoint(coord.getX(), coord.getY(), coord.getPlane());
	}

	@Inject
	public WorldPoint getWorldPointFromMap(int mapX, int mapY)
	{
		RSWorldMapArea worldMapData = getWorldMapData();
		if (worldMapData == null)
		{
			return null;
		}

		RSCoord coord = worldMapData.coord(mapX + worldMapData.getRegionLowX() * 64,
				mapY + worldMapData.getRegionLowY() * 64);
		if (coord == null)
		{
			return null;
		}

		return new WorldPoint(coord.getX(), coord.getY(), coord.getPlane());
	}

	@Inject
	public int getWorldMapX(int worldX)
	{
		RSWorldMapArea worldMapData = getWorldMapData();
		if (worldMapData == null)
		{
			return -1;
		}

		return worldX - (worldMapData.getRegionLowX() * 64);
	}

	@Inject
	public int getWorldMapY(int worldY)
	{
		RSWorldMapArea worldMapData = getWorldMapData();
		if (worldMapData == null)
		{
			return -1;
		}

		return worldY - (worldMapData.getRegionLowY() * 64);
	}
}
