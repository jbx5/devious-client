package dev.unethicalite.api.query.entities;

import dev.unethicalite.api.query.results.SceneEntityQueryResults;
import dev.unethicalite.api.scene.Tiles;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.function.Supplier;

public class TileObjectQuery extends SceneEntityQuery<TileObject, TileObjectQuery>
{
	private Tile[] tiles = null;

	public TileObjectQuery(Supplier<List<TileObject>> supplier)
	{
		super(supplier);
	}

	public TileObjectQuery tiles(Tile... tiles)
	{
		this.tiles = tiles;
		return this;
	}

	@Override
	protected SceneEntityQueryResults<TileObject> results(List<TileObject> list)
	{
		return new SceneEntityQueryResults<>(list);
	}

	@Override
	public boolean test(TileObject tileObject)
	{
		if (tiles != null && !ArrayUtils.contains(tiles, Tiles.getAt(tileObject.getWorldLocation())))
		{
			return false;
		}

		return super.test(tileObject);
	}
}
