package net.runelite.mixins;

import java.util.Collection;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.worldmap.WorldMapIcon;
import net.runelite.rs.api.RSWorldMapRegion;

@Mixin(RSWorldMapRegion.class)
public abstract class RSWorldMapRegionMixin implements RSWorldMapRegion
{
	@Inject
	@Override
	public Collection<WorldMapIcon> getMapIcons()
	{
		return this.icons();
	}
}
