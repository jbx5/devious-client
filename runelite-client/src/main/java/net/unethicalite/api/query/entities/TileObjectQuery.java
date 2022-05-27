package net.unethicalite.api.query.entities;

import net.unethicalite.api.query.results.SceneEntityQueryResults;
import net.unethicalite.api.scene.Tiles;
import net.runelite.api.Tile;
import net.runelite.api.TileObject;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TileObjectQuery extends SceneEntityQuery<TileObject, TileObjectQuery>
{
	private Tile[] tiles = null;
	private Class<? extends TileObject>[] is = null;

	public TileObjectQuery(Supplier<List<TileObject>> supplier)
	{
		super(supplier);
	}

	public TileObjectQuery tiles(Tile... tiles)
	{
		this.tiles = tiles;
		return this;
	}

	@SafeVarargs
	public final TileObjectQuery is(Class<? extends TileObject>... classes)
	{
		this.is = classes;
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

		if (is != null && Arrays.stream(is).noneMatch(clazz -> clazz.isInstance(tileObject)))
		{
			return false;
		}

		return super.test(tileObject);
	}
}
