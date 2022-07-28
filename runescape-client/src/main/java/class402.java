import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("oc")
public class class402 {
	@ObfuscatedName("c")
	static final int[] field4457 = new int[16384];

	@ObfuscatedName("w")
	static final int[] field4458 = new int[16384];

	@ObfuscatedName("fr")
	static String field4461;

	@ObfuscatedName("mm")
	@ObfuscatedGetter(intValue = -552578051)
	@Export("menuWidth")
	static int menuWidth;

	static {
		double var0 = 3.834951969714103E-4;
		for (int var2 = 0; var2 < 16384; ++var2) {
			field4457[var2] = ((int) (16384.0 * Math.sin(((double) (var2)) * var0)));
			field4458[var2] = ((int) (16384.0 * Math.cos(var0 * ((double) (var2)))));
		}
	}
}