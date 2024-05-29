package net.runelite.rs.api;
import net.runelite.api.Tile;
import net.runelite.api.TileItem;
import net.runelite.mapping.Import;

public interface RSTileItem extends RSRenderable, TileItem
{
	@Import("id")
	@Override
	int getId();

	@Import("id")
	void setId(int id);

	@Import("quantity")
	@Override
	int getQuantity();

	@Import("quantity")
	void setQuantity(int quantity);

	@Import("flag")
	int getFlag();

	@Import("flag")
	void setFlag(int flag);

	int getX();

	void setX(int x);

	int getY();

	void setY(int y);

	/**
	 * Get the tile this item is on
	 * @return
	 */
	Tile getTile();

	void setVisibleTime(int visibleTime);
	void setDespawnTime(int despawnTime);
	void setOwnership(int ownership);
	void setPrivate(boolean isPrivate);
}
