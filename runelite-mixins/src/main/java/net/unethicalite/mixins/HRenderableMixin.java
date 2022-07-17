package net.unethicalite.mixins;

import net.runelite.api.Locatable;
import net.runelite.api.Perspective;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

import java.awt.Rectangle;
import java.awt.Shape;

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

	@Inject
	@MethodHook(value = "draw", end = true)
	public void onDraw(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, long hash)
	{
		updateBounds();
	}

	@Inject
	public void updateBounds()
	{
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
