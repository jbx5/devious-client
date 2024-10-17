import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class191 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("eu")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	public static int method3984(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(256.0D * var3);
		int var10 = (int)(256.0D * var5);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}
}
