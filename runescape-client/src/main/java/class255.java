import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public class class255 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lkg;",
		garbageValue = "-1670768252"
	)
	public static class270 method5031(int var0, int var1) {
		int var2 = var0 - var1 & 2047;
		class275 var3 = class275.field2997;
		if (var2 > 1024) {
			var2 = 2048 - var2;
			var3 = class275.field2999;
		}

		return new class270(var3, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "360935784"
	)
	static int method5032() {
		return Login.loginIndex;
	}
}
