import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
public class class552 {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1732648451
	)
	int field5358;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 157066741
	)
	int field5359;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 986573419
	)
	int field5360;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 546767775
	)
	int field5366;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -997731419
	)
	int field5365;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -963426569
	)
	int field5357;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1937689463
	)
	int field5364;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2113199757
	)
	int field5370;
	@ObfuscatedName("al")
	boolean field5363;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 572467897
	)
	int field5367;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -677739811
	)
	int field5368;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 179988305
	)
	int field5369;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 162745567
	)
	int field5361;

	public class552() {
		this.field5364 = 0;
		this.field5370 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1748951487"
	)
	public void method9871(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5358 = var1;
		this.field5359 = var2;
		this.field5360 = var3;
		this.field5366 = var4;
		this.field5365 = var5;
		this.field5357 = var6;
		this.field5364 = var7;
		this.field5370 = var8;
		this.field5363 = var9;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "84"
	)
	public void method9872(int var1, int var2, int var3, int var4) {
		this.field5367 = var1;
		this.field5368 = var2;
		this.field5369 = var3;
		this.field5361 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpl;Lpx;I)V",
		garbageValue = "84496727"
	)
	public void method9873(class414 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5366, (int)((float)var3 * 0.9F));
			int var5 = var1.method7549(this.field5360);
			int var6 = var1.method7542(this.field5366);
			int var7 = var5 + (this.field5358 - this.field5365);
			int var8 = var3 + var6 + (this.field5359 - this.field5357);
			Rasterizer2D.Rasterizer2D_setClip(this.field5358, this.field5359, this.field5358 + this.field5360, this.field5359 + this.field5366);
			int var9 = this.field5370;
			int var10 = this.field5364;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class418 var21 = var1.method7522(0, var9);
			class418 var12 = var1.method7522(var9, var10);
			class418 var13 = var1.method7522(var10, var1.method7513());
			class418 var14 = var1.method7522(0, this.field5364);
			int var16;
			int var18;
			if (!var12.method7783()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method7766(); ++var16) {
					class416 var23 = var12.method7762(var16);
					var18 = var7 + var23.field4606;
					int var19 = var2.charWidth(var23.field4607);
					int var20 = var8 + var23.field4605 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5361);
				}
			}

			if (!var21.method7783()) {
				var2.method7700(var21, var7, var8, this.field5367, this.field5368, -1);
			}

			if (!var12.method7783()) {
				var2.method7700(var12, var7, var8, this.field5369, this.field5368, -1);
			}

			if (!var13.method7783()) {
				var2.method7700(var13, var7, var8, this.field5367, this.field5368, -1);
			}

			if (this.field5363) {
				class505 var22 = var14.method7768();
				var16 = var7 + (Integer)var22.field5090;
				int var17 = var8 + (Integer)var22.field5089;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5367);
				if (this.field5368 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5368);
				}
			}

		}
	}
}
