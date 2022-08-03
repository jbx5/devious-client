package net.unethicalite.api.widgets;

import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Vars;
import net.runelite.api.GameState;
import net.runelite.api.VarClientInt;
import net.unethicalite.client.Static;

import java.util.Arrays;

public class Tabs
{
	public static void open(Tab tab)
	{
		if (Static.getClient() == null || Game.getState() != GameState.LOGGED_IN)
		{
			return;
		}

		GameThread.invoke(() -> Static.getClient().runScript(915, tab.getIndex()));
	}

	@Deprecated
	public static void openInterface(Tab tab)
	{
		open(tab);
	}

	public static boolean isOpen(Tab tab)
	{
		return Vars.getVarcInt(VarClientInt.INVENTORY_TAB) == Arrays.asList(Tab.values()).indexOf(tab);
	}
}
