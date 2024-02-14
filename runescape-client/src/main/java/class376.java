import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class376 extends DualNode {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field4387;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	Archive field4385;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1831422623
	)
	int field4384;
	@ObfuscatedName("al")
	byte field4386;

	class376() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)Ljava/lang/String;",
		garbageValue = "634448861"
	)
	static String method7101(int var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			if (var2 && var0 >= 0) {
				int var3 = 2;

				for (int var4 = var0 / var1; var4 != 0; ++var3) {
					var4 /= var1;
				}

				char[] var5 = new char[var3];
				var5[0] = '+';

				for (int var6 = var3 - 1; var6 > 0; --var6) {
					int var7 = var0;
					var0 /= var1;
					int var8 = var7 - var0 * var1;
					if (var8 >= 10) {
						var5[var6] = (char)(var8 + 87);
					} else {
						var5[var6] = (char)(var8 + 48);
					}
				}

				return new String(var5);
			} else {
				return Integer.toString(var0, var1);
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
