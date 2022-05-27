package net.unethicalite.mixins;

import net.runelite.api.Locatable;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

import java.awt.*;

@Mixin(RSRenderable.class)
public abstract class HRenderableMixin implements RSRenderable
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private Rectangle cachedBounds;

	@Inject
	public Rectangle getCachedBounds()
	{
		return cachedBounds;
	}

	@SuppressWarnings("InfiniteRecursion")
	@Copy("draw")
	@Replace("draw")
	public void copy$draw(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z,
						  long hash)
	{
		copy$draw(orientation, pitchSin, pitchCos, yawSin, yawCos, x, y, z, hash);

		if (this instanceof Locatable)
		{
			Locatable locatable = (Locatable) this;
			RSModel model = getModel();
			if (model != null)
			{
				LocalPoint localPoint = locatable.getLocalLocation();
				if (localPoint == null)
				{
					return;
				}

				Shape convexHull = model.getConvexHull(localPoint.getX(), localPoint.getY(), 0,
						Perspective.getTileHeight(client, localPoint, locatable.getWorldLocation().getPlane()));
				if (convexHull != null)
				{
					cachedBounds = convexHull.getBounds();
				}
			}
		}
	}
}
