import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("tm")
public class class498 {
	@ObfuscatedName("as")
	static final int[] field5050;
	@ObfuscatedName("aw")
	static final int[] field5051;
	@ObfuscatedName("gp")
	@Export("worldHost")
	static String worldHost;

	static {
		field5050 = new int[2048];
		field5051 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field5050[var2] = (int)(65536.0D * Math.sin((double)var2 * var0));
			field5051[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}
}
