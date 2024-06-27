package net.runelite.rs.api;

import net.runelite.api.IntProjection;
import net.runelite.mapping.Import;

public interface RSIntProjection extends IntProjection
{
	@Import("cameraX")
	@Override
	int getCameraX();

	@Import("cameraX")
	void setCameraX(int cameraX);

	@Import("cameraY")
	@Override
	int getCameraY();

	@Import("cameraY")
	void setCameraY(int cameraY);

	@Import("cameraZ")
	@Override
	int getCameraZ();

	@Import("cameraZ")
	void setCameraZ(int cameraZ);

	@Import("cameraPitch")
	int getCameraPitch();

	@Import("cameraPitch")
	void setCameraPitch(int cameraPitch);

	@Import("cameraYaw")
	int getCameraYaw();

	@Import("cameraYaw")
	void setCameraYaw(int cameraYaw);

	@Import("pitchSin")
	@Override
	int getPitchSin();

	@Import("pitchSin")
	void setPitchSin(int pitchSin);

	@Import("pitchCos")
	@Override
	int getPitchCos();

	@Import("pitchCos")
	void setPitchCos(int pitchCos);

	@Import("yawSin")
	@Override
	int getYawSin();

	@Import("yawSin")
	void setYawSin(int yawSin);

	@Import("yawCos")
	@Override
	int getYawCos();

	@Import("yawCos")
	void setYawCos(int yawCos);
}
