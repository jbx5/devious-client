package net.runelite.rs.api;

import net.runelite.api.DynamicObject;
import net.runelite.mapping.Import;

public interface RSDynamicObject extends RSRenderable, DynamicObject
{
	@Import("id")
	int getId();

	@Import("frame")
	@Override
	int getAnimFrame();

	@Import("frame")
	void setAnimFrame(int frame);

	@Import("cycleStart")
	@Override
	int getAnimCycle();

	@Import("sequenceDefinition")
	@Override
	RSSequenceDefinition getAnimation();
}
