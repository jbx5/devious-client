package net.unethicalite.mixins;

import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Text;
import net.runelite.api.MenuAction;
import net.runelite.api.NPCComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNPC;
import net.runelite.rs.api.RSNPCComposition;

@Mixin(RSNPC.class)
public abstract class HNpcMixin implements RSNPC
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private RSNPCComposition transformedComposition = null;

	@Inject
	@Override
	public int getId()
	{
		RSNPCComposition composition = getTransformedComposition();
		return composition == null ? -1 : composition.getId();
	}

	@Inject
	@Override
	public String getName()
	{
		RSNPCComposition composition = getTransformedComposition();
		return composition == null ? "null" : Text.sanitize(composition.getName());
	}

	@Inject
	@Override
	public int getCombatLevel()
	{
		RSNPCComposition composition = getTransformedComposition();
		return composition == null ? -1 : composition.getCombatLevel();
	}

	@Inject
	@Override
	public String[] getActions()
	{
		RSNPCComposition composition = getTransformedComposition();
		if (composition == null)
		{
			return null;
		}

		String[] sanitized = new String[composition.getActions().length];
		for (int i = 0; i < composition.getActions().length; i++)
		{
			sanitized[i] = Text.sanitize(composition.getActions()[i]);
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
		interact(getIndex(), getActionOpcode(action));
	}

	@Override
	@Inject
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		if (identifier == -1)
		{
			throw new IllegalStateException("Interacted NPC no longer exists " + getName() + ", cancelling " +
					"interaction.");
		}

		client.interact(getMenu(identifier, opcode, param0, param1));
	}

	@Inject
	@Override
	public void interact(int index, int opcode)
	{
		interact(getIndex(), opcode, 0, 0);
	}

	@Inject
	@Override
	public String toString()
	{
		return getIndex() + ": " + getName() + " (" + getId() + ") at " + getWorldLocation();
	}

	@Inject
	public long getTag()
	{
		return client.calculateTag(0, 0, 1, getComposition().isInteractible(), getIndex(), getWorldView().getId());
	}

	@Inject
	public void setTransformedComposition(NPCComposition composition)
	{
		transformedComposition = (RSNPCComposition) composition;
	}

	@Inject
	public RSNPCComposition getTransformedComposition()
	{
		return transformedComposition == null ? getComposition() : transformedComposition;
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex)
	{
		return getMenu(getIndex(), getActionOpcode(actionIndex));
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex, int opcode)
	{
		return getMenu(getIndex(), opcode, 0, 0);
	}
}
