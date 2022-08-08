package net.unethicalite.mixins;

import net.unethicalite.api.events.MouseAutomated;
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
	public void sendClick(int x, int y, int button)
	{
		client.setFocused(true);
		setIdleCycles(0);
		setLastPressedX(x);
		setLastPressedY(y);
		setLastPressedMillis(System.currentTimeMillis());
		setLastButton(getButton(button));
		if (getLastPendingButton() != 0)
		{
			setCurrentButton(getLastPendingButton());
		}

		client.getCallbacks().post(MouseAutomated.builder()
				.eventType(MouseAutomated.EventType.PRESS)
				.x(x)
				.y(y)
				.button(button)
				.build()
		);
	}

	@Override
	@Inject
	public void sendRelease()
	{
		setIdleCycles(0);
		setCurrentButton(0);

		client.getCallbacks().post(MouseAutomated.builder()
				.eventType(MouseAutomated.EventType.RELEASE)
				.x(getLastPressedX())
				.y(getLastPressedY())
				.button(getLastButton())
				.build()
		);
	}

	@Override
	@Inject
	public void sendMovement(int x, int y)
	{
		setIdleCycles(0);
		setMouseX(x);
		setMouseY(y);
		setLastMovedMillis(System.currentTimeMillis());

		client.getCallbacks().post(MouseAutomated.builder()
				.eventType(MouseAutomated.EventType.MOVE)
				.x(x)
				.y(y)
				.button(-1)
				.build()
		);
	}

	@Override
	@Inject
	public void sendExit()
	{
		setIdleCycles(0);
		setMouseX(-1);
		setMouseY(-1);
		setLastMovedMillis(System.currentTimeMillis());

		client.getCallbacks().post(MouseAutomated.builder()
				.eventType(MouseAutomated.EventType.EXIT)
				.x(-1)
				.y(-1)
				.button(-1)
				.build()
		);
	}

	@Override
	@Inject
	public void sendFocusLost()
	{
		setCurrentButton(0);
		client.setFocused(false);
	}

	@Inject
	private int getButton(int button)
	{
		return button == 3 ? 2 : button == 2 ? 4 : button;
	}

	@Override
	@Inject
	public synchronized void sendClickMouseEvent(int x, int y, int button)
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
	public synchronized void sendMovementMouseEvent(int x, int y)
	{
		Canvas canvas = client.getCanvas();
		MouseEvent move = new MouseEvent(canvas, MouseEvent.MOUSE_MOVED, System.currentTimeMillis(), 0, x, y, 0, false);
		move.setSource("unethicalite");
		canvas.dispatchEvent(move);
	}
}
