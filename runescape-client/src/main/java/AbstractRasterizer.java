import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("at")
	boolean field2783;
	@ObfuscatedName("ah")
	boolean field2782;
	@ObfuscatedName("aa")
	int[] field2786;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	Clips field2788;

	@ObfuscatedSignature(
		descriptor = "(Lkh;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2783 = false;
		this.field2782 = false;
		this.field2786 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2788 = var1;
	}

	@ObfuscatedName("at")
	void method5286(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9607(var1, var2, var3, var4);
	}

	@ObfuscatedName("ao")
	void method5288(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method5287(var10, var13, var14, var15, var16);
		var11 = method5287(var11, var13, var14, var15, var16);
		var12 = method5287(var12, var13, var14, var15, var16);
		this.vmethod5746(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ab")
	void method5291(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method5287(var10, var11, var12, var13, var14);
		var10 = this.field2786[var15];
		this.vmethod5752(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("au")
	abstract void vmethod5746(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("aa")
	abstract void vmethod5752(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("ac")
	abstract void vmethod5754(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("al")
	abstract void vmethod5761(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ah")
	static int method5287(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("ar")
	static final int method5313(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}
}
