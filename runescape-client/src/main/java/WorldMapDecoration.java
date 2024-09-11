import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1977807551
	)
	public static int field3214;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1585924473
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 909933211
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 428020261
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqo;FFFB)F",
		garbageValue = "54"
	)
	static float method6189(class429 var0, float var1, float var2, float var3) {
		float var4 = class388.method7523(var0.field4755, var0.field4754, var1);
		if (Math.abs(var4) < class133.field1561) {
			return var1;
		} else {
			float var5 = class388.method7523(var0.field4755, var0.field4754, var2);
			if (Math.abs(var5) < class133.field1561) {
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

					float var16 = class133.field1565 * Math.abs(var2) + var3 * 0.5F;
					float var17 = 0.5F * (var6 - var2);
					boolean var18 = Math.abs(var17) > var16 && 0.0F != var5;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var6 == var1) {
								var9 = var12 * 2.0F * var17;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = var12 * (2.0F * var17 * var10 * (var10 - var11) - (var11 - 1.0F) * (var2 - var1));
								var10 = (var10 - 1.0F) * (var11 - 1.0F) * (var12 - 1.0F);
							}

							if ((double)var9 > 0.0D) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < var10 * var17 * 3.0F - Math.abs(var16 * var10) && var9 < Math.abs(0.5F * var12 * var10)) {
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
						} else if ((double)var17 > 0.0D) {
							var2 += var16;
						} else {
							var2 -= var16;
						}

						var5 = class388.method7523(var0.field4755, var0.field4754, var2);
						if ((double)(var5 * (var13 / Math.abs(var13))) > 0.0D) {
							var14 = true;
							var15 = true;
						} else {
							var15 = true;
						}
					}
				} while(var15);

				return var2;
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-535100221"
	)
	static int method6190(int var0, Script var1, boolean var2) {
		return 2;
	}
}
