package dev.hoot.api.entities;

import dev.hoot.api.SceneEntity;
import dev.hoot.api.scene.Tiles;
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
		return at(tile, x ->
		{
			for (int id : ids)
			{
				if (id == x.getId())
				{
					return true;
				}
			}

			return false;
		});
	}

	protected List<T> at(Tile tile, String... names)
	{
		return at(tile, x ->
		{
			if (x.getName() == null)
			{
				return false;
			}

			for (String name : names)
			{
				if (name.equals(x.getName()))
				{
					return true;
				}
			}

			return false;
		});
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
		return surrounding(worldX, worldY, plane, radius, x ->
		{
			for (int id : ids)
			{
				if (id == x.getId())
				{
					return true;
				}
			}

			return false;
		});
	}

	protected List<T> surrounding(int worldX, int worldY, int plane, int radius, String... names)
	{
		return surrounding(worldX, worldY, plane, radius, x ->
		{
			if (x.getName() == null)
			{
				return false;
			}

			for (String name : names)
			{
				if (name.equals(x.getName()))
				{
					return true;
				}
			}

			return false;
		});
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
		return in(area, x ->
		{
			for (int id : ids)
			{
				if (id == x.getId())
				{
					return true;
				}
			}

			return false;
		});
	}

	protected List<T> in(WorldArea area, String... names)
	{
		return in(area, x ->
		{
			if (x.getName() == null)
			{
				return false;
			}

			for (String name : names)
			{
				if (name.equals(x.getName()))
				{
					return true;
				}
			}

			return false;
		});
	}
}
