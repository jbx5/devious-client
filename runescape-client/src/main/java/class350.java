import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class350 {
	static {
		int var0 = 0;
		int var1 = 0;
		class345[] var2 = class466.method8362();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class345 var4 = var2[var3];
			if (var4.field3877 > var0) {
				var0 = var4.field3877;
			}

			if (var4.field3876 > var1) {
				var1 = var4.field3876;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1513335843"
	)
	public static int method6620(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
