package net.unethicalite.api.query.entities;

import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class TileItemQuery extends SceneEntityQuery<TileItem, TileItemQuery>
{
	private int[] quantities = null;
	private Tile[] tiles = null;
	private Boolean tradable = null;
	private Boolean stackable = null;
	private Boolean noted = null;
	private Boolean members = null;
	private Integer storePrice = null;
	private String[] inventoryActions = null;

	public TileItemQuery(Supplier<List<TileItem>> supplier)
	{
		super(supplier);
	}

	public TileItemQuery quantities(int... quantities)
	{
		this.quantities = quantities;
		return this;
	}

	public TileItemQuery tiles(Tile... tiles)
	{
		this.tiles = tiles;
		return this;
	}

	public TileItemQuery tradable(boolean tradable)
	{
		this.tradable = tradable;
		return this;
	}

	public TileItemQuery stackable(boolean stackable)
	{
		this.stackable = stackable;
		return this;
	}

	public TileItemQuery noted(boolean noted)
	{
		this.noted = noted;
		return this;
	}

	public TileItemQuery members(boolean members)
	{
		this.members = members;
		return this;
	}

	public TileItemQuery storePrice(int storePrice)
	{
		this.storePrice = storePrice;
		return this;
	}

	public TileItemQuery inventoryActions(String... inventoryActions)
	{
		this.inventoryActions = inventoryActions;
		return this;
	}

	@Override
	protected SceneEntityQueryResults<TileItem> results(List<TileItem> list)
	{
		return new SceneEntityQueryResults<>(list);
	}

	@Override
	public boolean test(TileItem tileItem)
	{
		if (quantities != null && !ArrayUtils.contains(quantities, tileItem.getQuantity()))
		{
			return false;
		}

		if (tiles != null && !ArrayUtils.contains(tiles, tileItem.getTile()))
		{
			return false;
		}

		if (tradable != null && !tradable.equals(tileItem.isTradable()))
		{
			return false;
		}

		if (stackable != null && !stackable.equals(tileItem.isStackable()))
		{
			return false;
		}

		if (noted != null && !noted.equals(tileItem.isNoted()))
		{
			return false;
		}

		if (members != null && !members.equals(tileItem.isMembers()))
		{
			return false;
		}

		if (storePrice != null && !storePrice.equals(tileItem.getStorePrice()))
		{
			return false;
		}

		if (inventoryActions != null
				&& Arrays.stream(inventoryActions).noneMatch(Predicates.texts(tileItem.getInventoryActions())))
		{
			return false;
		}

		return super.test(tileItem);
	}
}
