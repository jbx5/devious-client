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
	private int ownership;

	@Inject
	@Override
	public int getOwnership()
	{
		return this.ownership;
	}

	@Inject
	@Override
	public void setOwnership(int ownership)
	{
		this.ownership = ownership;
	}

	@Inject
	private boolean isPrivate;

	@Inject
	@Override
	public boolean isPrivate()
	{
		return this.isPrivate;
	}

	@Inject
	@Override
	public void setPrivate(boolean isPrivate)
	{
		this.isPrivate = isPrivate;
	}

	@Replace("addTileItemToGroundItems")
	static void addTileItemToGroundItems(int z, int x, int y, int id, int quantity, int flag, int visibleTime, int despawnTime, int ownership, boolean isPrivate)
	{
		RSTileItem tileItem = client.newTileItem();
		tileItem.setId(id);
		tileItem.setQuantity(quantity);
		tileItem.setFlag(flag);
		tileItem.setVisibleTime(visibleTime + client.getTickCount());
		tileItem.setDespawnTime(despawnTime + client.getTickCount());
		tileItem.setOwnership(ownership);
		tileItem.setPrivate(isPrivate);
		if (client.getWorldView().getGroundItems()[z][x][y] == null)
		{
			client.getWorldView().getGroundItems()[z][x][y] = client.newNodeDeque();
		}

		client.getWorldView().getGroundItems()[z][x][y].addFirst(tileItem);
		client.updateItemPile(z, x, y);
	}
}
