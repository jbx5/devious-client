package dev.hoot.api.scene;

import dev.hoot.api.game.Game;
import net.runelite.api.Constants;
import net.runelite.api.DecorativeObject;
import net.runelite.api.GameObject;
import net.runelite.api.GroundObject;
import net.runelite.api.NPC;
import net.runelite.api.Scene;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import net.runelite.api.WallObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tiles
{
	private static final Logger log = LoggerFactory.getLogger(Tiles.class);

	public static List<Tile> getTiles(Predicate<Tile> filter)
	{
		List<Tile> out = new ArrayList<>();

		for (int x = 0; x < Constants.SCENE_SIZE; x++)
		{
			for (int y = 0; y < Constants.SCENE_SIZE; y++)
			{
				Tile tile = Game.getClient().getScene().getTiles()[Game.getClient().getPlane()][x][y];
				if (tile != null && filter.test(tile))
				{
					out.add(tile);
				}
			}
		}

		return out;
	}

	public static List<Tile> getTiles()
	{
		return getTiles(x -> true);
	}

	public static Tile getAt(WorldPoint worldPoint)
	{
		return getAt(worldPoint.getX(), worldPoint.getY(), worldPoint.getPlane());
	}

	public static Tile getAt(LocalPoint localPoint)
	{
		return Game.getClient().getScene().getTiles()[Game.getClient().getPlane()][localPoint.getSceneX()][localPoint.getSceneY()];
	}

	public static Tile getAt(int worldX, int worldY, int plane)
	{
		if (!WorldPoint.isInScene(Game.getClient(), worldX, worldY))
		{
			return null;
		}

		int x = worldX - Game.getClient().getBaseX();
		int y = worldY - Game.getClient().getBaseY();

		return Game.getClient().getScene().getTiles()[plane][x][y];
	}

	public static Tile getHoveredTile()
	{
		return Game.getClient().getSelectedSceneTile();
	}

	private static TileObject findTileObject(int x, int y, int id)
	{
		Scene scene = Game.getClient().getScene();
		Tile[][][] tiles = scene.getTiles();
		Tile tile = tiles[Game.getClient().getPlane()][x][y];
		if (tile != null)
		{
			for (GameObject gameObject : tile.getGameObjects())
			{
				if (gameObject != null && gameObject.getId() == id)
				{
					return gameObject;
				}
			}

			WallObject wallObject = tile.getWallObject();
			if (wallObject != null && wallObject.getId() == id)
			{
				return wallObject;
			}

			DecorativeObject decorativeObject = tile.getDecorativeObject();
			if (decorativeObject != null && decorativeObject.getId() == id)
			{
				return decorativeObject;
			}

			GroundObject groundObject = tile.getGroundObject();
			if (groundObject != null && groundObject.getId() == id)
			{
				return groundObject;
			}
		}
		return null;
	}

	private static NPC findNpc(int id)
	{
		return Game.getClient().getCachedNPCs()[id];
	}
}
