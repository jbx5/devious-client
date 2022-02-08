package dev.hoot.api.input.naturalmouse.support;

import dev.hoot.api.input.naturalmouse.api.MouseInfoAccessor;

import java.awt.*;

public class DefaultMouseInfoAccessor implements MouseInfoAccessor
{

	@Override
	public Point getMousePosition()
	{
		return MouseInfo.getPointerInfo().getLocation();
	}
}
