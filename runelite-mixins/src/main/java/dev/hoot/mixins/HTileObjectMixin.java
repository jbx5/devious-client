package dev.hoot.mixins;

import dev.hoot.api.events.AutomatedMenu;
import dev.hoot.api.util.Randomizer;
import net.runelite.api.GameObject;
import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Mixins;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.util.Text;
import net.runelite.rs.api.RSBoundaryObject;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFloorDecoration;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSWallDecoration;

import java.awt.*;

@Mixins({
		@Mixin(RSWallDecoration.class),
		@Mixin(RSGameObject.class),
		@Mixin(RSFloorDecoration.class),
		@Mixin(RSItemLayer.class),
		@Mixin(RSBoundaryObject.class)
})
public abstract class HTileObjectMixin implements TileObject
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public Point menuPoint()
	{
		if (this instanceof GameObject)
		{
			GameObject temp = (GameObject) this;
			return temp.getSceneMinLocation();
		}

		return new Point(getLocalLocation().getSceneX(), getLocalLocation().getSceneY());
	}

	@Inject
	@Override
	public String getName()
	{
		RSObjectComposition def = (RSObjectComposition) getTransformedComposition();
		return def == null ? "null" : Text.removeTags(Text.sanitize(def.getName()));
	}

	@Inject
	@Override
	public String[] getRawActions()
	{
		RSObjectComposition def = (RSObjectComposition) getTransformedComposition();
		return def == null ? null : def.getActions();
	}

	@Override
	@Inject
	public int getActionOpcode(int action)
	{
		switch (action)
		{
			case 0:
				return MenuAction.GAME_OBJECT_FIRST_OPTION.getId();
			case 1:
				return MenuAction.GAME_OBJECT_SECOND_OPTION.getId();
			case 2:
				return MenuAction.GAME_OBJECT_THIRD_OPTION.getId();
			case 3:
				return MenuAction.GAME_OBJECT_FOURTH_OPTION.getId();
			case 4:
				return MenuAction.GAME_OBJECT_FIFTH_OPTION.getId();
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
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		client.interact(getMenu(identifier, opcode, param0, param1));
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
		Shape shape = getClickbox();
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
	public void interact(int index, int opcode)
	{
		interact(getId(), opcode, menuPoint().getX(), menuPoint().getY());
	}

	@Inject
	@Override
	public long getTag()
	{
		return getHash();
	}

	@Inject
	public AutomatedMenu getMenu(int actionIndex)
	{
		return getMenu(getId(), getActionOpcode(actionIndex));
	}

	@Inject
	public AutomatedMenu getMenu(int actionIndex, int opcode)
	{
		return getMenu(getId(), opcode, menuPoint().getX(), menuPoint().getY());
	}
}
