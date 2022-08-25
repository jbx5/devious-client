import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("oi")
public class class402 {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(intValue = 289607871)
	static int field4448;

	@ObfuscatedName("c")
	static final int[] field4444 = new int[16384];

	@ObfuscatedName("q")
	static final int[] field4447 = new int[16384];

	static {
		double var0 = 3.834951969714103E-4;
		for (int var2 = 0; var2 < 16384; ++var2) {
			field4444[var2] = ((int) (16384.0 * Math.sin(((double) (var2)) * var0)));
			field4447[var2] = ((int) (16384.0 * Math.cos(var0 * ((double) (var2)))));
		}
	}
}