package net.unethicalite.mixins;

import java.awt.Shape;
import net.runelite.api.ObjectComposition;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Randomizer;
import net.unethicalite.api.util.Text;
import net.runelite.api.GameObject;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Mixins;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBoundaryObject;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFloorDecoration;
import net.runelite.rs.api.RSGameObject;
import net.runelite.rs.api.RSItemLayer;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSWallDecoration;

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

	@Inject
	public int getId()
	{
		long hash = getHash();
		return (int) (hash >>> 17 & 4294967295L);
	}

	@Inject
	public int getActualId()
	{
		ObjectComposition transformedComposition = getTransformedComposition();
		if (transformedComposition == null)
		{
			return getId();
		}

		return transformedComposition.getId();
	}

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
		return def == null ? "null" : Text.sanitize(def.getName());
	}

	@Inject
	@Override
	public String[] getActions()
	{
		RSObjectComposition def = (RSObjectComposition) getTransformedComposition();
		if (def == null)
		{
			return null;
		}

		String[] sanitized = new String[def.getActions().length];
		for (int i = 0; i < sanitized.length; i++)
		{
			sanitized[i] = net.unethicalite.api.util.Text.sanitize(def.getActions()[i]);
		}

		return sanitized;
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
		Shape shape;
		if (this instanceof GameObject)
		{
			shape = ((GameObject) this).getConvexHull();
		}
		else if (this instanceof RSBoundaryObject)
		{
			shape = ((RSBoundaryObject) this).getConvexHull();
		}
		else if (this instanceof RSFloorDecoration)
		{
			shape = ((RSFloorDecoration) this).getConvexHull();
		}
		else if (this instanceof RSWallDecoration)
		{
			shape = ((RSWallDecoration) this).getConvexHull();
		}
		else
		{
			shape = this.getCanvasTilePoly();
		}

		return shape != null ? Randomizer.getRandomPointIn(shape.getBounds()) : null;
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
	public MenuAutomated getMenu(int actionIndex)
	{
		return getMenu(getId(), getActionOpcode(actionIndex));
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex, int opcode)
	{
		return getMenu(getId(), opcode, menuPoint().getX(), menuPoint().getY());
	}
}
