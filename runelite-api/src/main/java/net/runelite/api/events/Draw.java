package net.runelite.api.events;

import lombok.Data;
import java.awt.Graphics;

@Data
public class Draw
{
	private static final Draw INSTANCE = new Draw();

	public static Draw getInstance()
	{
		return INSTANCE;
	}

	private Draw()
	{
	}

	Graphics graphics;
}
