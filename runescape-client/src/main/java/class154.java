import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class154 extends class166 {
	@ObfuscatedName("rl")
	@ObfuscatedSignature(descriptor = 
	"Lex;")

	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("se")
	@ObfuscatedGetter(intValue = 
	1598240235)

	static int field1691;
	@ObfuscatedName("id")
	@ObfuscatedGetter(intValue = 
	71444527)

	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("v")
	String field1688;

	@ObfuscatedSignature(descriptor = 
	"Lev;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lev;Ljava/lang/String;Ljava/lang/String;)V")

	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1688 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1689964957")

	public int vmethod3341() {
		return 1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-1535635597")

	public String vmethod3333() {
		return this.field1688;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lnj;FFFI)F", garbageValue = 
	"-1450671201")

	static float method3181(class389 var0, float var1, float var2, float var3) {
		float var4 = class306.method5786(var0.field4364, var0.field4363, var1);
		if (Math.abs(var4) < class114.field1382) {
			return var1;
		} else {
			float var5 = class306.method5786(var0.field4364, var0.field4363, var2);
			if (Math.abs(var5) < class114.field1382) {
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

					float var16 = (class114.field1380 * Math.abs(var2)) + (0.5F * var3);
					float var17 = 0.5F * (var6 - var2);
					boolean var18 = (Math.abs(var17) > var16) && (var5 != 0.0F);
					if (var18) {
						if ((Math.abs(var8) >= var16) && (Math.abs(var4) > Math.abs(var5))) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var1 == var6) {
								var9 = (var12 * var17) * 2.0F;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = (((((var10 - var11) * 2.0F) * var17) * var10) - ((var11 - 1.0F) * (var2 - var1))) * var12;
								var10 = ((var12 - 1.0F) * (var11 - 1.0F)) * (var10 - 1.0F);
							}

							if (((double) (var9)) > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}

							var12 = var8;
							var8 = var7;
							if (((2.0F * var9) < (((3.0F * var17) * var10) - Math.abs(var16 * var10))) && (var9 < Math.abs((var12 * 0.5F) * var10))) {
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

						var5 = class306.method5786(var0.field4364, var0.field4363, var2);
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