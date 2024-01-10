package net.devious.mixins;

import java.util.UUID;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPlatformInfo;

@Mixin(RSPlatformInfo.class)
public abstract class DRSPlatformInfoMixin implements RSPlatformInfo
{
	@Shadow("client")
	private static RSClient client;

	@Copy("getDeviceId")
	@Replace("getDeviceId")
	public String copy$getDeviceId(int os)
	{
		String deviceId = copy$getDeviceId(os);
		client.getLogger().warn("Found deviceId: {}", deviceId);
		UUID uuid = UUID.randomUUID();
		client.getLogger().info("Using random deviceId (UUID): {}", uuid.toString());
		return uuid.toString();
	}
}
