package net.unethicalite.mixins;

import net.runelite.api.ObjectComposition;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSObjectComposition;

@Mixin(RSGameObject.class)
public abstract class HGameObjectMixin implements RSGameObject
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private RSObjectComposition transformedComposition = null;

	@Inject
	@Override
	public WorldArea getWorldArea()
	{
		if (!getLocalLocation().isInScene())
		{
			return null;
		}

		LocalPoint localSWTile = new LocalPoint(
				getLocalLocation().getX() - (sizeX() - 1) * Perspective.LOCAL_TILE_SIZE / 2,
				getLocalLocation().getY() - (sizeY() - 1) * Perspective.LOCAL_TILE_SIZE / 2
		);

		LocalPoint localNETile = new LocalPoint(
				getLocalLocation().getX() + (sizeX() - 1) * Perspective.LOCAL_TILE_SIZE / 2,
				getLocalLocation().getY() + (sizeY() - 1) * Perspective.LOCAL_TILE_SIZE / 2
		);

		return new WorldArea(
				WorldPoint.fromLocal(client, localSWTile),
				WorldPoint.fromLocal(client, localNETile)
		);
	}

	@Inject
	public RSObjectComposition getTransformedComposition()
	{
		return transformedComposition;
	}

	@Inject
	public void setTransformedComposition(ObjectComposition composition)
	{
		transformedComposition = (RSObjectComposition) composition;
	}
}
