package net.runelite.client.plugins.regions;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Range;

@ConfigGroup("regions")
public interface RegionConfig extends Config
{
	@ConfigItem(
			keyName = "apiKey",
			name = "API Key",
			description = "API Key used for contributing collision data to our backend.",
			secret = true,
			position = 0
	)
	default String apiKey()
	{
		return "";
	}

	@Range(max = 3)
	@ConfigItem(
			keyName = "collisionOverlayPlane",
			name = "Collision overlay plane",
			description = "Collision overlay plane",
			position = 1
	)
	default int collisionOverlayPlane()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "collisionOverlay",
			name = "Show collision overlay",
			description = "Show collision overlay",
			position = 2
	)
	default boolean collisionOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "transportsOverlay",
			name = "Show transports overlay",
			description = "Show transports overlay",
			position = 3
	)
	default boolean transportsOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "pathOverlay",
			name = "Show path overlay",
			description = "Show path overlay",
			position = 4
	)
	default boolean pathOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "download",
			name = "Update collision data",
			description = "Downloads new collision data from the server and updates the currently used collision map",
			position = 5
	)
	default Button download()
	{
		return new Button();
	}

	@ConfigItem(
			keyName = "transport",
			name = "Add new transport",
			description = "Add new transport",
			position = 6
	)
	default Button transport()
	{
		return new Button();
	}
}
