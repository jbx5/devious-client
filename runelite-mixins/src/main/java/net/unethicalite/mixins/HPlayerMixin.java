package net.unethicalite.mixins;

import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Text;
import net.runelite.api.MenuAction;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.mixins.RSPlayerMixin;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPlayer;

@Mixin(RSPlayer.class)
public abstract class HPlayerMixin extends RSPlayerMixin implements RSPlayer
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public int getIndex()
	{
		for (int i = 0; i < client.getCachedPlayers().length; i++)
		{
			RSPlayer player = (RSPlayer) client.getCachedPlayers()[i];
			if (player != null && player.equals(this))
			{
				return i;
			}
		}

		return -1;
	}

	@Inject
	@Override
	public int getActionOpcode(int action)
	{
		switch (action)
		{
			case 0:
				return MenuAction.PLAYER_FIRST_OPTION.getId();
			case 1:
				return MenuAction.PLAYER_SECOND_OPTION.getId();
			case 2:
				return MenuAction.PLAYER_THIRD_OPTION.getId();
			case 3:
				return MenuAction.PLAYER_FOURTH_OPTION.getId();
			case 4:
				return MenuAction.PLAYER_FIFTH_OPTION.getId();
			case 5:
				return MenuAction.PLAYER_SIXTH_OPTION.getId();
			case 6:
				return MenuAction.PLAYER_SEVENTH_OPTION.getId();
			case 7:
				return MenuAction.PLAYER_EIGHTH_OPTION.getId();
			default:
				throw new IllegalArgumentException("action = " + action);
		}
	}

	@Inject
	@Override
	public String[] getActions()
	{
		String[] sanitized = new String[client.getPlayerOptions().length];
		for (int i = 0; i < sanitized.length; i++)
		{
			sanitized[i] = Text.sanitize(client.getPlayerOptions()[i]);
		}

		return sanitized;
	}

	@Override
	@Inject
	public void interact(int action)
	{
		interact(getIndex(), getActionOpcode(action));
	}

	@Inject
	@Override
	public void interact(int index, int opcode)
	{
		interact(getIndex(), opcode, 0, 0);
	}

	@Inject
	@Override
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		client.interact(getMenu(identifier, opcode, param0, param1));
	}

	@Inject
	@Override
	public boolean isIdle()
	{
		return (getIdlePoseAnimation() == getPoseAnimation() && getAnimation() == -1)
				&& (getInteracting() == null || getInteracting().isDead());
	}

	@Inject
	@Override
	public long getTag()
	{
		return client.calculateTag(0, 0, 0, false, getIndex(), getWorldView().getId());
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex)
	{
		return getMenu(getIndex(), getActionOpcode(actionIndex));
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex, int opcode)
	{
		return getMenu(actionIndex, opcode, 0, 0);
	}
}
