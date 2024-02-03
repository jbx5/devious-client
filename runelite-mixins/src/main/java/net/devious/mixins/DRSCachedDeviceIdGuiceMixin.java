package net.devious.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class DRSCachedDeviceIdGuiceMixin implements RSClient
{
	@Inject
	@javax.inject.Inject
	@javax.inject.Named("cachedUUID")
	private boolean cachedUUID;

	@Inject
	@Override
	public boolean useCachedUUID()
	{
		return cachedUUID;
	}
}
