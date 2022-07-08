import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("pe")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lpe;")
	@Export("oldscape")
	public static final LoginType oldscape;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4611;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4615;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4612;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4609;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4614;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4613;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpe;")
	static final LoginType field4617;

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lpe;")
	public static final LoginType field4620;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 217368977)
	final int field4618;

	@ObfuscatedName("s")
	final String field4619;

	static {
		oldscape = new LoginType(7, 0, "", "");
		field4611 = new LoginType(5, 1, "", "");
		field4615 = new LoginType(8, 2, "", "");
		field4612 = new LoginType(0, 3, "", "");
		field4609 = new LoginType(2, 4, "", "");
		field4614 = new LoginType(4, 5, "", "");
		field4613 = new LoginType(6, 6, "", "");
		field4617 = new LoginType(1, 7, "", "");
		field4620 = new LoginType(3, -1, "", "", true, new LoginType[]{ oldscape, field4611, field4615, field4609, field4612 });
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4618 = var1;
		this.field4619 = var4;
	}

	@ObfuscatedSignature(descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lpe;)V")
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4618 = var1;
		this.field4619 = var4;
	}

	public String toString() {
		return this.field4619;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lnk;FFFI)F", garbageValue = "343733515")
	static float method7453(class389 var0, float var1, float var2, float var3) {
		float var4 = FileSystem.method3281(var0.field4415, var0.field4414, var1);
		if (Math.abs(var4) < class114.field1429) {
			return var1;
		} else {
			float var5 = FileSystem.method3281(var0.field4415, var0.field4414, var2);
			if (Math.abs(var5) < class114.field1429) {
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
					float var16 = class114.field1432 * Math.abs(var2) + 0.5F * var3;
					float var17 = 0.5F * (var6 - var2);
					boolean var18 = Math.abs(var17) > var16 && var5 != 0.0F;
					if (var18) {
						if (Math.abs(var8) >= var16 && Math.abs(var4) > Math.abs(var5)) {
							float var12 = var5 / var4;
							float var9;
							float var10;
							if (var6 == var1) {
								var9 = 2.0F * var17 * var12;
								var10 = 1.0F - var12;
							} else {
								var10 = var4 / var13;
								float var11 = var5 / var13;
								var9 = ((var10 - var11) * 2.0F * var17 * var10 - (var2 - var1) * (var11 - 1.0F)) * var12;
								var10 = (var12 - 1.0F) * (var10 - 1.0F) * (var11 - 1.0F);
							}
							if (((double) (var9)) > 0.0) {
								var10 = -var10;
							} else {
								var9 = -var9;
							}
							var12 = var8;
							var8 = var7;
							if (2.0F * var9 < var10 * 3.0F * var17 - Math.abs(var16 * var10) && var9 < Math.abs(var10 * var12 * 0.5F)) {
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
						var5 = FileSystem.method3281(var0.field4415, var0.field4414, var2);
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