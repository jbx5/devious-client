package net.unethicalite.api.input;

import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.Canvas;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class Mouse
{
	private static final Logger log = LoggerFactory.getLogger(Mouse.class);
	private static final int MENU_REPLACE_DELAY = 80;
	public static final Supplier<Point> CLICK_POINT_SUPPLIER = () -> new Point(Rand.nextInt(520, 568), Rand.nextInt(55, 70));

	private static boolean exited = true;
	private static final Executor CLICK_EXECUTOR = Executors.newSingleThreadExecutor();

	public static void click(int x, int y, boolean left)
	{
		if (Static.getClient().isClientThread())
		{
			CLICK_EXECUTOR.execute(() -> handleClick(x, y, left));
		}
		else
		{
			handleClick(x, y, left);
		}
	}

	private static void handleClick(int x, int y, boolean left)
	{
		long start = System.currentTimeMillis();
		Canvas canvas = Static.getClient().getCanvas();

		if (exited)
		{
			entered(x, y, canvas, System.currentTimeMillis());
		}

		moved(x, y, canvas, System.currentTimeMillis());
		Time.sleep(2, 30);
		pressed(x, y, canvas, System.currentTimeMillis(), left ? MouseEvent.BUTTON1 : MouseEvent.BUTTON3);
		Time.sleep(2, 30);
		long currTime = System.currentTimeMillis();
		released(x, y, canvas, currTime, left ? MouseEvent.BUTTON1 : MouseEvent.BUTTON3);
		clicked(x, y, canvas, currTime, left ? MouseEvent.BUTTON1 : MouseEvent.BUTTON3);

		if (Rand.nextBool() && !exited)
		{
			exited(x, y, canvas, System.currentTimeMillis());
		}

		long sleep = MENU_REPLACE_DELAY - (System.currentTimeMillis() - start);
		if (sleep > 0)
		{
			Time.sleep(sleep);
		}
		else
		{
			Time.sleep(MENU_REPLACE_DELAY);
		}
	}

	public static void click(Point point, boolean left)
	{
		click((int) point.getX(), (int) point.getY(), left);
	}

	public static void clickRandom(boolean left)
	{
		click(CLICK_POINT_SUPPLIER.get(), left);
	}

	public static synchronized void pressed(int x, int y, Canvas canvas, long time, int button)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_PRESSED, time, 0, x, y, 1, false, button);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
	}

	public static synchronized void released(int x, int y, Canvas canvas, long time, int button)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_RELEASED, time, 0, x, y, 1, false, button);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
	}

	public static synchronized void clicked(int x, int y, Canvas canvas, long time, int button)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_CLICKED, time, 0, x, y, 1, false, button);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
	}

	public static synchronized void released(int x, int y, Canvas canvas, long time)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_RELEASED, time, 0, x, y, 1, false);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
	}

	public static synchronized void clicked(int x, int y, Canvas canvas, long time)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_CLICKED, time, 0, x, y, 1, false);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
	}

	public static synchronized void exited(int x, int y, Canvas canvas, long time)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_EXITED, time, 0, x, y, 0, false);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
		exited = true;
	}

	public static synchronized void entered(int x, int y, Canvas canvas, long time)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_ENTERED, time, 0, x, y, 0, false);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
		exited = false;
	}

	public static synchronized void moved(int x, int y, Canvas canvas, long time)
	{
		MouseEvent event = new MouseEvent(canvas, MouseEvent.MOUSE_MOVED, time, 0, x, y, 0, false);
		event.setSource("unethicalite");
		canvas.dispatchEvent(event);
	}

	public static Point getPosition()
	{
		return Static.getClient().getMouseCanvasPosition().getAwtPoint();
	}
}
