import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class290 {
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Float;Ljava/lang/Float;B)V", garbageValue = 
	"-14")

	static void method5558(Float var0, Float var1) {
		var1 = 1.0F - var1;
		if (var0 < 0.0F) {
			var0 = 0.0F;
		}

		if (var1 < 0.0F) {
			var1 = 0.0F;
		}

		if ((var0 > 1.0F) || (var1 > 1.0F)) {
			float var2 = ((float) ((((double) (var0 * ((var0 - 2.0F) + var1))) + (((double) (var1)) * (((double) (var1)) - 2.0))) + 1.0));
			if ((class114.field1382 + var2) > 0.0F) {
				Float var4;
				if ((var0 + class114.field1382) < 1.3333334F) {
					float var5 = var0 - 2.0F;
					float var6 = var0 - 1.0F;
					float var7 = ((float) (Math.sqrt(((double) ((var5 * var5) - ((var6 * 4.0F) * var6))))));
					float var8 = (var7 + (-var5)) * 0.5F;
					if ((var1 + class114.field1382) > var8) {
						var4 = var8 - class114.field1382;
					} else {
						var8 = ((-var5) - var7) * 0.5F;
						if (var1 < (var8 + class114.field1382)) {
							var4 = var8 + class114.field1382;
						}
					}
				} else {
					Float var3 = 1.3333334F - class114.field1382;
					var4 = 0.33333334F - class114.field1382;
				}
			}
		}

		var1 = 1.0F - var1;
	}
}