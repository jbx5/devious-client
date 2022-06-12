package net.unethicalite.api.entities;

import net.unethicalite.api.query.entities.TileItemQuery;
import net.unethicalite.api.scene.Tiles;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TileItems extends TileEntities<TileItem>
{
	private static final TileItems TILE_ITEMS = new TileItems();

	private TileItems()
	{
	}

	public static TileItemQuery query()
	{
		return query(TileItems::getAll);
	}

	public static TileItemQuery query(Supplier<List<TileItem>> supplier)
	{
		return new TileItemQuery(supplier);
	}

	public static List<TileItem> getAll()
	{
		return getAll(x -> true);
	}

	public static List<TileItem> getAll(Predicate<TileItem> filter)
	{
		return TILE_ITEMS.all(filter);
	}

	public static List<TileItem> getAll(int... ids)
	{
		return TILE_ITEMS.all(ids);
	}

	public static List<TileItem> getAll(String... names)
	{
		return TILE_ITEMS.all(names);
	}

	public static TileItem getNearest(Predicate<TileItem> filter)
	{
		return getNearest(Players.getLocal().getWorldLocation(), filter);
	}

	public static TileItem getNearest(int... ids)
	{
		return getNearest(Players.getLocal().getWorldLocation(), ids);
	}

	public static TileItem getNearest(String... names)
	{
		return getNearest(Players.getLocal().getWorldLocation(), names);
	}

	public static TileItem getNearest(WorldPoint to, Predicate<TileItem> filter)
	{
		return TILE_ITEMS.nearest(to, filter);
	}

	public static TileItem getNearest(WorldPoint to, int... ids)
	{
		return TILE_ITEMS.nearest(to, ids);
	}

	public static TileItem getNearest(WorldPoint to, String... names)
	{
		return TILE_ITEMS.nearest(to, names);
	}

	public static List<TileItem> getAt(int worldX, int worldY, int plane, int... ids)
	{
		return getAt(Tiles.getAt(worldX, worldY, plane), ids);
	}

	public static List<TileItem> getAt(int worldX, int worldY, int plane, String... names)
	{
		return getAt(Tiles.getAt(worldX, worldY, plane), names);
	}

	public static List<TileItem> getAt(int worldX, int worldY, int plane, Predicate<TileItem> filter)
	{
		return getAt(Tiles.getAt(worldX, worldY, plane), filter);
	}

	public static List<TileItem> getAt(WorldPoint worldPoint, Predicate<TileItem> filter)
	{
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), filter);
	}

	public static List<TileItem> getAt(WorldPoint worldPoint, int... ids)
	{
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), ids);
	}

	public static List<TileItem> getAt(WorldPoint worldPoint, String... names)
	{
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), names);
	}

	public static List<TileItem> getAt(Tile tile, int... ids)
	{
		return TILE_ITEMS.at(tile, ids);
	}

	public static List<TileItem> getAt(Tile tile, String... names)
	{
		return TILE_ITEMS.at(tile, names);
	}

	public static List<TileItem> getAt(Tile tile, Predicate<TileItem> filter)
	{
		if (tile == null)
		{
			return Collections.emptyList();
		}

		return TILE_ITEMS.at(tile, filter);
	}

	public static TileItem getFirstAt(int worldX, int worldY, int plane, int... ids)
	{
		return getAt(worldX, worldY, plane, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(int worldX, int worldY, int plane, String... names)
	{
		return getAt(worldX, worldY, plane, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(int worldX, int worldY, int plane, Predicate<TileItem> filter)
	{
		return getAt(worldX, worldY, plane, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(WorldPoint worldPoint, int... ids)
	{
		return getAt(worldPoint, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(WorldPoint worldPoint, String... names)
	{
		return getAt(worldPoint, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(WorldPoint worldPoint, Predicate<TileItem> filter)
	{
		return getAt(worldPoint, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(Tile tile, int... ids)
	{
		return getAt(tile, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(Tile tile, String... names)
	{
		return getAt(tile, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(Tile tile, Predicate<TileItem> filter)
	{
		return getAt(tile, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(int worldX, int worldY, int plane, int radius, int... ids)
	{
		return getSurrounding(worldX, worldY, plane, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(int worldX, int worldY, int plane, int radius, String... names)
	{
		return getSurrounding(worldX, worldY, plane, radius, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileItem> filter)
	{
		return getSurrounding(worldX, worldY, plane, radius, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(WorldPoint worldPoint, int radius, int... ids)
	{
		return getSurrounding(worldPoint, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(WorldPoint worldPoint, int radius, String... names)
	{
		return getSurrounding(worldPoint, radius, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(WorldPoint worldPoint, int radius, Predicate<TileItem> filter)
	{
		return getSurrounding(worldPoint, radius, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(Tile tile, int radius, int... ids)
	{
		return getSurrounding(tile, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(Tile tile, int radius, String... names)
	{
		return getSurrounding(tile, radius, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(Tile tile, int radius, Predicate<TileItem> filter)
	{
		return getSurrounding(tile, radius, filter).stream().findFirst().orElse(null);
	}

	public static List<TileItem> getSurrounding(int worldX, int worldY, int plane, int radius, int... ids)
	{
		return TILE_ITEMS.surrounding(worldX, worldY, plane, radius, ids);
	}

	public static List<TileItem> getSurrounding(int worldX, int worldY, int plane, int radius, String... names)
	{
		return TILE_ITEMS.surrounding(worldX, worldY, plane, radius, names);
	}

	public static List<TileItem> getSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileItem> filter)
	{
		return TILE_ITEMS.surrounding(worldX, worldY, plane, radius, filter);
	}

	public static List<TileItem> getSurrounding(WorldPoint worldPoint, int radius, int... ids)
	{
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, ids);
	}

	public static List<TileItem> getSurrounding(WorldPoint worldPoint, int radius, String... names)
	{
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, names);
	}

	public static List<TileItem> getSurrounding(WorldPoint worldPoint, int radius, Predicate<TileItem> filter)
	{
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, filter);
	}

	public static List<TileItem> getSurrounding(Tile tile, int radius, int... ids)
	{
		return getSurrounding(tile.getWorldX(), tile.getWorldY(), tile.getPlane(), radius, ids);
	}

	public static List<TileItem> getSurrounding(Tile tile, int radius, String... names)
	{
		return getSurrounding(tile.getWorldX(), tile.getWorldY(), tile.getPlane(), radius, names);
	}

	public static List<TileItem> getSurrounding(Tile tile, int radius, Predicate<TileItem> filter)
	{
		return getSurrounding(tile.getWorldX(), tile.getWorldY(), tile.getPlane(), radius, filter);
	}

	public static List<TileItem> within(WorldArea area, String... names)
	{
		return TILE_ITEMS.in(area, names);
	}

	public static List<TileItem> within(WorldArea area, int... ids)
	{
		return TILE_ITEMS.in(area, ids);
	}

	public static List<TileItem> within(WorldArea area, Predicate<TileItem> filter)
	{
		return TILE_ITEMS.in(area, filter);
	}

	@Override
	protected List<TileItem> all(Predicate<? super TileItem> filter)
	{
		return Tiles.getAll().stream()
				.flatMap(tile -> at(tile, filter).stream())
				.collect(Collectors.toList());
	}

	@Override
	protected List<TileItem> at(Tile tile, Predicate<? super TileItem> filter)
	{
		List<TileItem> out = new ArrayList<>();
		if (tile == null)
		{
			return out;
		}

		if (tile.getGroundItems() != null)
		{
			for (TileItem item : tile.getGroundItems())
			{
				if (item == null || item.getId() == -1)
				{
					continue;
				}

				if (!filter.test(item))
				{
					continue;
				}

				out.add(item);
			}
		}

		return out;
	}
}
