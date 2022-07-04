package net.unethicalite.client;

import net.runelite.client.RuneLite;
import net.unethicalite.client.minimal.MinimalClient;

public class Unethicalite
{
	public static void main(String[] args) throws Exception
	{
		if ("minimal".equals(System.getenv("unethicalite.build")))
		{
			MinimalClient.main(args);
		}
		else
		{
			RuneLite.oldMain(args);
		}
	}
}
