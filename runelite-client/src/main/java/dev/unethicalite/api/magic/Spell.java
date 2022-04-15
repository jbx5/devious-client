package dev.unethicalite.api.magic;

import net.runelite.api.widgets.WidgetInfo;

public interface Spell
{
	int getLevel();

	WidgetInfo getWidget();

	boolean canCast();
}
