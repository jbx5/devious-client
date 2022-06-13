package net.unethicalite.mixins;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSCoord;
import net.runelite.rs.api.RSWorldMap;

@Mixin(RSWorldMap.class)
public abstract class HWorldMapMixin implements RSWorldMap
{
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
}
