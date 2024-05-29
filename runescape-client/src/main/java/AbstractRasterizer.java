import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("ao")
	static int field2695;
	@ObfuscatedName("ak")
	boolean field2686;
	@ObfuscatedName("al")
	boolean field2687;
	@ObfuscatedName("ab")
	int[] field2690;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	Clips field2693;

	static {
		field2695 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lkp;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2686 = false;
		this.field2687 = false;
		this.field2690 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2693 = var1;
	}

	@ObfuscatedName("ak")
	void method4799(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9971(var1, var2, var3, var4);
	}

	@ObfuscatedName("az")
	void method4802(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method4800(var10, var13, var14, var15, var16);
		var11 = method4800(var11, var13, var14, var15, var16);
		var12 = method4800(var12, var13, var14, var15, var16);
		this.vmethod5445(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("af")
	void method4803(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method4800(var10, var11, var12, var13, var14);
		var10 = this.field2690[var15];
		this.vmethod5396(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("aa")
	abstract void vmethod5445(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("at")
	abstract void vmethod5396(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ab")
	abstract void vmethod5398(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ac")
	abstract void vmethod5419(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("al")
	static int method4800(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("aj")
	static final int method4801(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ao")
	static final int method4842() {
		return field2695;
	}

	@ObfuscatedName("ah")
	static void method4808(int var0) {
		field2695 = var0;
	}

	@ObfuscatedName("av")
	static void method4828(int var0) {
		int var1 = var0 * 140;
		method4808(var1);
	}
}
