import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wz")
public class class575 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 675060329
	)
	int field5589;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2055151253
	)
	int field5587;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 746127111
	)
	int field5588;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -582280765
	)
	int field5595;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1750032825
	)
	int field5590;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1455420553
	)
	int field5591;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1898538417
	)
	int field5592;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1965287649
	)
	int field5593;
	@ObfuscatedName("at")
	boolean field5594;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 787028893
	)
	int field5596;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1227468795
	)
	int field5585;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -534089617
	)
	int field5597;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1802853985
	)
	int field5598;

	public class575() {
		this.field5592 = 0;
		this.field5593 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-415354608"
	)
	public void method10746(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5589 = var1;
		this.field5587 = var2;
		this.field5588 = var3;
		this.field5595 = var4;
		this.field5590 = var5;
		this.field5591 = var6;
		this.field5592 = var7;
		this.field5593 = var8;
		this.field5594 = var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1274993226"
	)
	public void method10748(int var1, int var2, int var3, int var4) {
		this.field5596 = var1;
		this.field5585 = var2;
		this.field5597 = var3;
		this.field5598 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lql;Lqi;B)V",
		garbageValue = "-8"
	)
	public void method10751(class436 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5595, (int)((float)var3 * 0.9F));
			int var5 = var1.method8442(this.field5588);
			int var6 = var1.method8443(this.field5595);
			int var7 = var5 + (this.field5589 - this.field5590);
			int var8 = var3 + var6 + (this.field5587 - this.field5591);
			Rasterizer2D.Rasterizer2D_setClip(this.field5589, this.field5587, this.field5589 + this.field5588, this.field5587 + this.field5595);
			int var9 = this.field5593;
			int var10 = this.field5592;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class440 var21 = var1.method8423(0, var9);
			class440 var12 = var1.method8423(var9, var10);
			class440 var13 = var1.method8423(var10, var1.method8414());
			class440 var14 = var1.method8423(0, this.field5592);
			int var16;
			int var18;
			if (!var12.method8678()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method8663(); ++var16) {
					class438 var23 = var12.method8667(var16);
					var18 = var7 + var23.field4840;
					int var19 = var2.charWidth(var23.field4839);
					int var20 = var8 + var23.field4841 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5598);
				}
			}

			if (!var21.method8678()) {
				var2.method8572(var21, var7, var8, this.field5596, this.field5585, -1);
			}

			if (!var12.method8678()) {
				var2.method8572(var12, var7, var8, this.field5597, this.field5585, -1);
			}

			if (!var13.method8678()) {
				var2.method8572(var13, var7, var8, this.field5596, this.field5585, -1);
			}

			if (this.field5594) {
				class527 var22 = var14.method8666();
				var16 = var7 + (Integer)var22.field5316;
				int var17 = var8 + (Integer)var22.field5317;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5596);
				if (this.field5585 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5585);
				}
			}

		}
	}
}
