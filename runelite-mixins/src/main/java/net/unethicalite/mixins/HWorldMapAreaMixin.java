package net.unethicalite.mixins;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSCoord;
import net.runelite.rs.api.RSWorldMapArea;

@Mixin(RSWorldMapArea.class)
public abstract class HWorldMapAreaMixin implements RSWorldMapArea
{
	@Inject
	public WorldPoint getOrigin()
	{
		RSCoord origin = getRSOrigin();
		if (origin == null)
		{
			return null;
		}

		return new WorldPoint(origin.getX(), origin.getY(), origin.getPlane());
	}
}
