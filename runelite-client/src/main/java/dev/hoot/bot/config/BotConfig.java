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

//	@ConfigSection(
//					name = "Mouse",
//					position = 1,
//					description = ""
//	)
//	String mouseSection = "Mouse";
//
//	@ConfigSection(
//					name = "Natural Mouse",
//					position = 2,
//					description = ""
//	)
//	String naturalMouseSection = "Natural Mouse";

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
			keyName = "mouseEvents",
			name = "Mouse events",
			description = "Mouse events",
			section = optionsSection
	)
	default boolean mouseEvents()
	{
		return false;
	}

	@ConfigItem(
			position = 3,
			keyName = "debugLog",
			name = "Debug log",
			description = "Debug log",
			section = optionsSection
	)
	default boolean debugLog()
	{
		return false;
	}

	@ConfigItem(
			keyName = "interactType",
			name = "Interact click type",
			description = "Type of clicks to send to the server",
			section = optionsSection,
			position = 4
	)
	default InteractType interactType()
	{
		return InteractType.CLICKBOXES;
	}

	@ConfigItem(
			position = 5,
			keyName = "minimized",
			name = "Start minimized",
			description = "Start minimized",
			section = optionsSection
	)
	default boolean minimized()
	{
		return true;
	}

//	@ConfigItem(
//					position = 3,
//					keyName = "mouse.move",
//					name = "Mouse movement",
//					description = "Mouse movement",
//					section = mouseSection
//	)
//	default boolean moveMouse() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 4,
//					keyName = "mouse.clickBoxes",
//					name = "Click clickboxes",
//					description = "Click clickboxes",
//					section = mouseSection
//	)
//	default boolean clickBoxes() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 5,
//					keyName = "naturalmouse.minDelay",
//					name = "Min. delay",
//					description = "Min. delay",
//					section = naturalMouseSection
//	)
//	default int minDelay() {
//		return 45;
//	}
//
//	@ConfigItem(
//					position = 6,
//					keyName = "naturalmouse.maxDelay",
//					name = "Max. delay",
//					description = "Max. delay",
//					section = naturalMouseSection
//	)
//	default int maxDelay() {
//		return 100;
//	}
//
//	@ConfigItem(
//					position = 7,
//					keyName = "naturalmouse.reactionTimeVariation",
//					name = "Reaction time variation",
//					description = "Reaction time variation",
//					section = naturalMouseSection
//	)
//	default int reactionTimeVariation() {
//		return 75;
//	}
//
//	@ConfigItem(
//					position = 8,
//					keyName = "naturalmouse.dragSpeed",
//					name = "Mouse drag speed",
//					description = "Mouse drag speed",
//					section = naturalMouseSection
//	)
//	default int dragSpeed() {
//		return 150;
//	}
//
//	@ConfigItem(
//					position = 9,
//					keyName = "naturalmouse.overshoots",
//					name = "Overshoots",
//					description = "Overshoots",
//					section = naturalMouseSection
//	)
//	default int overshoots() {
//		return 4;
//	}
//
//	@ConfigItem(
//					position = 10,
//					keyName = "naturalmouse.variatingFlow",
//					name = "Variating flow",
//					description = "Variating flow",
//					section = naturalMouseSection
//	)
//	default boolean variatingFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 11,
//					keyName = "naturalmouse.slowStartupFlow",
//					name = "Slow startup flow",
//					description = "Slow startup flow",
//					section = naturalMouseSection
//	)
//	default boolean slowStartupFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 12,
//					keyName = "naturalmouse.slowStartupFlow2",
//					name = "Slow startup flow 2",
//					description = "Slow startup flow 2",
//					section = naturalMouseSection
//	)
//	default boolean slowStartupFlow2() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 13,
//					keyName = "naturalmouse.jaggedFlow",
//					name = "Jagged flow",
//					description = "Jagged flow",
//					section = naturalMouseSection
//	)
//	default boolean jaggedFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 14,
//					keyName = "naturalmouse.interruptedFlow",
//					name = "Interrupted flow",
//					description = "Interrupted flow",
//					section = naturalMouseSection
//	)
//	default boolean interruptedFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 15,
//					keyName = "naturalmouse.interruptedFlow2",
//					name = "Interrupted flow 2",
//					description = "Interrupted flow 2",
//					section = naturalMouseSection
//	)
//	default boolean interruptedFlow2() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 16,
//					keyName = "naturalmouse.stoppingFlow",
//					name = "Stopping flow",
//					description = "Stopping flow",
//					section = naturalMouseSection
//	)
//	default boolean stoppingFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 17,
//					keyName = "naturalmouse.adjustingFlow",
//					name = "Adjusting flow",
//					description = "Adjusting flow",
//					section = naturalMouseSection
//	)
//	default boolean adjustingFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 18,
//					keyName = "naturalmouse.randomFlow",
//					name = "Random flow",
//					description = "Random flow",
//					section = naturalMouseSection
//	)
//	default boolean randomFlow() {
//		return true;
//	}
//
//	@ConfigItem(
//					position = 19,
//					keyName = "naturalmouse.deviationSlope",
//					name = "Deviation slope",
//					description = "Deviation slope",
//					section = naturalMouseSection
//	)
//	default int deviationSlope() {
//		return 10;
//	}
}
