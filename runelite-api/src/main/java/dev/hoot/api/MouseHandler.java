package dev.hoot.api;

import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public interface MouseHandler extends MouseListener, MouseMotionListener, FocusListener
{
	int getCurrentX();

	int getCurrentY();

	long getCurrentMillis();

	int getCurrentButton();

	int getIdleCycles();

	int getLastButton();

	int getLastPressedX();

	int getLastPressedY();

	long getLastPressedMillis();

	void setMouseX(int x);

	void setMouseY(int y);

	void setCurrentMillis(long millis);

	void setCurrentButton(int button);

	void setIdleCycles(int cycles);

	void setLastButton(int button);

	void setLastPressedX(int x);

	void setLastPressedY(int y);

	void setLastPressedMillis(long millis);

	void sendClick(int x, int y, int button);

	default void sendClick(int x, int y)
	{
		sendClick(x, y, 1);
	}

	void sendMovement(int x, int y);
}
