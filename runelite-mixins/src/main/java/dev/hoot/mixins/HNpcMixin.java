package dev.hoot.mixins;

import net.runelite.api.MenuAction;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.util.Text;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;

import java.util.HashMap;

@Mixin(RSNPC.class)
public abstract class HNpcMixin implements RSNPC
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("npcDefCache")
	private static HashMap<Integer, RSNPCComposition> npcDefCache;

	@Inject
	@Override
	public int getId()
	{
		RSNPCComposition composition = transformIfRequired();
		return composition == null ? -1 : composition.getId();
	}

	@Inject
	@Override
	public String getName()
	{
		RSNPCComposition composition = transformIfRequired();
		return composition == null ? null : Text.removeTags(Text.sanitize(composition.getName()));
	}

	@Inject
	@Override
	public int getCombatLevel()
	{
		RSNPCComposition composition = transformIfRequired();
		return composition == null ? -1 : composition.getCombatLevel();
	}

	@Inject
	@Override
	public String[] getRawActions()
	{
		RSNPCComposition composition = transformIfRequired();
		return composition == null ? null : composition.getActions();
	}

	@Inject
	private RSNPCComposition transformIfRequired()
	{
		RSNPCComposition composition = getComposition();
		if (isTransformRequired())
		{
			if (!npcDefCache.containsKey(getIndex()))
			{
				assert client.isClientThread() : "NPCComposition.getTransformed must be called on client thread";
				composition = composition.transform();
				npcDefCache.put(getIndex(), composition);
			}
			else
			{
				composition = npcDefCache.get(getIndex());
			}
		}

		return composition;
	}

	@Inject
	@Override
	public boolean isDefinitionCached()
	{
		return npcDefCache.containsKey(getIndex());
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
				return MenuAction.NPC_FIRST_OPTION.getId();
			case 1:
				return MenuAction.NPC_SECOND_OPTION.getId();
			case 2:
				return MenuAction.NPC_THIRD_OPTION.getId();
			case 3:
				return MenuAction.NPC_FOURTH_OPTION.getId();
			case 4:
				return MenuAction.NPC_FIFTH_OPTION.getId();
			default:
				throw new IllegalArgumentException("action = " + action);
		}
	}

	@Override
	@Inject
	public void interact(int action)
	{
		interact(getIndex(), getActionId(action));
	}

	@Override
	@Inject
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
		interact(getIndex(), menuAction, 0, 0);
	}

	@Inject
	@Override
	public boolean isTransformRequired()
	{
		return getComposition() != null && getComposition().getConfigs() != null;
	}

	@Inject
	@Override
	public String toString()
	{
		return getIndex() + ": " + getName() + " (" + getId() + ") at " + getWorldLocation();
	}

	@Inject
	private Point getScreenCoords()
	{
		return Perspective.localToCanvas(client, getLocalLocation(), client.getPlane());
	}

	@Inject
	public long getTag()
	{
		return client.calculateTag(0, 0, 1, getComposition().isInteractible(), getIndex());
	}
}
