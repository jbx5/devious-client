import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("jq")
public class class270 {
	@ObfuscatedName("uz")
	@ObfuscatedGetter(longValue = 7367865405897213441L)
	static long field3177;

	@ObfuscatedName("c")
	static int[] field3179;

	static {
		new Object();
		field3179 = new int[33];
		field3179[0] = 0;
		int var0 = 2;
		for (int var1 = 1; var1 < 33; ++var1) {
			field3179[var1] = var0 - 1;
			var0 += var0;
		}
	}
}