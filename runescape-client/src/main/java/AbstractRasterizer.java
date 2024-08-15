import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("aq")
	static int field1964;
	@ObfuscatedName("ab")
	boolean field1971;
	@ObfuscatedName("ay")
	boolean field1962;
	@ObfuscatedName("ae")
	int[] field1969;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	Clips field1970;

	static {
		field1964 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lhk;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field1971 = false;
		this.field1962 = false;
		this.field1969 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field1970 = var1;
	}

	@ObfuscatedName("ab")
	void method3843(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("au")
	void method3854(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method3844(var10, var13, var14, var15, var16);
		var11 = method3844(var11, var13, var14, var15, var16);
		var12 = method3844(var12, var13, var14, var15, var16);
		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ax")
	void method3847(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method3844(var10, var11, var12, var13, var14);
		var10 = this.field1969[var15];
		this.vmethod4430(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ao")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("am")
	abstract void vmethod4430(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ac")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ae")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ay")
	static int method3844(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += var8 * (var1 - var5) >> 7;
		}

		if (var2 != -1) {
			var6 += var8 * (var2 - var6) >> 7;
		}

		if (var3 != -1) {
			var7 += var8 * (var3 - var7) >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfuscatedName("an")
	static final int method3845(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ad")
	static final int method3846() {
		return field1964;
	}

	@ObfuscatedName("aq")
	static void method3852(int var0) {
		field1964 = var0;
	}

	@ObfuscatedName("al")
	static void method3874(int var0) {
		int var1 = var0 * 210;
		method3852(var1);
	}
}
