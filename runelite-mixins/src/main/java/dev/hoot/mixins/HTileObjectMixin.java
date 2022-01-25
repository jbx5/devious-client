package dev.hoot.mixins;

import net.runelite.api.GameObject;
import net.runelite.api.MenuAction;
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
		RSObjectComposition def = (RSObjectComposition) getTransformedDefinition();
		return def == null ? null : Text.removeTags(Text.sanitize(def.getName()));
	}

	@Inject
	@Override
	public String[] getRawActions()
	{
		RSObjectComposition def = (RSObjectComposition) getTransformedDefinition();
		return def == null ? null : def.getActions();
	}

	@Override
	@Inject
	public void interact(String action)
	{
		interact(getActions().indexOf(action));
	}

	@Override
	@Inject
	public int getActionId(int action)
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
		interact(getId(), getActionId(action));
	}

	@Inject
	@Override
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		Point screenCoords = getCanvasLocation();
		int x = screenCoords != null ? screenCoords.getX() : -1;
		int y = screenCoords != null ? screenCoords.getY() : -1;

		client.interact(identifier, opcode, param0, param1, x, y, getTag());
	}

	@Inject
	@Override
	public void interact(int index, int menuAction)
	{
		interact(getId(), menuAction, menuPoint().getX(), menuPoint().getY());
	}

	@Inject
	@Override
	public long getTag()
	{
		return getHash();
	}
}
