import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("go")
public class class193 {
	@ObfuscatedName("q")
	@Export("directions")
	public static int[][] directions;

	@ObfuscatedName("f")
	@Export("distances")
	public static int[][] distances;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1258310083)
	public static int field2219;

	@ObfuscatedName("w")
	@Export("bufferX")
	public static int[] bufferX;

	@ObfuscatedName("y")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128];
		distances = new int[128][128];
		bufferX = new int[4096];
		bufferY = new int[4096];
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(descriptor = "(IIIIIIIII)V", garbageValue = "628542116")
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (WorldMapSection2.loadInterface(var0)) {
			class12.field62 = null;
			class14.drawInterface(SoundCache.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class12.field62 != null) {
				class14.drawInterface(class12.field62, -1412584499, var1, var2, var3, var4, UserComparator5.field1389, SecureRandomFuture.field960, var7);
				class12.field62 = null;
			}
		} else if (var7 != -1) {
			Client.field703[var7] = true;
		} else {
			for (int var8 = 0; var8 < 100; ++var8) {
				Client.field703[var8] = true;
			}
		}
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "98")
	static final int method3919() {
		float var0 = 200.0F * (((float) (class19.clientPreferences.method2254())) - 0.5F);
		return 100 - Math.round(var0);
	}
}