package net.unethicalite.api.game;

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

	public static int getVarcInt(int varClientInt)
	{
		return Static.getClient().getVarcIntValue(varClientInt);
	}

	public static String getVarcStr(int varClientStr)
	{
		return Static.getClient().getVarcStrValue(varClientStr);
	}

	public static void setVarcInt(int varClientInt, int value)
	{
		GameThread.invoke(() -> Static.getClient().setVarcIntValue(varClientInt, value));
	}

	public static void setVarcStr(int varClientStr, String value)
	{
		GameThread.invoke(() -> Static.getClient().setVarcStrValue(varClientStr, value));
	}
}
