import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
public enum class82 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	field1062(0, -1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	field1068(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	field1069(2, 7),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	field1064(3, 8),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lct;"
	)
	field1065(4, 9);

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 329325289
	)
	final int field1066;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1713247665
	)
	final int field1067;

	class82(int var3, int var4) {
		this.field1066 = var3;
		this.field1067 = var4; // L: 21
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1067; // L: 26
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lnn;",
		garbageValue = "15"
	)
	public static class388 method2262() {
		synchronized(class388.field4429) { // L: 28
			if (class388.field4434 == 0) { // L: 29
				return new class388();
			} else {
				class388.field4429[--class388.field4434].method7157(); // L: 31
				return class388.field4429[class388.field4434]; // L: 32
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "75865369"
	)
	public static double[] method2261(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1; // L: 17
		double[] var6 = new double[var5]; // L: 18
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = BoundaryObject.method4649((double)var7, var0, var2); // L: 20
			++var7; // L: 19
		}

		return var6; // L: 22
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "-120"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) { // L: 5234
			int var3 = class120.getTileHeight(var0, var1, Tiles.Client_plane) - var2; // L: 5239
			var0 -= TaskHandler.cameraX; // L: 5240
			var3 -= SecureRandomFuture.cameraY; // L: 5241
			var1 -= ApproximateRouteStrategy.cameraZ; // L: 5242
			int var4 = Rasterizer3D.Rasterizer3D_sine[class163.cameraPitch]; // L: 5243
			int var5 = Rasterizer3D.Rasterizer3D_cosine[class163.cameraPitch]; // L: 5244
			int var6 = Rasterizer3D.Rasterizer3D_sine[class10.cameraYaw]; // L: 5245
			int var7 = Rasterizer3D.Rasterizer3D_cosine[class10.cameraYaw]; // L: 5246
			int var8 = var6 * var1 + var0 * var7 >> 16; // L: 5247
			var1 = var7 * var1 - var0 * var6 >> 16; // L: 5248
			var0 = var8; // L: 5249
			var8 = var5 * var3 - var4 * var1 >> 16; // L: 5250
			var1 = var5 * var1 + var3 * var4 >> 16; // L: 5251
			if (var1 >= 50) { // L: 5253
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2; // L: 5254
				Client.viewportTempY = var8 * Client.viewportZoom / var1 + Client.viewportHeight / 2; // L: 5255
			} else {
				Client.viewportTempX = -1; // L: 5258
				Client.viewportTempY = -1; // L: 5259
			}

		} else {
			Client.viewportTempX = -1; // L: 5235
			Client.viewportTempY = -1; // L: 5236
		}
	} // L: 5237 5261
}
