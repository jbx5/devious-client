import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("aq")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("ad")
	static int[] field2875;
	@ObfuscatedName("ag")
	static int[] field2880;
	@ObfuscatedName("ak")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("ap")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	@Export("clips")
	public static Clips clips;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static AbstractRasterizer field2874;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static final AbstractRasterizer field2881;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static final AbstractRasterizer field2882;

	static {
		Rasterizer3D_colorPalette = new int[65536];
		field2875 = new int[512];
		field2880 = new int[2048];
		Rasterizer3D_sine = new int[2048];
		Rasterizer3D_cosine = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2875[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2880[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		clips = new Clips();
		field2881 = new class297(clips);
		field2882 = new class299(clips);
		field2874 = field2881;
	}

	@ObfuscatedName("aq")
	public static void method5325(boolean var0) {
		if (var0 && Rasterizer2D.field5435 != null) {
			field2874 = field2882;
		} else {
			field2874 = field2881;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llh;)V"
	)
	public static void method5309(TextureLoader var0) {
		clips.Rasterizer3D_textureLoader = var0;
	}

	@ObfuscatedName("ag")
	public static void method5248(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512);
	}

	@ObfuscatedName("ak")
	@Export("Rasterizer3D_buildPalette")
	static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = 2.0D * var11 - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var19;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}

					if (6.0D * var6 < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (2.0D * var6 < 1.0D) {
						var15 = var19;
					} else if (3.0D * var6 < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}

					if (6.0D * var27 < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (2.0D * var27 < 1.0D) {
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var30 = (int)(var17 * 256.0D);
				int var22 = var30 + (var20 << 8) + (var29 << 16);
				var22 = Rasterizer3D_brighten(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				Rasterizer3D_colorPalette[var4++] = var22;
			}
		}

	}

	@ObfuscatedName("ap")
	@Export("Rasterizer3D_brighten")
	static int Rasterizer3D_brighten(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return var11 + (var10 << 8) + (var9 << 16);
	}

	@ObfuscatedName("an")
	@Export("getClipMidX")
	static int getClipMidX() {
		return clips.field3196;
	}

	@ObfuscatedName("aj")
	@Export("getClipMidY")
	static int getClipMidY() {
		return clips.field3197;
	}

	@ObfuscatedName("av")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2() {
		return clips.clipNegativeMidX;
	}

	@ObfuscatedName("ab")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2() {
		return clips.field3201;
	}

	@ObfuscatedName("ai")
	static int method5255() {
		return clips.field3190;
	}

	@ObfuscatedName("ae")
	static int method5271() {
		return clips.clipNegativeMidY;
	}

	@ObfuscatedName("au")
	@Export("get3dZoom")
	public static int get3dZoom() {
		return clips.field3184;
	}

	@ObfuscatedName("ah")
	static int method5258() {
		return clips.field3198;
	}

	@ObfuscatedName("az")
	public static void method5259(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2874 == field2882) {
			field2874 = field2881;
		}

		field2874.method5360(var0, var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@Export("resetRasterClipping")
	public static void resetRasterClipping() {
		method5261(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
	}

	@ObfuscatedName("ac")
	static void method5261(int var0, int var1, int var2, int var3) {
		clips.field3198 = var2 - var0;
		clips.field3199 = var3 - var1;
		method5262();
		if (clips.Rasterizer3D_rowOffsets.length < clips.field3199) {
			clips.Rasterizer3D_rowOffsets = new int[ModeWhere.method7432(clips.field3199)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1;

		for (int var5 = 0; var5 < clips.field3199; ++var5) {
			clips.Rasterizer3D_rowOffsets[var5] = var4;
			var4 += Rasterizer2D.Rasterizer2D_width;
		}

	}

	@ObfuscatedName("al")
	public static void method5262() {
		clips.method5946();
	}

	@ObfuscatedName("ay")
	public static void method5307(int var0, int var1) {
		int var2 = clips.Rasterizer3D_rowOffsets[0];
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
		clips.method5947(var0, var4, var1, var3);
	}

	@ObfuscatedName("ao")
	public static void method5326(int var0, int var1, int var2) {
		clips.method5948(var0, var1, var2);
	}

	@ObfuscatedName("aa")
	@Export("rasterGouraud")
	static void rasterGouraud(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2874.vmethod5953(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("as")
	@Export("rasterFlat")
	public static void rasterFlat(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2874.vmethod5959(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("aw")
	static void method5267(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2874.vmethod5961(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("at")
	static void method5268(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2874.vmethod5968(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("af")
	static void method5269(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2874.method5363(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	@ObfuscatedName("am")
	static void method5270(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2874.method5397(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
