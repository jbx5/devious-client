package dev.unethicalite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSMouseHandler;

import java.awt.Canvas;
import java.awt.event.MouseEvent;

@Mixin(RSMouseHandler.class)
public abstract class HMouseHandlerMixin implements RSMouseHandler
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public synchronized void sendClick(int x, int y, int button)
	{
		long time = System.currentTimeMillis();
		Canvas canvas = client.getCanvas();
		MouseEvent press = new MouseEvent(canvas, MouseEvent.MOUSE_PRESSED, time, 0, x, y, 1, false, button);
		press.setSource("unethicalite");
		canvas.dispatchEvent(press);
		MouseEvent release = new MouseEvent(canvas, MouseEvent.MOUSE_RELEASED, time, 0, x, y, 1, false, button);
		release.setSource("unethicalite");
		canvas.dispatchEvent(release);
	}

	@Override
	@Inject
	public synchronized void sendMovement(int x, int y)
	{
		Canvas canvas = client.getCanvas();
//		if (!canvas.contains(getCurrentX(), getCurrentY()) && canvas.contains(x, y))
//		{
//			canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_ENTERED, client.getCurrentTime(), 0, x, y, 0, false));
//		}

		MouseEvent move = new MouseEvent(canvas, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, x, y, 0, false);
		move.setSource("unethicalite");
		canvas.dispatchEvent(move);

//		int currX = getCurrentX();
//		int currY = getCurrentY();
//		if (!canvas.contains(currX, currY))
//		{
//			canvas.dispatchEvent(new MouseEvent(canvas, MouseEvent.MOUSE_EXITED, client.getCurrentTime(), 0, currX, currY, 0, false));
//		}
	}
}
