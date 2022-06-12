package net.unethicalite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPcmPlayer;

@Mixin(RSPcmPlayer.class)
public abstract class HPcmPlayerMixin implements RSPcmPlayer
{
	@Shadow("client")
	private static RSClient client;

	@Copy("run")
	@Replace("run")
	public final void copy$run()
	{
		if (!client.isLowCpu())
		{
			copy$run();
		}
	}
}
