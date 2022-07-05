package net.unethicalite.client;

import net.runelite.client.RuneLite;
import net.unethicalite.client.minimal.MinimalClient;

import java.util.Arrays;

public class Unethicalite
{
	public static void main(String[] args) throws Exception
	{
		if (Arrays.asList(args).contains("--minimal"))
		{
			MinimalClient.main(args);
		}
		else
		{
			RuneLite.oldMain(args);
		}
	}
}
