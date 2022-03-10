package dev.hoot.mixins;

import dev.hoot.api.events.AutomatedMenu;
import dev.hoot.api.util.Randomizer;
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

import java.awt.*;

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
	public String[] getRawActions()
	{
		return getComposition().getGroundActions();
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

		return Text.removeTags(Text.sanitize(name));
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
	public Point getClickPoint()
	{
		java.awt.Point point = Randomizer.getRandomPointIn(getBounds());
		return new Point(point.x, point.y);
	}

	@Inject
	private Rectangle getBounds()
	{
		Shape shape = Perspective.getClickbox(client, getModel(), 0, getLocalLocation());
		if (shape != null)
		{
			return shape.getBounds();
		}
		else
		{
			Point screenCoords = Perspective.localToCanvas(client, getLocalLocation(), client.getPlane());
			if (screenCoords != null)
			{
				return new Rectangle(screenCoords.getX(), screenCoords.getY(), 0, 0);
			}
			return new Rectangle(-1, -1, 0, 0);
		}
	}

	@Inject
	@Override
	public long getTag()
	{
		return client.calculateTag(getX(), getY(), 3, false, 0);
	}

	@Inject
	public AutomatedMenu getMenu(int actionIndex)
	{
		return getMenu(getId(), getActionOpcode(actionIndex));
	}

	@Inject
	public AutomatedMenu getMenu(int actionIndex, int opcode)
	{
		return getMenu(getId(), opcode,
				getTile().getSceneLocation().getX(), getTile().getSceneLocation().getY());
	}
}
