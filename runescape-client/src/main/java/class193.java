import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hv")
public class class193 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	static Bounds field2035;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[Ljb;",
		garbageValue = "92"
	)
	public static class238[] method3759() {
		return new class238[]{class238.field2511, class238.field2520, class238.field2513, class238.field2519, class238.field2509, class238.field2507, class238.field2512, class238.field2516, class238.field2510};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1190585246"
	)
	public static int method3757(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-185854113"
	)
	static void method3758(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = var4 * 3 + 600;
			int var7 = Rasterizer3D.Rasterizer3D_sine[var4];
			int var9 = var1 - 334;
			if (var9 < 0) {
				var9 = 0;
			} else if (var9 > 100) {
				var9 = 100;
			}

			int var10 = (Client.zoomWidth - Client.zoomHeight) * var9 / 100 + Client.zoomHeight;
			int var8 = var5 * var10 / 256;
			var2[var3] = var8 * var7 >> 16;
		}

		class511.topLevelWorldView.scene.method5464(var2, 500, 800, var0 * 334 / var1, 334);
	}
}
