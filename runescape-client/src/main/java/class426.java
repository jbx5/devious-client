import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class426 {
	@ObfuscatedName("aq")
	float[] field4722;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1741438289
	)
	int field4723;

	class426(float[] var1, int var2) {
		this.field4722 = var1;
		this.field4723 = var2;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIII)V",
		garbageValue = "-1866067100"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = class169.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= class47.cameraX;
			var6 -= class328.cameraY;
			var2 -= class60.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[Language.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[Language.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[class337.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class337.cameraYaw];
			int var11 = var9 * var2 + var10 * var1 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var8 * var6 - var7 * var2 >> 16;
			var2 = var8 * var2 + var6 * var7 >> 16;
			if (var2 >= 50) {
				Client.viewportTempY = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
			} else {
				Client.viewportTempY = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempY = -1;
			Client.viewportTempY = -1;
		}
	}
}
