import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class356 {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static JagNetThread field3897;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([Lpp;IB)Lpp;",
		garbageValue = "0"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}
}
