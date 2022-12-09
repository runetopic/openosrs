package net.runelite.rs.api;

import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import net.runelite.mapping.Import;

public interface RSKeyHandler extends KeyListener, FocusListener
{
	@Import("KeyHandler_idleCycles")
	void setIdleCycles(int cycles);

	@Import("KeyHandler_idleCycles")
	int getIdleCycles();

	@Import("KeyHandler_pressedKeys")
	boolean[] getPressedKeys();
}
