package dev.hoot.api.entities;

import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.scene.Tiles;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TileItems extends Entities<TileItem> {
	private static final TileItems TILE_ITEMS = new TileItems();

	@Override
	protected List<TileItem> all(Predicate<? super TileItem> filter) {
		return Tiles.getTiles().stream()
						.flatMap(tile -> parseTile(tile, filter).stream())
						.collect(Collectors.toList());
	}

	public static List<TileItem> getAll(Predicate<TileItem> filter) {
		return TILE_ITEMS.all(filter);
	}

	public static List<TileItem> getAll(int... ids) {
		return TILE_ITEMS.all(ids);
	}

	public static List<TileItem> getAll(String... names) {
		return TILE_ITEMS.all(names);
	}

	public static TileItem getNearest(Predicate<TileItem> filter) {
		return getNearest(Players.getLocal().getWorldLocation(), filter);
	}

	public static TileItem getNearest(int... ids) {
		return getNearest(Players.getLocal().getWorldLocation(), ids);
	}

	public static TileItem getNearest(String... names) {
		return getNearest(Players.getLocal().getWorldLocation(), names);
	}

	public static TileItem getNearest(WorldPoint to, Predicate<TileItem> filter) {
		return TILE_ITEMS.nearest(to, filter);
	}

	public static TileItem getNearest(WorldPoint to, int... ids) {
		return TILE_ITEMS.nearest(to, ids);
	}

	public static TileItem getNearest(WorldPoint to, String... names) {
		return TILE_ITEMS.nearest(to, names);
	}

	public static List<TileItem> getAt(int worldX, int worldY, int plane, int... ids) {
		return getAt(Tiles.getAt(worldX, worldY, plane), ids);
	}

	public static List<TileItem> getAt(int worldX, int worldY, int plane, String... names) {
		return getAt(Tiles.getAt(worldX, worldY, plane), names);
	}

	public static List<TileItem> getAt(int worldX, int worldY, int plane, Predicate<TileItem> filter) {
		return getAt(Tiles.getAt(worldX, worldY, plane), filter);
	}

	public static List<TileItem> getAt(WorldPoint worldPoint, Predicate<TileItem> filter) {
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), filter);
	}

	public static List<TileItem> getAt(WorldPoint worldPoint, int... ids) {
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), ids);
	}

	public static List<TileItem> getAt(WorldPoint worldPoint, String... names) {
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), names);
	}

	public static List<TileItem> getAt(Tile tile, int... ids) {
		return getAt(tile, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<TileItem> getAt(Tile tile, String... names) {
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

	public static List<TileItem> getAt(Tile tile, Predicate<TileItem> filter) {
		if (tile == null) {
			return Collections.emptyList();
		}

		return parseTile(tile, filter);
	}

	public static TileItem getFirstAt(int worldX, int worldY, int plane, int... ids) {
		return getAt(worldX, worldY, plane, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(int worldX, int worldY, int plane, String... names) {
		return getAt(worldX, worldY, plane, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(int worldX, int worldY, int plane, Predicate<TileItem> filter) {
		return getAt(worldX, worldY, plane, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(WorldPoint worldPoint, int... ids) {
		return getAt(worldPoint, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(WorldPoint worldPoint, String... names) {
		return getAt(worldPoint, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(WorldPoint worldPoint, Predicate<TileItem> filter) {
		return getAt(worldPoint, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(Tile tile, int... ids) {
		return getAt(tile, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(Tile tile, String... names) {
		return getAt(tile, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstAt(Tile tile, Predicate<TileItem> filter) {
		return getAt(tile, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(int worldX, int worldY, int plane, int radius, int... ids) {
		return getSurrounding(worldX, worldY, plane, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(int worldX, int worldY, int plane, int radius, String... names) {
		return getSurrounding(worldX, worldY, plane, radius, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileItem> filter) {
		return getSurrounding(worldX, worldY, plane, radius, filter).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(WorldPoint worldPoint, int radius, int... ids) {
		return getSurrounding(worldPoint, radius, ids).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(WorldPoint worldPoint, int radius, String... names) {
		return getSurrounding(worldPoint, radius, names).stream().findFirst().orElse(null);
	}

	public static TileItem getFirstSurrounding(WorldPoint worldPoint, int radius, Predicate<TileItem> filter) {
		return getSurrounding(worldPoint, radius, filter).stream().findFirst().orElse(null);
	}

	public static List<TileItem> getSurrounding(int worldX, int worldY, int plane, int radius, int... ids) {
		return getSurrounding(worldX, worldY, plane, radius, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<TileItem> getSurrounding(int worldX, int worldY, int plane, int radius, String... names) {
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

	public static List<TileItem> getSurrounding(int worldX, int worldY, int plane, int radius, Predicate<TileItem> filter) {
		List<TileItem> out = new ArrayList<>();
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

	public static List<TileItem> getSurrounding(WorldPoint worldPoint, int radius, int... ids) {
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, ids);
	}

	public static List<TileItem> getSurrounding(WorldPoint worldPoint, int radius, String... names) {
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, names);
	}

	public static List<TileItem> getSurrounding(WorldPoint worldPoint, int radius, Predicate<TileItem> filter) {
		return getSurrounding(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane(), radius, filter);
	}

	private static List<TileItem> parseTile(Tile tile, Predicate<? super TileItem> pred) {
		List<TileItem> out = new ArrayList<>();
		if (tile.getGroundItems() != null) {
			for (TileItem item : tile.getGroundItems()) {
				if (item == null || item.getId() == -1) {
					continue;
				}

				if (!Game.getClient().isItemDefinitionCached(item.getId())) {
					GameThread.invokeLater(() -> Game.getClient().getItemComposition(item.getId()));
				}

				if (!pred.test(item)) {
					continue;
				}

				out.add(item);
			}
		}

		return out;
	}
}
