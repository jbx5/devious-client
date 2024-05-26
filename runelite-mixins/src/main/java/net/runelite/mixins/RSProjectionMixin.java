package net.runelite.mixins;

import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSProjection;

@Mixin(RSProjection.class)
public abstract class RSProjectionMixin implements RSProjection
{
	@Shadow("client")
	private static RSClient client;
}
