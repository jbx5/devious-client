import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ve")
public class class566 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1502640779
	)
	int field5504;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2084364727
	)
	int field5513;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 634251011
	)
	int field5506;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -485683097
	)
	int field5507;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2013288141
	)
	int field5508;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1291304991
	)
	int field5509;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -74061101
	)
	int field5510;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 34201323
	)
	int field5503;
	@ObfuscatedName("ad")
	boolean field5512;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -148217761
	)
	int field5516;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1282728313
	)
	int field5514;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1053260979
	)
	int field5515;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1951238575
	)
	int field5511;

	public class566() {
		this.field5510 = 0;
		this.field5503 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZB)V",
		garbageValue = "0"
	)
	public void method10240(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5504 = var1;
		this.field5513 = var2;
		this.field5506 = var3;
		this.field5507 = var4;
		this.field5508 = var5;
		this.field5509 = var6;
		this.field5510 = var7;
		this.field5503 = var8;
		this.field5512 = var9;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "60196699"
	)
	public void method10241(int var1, int var2, int var3, int var4) {
		this.field5516 = var1;
		this.field5514 = var2;
		this.field5515 = var3;
		this.field5511 = var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqd;Lqe;I)V",
		garbageValue = "132450332"
	)
	public void method10245(class433 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5507, (int)(0.9F * (float)var3));
			int var5 = var1.method8085(this.field5506);
			int var6 = var1.method8069(this.field5507);
			int var7 = var5 + (this.field5504 - this.field5508);
			int var8 = var3 + var6 + (this.field5513 - this.field5509);
			Rasterizer2D.Rasterizer2D_setClip(this.field5504, this.field5513, this.field5504 + this.field5506, this.field5513 + this.field5507);
			int var9 = this.field5503;
			int var10 = this.field5510;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class437 var21 = var1.method8099(0, var9);
			class437 var12 = var1.method8099(var9, var10);
			class437 var13 = var1.method8099(var10, var1.method8021());
			class437 var14 = var1.method8099(0, this.field5510);
			int var16;
			int var18;
			if (!var12.method8289()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method8270(); ++var16) {
					class435 var23 = var12.method8274(var16);
					var18 = var7 + var23.field4744;
					int var19 = var2.charWidth(var23.field4747);
					int var20 = var8 + var23.field4746 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5511);
				}
			}

			if (!var21.method8289()) {
				var2.method8168(var21, var7, var8, this.field5516, this.field5514, -1);
			}

			if (!var12.method8289()) {
				var2.method8168(var12, var7, var8, this.field5515, this.field5514, -1);
			}

			if (!var13.method8289()) {
				var2.method8168(var13, var7, var8, this.field5516, this.field5514, -1);
			}

			if (this.field5512) {
				class518 var22 = var14.method8269();
				var16 = var7 + (Integer)var22.field5229;
				int var17 = var8 + (Integer)var22.field5227;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5516);
				if (this.field5514 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5514);
				}
			}

		}
	}
}
