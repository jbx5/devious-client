import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vz")
public class class547 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1349877309
	)
	int field5264;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1841245853
	)
	int field5257;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -821107777
	)
	int field5269;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1581863441
	)
	int field5261;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -982399101
	)
	int field5262;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 537521583
	)
	int field5263;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -886515011
	)
	int field5268;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 27615469
	)
	int field5265;
	@ObfuscatedName("av")
	boolean field5266;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1969486397
	)
	int field5259;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 876959897
	)
	int field5260;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1640830113
	)
	int field5258;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -750793119
	)
	int field5270;

	public class547() {
		this.field5268 = 0;
		this.field5265 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-1556835629"
	)
	public void method9826(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5264 = var1;
		this.field5257 = var2;
		this.field5269 = var3;
		this.field5261 = var4;
		this.field5262 = var5;
		this.field5263 = var6;
		this.field5268 = var7;
		this.field5265 = var8;
		this.field5266 = var9;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "826854600"
	)
	public void method9830(int var1, int var2, int var3, int var4) {
		this.field5259 = var1;
		this.field5260 = var2;
		this.field5258 = var3;
		this.field5270 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpp;Lpu;B)V",
		garbageValue = "0"
	)
	public void method9827(class409 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5261, (int)(0.9F * (float)var3));
			int var5 = var1.method7495(this.field5269);
			int var6 = var1.method7595(this.field5261);
			int var7 = var5 + (this.field5264 - this.field5262);
			int var8 = var6 + var3 + (this.field5257 - this.field5263);
			Rasterizer2D.Rasterizer2D_setClip(this.field5264, this.field5257, this.field5269 + this.field5264, this.field5261 + this.field5257);
			int var9 = this.field5265;
			int var10 = this.field5268;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class413 var21 = var1.method7549(0, var9);
			class413 var12 = var1.method7549(var9, var10);
			class413 var13 = var1.method7549(var10, var1.method7467());
			class413 var14 = var1.method7549(0, this.field5268);
			int var16;
			int var18;
			if (!var12.method7707()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method7709(); ++var16) {
					class411 var23 = var12.method7712(var16);
					var18 = var7 + var23.field4524;
					int var19 = var2.charWidth(var23.field4523);
					int var20 = var8 + var23.field4525 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5270);
				}
			}

			if (!var21.method7707()) {
				var2.method7702(var21, var7, var8, this.field5259, this.field5260, -1);
			}

			if (!var12.method7707()) {
				var2.method7702(var12, var7, var8, this.field5258, this.field5260, -1);
			}

			if (!var13.method7707()) {
				var2.method7702(var13, var7, var8, this.field5259, this.field5260, -1);
			}

			if (this.field5266) {
				class500 var22 = var14.method7711();
				var16 = var7 + (Integer)var22.field5003;
				int var17 = var8 + (Integer)var22.field5004;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5259);
				if (this.field5260 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5260);
				}
			}

		}
	}
}
