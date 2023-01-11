package net.runelite.rs.api;

import java.util.List;
import net.runelite.api.worldmap.WorldMapRegion;
import net.runelite.mapping.Import;

public interface RSWorldMapRegion extends WorldMapRegion
{
	@Import("icons")
	List icons();
}
