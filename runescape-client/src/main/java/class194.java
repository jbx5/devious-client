import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class194 {
	@ObfuscatedName("f")
	@Export("directions")
	public static int[][] directions;
	@ObfuscatedName("n")
	@Export("distances")
	public static int[][] distances;
	@ObfuscatedName("q")
	@Export("bufferX")
	public static int[] bufferX;
	@ObfuscatedName("m")
	@Export("bufferY")
	public static int[] bufferY;

	static {
		directions = new int[128][128]; // L: 6
		distances = new int[128][128]; // L: 7
		bufferX = new int[4096]; // L: 11
		bufferY = new int[4096]; // L: 12
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-700810193"
	)
	static int method4038(int var0, Script var1, boolean var2) {
		return 2; // L: 4447
	}
}
