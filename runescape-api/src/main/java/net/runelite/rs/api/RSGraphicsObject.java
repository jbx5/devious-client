package net.runelite.rs.api;

import net.runelite.api.GraphicsObject;
import net.runelite.mapping.Import;

public interface RSGraphicsObject extends GraphicsObject, RSRenderable
{
	@Import("id")
	@Override
	int getId();

	@Import("id")
	void setId(int id);

	@Import("x")
	int getX();

	@Import("x")
	void setX(int x);

	@Import("y")
	int getY();

	@Import("y")
	void setY(int y);

	@Import("cycleStart")
	@Override
	int getStartCycle();

	@Import("plane")
	@Override
	int getLevel();

	@Import("plane")
	void setLevel(int level);

	@Import("z")
	@Override
	int getZ();

	@Import("z")
	void setZ(int height);

	@Import("isFinished")
	@Override
	boolean finished();

	@Import("isFinished")
	void setFinished(boolean finished);

	@Import("frame")
	int getFrame();

	@Import("frame")
	void setFrame(int frame);

	@Import("frameCycle")
	int getFrameCycle();

	@Import("frameCycle")
	void setFrameCycle(int frameCycle);

	@Import("sequenceDefinition")
	RSSequenceDefinition getSequenceDefinition();

	@Import("sequenceDefinition")
	void setSequenceDefinition(RSSequenceDefinition sequenceDefinition);

	@Import("advance")
	void advance(int var1);

	@Import("sequenceDefinition")
	@Override
	RSSequenceDefinition getAnimation();

	@Import("frame")
	@Override
	int getAnimationFrame();
}
