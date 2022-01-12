package dev.hoot.mixins;

import net.runelite.api.ItemComposition;
import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.util.Text;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSTileItem;

@Mixin(RSTileItem.class)
public abstract class HTileItemMixin implements RSTileItem
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public int getActionId(int action)
	{
		switch (action)
		{
			case 0:
				return MenuAction.GROUND_ITEM_FIRST_OPTION.getId();
			case 1:
				return MenuAction.GROUND_ITEM_SECOND_OPTION.getId();
			case 2:
				return MenuAction.GROUND_ITEM_THIRD_OPTION.getId();
			case 3:
				return MenuAction.GROUND_ITEM_FOURTH_OPTION.getId();
			case 4:
				return MenuAction.GROUND_ITEM_FIFTH_OPTION.getId();
			default:
				throw new IllegalArgumentException("action = " + action);
		}
	}

	@Override
	@Inject
	public void interact(int action)
	{
		interact(getId(), getActionId(action));
	}

	@Override
	@Inject
	public void interact(String action)
	{
		interact(getActions().indexOf(action));
	}

	@Inject
	@Override
	public String[] getRawActions()
	{
		return getComposition().getGroundActions();
	}

	@Inject
	@Override
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		Point screenCoords = getScreenCoords();
		int x = screenCoords != null ? screenCoords.getX() : -1;
		int y = screenCoords != null ? screenCoords.getY() : -1;

		client.interact(identifier, opcode, param0, param1, x, y, getTag());
	}

	@Inject
	@Override
	public void interact(int index, int menuAction)
	{
		interact(getId(), menuAction, getTile().getSceneLocation().getX(),
				getTile().getSceneLocation().getY());
	}

	@Inject
	@Override
	public void pickup()
	{
		interact(getId(), MenuAction.GROUND_ITEM_THIRD_OPTION.getId());
	}

	@Inject
	@Override
	public String getName()
	{
		return Text.removeTags(Text.sanitize(getComposition().getName()));
	}

	@Inject
	private ItemComposition getComposition()
	{
		return client.getItemComposition(getId());
	}

	@Inject
	@Override
	public boolean isTradable()
	{
		return getComposition().isTradeable();
	}

	@Inject
	@Override
	public boolean isStackable()
	{
		return getComposition().isStackable();
	}

	@Inject
	@Override
	public boolean isMembers()
	{
		return getComposition().isMembers();
	}

	@Inject
	@Override
	public int getNotedId()
	{
		return getComposition().getLinkedNoteId();
	}

	@Inject
	@Override
	public boolean isNoted()
	{
		return getComposition().getNote() > -1;
	}

	@Inject
	@Override
	public int getStorePrice()
	{
		return getComposition().getPrice();
	}

	@Inject
	@Override
	public String[] getInventoryActions()
	{
		return getComposition().getInventoryActions();
	}

	@Inject
	private Point getScreenCoords()
	{
		return Perspective.localToCanvas(client, getLocalLocation(), client.getPlane());
	}

	@Inject
	@Override
	public long getTag()
	{
		return client.calculateTag(getTile().getWorldX(), getTile().getWorldY(), 3, false, 0);
	}
}
