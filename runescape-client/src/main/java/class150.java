import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public abstract class class150 extends Node {
	@ObfuscatedName("ez")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = 107343017
	)
	static int field1701;

	class150() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	abstract void vmethod3822(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	abstract void vmethod3821(ClanSettings var1);

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIIII)V",
		garbageValue = "229971609"
	)
	@Export("worldToScreen")
	static void worldToScreen(WorldView var0, int var1, int var2, int var3, int var4, int var5) {
		if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
			int var6 = ScriptFrame.getTileHeight(var0, var3, var4, var0.plane) - var5;
			var1 -= AsyncHttpResponse.cameraX;
			var6 -= FloorOverlayDefinition.cameraY;
			var2 -= PlayerType.cameraZ;
			int var7 = Rasterizer3D.Rasterizer3D_sine[class323.cameraPitch];
			int var8 = Rasterizer3D.Rasterizer3D_cosine[class323.cameraPitch];
			int var9 = Rasterizer3D.Rasterizer3D_sine[class390.cameraYaw];
			int var10 = Rasterizer3D.Rasterizer3D_cosine[class390.cameraYaw];
			int var11 = var9 * var2 + var10 * var1 >> 16;
			var2 = var10 * var2 - var9 * var1 >> 16;
			var1 = var11;
			var11 = var8 * var6 - var7 * var2 >> 16;
			var2 = var8 * var2 + var6 * var7 >> 16;
			if (var2 >= 50) {
				Client.viewportTempX = Client.viewportWidth / 2 + Client.viewportZoom * var1 / var2;
				Client.viewportTempY = Client.viewportHeight / 2 + var11 * Client.viewportZoom / var2;
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
