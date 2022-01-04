package net.runelite.client.plugins.regions;

import net.runelite.client.config.Button;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

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

	@ConfigItem(
			keyName = "collisionOverlay",
			name = "Show collision overlay",
			description = "Show collision overlay",
			position = 1
	)
	default boolean collisionOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "transportsOverlay",
			name = "Show transports overlay",
			description = "Show transports overlay",
			position = 2
	)
	default boolean transportsOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "pathOverlay",
			name = "Show path overlay",
			description = "Show path overlay",
			position = 3
	)
	default boolean pathOverlay()
	{
		return false;
	}

	@ConfigItem(
			keyName = "download",
			name = "Update collision data",
			description = "Downloads new collision data from the server and updates the currently used collision map",
			position = 4
	)
	default Button download()
	{
		return new Button();
	}

	@ConfigItem(
			keyName = "transport",
			name = "Add new transport",
			description = "Add new transport",
			position = 5
	)
	default Button transport()
	{
		return new Button();
	}
}
