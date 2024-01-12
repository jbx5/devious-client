import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("am")
	boolean field2820;
	@ObfuscatedName("ap")
	boolean field2815;
	@ObfuscatedName("ag")
	int[] field2814;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	Clips field2821;

	@ObfuscatedSignature(
		descriptor = "(Llp;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2820 = false;
		this.field2815 = false;
		this.field2814 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2821 = var1;
	}

	@ObfuscatedName("am")
	void method5347(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9766(var1, var2, var3, var4);
	}

	@ObfuscatedName("aj")
	void method5350(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method5348(var10, var13, var14, var15, var16);
		var11 = method5348(var11, var13, var14, var15, var16);
		var12 = method5348(var12, var13, var14, var15, var16);
		this.vmethod5824(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("aq")
	void method5355(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method5348(var10, var11, var12, var13, var14);
		var10 = this.field2814[var15];
		this.vmethod5830(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("ar")
	abstract void vmethod5824(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("ag")
	abstract void vmethod5830(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ao")
	abstract void vmethod5832(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ae")
	abstract void vmethod5833(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ap")
	static int method5348(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("af")
	static final int method5349(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}
}
