package net.unethicalite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSGameEngine;

@Mixin(RSGameEngine.class)
public abstract class HGameEngineMixin implements RSGameEngine
{
	@Shadow("lowCpu")
	private static boolean lowCpu;

	@Copy("graphicsTick")
	@Replace("graphicsTick")
	void copy$graphicsTick()
	{
		if (!lowCpu)
		{
			copy$graphicsTick();
		}
	}
}
