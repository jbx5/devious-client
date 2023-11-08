import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class174 extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("archive7")
	static EvictingDualNodeHashTable archive7;
	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "Lcb;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		archive7 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1688673442"
	)
	public static int method3539(int var0) {
		return class476.field4817[var0 & 16383];
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "-2127919093"
	)
	public static int method3540(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5138[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
