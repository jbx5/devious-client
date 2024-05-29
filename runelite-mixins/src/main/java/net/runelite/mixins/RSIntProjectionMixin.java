package net.runelite.mixins;

import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIntProjection;

@Mixin(RSIntProjection.class)
public abstract class RSIntProjectionMixin implements RSIntProjection
{
	@Shadow("client")
	private static RSClient client;
}
