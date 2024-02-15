import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
public final class class409 {
	@ObfuscatedName("aq")
	final Object field4554;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1292696109
	)
	int field4553;

	class409(Object var1, int var2) {
		this.field4554 = var1;
		this.field4553 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "10"
	)
	public static int method7645(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1151377722"
	)
	public static int method7646(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5200[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
