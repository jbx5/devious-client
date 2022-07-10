package net.runelite.rs.api;

import net.runelite.api.ColorTextureOverride;
import net.runelite.mapping.Import;

public interface RSColorTextureOverride extends ColorTextureOverride
{
	@Import("colorToReplaceWith")
	short[] getColorToReplaceWith();

	@Import("textureToReplaceWith")
	short[] getTextureToReplaceWith();
}
