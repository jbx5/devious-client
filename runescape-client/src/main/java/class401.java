import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("ov")
public class class401 {
	@ObfuscatedName("j")
	static final int[] field4442;

	@ObfuscatedName("e")
	static final int[] field4443;

	static {
		field4442 = new int[16384];
		field4443 = new int[16384];
		double var0 = 3.834951969714103E-4;
		for (int var2 = 0; var2 < 16384; ++var2) {
			field4442[var2] = ((int) (16384.0 * Math.sin(var0 * ((double) (var2)))));
			field4443[var2] = ((int) (16384.0 * Math.cos(((double) (var2)) * var0)));
		}
	}
}