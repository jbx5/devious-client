import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vy")
public class class563 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -56042371
	)
	int field5469;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -474419009
	)
	int field5478;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1299554851
	)
	int field5471;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1870799425
	)
	int field5472;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 203814195
	)
	int field5476;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -795160307
	)
	int field5474;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 500348423
	)
	int field5475;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1784964957
	)
	int field5479;
	@ObfuscatedName("ao")
	boolean field5470;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1818663149
	)
	int field5477;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -143017937
	)
	int field5473;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1357965749
	)
	int field5480;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -531279993
	)
	int field5481;

	public class563() {
		this.field5475 = 0;
		this.field5479 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-2120480973"
	)
	public void method10253(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5469 = var1;
		this.field5478 = var2;
		this.field5471 = var3;
		this.field5472 = var4;
		this.field5476 = var5;
		this.field5474 = var6;
		this.field5475 = var7;
		this.field5479 = var8;
		this.field5470 = var9;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1677212845"
	)
	public void method10246(int var1, int var2, int var3, int var4) {
		this.field5477 = var1;
		this.field5473 = var2;
		this.field5480 = var3;
		this.field5481 = var4;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqb;B)V",
		garbageValue = "119"
	)
	public void method10248(class431 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5472, (int)((float)var3 * 0.9F));
			int var5 = var1.method8027(this.field5471);
			int var6 = var1.method8028(this.field5472);
			int var7 = var5 + (this.field5469 - this.field5476);
			int var8 = var3 + var6 + (this.field5478 - this.field5474);
			Rasterizer2D.Rasterizer2D_setClip(this.field5469, this.field5478, this.field5469 + this.field5471, this.field5478 + this.field5472);
			int var9 = this.field5479;
			int var10 = this.field5475;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class435 var21 = var1.method8008(0, var9);
			class435 var12 = var1.method8008(var9, var10);
			class435 var13 = var1.method8008(var10, var1.method8050());
			class435 var14 = var1.method8008(0, this.field5475);
			int var16;
			int var18;
			if (!var12.method8242()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method8243(); ++var16) {
					class433 var23 = var12.method8247(var16);
					var18 = var7 + var23.field4750;
					int var19 = var2.charWidth(var23.field4749);
					int var20 = var8 + var23.field4751 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5481);
				}
			}

			if (!var21.method8242()) {
				var2.method8145(var21, var7, var8, this.field5477, this.field5473, -1);
			}

			if (!var12.method8242()) {
				var2.method8145(var12, var7, var8, this.field5480, this.field5473, -1);
			}

			if (!var13.method8242()) {
				var2.method8145(var13, var7, var8, this.field5477, this.field5473, -1);
			}

			if (this.field5470) {
				class516 var22 = var14.method8246();
				var16 = var7 + (Integer)var22.field5199;
				int var17 = var8 + (Integer)var22.field5198;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5477);
				if (this.field5473 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5473);
				}
			}

		}
	}
}
