import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public class class132 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-516096679)

	int field1543;
	@ObfuscatedName("c")
	byte field1544;

	@ObfuscatedSignature(descriptor = 
	"Les;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Les;)V")

	class132(class131 var1) {
		this.this$0 = var1;
		this.field1543 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	void vmethod3168(Buffer var1) {
		this.field1543 = var1.readUnsignedShort();
		this.field1544 = var1.readByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	void vmethod3162(ClanSettings var1) {
		var1.method2964(this.field1543, this.field1544);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([FIFZFZ[FB)I", garbageValue = 
	"0")

	public static int method2888(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < (var1 + 1); ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var24 = ((Math.abs(var2) + Math.abs(var4)) * ((float) (var1 + 1))) * class114.field1382;
		if (var7 <= var24) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < (var1 + 1); ++var10) {
				var9[var10] = (1.0F / var7) * var0[var10];
			}

			while (Math.abs(var9[var1]) < var24) {
				--var1;
			} 

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = (-var9[0]) / var9[1];
				boolean var22 = (var3) ? var2 < (var24 + var6[0]) : var2 < (var6[0] - var24);
				boolean var23 = (var5) ? var4 > (var6[0] - var24) : var4 > (var6[0] + var24);
				var10 = (var22 && var23) ? 1 : 0;
				if (var10 > 0) {
					if (var3 && (var6[0] < var2)) {
						var6[0] = var2;
					} else if (var5 && (var6[0] > var4)) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class389 var11 = new class389(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * ((float) (var13));
				}

				float[] var21 = new float[var1 + 1];
				int var14 = method2888(var12, var1 - 1, var2, false, var4, false, var21);
				if (var14 == (-1)) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = class306.method5786(var9, var1, var2);
							if ((Math.abs(var18) <= var24) && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var14 == var20) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var21[var20];
						}

						var17 = class306.method5786(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var24) {
							if ((var20 != var14) || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (((var18 < 0.0F) && (var17 > 0.0F)) || ((var18 > 0.0F) && (var17 < 0.0F))) {
							var6[var10++] = class154.method3181(var11, var16, var19, 0.0F);
							if ((var10 > 1) && (var6[var10 - 2] >= (var6[var10 - 1] - var24))) {
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}
}