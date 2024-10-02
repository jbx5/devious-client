package net.runelite.mixins;

import net.runelite.api.Scene;
import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFloatProjection;

@Mixin(RSFloatProjection.class)
public abstract class RSFloatProjectionMixin implements RSFloatProjection
{
	@Shadow("client")
	private static RSClient client;

	@MethodHook(value = "drawTileUnderlay", end = true)
	@Inject
	void drawTileUnderlay(Scene scene, SceneTilePaint sceneTilePaint, int z, int x, int y)
	{
		if (client.getDrawCallbacks() != null)
		{
			client.getDrawCallbacks().drawScenePaint(scene, sceneTilePaint, z, x, y);
		}
	}

	@MethodHook(value = "drawTileOverlay", end = true)
	@Inject
	void drawTileOverlay(Scene scene, SceneTileModel sceneTileModel, int x, int z)
	{
		if (client.getDrawCallbacks() != null)
		{
			client.getDrawCallbacks().drawSceneTileModel(scene, sceneTileModel, x, z);
		}
	}

	@Inject
	@Override
	public float[] getProjection()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
