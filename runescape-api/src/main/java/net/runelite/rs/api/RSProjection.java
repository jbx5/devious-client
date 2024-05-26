package net.runelite.rs.api;

import net.runelite.api.Projection;
import net.runelite.api.Renderable;
import net.runelite.mapping.Import;

public interface RSProjection extends Projection
{
	//float[] project(int x, int y, int z);

	@Import("draw")
	@Override
	void draw(Renderable var1, int orientation, int x, int y, int z, long hash);
}
