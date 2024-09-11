import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public class class568 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1383250239
	)
	int field5534;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -704407873
	)
	int field5535;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -596378469
	)
	int field5545;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1351964881
	)
	int field5537;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1801144913
	)
	int field5538;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1682223287
	)
	int field5539;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 443754039
	)
	int field5540;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1782625587
	)
	int field5533;
	@ObfuscatedName("ar")
	boolean field5542;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1499645627
	)
	int field5541;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -253080365
	)
	int field5544;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 122533881
	)
	int field5543;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1463112779
	)
	int field5546;

	public class568() {
		this.field5540 = 0;
		this.field5533 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "-861775788"
	)
	public void method10525(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5534 = var1;
		this.field5535 = var2;
		this.field5545 = var3;
		this.field5537 = var4;
		this.field5538 = var5;
		this.field5539 = var6;
		this.field5540 = var7;
		this.field5533 = var8;
		this.field5542 = var9;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-32"
	)
	public void method10526(int var1, int var2, int var3, int var4) {
		this.field5541 = var1;
		this.field5544 = var2;
		this.field5543 = var3;
		this.field5546 = var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lqn;Lqu;B)V",
		garbageValue = "-27"
	)
	public void method10527(class435 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5537, (int)((float)var3 * 0.9F));
			int var5 = var1.method8310(this.field5545);
			int var6 = var1.method8311(this.field5537);
			int var7 = var5 + (this.field5534 - this.field5538);
			int var8 = var6 + var3 + (this.field5535 - this.field5539);
			Rasterizer2D.Rasterizer2D_setClip(this.field5534, this.field5535, this.field5534 + this.field5545, this.field5537 + this.field5535);
			int var9 = this.field5533;
			int var10 = this.field5540;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class439 var21 = var1.method8291(0, var9);
			class439 var12 = var1.method8291(var9, var10);
			class439 var13 = var1.method8291(var10, var1.method8345());
			class439 var14 = var1.method8291(0, this.field5540);
			int var16;
			int var18;
			if (!var12.method8549()) {
				int var15 = var2.maxAscent + var2.maxDescent;

				for (var16 = 0; var16 < var12.method8563(); ++var16) {
					class437 var23 = var12.method8548(var16);
					var18 = var7 + var23.field4793;
					int var19 = var2.charWidth(var23.field4794);
					int var20 = var8 + var23.field4795 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5546);
				}
			}

			if (!var21.method8549()) {
				var2.method8422(var21, var7, var8, this.field5541, this.field5544, -1);
			}

			if (!var12.method8549()) {
				var2.method8422(var12, var7, var8, this.field5543, this.field5544, -1);
			}

			if (!var13.method8549()) {
				var2.method8422(var13, var7, var8, this.field5541, this.field5544, -1);
			}

			if (this.field5542) {
				class520 var22 = var14.method8552();
				var16 = var7 + (Integer)var22.field5264;
				int var17 = var8 + (Integer)var22.field5265;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5541);
				if (this.field5544 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5544);
				}
			}

		}
	}
}
