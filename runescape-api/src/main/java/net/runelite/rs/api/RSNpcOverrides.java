package net.runelite.rs.api;

import net.runelite.api.NpcOverrides;
import net.runelite.mapping.Import;

public interface RSNpcOverrides extends NpcOverrides
{
	@Import("modelIds")
	@Override
	int[] getModelIds();

	@Import("recolorTo")
	@Override
	short[] getColorToReplaceWith();

	@Import("retextureTo")
	@Override
	short[] getTextureToReplaceWith();

	@Import("useLocalPlayer")
	@Override
	boolean useLocalPlayer();
}