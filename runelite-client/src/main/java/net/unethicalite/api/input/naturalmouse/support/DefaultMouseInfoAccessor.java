package net.unethicalite.api.input.naturalmouse.support;

import net.unethicalite.api.input.naturalmouse.api.MouseInfoAccessor;

import java.awt.*;

public class DefaultMouseInfoAccessor implements MouseInfoAccessor
{

	@Override
	public Point getMousePosition()
	{
		return MouseInfo.getPointerInfo().getLocation();
	}
}
