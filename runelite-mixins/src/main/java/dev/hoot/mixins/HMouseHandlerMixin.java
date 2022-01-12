package dev.hoot.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSMouseHandler;

@Mixin(RSMouseHandler.class)
public abstract class HMouseHandlerMixin implements RSMouseHandler
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public void sendClick(int x, int y, int button)
	{
		int btn = button;
		/*
		 * Set the button to 1337 so the client doesn't process it as click in the next cycle.
		 * Adding an extra condition in osrs/Client.java L: 3828 where checking for lastButton == 1337 makes it so that
		 * both the mouserecorder and the click packet are properly sent. If rev updates remove this added condition,
		 * make sure to re-add it.
		 */
		if (button == 1337)
		{
			btn = 1;
		}

		client.setFocused(true);
		setIdleCycles(0);
		setLastPressedX(correctX(x));
		setLastPressedY(correctY(y));
		setLastPressedMillis(client.getCurrentTime());
		setLastButton(button);

		if (getLastButton() != 0)
		{
			setCurrentButton(btn);
		}
	}

	@Override
	@Inject
	public void sendMovement(int x, int y)
	{
		client.setFocused(true);
		setIdleCycles(0);
		setCurrentX(correctX(x));
		setCurrentY(correctY(y));
		setCurrentMillis(System.currentTimeMillis());
	}

	@Inject
	public int correctX(int x)
	{
		if (x < 0)
		{
			return 0;
		}

		if (x > client.getCanvasWidth())
		{
			return client.getCanvasWidth();
		}

		return x;
	}

	@Inject
	public int correctY(int y)
	{
		if (y < 0)
		{
			return 0;
		}

		if (y > client.getCanvasHeight())
		{
			return client.getCanvasHeight();
		}

		return y;
	}
}
