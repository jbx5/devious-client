package net.runelite.rs.api;

import net.unethicalite.api.MouseHandler;
import net.runelite.mapping.Import;

public interface RSMouseHandler extends MouseHandler
{
	// The volatile fields are used as setters in the game loop (to set the non volatile fields)
	@Import("MouseHandler_x")
	@Override
	int getCurrentX();

	@Import("MouseHandler_y")
	@Override
	int getCurrentY();

	@Import("MouseHandler_millis")
	@Override
	long getCurrentMillis();

	@Import("MouseHandler_currentButton")
	@Override
	int getCurrentButton();

	@Import("MouseHandler_idleCycles")
	@Override
	int getIdleCycles();

	@Import("MouseHandler_lastButton")
	@Override
	int getLastButton();

	@Import("MouseHandler_lastPressedX")
	@Override
	int getLastPressedX();

	@Import("MouseHandler_lastPressedY")
	@Override
	int getLastPressedY();

	@Import("MouseHandler_lastPressedTimeMillis")
	@Override
	long getLastPressedMillis();

	@Import("MouseHandler_xVolatile")
	@Override
	void setMouseX(int x);

	@Import("MouseHandler_yVolatile")
	@Override
	void setMouseY(int y);

	@Import("MouseHandler_lastMovedVolatile")
	@Override
	void setLastMovedMillis(long millis);

	@Import("MouseHandler_currentButtonVolatile")
	@Override
	void setCurrentButton(int button);

	@Import("MouseHandler_idleCycles")
	@Override
	void setIdleCycles(int cycles);

	@Import("MouseHandler_lastButtonVolatile")
	@Override
	void setLastButton(int button); // for some reason this forces a click

	@Import("MouseHandler_lastPressedXVolatile")
	@Override
	void setLastPressedX(int x);

	@Import("MouseHandler_lastPressedYVolatile")
	@Override
	void setLastPressedY(int y);

	@Import("MouseHandler_lastPressedTimeMillisVolatile")
	@Override
	void setLastPressedMillis(long millis);

	@Import("MouseHandler_lastButtonVolatile")
	@Override
	int getLastPendingButton();
}
