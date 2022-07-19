package net.unethicalite.mixins;

import net.runelite.api.GameState;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSGameEngine;

@Mixin(RSGameEngine.class)
public abstract class HGameEngineMixin implements RSGameEngine
{
	@Shadow("client")
	private static RSClient client;

	@Copy("graphicsTick")
	@Replace("graphicsTick")
	void copy$graphicsTick()
	{
		if (client.isLowCpu() && (client.getGameState() == GameState.LOGGED_IN || client.getGameState() == GameState.LOADING))
		{
			return;
		}

		copy$graphicsTick();
	}
}
