package net.unethicalite.api.coords;

import lombok.Value;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;

@Value
public class RegionPoint
{
	int x;
	int y;
	int plane;
	int regionId;

	// region > world
	public WorldPoint toWorld()
	{
		return WorldPoint.fromRegion(regionId, x, y, plane);
	}

	// region > world > scene
	public ScenePoint toScene()
	{
		return ScenePoint.fromWorld(toWorld());
	}

	public int distanceTo(RegionPoint other)
	{
		if (other.regionId != regionId || other.plane != plane)
		{
			return Integer.MAX_VALUE;
		}

		return (int) Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
	}

	// scene > world > region
	public static RegionPoint fromScene(ScenePoint scenePoint)
	{
		Client client = Static.getClient();
		WorldPoint world = new WorldPoint(client.getBaseX() + scenePoint.getX(), client.getBaseY() + scenePoint.getY(), scenePoint.getPlane());
		return fromWorld(world);
	}

	// world > region
	public static RegionPoint fromWorld(WorldPoint worldPoint)
	{
		return new RegionPoint(worldPoint.getRegionX(), worldPoint.getRegionY(), worldPoint.getPlane(), worldPoint.getRegionID());
	}
}
