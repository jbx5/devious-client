package net.runelite.rs.api;

import net.runelite.api.KeyFocusListener;
import net.runelite.mapping.Import;

import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

public interface RSKeyHandler extends KeyListener, FocusListener, KeyFocusListener
{
	@Import("KeyHandler_idleCycles")
	void setIdleCycles(int cycles);

	@Import("KeyHandler_idleCycles")
	int getIdleCycles();

	@Import("KeyHandler_pressedKeys")
	boolean[] getPressedKeys();
}
