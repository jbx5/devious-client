package net.unethicalite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIsaacCipher;
import net.unethicalite.api.events.IsaacCipherGenerated;

@Mixin(RSIsaacCipher.class)
public abstract class HIsaacCipherMixin implements RSIsaacCipher
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@MethodHook(value = "<init>", end = true)
	public void rl$init(int[] seed)
	{
		client.getCallbacks().post(new IsaacCipherGenerated(seed, this));
	}
}
