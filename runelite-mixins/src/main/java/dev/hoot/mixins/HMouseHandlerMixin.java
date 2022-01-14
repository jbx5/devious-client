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
		client.setFocused(true);
		setIdleCycles(0);
		setLastPressedX(correctX(x));
		setLastPressedY(correctY(y));
		setLastPressedMillis(client.getCurrentTime());
		setLastButton(button);

		if (getLastButton() != 0)
		{
			setCurrentButton(button);
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
