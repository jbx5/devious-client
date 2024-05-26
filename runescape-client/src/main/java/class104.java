import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class104 {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive13")
	static Archive archive13;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lvh;",
		garbageValue = "-2117418260"
	)
	public static PrivateChatMode method2727(int var0) {
		PrivateChatMode[] var1 = FloorUnderlayDefinition.method4062();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field5482) {
				return var3;
			}
		}

		return null;
	}
}
