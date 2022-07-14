package net.runelite.rs.api;

import net.runelite.api.ColorTextureOverride;
import net.runelite.mapping.Import;

public interface RSPlayerCompositionColorTextureOverride extends ColorTextureOverride
{
	@Import("playerCompositionRecolorTo")
	short[] getPlayerCompositionRecolorTo();

	@Import("playerCompositionRetextureTo")
	short[] getPlayerCompositionRetextureTo();
}
