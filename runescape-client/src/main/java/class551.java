import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vc")
public class class551 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1736633797
	)
	int field5328;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 977812117
	)
	int field5327;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 812865587
	)
	int field5337;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1737079551
	)
	int field5330;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1904811141
	)
	int field5326;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -884648851
	)
	int field5331;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -457105599
	)
	int field5332;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1998409377
	)
	int field5333;
	@ObfuscatedName("au")
	boolean field5334;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 226477603
	)
	int field5329;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -127094571
	)
	int field5335;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1517432065
	)
	int field5336;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2069547021
	)
	int field5338;

	public class551() {
		this.field5332 = 0;
		this.field5333 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIZI)V",
		garbageValue = "1917571118"
	)
	public void method10058(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field5328 = var1;
		this.field5327 = var2;
		this.field5337 = var3;
		this.field5330 = var4;
		this.field5326 = var5;
		this.field5331 = var6;
		this.field5332 = var7;
		this.field5333 = var8;
		this.field5334 = var9;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "418202553"
	)
	public void method10059(int var1, int var2, int var3, int var4) {
		this.field5329 = var1;
		this.field5335 = var2;
		this.field5336 = var3;
		this.field5338 = var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpb;S)V",
		garbageValue = "5744"
	)
	public void method10060(class413 var1, Font var2) {
		if (var2 != null) {
			int var3 = var2.ascent;
			int var4 = Math.min(this.field5330, (int)(0.9F * (float)var3));
			int var5 = var1.method7773(this.field5337);
			int var6 = var1.method7786(this.field5330);
			int var7 = var5 + (this.field5328 - this.field5326);
			int var8 = var6 + var3 + (this.field5327 - this.field5331);
			Rasterizer2D.Rasterizer2D_setClip(this.field5328, this.field5327, this.field5337 + this.field5328, this.field5327 + this.field5330);
			int var9 = this.field5333;
			int var10 = this.field5332;
			if (var9 > var10) {
				int var11 = var9;
				var9 = var10;
				var10 = var11;
			}

			class417 var21 = var1.method7707(0, var9);
			class417 var12 = var1.method7707(var9, var10);
			class417 var13 = var1.method7707(var10, var1.method7711());
			class417 var14 = var1.method7707(0, this.field5332);
			int var16;
			int var18;
			if (!var12.method7956()) {
				int var15 = var2.maxDescent + var2.maxAscent;

				for (var16 = 0; var16 < var12.method7957(); ++var16) {
					class415 var23 = var12.method7971(var16);
					var18 = var7 + var23.field4584;
					int var19 = var2.charWidth(var23.field4583);
					int var20 = var8 + var23.field4585 - var3;
					Rasterizer2D.Rasterizer2D_fillRectangle(var18, var20, var19, var15, this.field5338);
				}
			}

			if (!var21.method7956()) {
				var2.method7849(var21, var7, var8, this.field5329, this.field5335, -1);
			}

			if (!var12.method7956()) {
				var2.method7849(var12, var7, var8, this.field5336, this.field5335, -1);
			}

			if (!var13.method7956()) {
				var2.method7849(var13, var7, var8, this.field5329, this.field5335, -1);
			}

			if (this.field5334) {
				class504 var22 = var14.method7963();
				var16 = var7 + (Integer)var22.field5063;
				int var17 = var8 + (Integer)var22.field5064;
				var18 = var17 - var4;
				Rasterizer2D.Rasterizer2D_drawLine(var16, var17, var16, var18, this.field5329);
				if (this.field5335 != -1) {
					Rasterizer2D.Rasterizer2D_drawLine(var16 + 1, var17 + 1, var16 + 1, var18 + 1, this.field5335);
				}
			}

		}
	}
}
