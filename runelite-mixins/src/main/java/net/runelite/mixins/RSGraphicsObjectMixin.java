package net.runelite.mixins;

import net.runelite.api.RuneLiteObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGraphicsObject;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNodeDeque;
import net.runelite.rs.api.RSRenderable;
import net.runelite.rs.api.RSRuneLiteObject;

@Mixin(RSGraphicsObject.class)
public abstract class RSGraphicsObjectMixin implements RSGraphicsObject
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	RSGraphicsObjectMixin()
	{
		final GraphicsObjectCreated event = new GraphicsObjectCreated(this);
		client.getCallbacks().post(event);
	}

	@Override
	@Inject
	public LocalPoint getLocation()
	{
		return new LocalPoint(this.getX(), this.getY());
	}


	@Copy("advance")
	@Replace("advance")
	public void copy$advance(int var1)
	{
		if (this instanceof RuneLiteObject)
		{
			((RSRuneLiteObject) this).advanceRL(var1);
		}
		else
		{
			copy$advance(var1);
		}
	}


	@Copy("getModel")
	@Replace("getModel")
	public RSModel copy$getModel()
	{
		if (this instanceof RuneLiteObject)
		{
			return ((RSRuneLiteObject) this).getModelRl();
		}
		else
		{
			return copy$getModel();
		}
	}

	@Copy("drawEntities")
	@Replace("drawEntities")
	static final void copy$drawEntities(int var0, int var1, int var2, int var3)
	{
		RSNodeDeque rSNodeDeque = client.getGraphicsObjectDeque();
		for (RSGraphicsObject rSGraphicsObject = (RSGraphicsObject)rSNodeDeque.last(); rSGraphicsObject != null; rSGraphicsObject = (RSGraphicsObject)rSNodeDeque.previous())
		{
			if (rSGraphicsObject.getLevel() == client.getPlane() && !rSGraphicsObject.finished())
			{
				if (client.getGameCycle() >= rSGraphicsObject.getStartCycle())
				{
					rSGraphicsObject.advance(client.getGraphicsCycle());
					if (rSGraphicsObject.finished())
					{
						rSGraphicsObject.unlink();
					}
					else
					{
						int radius = 60;
						int orientation = 0;
						boolean drawFrontTilesFirst = false;
						if (rSGraphicsObject instanceof RSRuneLiteObject)
						{
							RSRuneLiteObject rSRuneLiteObject = (RSRuneLiteObject)rSGraphicsObject;
							radius = rSRuneLiteObject.getRadius();
							orientation = rSRuneLiteObject.getOrientation();
							drawFrontTilesFirst = rSRuneLiteObject.drawFrontTilesFirst();
						}
						client.getScene().drawEntity(rSGraphicsObject
								.getLevel(), rSGraphicsObject
								.getX(), rSGraphicsObject
								.getY(), rSGraphicsObject
								.getZ(), radius, (RSRenderable)rSGraphicsObject, orientation, -1L, drawFrontTilesFirst);
					}
				}
			}
			else
			{
				rSGraphicsObject.unlink();
			}
		}
		copy$drawEntities(var0, var1, var2, var3);
	}
}
