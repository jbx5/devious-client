package dev.hoot.api.entities;

import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.scene.Tiles;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TileObjects extends Entities<TileObject> {
	private static final TileObjects TILE_OBJECTS = new TileObjects();

	@Override
	protected List<TileObject> all(Predicate<? super TileObject> filter) {
		return getTileObjects(Tiles.getTiles()).stream()
						.filter(filter)
						.collect(Collectors.toList());
	}

	public static List<TileObject> getAll(Predicate<TileObject> filter) {
		return TILE_OBJECTS.all(filter);
	}

	public static List<TileObject> getAll(int... ids) {
		return TILE_OBJECTS.all(ids);
	}

	public static List<TileObject> getAll(String... names) {
		return TILE_OBJECTS.all(names);
	}

	public static TileObject getNearest(Predicate<TileObject> filter) {
		return TILE_OBJECTS.nearest(Players.getLocal().getWorldLocation(), filter);
	}

	public static TileObject getNearest(int... ids) {
		return TILE_OBJECTS.nearest(Players.getLocal().getWorldLocation(), ids);
	}

	public static TileObject getNearest(String... names) {
		return TILE_OBJECTS.nearest(Players.getLocal().getWorldLocation(), names);
	}

	public static TileObject getNearest(WorldPoint to, Predicate<TileObject> filter) {
		return TILE_OBJECTS.nearest(to, filter);
	}

	public static TileObject getNearest(WorldPoint to, int... ids) {
		return TILE_OBJECTS.nearest(to, ids);
	}

	public static TileObject getNearest(WorldPoint to, String... names) {
		return TILE_OBJECTS.nearest(to, names);
	}

	public static List<TileObject> getAt(int worldX, int worldY, int plane, int... ids) {
		return getAt(Tiles.getAt(worldX, worldY, plane), ids);
	}

	public static List<TileObject> getAt(int worldX, int worldY, int plane, String... names) {
		return getAt(Tiles.getAt(worldX, worldY, plane), names);
	}

	public static List<TileObject> getAt(int worldX, int worldY, int plane, Predicate<TileObject> filter) {
		return getAt(Tiles.getAt(worldX, worldY, plane), filter);
	}

	public static List<TileObject> getAt(WorldPoint worldPoint, Predicate<TileObject> filter) {
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), filter);
	}

	public static List<TileObject> getAt(WorldPoint worldPoint, int... ids) {
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), ids);
	}

	public static List<TileObject> getAt(WorldPoint worldPoint, String... names) {
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), names);
	}

	public static List<TileObject> getAt(Tile tile, int... ids) {
		return getAt(tile, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<TileObject> getAt(Tile tile, String... names) {
		return getAt(tile, x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<TileObject> getAt(Tile tile, Predicate<TileObject> filter) {
		if (tile == null) {
			return Collections.emptyList();
		}

		return parseTile(tile, filter);
	}

	public static TileObject getFirstAt(int worldX, int worldY, int plane, int... ids) {
		return getAt(worldX, worldY, plane, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(int worldX, int worldY, int plane, String... names) {
		return getAt(worldX, worldY, plane, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(int worldX, int worldY, int plane, Predicate<TileObject> filter) {
		return getAt(worldX, worldY, plane, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(WorldPoint worldPoint, int... ids) {
		return getAt(worldPoint, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(WorldPoint worldPoint, String... names) {
		return getAt(worldPoint, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(WorldPoint worldPoint, Predicate<TileObject> filter) {
		return getAt(worldPoint, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(Tile tile, int... ids) {
		return getAt(tile, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(Tile tile, String... names) {
		return getAt(tile, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstAt(Tile tile, Predicate<TileObject> filter) {
		return getAt(tile, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(int worldX, int worldY, int plane, int radius, int... ids) {
		return getSurrounding(worldX, worldY, plane, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(int worldX, int worldY, int plane, int radius, String... names) {
		return getSurrounding(worldX, worldY, plane, radius, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileObject> filter) {
		return getSurrounding(worldX, worldY, plane, radius, filter).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(WorldPoint worldPoint, int radius, int... ids) {
		return getSurrounding(worldPoint, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(WorldPoint worldPoint, int radius, String... names) {
		return getSurrounding(worldPoint, radius, names).stream().findFirst().orElse(null);
	}

	public static TileObject getFirstSurrounding(WorldPoint worldPoint, int radius, Predicate<TileObject> filter) {
		return getSurrounding(worldPoint, radius, filter).stream().findFirst().orElse(null);
	}

	public static List<TileObject> getSurrounding(int worldX, int worldY, int plane, int radius, int... ids) {
		return getSurrounding(worldX, worldY, plane, radius, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<TileObject> getSurrounding(int worldX, int worldY, int plane, int radius, String... names) {
		return getSurrounding(worldX, worldY, plane, radius, x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<TileObject> getSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileObject> filter) {
		List<TileObject> out = new ArrayList<>();
		for (int x = -radius; x <= radius; x++) {
			for (int y = -radius; y <= radius; y++) {
				Tile tile = Tiles.getAt(worldX + x, worldY + y, plane);
				if (tile == null) {
					continue;
				}

				out.addAll(getAt(tile, filter));
			}
		}

		return out;
	}

	public static List<TileObject> getSurrounding(WorldPoint worldPoint, int radius, int... ids) {
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, ids);
	}

	public static List<TileObject> getSurrounding(WorldPoint worldPoint, int radius, String... names) {
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, names);
	}

	public static List<TileObject> getSurrounding(WorldPoint worldPoint, int radius, Predicate<TileObject> filter) {
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, filter);
	}

	private static List<TileObject> parseTile(Tile tile, Predicate<TileObject> pred) {
		Predicate<TileObject> filter = x -> {
			if (!x.isDefinitionCached()) {
				return GameThread.invokeLater(() -> {
					x.getCachedDefinition(); // cache it
					return pred.test(x);
				});
			}

			return pred.test(x);
		};

		return getTileObjects(tile).stream()
						.filter(filter)
						.collect(Collectors.toList());
	}

	private static List<TileObject> getTileObjects(List<Tile> tiles) {
		List<TileObject> out = new ArrayList<>();
		for (Tile tile : tiles) {
			out.addAll(getTileObjects(tile));
		}

		List<TileObject> notCached = out.stream()
						.filter(x -> !x.isDefinitionCached())
						.collect(Collectors.toList());
		if (!notCached.isEmpty()) {
			GameThread.invokeLater(() -> {
				for (TileObject tileObject : notCached) {
					tileObject.getDefinition();
				}

				return true;
			});
		}

		return out;
	}

	private static List<TileObject> getTileObjects(Tile tile) {
		List<TileObject> out = new ArrayList<>();
		DecorativeObject dec = tile.getDecorativeObject();
		if (dec != null && dec.getId() != -1) {
			out.add(dec);
		}

		WallObject wall = tile.getWallObject();
		if (wall != null && wall.getId() != -1) {
			out.add(wall);
		}

		GroundObject grnd = tile.getGroundObject();
		if (grnd != null && grnd.getId() != -1) {
			out.add(grnd);
		}

		GameObject[] gameObjects = tile.getGameObjects();
		if (gameObjects != null) {
			for (GameObject gameObject : gameObjects) {
				if (gameObject == null
								|| !Game.getClient().isTileObjectValid(tile, gameObject)
								|| gameObject.getId() == -1) {
					continue;
				}

				out.add(gameObject);
			}
		}

		return out;
	}
}
