import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class202 {
	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive19")
	static Archive archive19;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"[Ldq;")

	class115[] field2350;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	166923325)

	int field2352;

	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V")

	class202(Buffer var1, int var2) {
		this.field2350 = new class115[var2];
		this.field2352 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2350.length; ++var3) {
			class115 var4 = new class115(this.field2352, var1, false);
			this.field2350[var3] = var4;
		}

		this.method4115();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"245486778")

	void method4115() {
		class115[] var1 = this.field2350;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class115 var3 = var1[var2];
			if (var3.field1410 >= 0) {
				var3.field1404 = this.field2350[var3.field1410];
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-60")

	public int method4098() {
		return this.field2350.length;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IB)Ldq;", garbageValue = 
	"10")

	class115 method4099(int var1) {
		return this.field2350[var1];
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)[Ldq;", garbageValue = 
	"-796000357")

	class115[] method4100() {
		return this.field2350;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Ldu;IB)V", garbageValue = 
	"-80")

	void method4106(class122 var1, int var2) {
		this.method4116(var1, var2, ((boolean[]) (null)), false);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Ldu;I[ZZI)V", garbageValue = 
	"-1805231033")

	void method4116(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2783();
		int var6 = 0;
		class115[] var7 = this.method4100();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class115 var9 = var7[var8];
			if ((var3 == null) || (var4 == var3[var6])) {
				var1.method2763(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ldi;FZI)F", garbageValue = 
	"-605399100")

	static float method4111(class117 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if ((var0 != null) && (var0.method2706() != 0)) {
			float var4 = ((float) (var0.field1430[0].field1384));
			float var5 = ((float) (var0.field1430[var0.method2706() - 1].field1384));
			float var6 = var5 - var4;
			if (((double) (var6)) == 0.0) {
				return var0.field1430[0].field1385;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				double var8 = ((double) ((int) (var7)));
				float var10 = Math.abs(((float) (((double) (var7)) - var8)));
				float var11 = var6 * var10;
				var8 = Math.abs(var8 + 1.0);
				double var12 = var8 / 2.0;
				double var14 = ((double) ((int) (var12)));
				var10 = ((float) (var12 - var14));
				float var16;
				float var17;
				if (var2) {
					if (var0.field1428 == class116.field1423) {
						if (0.0 != ((double) (var10))) {
							var11 += var4;
						} else {
							var11 = var5 - var11;
						}
					} else if ((var0.field1428 != class116.field1425) && (var0.field1428 != class116.field1421)) {
						if (var0.field1428 == class116.field1419) {
							var11 = var4 - var1;
							var16 = var0.field1430[0].field1386;
							var17 = var0.field1430[0].field1390;
							var3 = var0.field1430[0].field1385;
							if (0.0 != ((double) (var16))) {
								var3 -= (var17 * var11) / var16;
							}

							return var3;
						}
					} else {
						var11 = var5 - var11;
					}
				} else if (var0.field1429 == class116.field1423) {
					if (((double) (var10)) != 0.0) {
						var11 = var5 - var11;
					} else {
						var11 += var4;
					}
				} else if ((var0.field1429 != class116.field1425) && (var0.field1429 != class116.field1421)) {
					if (var0.field1429 == class116.field1419) {
						var11 = var1 - var5;
						var16 = var0.field1430[var0.method2706() - 1].field1388;
						var17 = var0.field1430[var0.method2706() - 1].field1389;
						var3 = var0.field1430[var0.method2706() - 1].field1385;
						if (0.0 != ((double) (var16))) {
							var3 += (var11 * var17) / var16;
						}

						return var3;
					}
				} else {
					var11 += var4;
				}

				var3 = AttackOption.method2392(var0, var11);
				float var18;
				if (var2 && (var0.field1428 == class116.field1421)) {
					var18 = var0.field1430[var0.method2706() - 1].field1385 - var0.field1430[0].field1385;
					var3 = ((float) (((double) (var3)) - (var8 * ((double) (var18)))));
				} else if ((!var2) && (var0.field1429 == class116.field1421)) {
					var18 = var0.field1430[var0.method2706() - 1].field1385 - var0.field1430[0].field1385;
					var3 = ((float) (((double) (var3)) + (((double) (var18)) * var8)));
				}

				return var3;
			}
		} else {
			return var3;
		}
	}
}