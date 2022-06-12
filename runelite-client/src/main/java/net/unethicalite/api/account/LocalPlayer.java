package net.unethicalite.api.account;

import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.runelite.api.Player;
import net.runelite.api.VarPlayer;
import net.runelite.api.vars.AccountType;
import net.unethicalite.client.Static;

public class LocalPlayer
{
	public static Player get()
	{
		return Players.getLocal();
	}

	public static String getUsername()
	{
		return Static.getClient().getUsername();
	}

	public static String getPassword()
	{
		return Static.getClient().getPassword();
	}

	public static int getTotalLevel()
	{
		return Static.getClient().getTotalLevel();
	}

	public static int getQuestPoints()
	{
		return Vars.getVarp(VarPlayer.QUEST_POINTS.getId());
	}

	public static int getMembershipDays()
	{
		return Game.getMembershipDays();
	}

	public static boolean isMember()
	{
		return getMembershipDays() > 0;
	}

	public static String getDisplayName()
	{
		return get().getName();
	}

	public static AccountType getAccountType()
	{
		return Static.getClient().getAccountType();
	}
}
