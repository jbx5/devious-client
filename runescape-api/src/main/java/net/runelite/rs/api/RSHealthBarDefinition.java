package net.runelite.rs.api;

import net.runelite.api.HealthBarConfig;
import net.runelite.mapping.Import;

public interface RSHealthBarDefinition extends RSDualNode, HealthBarConfig
{
	@Import("width")
	int getHealthScale();

	@Import("frontSpriteID")
	@Override
	int getHealthBarFrontSpriteId();

	@Import("getFrontSprite")
	RSSpritePixels getHealthBarFrontSprite();

	@Import("getBackSprite")
	RSSpritePixels getHealthBarBackSprite();

	@Import("widthPadding")
	@Override
	void setPadding(int padding);
}
