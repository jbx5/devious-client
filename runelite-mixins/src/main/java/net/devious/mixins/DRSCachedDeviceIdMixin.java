package net.devious.mixins;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Properties;
import java.util.UUID;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPlatformInfo;

@Mixin(RSPlatformInfo.class)
public abstract class DRSCachedDeviceIdMixin implements RSPlatformInfo
{
	@Shadow("client")
	private static RSClient client;

	@net.runelite.api.mixins.Inject
	@javax.inject.Inject
	@javax.inject.Named("cachedUUID")
	private boolean cachedUUID; // Does not work

	@net.runelite.api.mixins.Inject
	@javax.inject.Inject
	@javax.inject.Named("runeLiteDir")
	private File oprsDir; // Does not work

	@Inject
	private File cachedUUIDFile;

	@Inject
	private Properties cachedUUIDProperties;

	@Copy("getDeviceId")
	@Replace("getDeviceId")
	public String copy$getDeviceId(int os)
	{
		/*if (!cachedUUID)
		{
			String deviceId = copy$getDeviceId(os);
			client.getLogger().warn("Found deviceId (UUID): {}", deviceId);
			return deviceId;
		}*/

		String cachedDeviceId = getCachedUUID(client.getUsername());
		if (cachedDeviceId == null)
		{
			cachedDeviceId = UUID.randomUUID().toString();
			writeCachedUUID(client.getUsername(), cachedDeviceId);
		}
		client.getLogger().info("Using cached deviceId (UUID): {}", cachedDeviceId);
		return cachedDeviceId;
	}

	@Inject
	private String getCachedUUID(String username)
	{
		if (cachedUUIDProperties == null)
		{
			cachedUUIDFile = new File(System.getProperty("user.home") + File.separator + ".openosrs", "uuid-cached.properties");
			cachedUUIDProperties = new Properties();

			if (cachedUUIDProperties.isEmpty() && cachedUUIDFile.exists())
			{
				try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(cachedUUIDFile), StandardCharsets.UTF_8))
				{
					cachedUUIDProperties.load(inputStreamReader);
				}
				catch (IOException e)
				{
					client.getLogger().warn("Unable to load cached UUID profiles from disk", e);
				}

				if (cachedUUIDProperties.size() > 0)
				{
					client.getLogger().info("Read {} cached UUID profiles from disk", cachedUUIDProperties.size());
				}
			}
		}

		String uuid = cachedUUIDProperties.getProperty(client.getUsername());
		return uuid != null ? uuid : null;
	}

	@Inject
	private void writeCachedUUID(String username, String UUID)
	{
		cachedUUIDProperties.setProperty(client.getUsername(), UUID);
		try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(Files.newOutputStream(cachedUUIDFile.toPath()), StandardCharsets.UTF_8))
		{
			cachedUUIDProperties.store(outputStreamWriter, "Cached UUID");
		}
		catch (IOException e)
		{
			client.getLogger().warn("Unable to write cached UUID to disk", e);
		}
	}
}
