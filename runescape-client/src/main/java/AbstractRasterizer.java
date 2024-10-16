import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("au")
	static int field2624;
	@ObfuscatedName("ap")
	boolean field2619;
	@ObfuscatedName("aw")
	boolean field2615;
	@ObfuscatedName("am")
	int[] field2622;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	Clips field2623;

	static {
		field2624 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lky;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2619 = false;
		this.field2615 = false;
		this.field2622 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2623 = var1;
	}

	@ObfuscatedName("ap")
	void method4923(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.Rasterizer2D_init(var1, var2, var3, var4);
	}

	@ObfuscatedName("aj")
	void method4926(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4945(var10, var13, var14, var15, var16);
		var11 = method4945(var11, var13, var14, var15, var16);
		var12 = method4945(var12, var13, var14, var15, var16);
		this.drawAlphaBlendedGraphics(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ai")
	void method4927(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4945(var10, var11, var12, var13, var14);
		var10 = this.field2622[var15];
		this.vmethod5540(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ay")
	@Export("drawAlphaBlendedGraphics")
	abstract void drawAlphaBlendedGraphics(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("as")
	abstract void vmethod5540(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ae")
	@Export("drawGradientTriangle")
	abstract void drawGradientTriangle(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("am")
	@Export("textureMapPolygons")
	abstract void textureMapPolygons(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("aw")
	static int method4945(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("ak")
	static final int method4925(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("at")
	static final int method4952() {
		return field2624;
	}

	@ObfuscatedName("au")
	static void method4933(int var0) {
		field2624 = var0;
	}

	@ObfuscatedName("an")
	static void method4934(int var0) {
		int var1 = var0 * 210;
		method4933(var1);
	}
}
