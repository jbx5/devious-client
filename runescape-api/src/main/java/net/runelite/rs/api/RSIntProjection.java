package net.runelite.rs.api;

import net.runelite.api.IntProjection;
import net.runelite.mapping.Import;

public interface RSIntProjection extends IntProjection
{
	@Import("cameraX")
	@Override
	int getCameraX();

	@Import("cameraY")
	@Override
	int getCameraY();

	@Import("cameraZ")
	@Override
	int getCameraZ();

	@Import("pitchSin")
	@Override
	int getPitchSin();

	@Import("pitchCos")
	@Override
	int getPitchCos();

	@Import("yawSin")
	@Override
	int getYawSin();

	@Import("yawCos")
	@Override
	int getYawCos();
}
