package net.runelite.mixins;

import net.runelite.api.SceneTileModel;
import net.runelite.api.SceneTilePaint;
import net.runelite.api.Tile;
import net.runelite.api.hooks.DrawCallbacks;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIntProjection;
import net.runelite.rs.api.RSScene;
import net.runelite.rs.api.RSSceneTileModel;

@Mixin(RSIntProjection.class)
public abstract class RSIntProjectionMixin implements RSIntProjection
{
	@Shadow("client")
	private static RSClient client;

	@Copy("drawTileUnderlay")
	@Replace("drawTileUnderlay")
	public void copy$drawTileUnderlay(RSScene scene, SceneTilePaint sceneTilePaint, int z, int x, int y)
	{
		byte[][][] tileSettings = client.getTileSettings();
		final boolean checkClick = scene.isCheckClick();

		int tilePlane = z;
		if ((tileSettings[1][x][x] & 2) != 0)
		{
			tilePlane = z - 1;
		}

		if (!client.isGpu())
		{
			try
			{
				copy$drawTileUnderlay(scene, sceneTilePaint, z, x, y);
			}
			catch (Exception ex)
			{
				client.getLogger().warn("error during tile underlay rendering", ex);
			}

			if (scene.getRoofRemovalMode() == 0 || !checkClick || client.getPlane() != tilePlane)
			{
				return;
			}
		}

		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();

		if (drawCallbacks == null)
		{
			return;
		}

		try
		{
			final int[][][] tileHeights = scene.getTileHeights();

			final int cameraX2 = client.getCameraX2();
			final int cameraY2 = client.getCameraY2();
			final int cameraZ2 = client.getCameraZ2();

			final int zoom = client.get3dZoom();
			final int centerX = client.getCenterX();
			final int centerY = client.getCenterY();

			final int mouseX2 = scene.getMouseX2();
			final int mouseY2 = scene.getMouseY2();

			final int yawCos = this.getYawCos();
			final int yawSin = this.getYawSin();
			final int pitchCos = this.getPitchCos();
			final int pitchSin = this.getPitchSin();

			int var9;
			int var10 = var9 = (x << 7) - cameraX2;
			int var11;
			int var12 = var11 = (y << 7) - cameraZ2;
			int var13;
			int var14 = var13 = var10 + 128;
			int var15;
			int var16 = var15 = var12 + 128;
			int var17 = tileHeights[z][x][y] - cameraY2;
			int var18 = tileHeights[z][x + 1][y] - cameraY2;
			int var19 = tileHeights[z][x + 1][y + 1] - cameraY2;
			int var20 = tileHeights[z][x][y + 1] - cameraY2;
			int var21 = var10 * yawCos + yawSin * var12 >> 16;
			var12 = var12 * yawCos - yawSin * var10 >> 16;
			var10 = var21;
			var21 = var17 * pitchCos - pitchSin * var12 >> 16;
			var12 = pitchSin * var17 + var12 * pitchCos >> 16;
			var17 = var21;
			if (var12 >= 50)
			{
				var21 = var14 * yawCos + yawSin * var11 >> 16;
				var11 = var11 * yawCos - yawSin * var14 >> 16;
				var14 = var21;
				var21 = var18 * pitchCos - pitchSin * var11 >> 16;
				var11 = pitchSin * var18 + var11 * pitchCos >> 16;
				var18 = var21;
				if (var11 >= 50)
				{
					var21 = var13 * yawCos + yawSin * var16 >> 16;
					var16 = var16 * yawCos - yawSin * var13 >> 16;
					var13 = var21;
					var21 = var19 * pitchCos - pitchSin * var16 >> 16;
					var16 = pitchSin * var19 + var16 * pitchCos >> 16;
					var19 = var21;
					if (var16 >= 50)
					{
						var21 = var9 * yawCos + yawSin * var15 >> 16;
						var15 = var15 * yawCos - yawSin * var9 >> 16;
						var9 = var21;
						var21 = var20 * pitchCos - pitchSin * var15 >> 16;
						var15 = pitchSin * var20 + var15 * pitchCos >> 16;
						if (var15 >= 50)
						{
							int dy = var10 * zoom / var12 + centerX;
							int dx = var17 * zoom / var12 + centerY;
							int cy = var14 * zoom / var11 + centerX;
							int cx = var18 * zoom / var11 + centerY;
							int ay = var13 * zoom / var16 + centerX;
							int ax = var19 * zoom / var16 + centerY;
							int by = var9 * zoom / var15 + centerX;
							int bx = var21 * zoom / var15 + centerY;

							drawCallbacks.drawScenePaint(scene, sceneTilePaint, z, x, y);

							if ((ay - by) * (cx - bx) - (ax - bx) * (cy - by) > 0)
							{
								if (checkClick && client.containsBounds(mouseX2, mouseY2, ax, bx, cx, ay, by, cy))
								{
									scene.setTargetTile(x, y);

									if (mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
									{
										scene.hoverTile(x, y, tilePlane);
									}
								}
							}

							if ((dy - cy) * (bx - cx) - (dx - cx) * (by - cy) > 0)
							{
								if (checkClick && client.containsBounds(mouseX2, mouseY2, dx, cx, bx, dy, cy, by))
								{
									scene.setTargetTile(x, y);

									if (mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
									{
										scene.hoverTile(x, y, tilePlane);
									}
								}
							}

						}
					}
				}
			}
		}
		catch (Exception ex)
		{
			client.getLogger().warn("error during underlay rendering", ex);
		}
	}

	@Inject
	private static int[] tmpX = new int[6];

	@Inject
	private static int[] tmpY = new int[6];

	@Copy("drawTileOverlay")
	@Replace("drawTileOverlay")
	public void copy$drawTileOverlay(RSScene scene, SceneTileModel sceneTileModel, int tileX, int tileY)
	{
		Tile rsTile = scene.getTiles()[client.getPlane()][tileX][tileY];
		final boolean checkClick = scene.isCheckClick();

		if (!client.isGpu())
		{
			copy$drawTileOverlay(scene, sceneTileModel, tileX, tileY);

			if (scene.getRoofRemovalMode() == 0 || !checkClick || rsTile == null || rsTile.getSceneTileModel() != sceneTileModel || rsTile.getPhysicalLevel() != client.getPlane())
			{
				return;
			}
		}

		final DrawCallbacks drawCallbacks = client.getDrawCallbacks();

		if (drawCallbacks == null)
		{
			return;
		}

		try
		{
			final int cameraX2 = scene.getCameraX2();
			final int cameraY2 = scene.getCameraY2();
			final int cameraZ2 = scene.getCameraZ2();
			final int zoom = client.get3dZoom();
			final int centerX = client.getCenterX();
			final int centerY = client.getCenterY();

			drawCallbacks.drawSceneTileModel(scene, sceneTileModel, tileX, tileY);

			if (!checkClick)
			{
				return;
			}

			RSSceneTileModel tileModel = (RSSceneTileModel) sceneTileModel;

			final int[] faceX = tileModel.getFaceX();
			final int[] faceY = tileModel.getFaceY();
			final int[] faceZ = tileModel.getFaceZ();

			final int[] vertexX = tileModel.getVertexX();
			final int[] vertexY = tileModel.getVertexY();
			final int[] vertexZ = tileModel.getVertexZ();

			final int vertexCount = vertexX.length;
			final int faceCount = faceX.length;

			final int mouseX2 = scene.getMouseX2();
			final int mouseY2 = scene.getMouseY2();

			final int yawCos = this.getYawCos();
			final int yawSin = this.getYawSin();
			final int pitchCos = this.getPitchCos();
			final int pitchSin = this.getPitchSin();

			for (int i = 0; i < vertexCount; ++i)
			{
				int vx = vertexX[i] - cameraX2;
				int vy = vertexY[i] - cameraY2;
				int vz = vertexZ[i] - cameraZ2;

				int rotA = vz * yawSin + vx * yawCos >> 16;
				int rotB = vz * yawCos - vx * yawSin >> 16;

				int var13 = vy * pitchCos - rotB * pitchSin >> 16;
				int var12 = vy * pitchSin + rotB * pitchCos >> 16;
				if (var12 < 50)
				{
					return;
				}

				int ax = rotA * zoom / var12 + centerX;
				int ay = var13 * zoom / var12 + centerY;

				tmpX[i] = ax;
				tmpY[i] = ay;
			}

			for (int i = 0; i < faceCount; ++i)
			{
				int va = faceX[i];
				int vb = faceY[i];
				int vc = faceZ[i];

				int x1 = tmpX[va];
				int x2 = tmpX[vb];
				int x3 = tmpX[vc];

				int y1 = tmpY[va];
				int y2 = tmpY[vb];
				int y3 = tmpY[vc];

				if ((x1 - x2) * (y3 - y2) - (y1 - y2) * (x3 - x2) > 0)
				{
					if (client.containsBounds(mouseX2, mouseY2, y1, y2, y3, x1, x2, x3))
					{
						scene.setTargetTile(tileX, tileY);

						if (rsTile != null && sceneTileModel == rsTile.getSceneTileModel() && mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
						{
							scene.hoverTile(tileX, tileY, rsTile.getPhysicalLevel());
						}
						break;
					}
				}
			}
		}
		catch (Exception ex)
		{
			client.getLogger().warn("error during overlay rendering", ex);
		}
	}
}
