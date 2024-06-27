import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("AbstractRasterizer")
public abstract class AbstractRasterizer extends Rasterizer2D {
	@ObfuscatedName("ai")
	static int field2906;
	@ObfuscatedName("aq")
	boolean field2900;
	@ObfuscatedName("ad")
	boolean field2897;
	@ObfuscatedName("av")
	int[] field2901;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	Clips field2905;

	static {
		field2906 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Llo;)V"
	)
	AbstractRasterizer(Clips var1) {
		this.field2900 = false;
		this.field2897 = false;
		this.field2901 = Rasterizer3D.Rasterizer3D_colorPalette;
		this.field2905 = var1;
	}

	@ObfuscatedName("aq")
	void method5360(int[] var1, int var2, int var3, float[] var4) {
		Rasterizer2D.method9902(var1, var2, var3, var4);
	}

	@ObfuscatedName("ak")
	void method5363(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
		var10 = method5361(var10, var13, var14, var15, var16);
		var11 = method5361(var11, var13, var14, var15, var16);
		var12 = method5361(var12, var13, var14, var15, var16);
		this.vmethod5953(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
	}

	@ObfuscatedName("ap")
	void method5397(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
		int var15 = method5361(var10, var11, var12, var13, var14);
		var10 = this.field2901[var15];
		this.vmethod5959(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
	}

	@ObfuscatedName("an")
	abstract void vmethod5953(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

	@ObfuscatedName("aj")
	abstract void vmethod5959(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

	@ObfuscatedName("av")
	abstract void vmethod5961(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ab")
	abstract void vmethod5968(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

	@ObfuscatedName("ad")
	static int method5361(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	@ObfuscatedName("ag")
	static final int method5403(int var0, int var1) {
		var1 = (var0 & 127) * var1 >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfuscatedName("ai")
	static final int method5369() {
		return field2906;
	}

	@ObfuscatedName("ae")
	static void method5370(int var0) {
		field2906 = var0;
	}

	@ObfuscatedName("au")
	static void method5371(int var0) {
		int var1 = var0 * 140;
		method5370(var1);
	}
}
