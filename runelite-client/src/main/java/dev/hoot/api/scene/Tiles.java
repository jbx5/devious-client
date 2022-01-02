package dev.hoot.api.scene;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.Constants;
import net.runelite.api.Tile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tiles
{
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
		Client client = Game.getClient();
		int correctedX = worldX < Constants.REGION_SIZE ? worldX + client.getBaseX() : worldX;
		int correctedY = worldY < Constants.REGION_SIZE ? worldY + client.getBaseY() : worldY;

		if (!WorldPoint.isInScene(client, correctedX, correctedY))
		{
			return null;
		}

		int x = correctedX - client.getBaseX();
		int y = correctedY - client.getBaseY();

		return client.getScene().getTiles()[plane][x][y];
	}

	public static Tile getHoveredTile()
	{
		return Game.getClient().getSelectedSceneTile();
	}
}
