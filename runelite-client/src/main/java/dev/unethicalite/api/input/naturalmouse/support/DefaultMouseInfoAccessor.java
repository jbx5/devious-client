package dev.unethicalite.api.input.naturalmouse.support;

import dev.unethicalite.api.input.naturalmouse.api.MouseInfoAccessor;

import java.awt.*;

public class DefaultMouseInfoAccessor implements MouseInfoAccessor
{

	@Override
	public Point getMousePosition()
	{
		return MouseInfo.getPointerInfo().getLocation();
	}
}
