package net.unethicalite.api.entities;

import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.scene.Tiles;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public abstract class TileEntities<T extends SceneEntity> extends Entities<T>
{
	protected abstract List<T> at(Tile tile, Predicate<? super T> filter);

	protected List<T> at(Tile tile, int... ids)
	{
		return at(tile, Predicates.ids(ids));
	}

	protected List<T> at(Tile tile, String... names)
	{
		return at(tile, Predicates.names(names));
	}

	protected List<T> surrounding(int worldX, int worldY, int plane, int radius, Predicate<? super T> filter)
	{
		List<T> out = new ArrayList<>();
		for (int x = -radius; x <= radius; x++)
		{
			for (int y = -radius; y <= radius; y++)
			{
				out.addAll(at(Tiles.getAt(worldX + x, worldY + y, plane), filter));
			}
		}

		return out;
	}

	protected List<T> surrounding(int worldX, int worldY, int plane, int radius, int... ids)
	{
		return surrounding(worldX, worldY, plane, radius, Predicates.ids(ids));
	}

	protected List<T> surrounding(int worldX, int worldY, int plane, int radius, String... names)
	{
		return surrounding(worldX, worldY, plane, radius, Predicates.names(names));
	}


	protected List<T> in(WorldArea area, Predicate<? super T> filter)
	{
		List<T> out = new ArrayList<>();
		for (WorldPoint worldPoint : area.toWorldPointList())
		{
			out.addAll(at(Tiles.getAt(worldPoint), filter));
		}

		return out;
	}

	protected List<T> in(WorldArea area, int... ids)
	{
		return in(area, Predicates.ids(ids));
	}

	protected List<T> in(WorldArea area, String... names)
	{
		return in(area, Predicates.names(names));
	}
}
