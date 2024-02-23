/*
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.mixins;

import com.google.common.primitives.Floats;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;

@Mixin(RSClient.class)
public abstract class CameraMixin implements RSClient
{
	public static final int STANDARD_PITCH_MIN = 128;
	public static final int STANDARD_PITCH_MAX = 383;
	public static final int NEW_PITCH_MAX = 512;

	@Shadow("client")
	static RSClient client;

	@Inject
	static boolean pitchRelaxEnabled = false;

	@Inject
	static int lastPitch = 128;

	@Inject
	static int lastPitchTarget = 128;

	@Inject
	@Override
	public boolean getCameraPitchRelaxerEnabled()
	{
		return pitchRelaxEnabled;
	}

	@Inject
	public void setCameraPitchRelaxerEnabled(boolean enabled)
	{
		if (pitchRelaxEnabled == enabled)
		{
			return;
		}
		pitchRelaxEnabled = enabled;
		if (!enabled)
		{
			int pitch = client.getCameraPitchTarget();
			if (pitch > STANDARD_PITCH_MAX)
			{
				client.setCameraPitchTarget(STANDARD_PITCH_MAX);
			}
		}
	}

	@FieldHook("camAngleX")
	@Inject
	static void onCameraPitchTargetChanged(int idx)
	{
		int newPitch = client.getCameraPitchTarget();
		int pitch = newPitch;
		if (pitchRelaxEnabled)
		{
			// This works because the vanilla camera movement code only moves %2
			if (lastPitchTarget > STANDARD_PITCH_MAX && newPitch == STANDARD_PITCH_MAX)
			{
				pitch = lastPitchTarget;
				if (pitch > NEW_PITCH_MAX)
				{
					pitch = NEW_PITCH_MAX;
				}
				client.setCameraPitchTarget(pitch);
			}
		}
		lastPitchTarget = pitch;
	}

	@FieldHook("cameraPitch")
	@Inject
	static void onCameraPitchChanged(int idx)
	{
		int newPitch = client.getCameraPitch();
		int pitch = newPitch;
		if (pitchRelaxEnabled)
		{
			// This works because the vanilla camera movement code only moves %2
			if (lastPitch > STANDARD_PITCH_MAX && newPitch == STANDARD_PITCH_MAX)
			{
				pitch = lastPitch;
				if (pitch > NEW_PITCH_MAX)
				{
					pitch = NEW_PITCH_MAX;
				}
				client.setCameraPitch(pitch);
			}
		}
		lastPitch = pitch;
	}

	@Inject
	private static boolean invertPitch;

	@Inject
	private static boolean invertYaw;

	@Inject
	@Override
	public void setInvertPitch(boolean state)
	{
		invertPitch = state;
	}

	@Inject
	@Override
	public void setInvertYaw(boolean state)
	{
		invertYaw = state;
	}

	@Inject
	private static float cameraSpeed = 1.0F;

	@Inject
	@Override
	public void setCameraSpeed(float var1)
	{
		cameraSpeed = Floats.constrainToRange(var1, 0.2F, 5.0F);
	}

	@Inject
	private static int cameraMouseButtonMask;

	@Inject
	@Override
	public void setCameraMouseButtonMask(int mask)
	{
		cameraMouseButtonMask = mask;
	}

	@Inject
	@FieldHook("camAngleDX")
	private static void onCamAngleDXChanged(int idx)
	{
		label74:
		{
			int mouseCurrentButton = client.getMouseCurrentButton();
			if (cameraMouseButtonMask != 0)
			{
				if ((cameraMouseButtonMask >> mouseCurrentButton & 1) != 0)
				{
					break label74;
				}
			}
			else if (mouseCurrentButton == 4 && client.isMouseCam())
			{
				break label74;
			}

			if (client.getIndexCheck().isValidIndexInRange(96))
			{
				client.setCamAngleDY((int) (client.getCamAngleDY() + (-24 * cameraSpeed - client.getCamAngleDY()) / 2));
			}
			else if (client.getIndexCheck().isValidIndexInRange(97))
			{
				client.setCamAngleDY((int) (client.getCamAngleDY() + (24 * cameraSpeed - client.getCamAngleDY()) / 2));
			}
			else
			{
				client.setCamAngleDY(client.getCamAngleDY() / 2);
			}

			if (client.getIndexCheck().isValidIndexInRange(98))
			{
				client.setCamAngleDX((int) (client.getCamAngleDX() + (12 * cameraSpeed - client.getCamAngleDX()) / 2));
			}
			else if (client.getIndexCheck().isValidIndexInRange(99))
			{
				client.setCamAngleDX((int) (client.getCamAngleDX() + (-12 * cameraSpeed - client.getCamAngleDX()) / 2));
			}
			else
			{
				client.setCamAngleDX(client.getCamAngleDX() / 2);
			}

			client.setMouseCamClickedY(client.getMouseHandlerY());
			client.setMouseCamClickedX(client.getMouseHandlerX());
			return;
		}

		int var2 = client.getMouseHandlerY() - client.getMouseCamClickedY();
		int var3 = client.getMouseCamClickedX() - client.getMouseHandlerX();
		client.setCamAngleDY((int) (var2 * 2 * cameraSpeed));
		client.setCamAngleDX((int) (var3 * 2 * cameraSpeed));

		if (invertPitch)
		{
			client.setCamAngleDX(-client.getCamAngleDX());
		}

		if (invertYaw)
		{
			client.setCamAngleDY(-client.getCamAngleDY());
		}

		client.setMouseCamClickedY(var2 != -1 && var2 != 1 ? (client.getMouseHandlerY() + client.getMouseCamClickedY()) / 2 : client.getMouseHandlerY());
		client.setMouseCamClickedX(var3 != -1 && var3 != 1 ? (client.getMouseHandlerX() + client.getMouseCamClickedX()) / 2 : client.getMouseHandlerX());
	}
}