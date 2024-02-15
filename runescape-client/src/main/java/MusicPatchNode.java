import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
@Implements("MusicPatchNode")
public class MusicPatchNode extends Node {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2014932929
	)
	int field3576;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	@Export("table")
	MusicPatch table;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("rawSound")
	RawSound rawSound;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	MusicPatchNode2 field3567;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 864391351
	)
	int field3572;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1791347925
	)
	int field3569;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1287444843
	)
	int field3570;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 781872781
	)
	int field3580;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -215055731
	)
	int field3581;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1171568241
	)
	int field3573;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1801689695
	)
	int field3574;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1949253632
	)
	int field3571;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 981667397
	)
	int field3582;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1841880265
	)
	int field3577;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -906107239
	)
	int field3578;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2050032387
	)
	int field3579;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1276025151
	)
	int field3586;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1874591773
	)
	int field3565;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbs;"
	)
	@Export("stream")
	RawPcmStream stream;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -289353881
	)
	int field3583;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1232026487
	)
	int field3584;

	MusicPatchNode() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method6378() {
		this.table = null;
		this.rawSound = null;
		this.field3567 = null;
		this.stream = null;
	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "1"
	)
	static final void method6381(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var15 + var7 + var1;
			Rasterizer3D.method5296(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method5296(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}
}
