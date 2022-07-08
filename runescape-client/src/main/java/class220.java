import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ha")
public class class220 {
	@ObfuscatedName("cm")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1440657841")
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;
		try {
			var0 = class67.getPreferencesFile("", class285.field3313.name, true);
			Buffer var1 = class19.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}
		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "1567739451")
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = SceneTilePaint.getTileHeight(var0, var1, PacketWriter.Client_plane) - var2;
			var0 -= class18.cameraX;
			var3 -= class16.cameraY;
			var1 -= class228.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[ViewportMouse.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[ViewportMouse.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[SoundCache.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[SoundCache.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var5 * var1 + var4 * var3 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}
		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}