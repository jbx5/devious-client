package net.unethicalite.api.game;

import net.runelite.api.VarClientInt;
import net.runelite.api.VarClientStr;
import net.unethicalite.client.Static;

public class Vars
{
	public static int getBit(int id)
	{
		return GameThread.invokeLater(() -> Static.getClient().getVarbitValue(Static.getClient().getVarps(), id));
	}

	public static int getVarp(int id)
	{
		return Static.getClient().getVarpValue(Static.getClient().getVarps(), id);
	}

	public static int getVarcInt(VarClientInt varClientInt)
	{
		return Static.getClient().getVar(varClientInt);
	}

	public static String getVarcStr(VarClientStr varClientStr)
	{
		return Static.getClient().getVar(varClientStr);
	}
}
