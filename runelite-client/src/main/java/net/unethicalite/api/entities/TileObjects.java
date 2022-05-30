package net.unethicalite.api.entities;

import net.unethicalite.api.query.entities.TileObjectQuery;
import net.unethicalite.api.scene.Tiles;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TileObjects extends TileEntities<TileObject>
{
	private static final TileObjects TILE_OBJECTS = new TileObjects();

	private TileObjects()
	{
	}

	public static TileObjectQuery query()
	{
		return query(TileObjects::getAll);
	}

	public static TileObjectQuery query(Supplier<List<TileObject>> supplier)
	{
		return new TileObjectQuery(supplier);
	}

	public static List<TileObject> getAll()
	{
		return getAll(x -> true);
	}

	public static List<TileObject> getAll(Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.all(filter);
	}

	public static List<TileObject> getAll(int... ids)
	{
		return TILE_OBJECTS.all(ids);
	}

	public static List<TileObject> getAll(String... names)
	{
		return TILE_OBJECTS.all(names);
	}

	public static TileObject getNearest(Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.nearest(Players.getLocal().getWorldLocation(), filter);
	}

	public static TileObject getNearest(int... ids)
	{
		return TILE_OBJECTS.nearest(Players.getLocal().getWorldLocation(), ids);
	}

	public static TileObject getNearest(String... names)
	{
		return TILE_OBJECTS.nearest(Players.getLocal().getWorldLocation(), names);
	}

	public static TileObject getNearest(WorldPoint to, Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.nearest(to, filter);
	}

	public static TileObject getNearest(WorldPoint to, int... ids)
	{
		return TILE_OBJECTS.nearest(to, ids);
	}

	public static TileObject getNearest(WorldPoint to, String... names)
	{
		return TILE_OBJECTS.nearest(to, names);
	}

	public static List<TileObject> getAt(int worldX, int worldY, int plane, int... ids)
	{
		return TILE_OBJECTS.at(Tiles.getAt(worldX, worldY, plane), ids);
	}

	public static List<TileObject> getAt(int worldX, int worldY, int plane, String... names)
	{
		return TILE_OBJECTS.at(Tiles.getAt(worldX, worldY, plane), names);
	}

	public static List<TileObject> getAt(int worldX, int worldY, int plane, Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.at(Tiles.getAt(worldX, worldY, plane), filter);
	}

	public static List<TileObject> getAt(WorldPoint worldPoint, Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.at(Tiles.getAt(worldPoint), filter);
	}

	public static List<TileObject> getAt(WorldPoint worldPoint, int... ids)
	{
		return TILE_OBJECTS.at(Tiles.getAt(worldPoint), ids);
	}

	public static List<TileObject> getAt(WorldPoint worldPoint, String... names)
	{
		return TILE_OBJECTS.at(Tiles.getAt(worldPoint), names);
	}

	public static List<TileObject> getAt(Tile tile, int... ids)
	{
		return TILE_OBJECTS.at(tile, ids);
	}

	public static List<TileObject> getAt(Tile tile, String... names)
	{
		return TILE_OBJECTS.at(tile, names);
	}

	public static List<TileObject> getAt(Tile tile, Predicate<TileObject> filter)
	{
		if (tile == null)
		{
			return Collections.emptyList();
		}

		return TILE_OBJECTS.at(tile, filter);
	}

	public static TileObject getFirstAt(int worldX, int worldY, int plane, int... ids)
	{
		return getAt(worldX, worldY, plane, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(int worldX, int worldY, int plane, String... names)
	{
		return getAt(worldX, worldY, plane, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(int worldX, int worldY, int plane, Predicate<TileObject> filter)
	{
		return getAt(worldX, worldY, plane, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(WorldPoint worldPoint, int... ids)
	{
		return getAt(worldPoint, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(WorldPoint worldPoint, String... names)
	{
		return getAt(worldPoint, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(WorldPoint worldPoint, Predicate<TileObject> filter)
	{
		return getAt(worldPoint, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(Tile tile, int... ids)
	{
		return getAt(tile, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(Tile tile, String... names)
	{
		return getAt(tile, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(Tile tile, Predicate<TileObject> filter)
	{
		return getAt(tile, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(int worldX, int worldY, int plane, int radius, int... ids)
	{
		return getSurrounding(worldX, worldY, plane, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(int worldX, int worldY, int plane, int radius, String... names)
	{
		return getSurrounding(worldX, worldY, plane, radius, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileObject> filter)
	{
		return getSurrounding(worldX, worldY, plane, radius, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(WorldPoint worldPoint, int radius, int... ids)
	{
		return getSurrounding(worldPoint, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(WorldPoint worldPoint, int radius, String... names)
	{
		return getSurrounding(worldPoint, radius, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(WorldPoint worldPoint, int radius, Predicate<TileObject> filter)
	{
		return getSurrounding(worldPoint, radius, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(Tile tile, int radius, int... ids)
	{
		return getSurrounding(tile, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(Tile tile, int radius, String... names)
	{
		return getSurrounding(tile, radius, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(Tile tile, int radius, Predicate<TileObject> filter)
	{
		return getSurrounding(tile, radius, filter).stream().findFirst().orElse(null);
	}

	public static List<TileObject> getSurrounding(int worldX, int worldY, int plane, int radius, int... ids)
	{
		return TILE_OBJECTS.surrounding(worldX, worldY, plane, radius, ids);
	}

	public static List<TileObject> getSurrounding(int worldX, int worldY, int plane, int radius, String... names)
	{
		return TILE_OBJECTS.surrounding(worldX, worldY, plane, radius, names);
	}

	public static List<TileObject> getSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.surrounding(worldX, worldY, plane, radius, filter);
	}

	public static List<TileObject> getSurrounding(WorldPoint worldPoint, int radius, int... ids)
	{
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, ids);
	}

	public static List<TileObject> getSurrounding(WorldPoint worldPoint, int radius, String... names)
	{
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, names);
	}

	public static List<TileObject> getSurrounding(WorldPoint worldPoint, int radius, Predicate<TileObject> filter)
	{
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, filter);
	}

	public static List<TileObject> getSurrounding(Tile tile, int radius, int... ids)
	{
		return getSurrounding(tile.getWorldX(), tile.getWorldY(), tile.getPlane(), radius, ids);
	}

	public static List<TileObject> getSurrounding(Tile tile, int radius, String... names)
	{
		return getSurrounding(tile.getWorldX(), tile.getWorldY(), tile.getPlane(), radius, names);
	}

	public static List<TileObject> getSurrounding(Tile tile, int radius, Predicate<TileObject> filter)
	{
		return getSurrounding(tile.getWorldX(), tile.getWorldY(), tile.getPlane(), radius, filter);
	}

	public static List<TileObject> within(WorldArea area, String... names)
	{
		return TILE_OBJECTS.in(area, names);
	}

	public static List<TileObject> within(WorldArea area, int... ids)
	{
		return TILE_OBJECTS.in(area, ids);
	}

	public static List<TileObject> within(WorldArea area, Predicate<TileObject> filter)
	{
		return TILE_OBJECTS.in(area, filter);
	}

	private static List<TileObject> getTileObjects(Tile tile)
	{
		List<TileObject> out = new ArrayList<>();
		if (tile == null)
		{
			return out;
		}

		DecorativeObject dec = tile.getDecorativeObject();
		if (dec != null && dec.getId() != -1)
		{
			out.add(dec);
		}

		WallObject wall = tile.getWallObject();
		if (wall != null && wall.getId() != -1)
		{
			out.add(wall);
		}

		GroundObject grnd = tile.getGroundObject();
		if (grnd != null && grnd.getId() != -1)
		{
			out.add(grnd);
		}

		GameObject[] gameObjects = tile.getGameObjects();
		if (gameObjects != null)
		{
			for (GameObject gameObject : gameObjects)
			{
				if (gameObject == null
						|| !Static.getClient().isTileObjectValid(tile, gameObject)
						|| gameObject.getId() == -1)
				{
					continue;
				}

				out.add(gameObject);
			}
		}

		return out;
	}

	@Override
	protected List<TileObject> all(Predicate<? super TileObject> filter)
	{
		List<TileObject> out = new ArrayList<>();
		for (Tile tile : Tiles.getAll())
		{
			out.addAll(getTileObjects(tile));
		}

		return out.stream()
				.filter(filter)
				.collect(Collectors.toList());
	}

	@Override
	protected List<TileObject> at(Tile tile, Predicate<? super TileObject> pred)
	{
		return getTileObjects(tile).stream()
				.filter(pred)
				.collect(Collectors.toList());
	}
}
