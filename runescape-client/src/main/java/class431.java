import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class431 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2118328581
	)
	static int field4647;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BI)[I",
		garbageValue = "1422300255"
	)
	public static int[] method8065(byte[] var0) {
		if (var0 != null && var0.length != 0 && var0.length <= 8) {
			int[] var1 = new int[var0.length];

			for (int var2 = 0; var2 < var0.length; ++var2) {
				if (var0[var2] < 0 || var0[var2] > class554.field5330.length) {
					return null;
				}

				var1[var2] = class554.field5330[var0[var2]];
			}

			return var1;
		} else {
			return null;
		}
	}
}
