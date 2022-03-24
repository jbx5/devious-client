import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public class class400 {
	@ObfuscatedName("l")
	static final int[] field4390;
	@ObfuscatedName("n")
	static final int[] field4389;
	static 
	{
		field4390 = new int[16384];
		field4389 = new int[16384];
		double var0 = 3.834951969714103E-4;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4390[var2] = ((int) (16384.0 * Math.sin(((double) (var2)) * var0)));
			field4389[var2] = ((int) (16384.0 * Math.cos(var0 * ((double) (var2)))));
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;I[B[BI)V", garbageValue = 
	"-785240877")

	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3422 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3422 = new byte[11][];
			var0.field3423 = new byte[11][];
			var0.field3424 = new int[11];
			var0.field3425 = new int[11];
		}

		var0.field3422[var1] = var2;
		if (var2 != null) {
			var0.field3432 = true;
		} else {
			var0.field3432 = false;

			for (int var4 = 0; var4 < var0.field3422.length; ++var4) {
				if (var0.field3422[var4] != null) {
					var0.field3432 = true;
					break;
				}
			}
		}

		var0.field3423[var1] = var3;
	}
}