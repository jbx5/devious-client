import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class231 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field1851")
	static EvictingDualNodeHashTable field1851;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "-2050720647"
	)
	static void method4778(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class448.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}
