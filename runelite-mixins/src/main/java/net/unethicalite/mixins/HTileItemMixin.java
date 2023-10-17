package net.unethicalite.mixins;

import java.awt.Shape;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Randomizer;
import net.unethicalite.api.util.Text;
import net.runelite.api.ItemComposition;
import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSTileItem;

@Mixin(RSTileItem.class)
public abstract class HTileItemMixin implements RSTileItem
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public int getActionOpcode(int action)
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
		interact(getId(), getActionOpcode(action));
	}

	@Inject
	@Override
	public String[] getActions()
	{
		String[] actions = getComposition().getGroundActions();
		String[] sanitized = new String[actions.length];
		for (int i = 0; i < actions.length; i++)
		{
			sanitized[i] = Text.sanitize(actions[i]);
		}

		return sanitized;
	}

	@Inject
	@Override
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		client.interact(getMenu(identifier, opcode, param0, param1));
	}

	@Inject
	@Override
	public void interact(int index, int opcode)
	{
		interact(getId(), opcode, getTile().getSceneLocation().getX(),
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
		String name = getComposition().getName();
		if (name == null)
		{
			return "null";
		}

		return Text.sanitize(name);
	}

	@Inject
	public Point getClickPoint()
	{
		LocalPoint localPoint = this.getLocalLocation();
		if (localPoint == null)
		{
			return null;
		}

		Shape convexHull = this.getModel().getConvexHull(localPoint.getX(), localPoint.getY(), 0,
			Perspective.getTileHeight(client, localPoint, this.getWorldLocation().getPlane()));

		return convexHull != null ? Randomizer.getRandomPointIn(convexHull.getBounds()) : null;
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
	@Override
	public long getTag()
	{
		return client.calculateTag(getX(), getY(), 3, false, 0);
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex)
	{
		return getMenu(getId(), getActionOpcode(actionIndex));
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex, int opcode)
	{
		return getMenu(getId(), opcode,
				getTile().getSceneLocation().getX(), getTile().getSceneLocation().getY());
	}
}
