import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gt")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 420323745)
	@Export("minTileX")
	int minTileX;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 664232373)
	@Export("maxTileX")
	int maxTileX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1752935515)
	@Export("minTileY")
	int minTileY;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1056536929)
	@Export("maxTileY")
	int maxTileY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 571087511)
	@Export("type")
	int type;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 406575443)
	@Export("minX")
	int minX;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1576796185)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1314559405)
	@Export("minZ")
	int minZ;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 2128416579)
	@Export("maxZ")
	int maxZ;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1717210177)
	@Export("minY")
	int minY;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -492747543)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1212775709)
	int field2470;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 2080254021)
	int field2471;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1185688463)
	int field2472;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -333239733)
	int field2473;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1901247891)
	int field2474;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 1422842103)
	int field2477;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 205898589)
	int field2461;

	Occluder() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(DDIB)[D", garbageValue = "0")
	public static double[] method4235(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;
		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = (((double) (var7)) - var0) / var2;
			double var13 = Math.exp(-var15 * var15 / 2.0) / Math.sqrt(6.283185307179586);
			double var11 = var13 / var2;
			var6[var8] = var11;
			++var7;
		}
		return var6;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1428269525")
	public static int method4236(int var0) {
		return FileSystem.method3214(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-27")
	public static void method4237() {
		DbTableType.DBTableType_cache.clear();
	}
}