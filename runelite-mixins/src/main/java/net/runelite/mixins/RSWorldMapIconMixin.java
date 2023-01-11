package net.runelite.mixins;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSAbstractWorldMapIcon;

@Mixin(RSAbstractWorldMapIcon.class)
public abstract class RSWorldMapIconMixin implements RSAbstractWorldMapIcon
{
	@Inject
	@Override
	public WorldPoint getCoordinate()
	{
		return new WorldPoint(getRSCoordinate().getX(), getRSCoordinate().getY(), getRSCoordinate().getPlane());
	}
}
