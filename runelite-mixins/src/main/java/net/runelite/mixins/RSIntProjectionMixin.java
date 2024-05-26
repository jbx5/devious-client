package net.runelite.mixins;

import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSIntProjection;

@Mixin(RSIntProjection.class)
public abstract class RSIntProjectionMixin implements RSIntProjection
{
	@Shadow("client")
	private static RSClient client;

	/*@Copy("drawTileOverlay")
	@Replace("drawTileOverlay")
	public void copy$drawTileOverlay(RSScene scene, SceneTileModel tile, int tileX, int tileY)
	{
		Tile rsTile = scene.getTiles()[client.getPlane()][tileX][tileY];
		final boolean checkClick = scene.isCheckClick();

		if (!client.isGpu())
		{
			copy$drawTileOverlay(scene, tile, tileX, tileY);

			if (scene.getRoofRemovalMode() == 0 || !checkClick || rsTile == null || rsTile.getSceneTileModel() != tile || rsTile.getPhysicalLevel() != scene.getScenePlane())
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
			drawCallbacks.drawSceneTileModel(scene, tile, tileX, tileY);

			if (!checkClick)
			{
				return;
			}

			RSSceneTileModel tileModel = (RSSceneTileModel) tile;

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

			for (int i = 0; i < vertexCount; ++i)
			{
				int vx = vertexX[i] - cameraX2;
				int vy = vertexY[i] - cameraY2;
				int vz = vertexZ[i] - cameraZ2;

				int rotA = vz * getYawSin() + vx * this.getYawCos() >> 16;
				int rotB = vz * getYawCos() - vx * this.getYawSin() >> 16;

				int var13 = vy * getPitchCos() - rotB * this.getPitchSin() >> 16;
				int var12 = vy * getPitchSin() + rotB * getPitchCos() >> 16;
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
						setTargetTile(tileX, tileY);

						if (rsTile != null && tile == rsTile.getSceneTileModel() && mouseX2 >= client.getViewportXOffset() && mouseX2 < client.getViewportXOffset() + client.getViewportWidth() && mouseY2 >= client.getViewportYOffset() && mouseY2 < client.getViewportYOffset() + client.getViewportHeight())
						{
							hoverTile(tileX, tileY, rsTile.getPhysicalLevel());
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
	}*/
}
