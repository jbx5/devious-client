package net.runelite.mixins;

import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSWorldMap;
import net.runelite.rs.api.RSWorldMapRenderer;

@Mixin(RSWorldMap.class)
public abstract class RSWorldMapMixin implements RSWorldMap
{
	@Inject
	@Override
	public Point getWorldMapPosition()
	{
		RSWorldMapRenderer worldMapRenderer = getWorldMapRenderer();
		int worldX = getWorldMapX() + worldMapRenderer.getSurfaceOffsetX();
		int worldY = getWorldMapY() + worldMapRenderer.getSurfaceOffsetY();
		return new Point(worldX, worldY);
	}

	@Inject
	public void setWorldMapPositionTarget(WorldPoint worldPoint)
	{
		setWorldMapPositionTarget(worldPoint.getX(), worldPoint.getY());
	}
}
