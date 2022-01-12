package dev.hoot.bot.config;

import net.runelite.client.config.*;

@ConfigGroup("hoot")
public interface BotConfig extends Config
{

	@ConfigSection(
			name = "Options",
			position = 0,
			description = ""
	)
	String optionsSection = "Options";

	@Range(
			min = 1,
			max = 50
	)
	@ConfigItem(
			position = 0,
			keyName = "fpsLimit",
			name = "FPS limit",
			description = "FPS limit",
			section = optionsSection
	)
	default int fpsLimit()
	{
		return 15;
	}

	@ConfigItem(
			position = 1,
			keyName = "renderOff",
			name = "Render off",
			description = "Render off",
			section = optionsSection
	)
	default boolean renderOff()
	{
		return false;
	}

	@ConfigItem(
			position = 2,
			keyName = "minimized",
			name = "Start minimized",
			description = "Start minimized",
			section = optionsSection
	)
	default boolean minimized()
	{
		return false;
	}

	@ConfigItem(
			position = 3,
			keyName = "neverLog",
			name = "Neverlog",
			description = "Skips idle checks",
			section = optionsSection
	)
	default boolean neverLog()
	{
		return true;
	}
}
