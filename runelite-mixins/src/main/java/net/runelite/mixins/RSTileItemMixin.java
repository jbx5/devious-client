package net.runelite.mixins;

import net.runelite.api.Tile;
import net.runelite.api.events.ItemQuantityChanged;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSTileItem;

@Mixin(RSTileItem.class)
public abstract class RSTileItemMixin implements RSTileItem
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private int rl$sceneX = -1;

	@Inject
	private int rl$sceneY = -1;

	@Inject
	RSTileItemMixin()
	{
	}

	@Inject
	@Override
	public Tile getTile()
	{
		int x = rl$sceneX;
		int y = rl$sceneY;

		if (x == -1 || y == -1)
		{
			return null;
		}

		Tile[][][] tiles = client.getScene().getTiles();
		return tiles[client.getPlane()][x][y];
	}

	@Inject
	@Override
	public void onUnlink()
	{
		if (rl$sceneX != -1)
		{
			// on despawn, the first item unlinked is the item despawning. However on spawn
			// items can be delinked in order to sort them, so we can't assume the item here is despawning
			if (client.getLastItemDespawn() == null)
			{
				client.setLastItemDespawn(this);
			}
		}
	}

	@Inject
	@FieldHook(value = "quantity", before = true)
	public void quantityChanged(int quantity)
	{
		if (rl$sceneX != -1)
		{
			client.getLogger().debug("Item quantity changed: {} ({} -> {})", getId(), getQuantity(), quantity);

			ItemQuantityChanged itemQuantityChanged = new ItemQuantityChanged(this, getTile(), getQuantity(), quantity);
			client.getCallbacks().post(itemQuantityChanged);
		}
	}

	@Inject
	@Override
	public int getX()
	{
		return rl$sceneX;
	}

	@Inject
	@Override
	public void setX(int x)
	{
		rl$sceneX = x;
	}

	@Inject
	@Override
	public int getY()
	{
		return rl$sceneY;
	}

	@Inject
	@Override
	public void setY(int y)
	{
		rl$sceneY = y;
	}

	@Inject
	private int despawnTime;

	@Inject
	@Override
	public int getDespawnTime()
	{
		return this.despawnTime;
	}

	@Inject
	@Override
	public void setDespawnTime(int despawnTime)
	{
		this.despawnTime = despawnTime;
	}

	@Inject
	private int visibleTime;

	@Inject
	@Override
	public int getVisibleTime()
	{
		return this.visibleTime;
	}

	@Inject
	@Override
	public void setVisibleTime(int visibleTime)
	{
		this.visibleTime = visibleTime;
	}

	@Replace("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int z, int x, int y, int id, int quantity, int flag, int visibleTime, int despawnTime, int var8, boolean var9)
	{
		RSTileItem tileItem = client.newTileItem();
		tileItem.setId(id);
		tileItem.setQuantity(quantity);
		tileItem.setFlag(flag);
		tileItem.setDespawnTime(despawnTime);
		tileItem.setVisibleTime(visibleTime);
		if (client.getGroundItemDeque()[z][x][y] == null)
		{
			client.getGroundItemDeque()[z][x][y] = client.newNodeDeque();
		}

		client.getGroundItemDeque()[z][x][y].addFirst(tileItem);
		client.updateItemPile(z, x, y);
	}
}
