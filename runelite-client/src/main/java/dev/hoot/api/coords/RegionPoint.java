package dev.hoot.api.coords;

import dev.hoot.api.game.Game;
import lombok.Value;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;

@Value
public class RegionPoint {
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

    // scene > world > region
    public static RegionPoint fromScene(ScenePoint scenePoint)
    {
        Client client = Game.getClient();
        WorldPoint world = new WorldPoint(client.getBaseX() + scenePoint.getX(), client.getBaseY() + scenePoint.getY(), scenePoint.getPlane());
        return fromWorld(world);
    }

    // world > region
    public static RegionPoint fromWorld(WorldPoint worldPoint)
    {
        return new RegionPoint(worldPoint.getRegionX(), worldPoint.getRegionY(), worldPoint.getPlane(), worldPoint.getRegionID());
    }
}
