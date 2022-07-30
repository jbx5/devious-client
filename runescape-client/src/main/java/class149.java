import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ee")
public class class149 {
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("musicTrackArchive")
	public static AbstractArchive musicTrackArchive;

	@ObfuscatedName("hi")
	@ObfuscatedSignature(descriptor = "Lmx;")
	@Export("fontPlain12")
	static Font fontPlain12;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(DDII)[D", garbageValue = "-1336273469")
	public static double[] method3135(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;
		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = Varps.method5536(((double) (var7)), var0, var2);
			++var7;
		}
		return var6;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Loo;FFFI)F", garbageValue = "146848499")
	static float method3136(class390 var0, float var1, float var2, float var3) {
		float var4 = class273.method5265(var0.field4424, var0.field4426, var1);
		if (Math.abs(var4) < class114.field1399) {
			return var1;
		} else {
			float var5 = class273.method5265(var0.field4424, var0.field4426, var2);
			if (Math.abs(var5) < class114.field1399) {
				return var2;
			} else {
				float var6 = 0.0F;
				float var7 = 0.0F;
				float var8 = 0.0F;
				float var13 = 0.0F;
				boolean var14 = true;
				boolean var15 = false;
				do {
					var15 = false;
					if (var14) {
						var6 = var1;
						var13 = var4;
						var7 = var2 - var1;
						var8 = var7;
						var14 = false;
					}
					if (Math.abs(var13) < Math.abs(var5)) {
						var1 = var2;
						var2 = var6;
						var6 = var1;
						var4 = var5;
						var5 = var13;
						var13 = var4;
					}
					float var16 = class114.field1401 * Math.abs(var2) + var3 * 0.5F;
					float var17 = (var6 - var2) * 0.5F;
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
					if (var18) {
						if (!(Math.abs(var8) < var16) && !(Math.abs(var4) <= Math.abs(var5))) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = 2.0F * var17 * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1)) * var12;
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}
							if (((double) (var9)) > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}
							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < var17 * 3.0F * var10 - Math.abs(var10 * var16) && var9 < Math.abs(var10 * 0.5F * var12)) {
								var7 = var9 / var10;
							} else {
								var7 = var17;
								var8 = var17;
							}
						} else {
							var7 = var17;
							var8 = var17;
						}
						var1 = var2;
						var4 = var5;
						if (Math.abs(var7) > var16) {
							var2 += var7;
						} else if (((double) (var17)) > 0.0) {
							var2 += var16;
						} else {
							var2 -= var16;
						}
						var5 = class273.method5265(var0.field4424, var0.field4426, var2);
						if (((double) (var5 * (var13 / Math.abs(var13)))) > 0.0) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while (var15 );
				return var2;
			}
		}
	}
}