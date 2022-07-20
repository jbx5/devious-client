package net.unethicalite.api.input.naturalmouse.api;

import java.awt.Dimension;

/**
 * Abstracts ordinary static System calls away
 */
public interface SystemCalls
{
	long currentTimeMillis();

	void sleep(long time);

	Dimension getScreenSize();

	void setMousePosition(int x, int y);
}
