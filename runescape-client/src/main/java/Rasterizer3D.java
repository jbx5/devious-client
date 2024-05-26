import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("Rasterizer3D")
public class Rasterizer3D {
	@ObfuscatedName("ak")
	@Export("Rasterizer3D_colorPalette")
	public static int[] Rasterizer3D_colorPalette;
	@ObfuscatedName("al")
	static int[] field2672;
	@ObfuscatedName("aj")
	static int[] field2666;
	@ObfuscatedName("az")
	@Export("Rasterizer3D_sine")
	public static int[] Rasterizer3D_sine;
	@ObfuscatedName("af")
	@Export("Rasterizer3D_cosine")
	public static int[] Rasterizer3D_cosine;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("clips")
	public static Clips clips;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static AbstractRasterizer field2670;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static final AbstractRasterizer field2671;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	static final AbstractRasterizer field2667;

	static {
		Rasterizer3D_colorPalette = new int[65536];
		field2672 = new int[512];
		field2666 = new int[2048];
		Rasterizer3D_sine = new int[2048];
		Rasterizer3D_cosine = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2672[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2666[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			Rasterizer3D_sine[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			Rasterizer3D_cosine[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

		clips = new Clips();
		field2671 = new class267(clips);
		field2667 = new class269(clips);
		field2670 = field2671;
	}

	@ObfuscatedName("ak")
	public static void method4698(boolean var0) {
		if (var0 && Rasterizer2D.field5415 != null) {
			field2670 = field2667;
		} else {
			field2670 = field2671;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkc;)V"
	)
	public static void method4680(TextureLoader var0) {
		clips.Rasterizer3D_textureLoader = var0;
	}

	@ObfuscatedName("aj")
	public static void method4681(double var0) {
		Rasterizer3D_buildPalette(var0, 0, 512);
	}

	@ObfuscatedName("az")
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

	@ObfuscatedName("af")
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

	@ObfuscatedName("aa")
	@Export("getClipMidX")
	static int getClipMidX() {
		return clips.field2982;
	}

	@ObfuscatedName("at")
	@Export("getClipMidY")
	static int getClipMidY() {
		return clips.field2984;
	}

	@ObfuscatedName("ab")
	@Export("Rasterizer3D_clipMidX2")
	static int Rasterizer3D_clipMidX2() {
		return clips.clipNegativeMidX;
	}

	@ObfuscatedName("ac")
	@Export("Rasterizer3D_clipMidY2")
	static int Rasterizer3D_clipMidY2() {
		return clips.field2988;
	}

	@ObfuscatedName("ao")
	static int method4687() {
		return clips.field2990;
	}

	@ObfuscatedName("ah")
	static int method4751() {
		return clips.clipNegativeMidY;
	}

	@ObfuscatedName("av")
	@Export("get3dZoom")
	public static int get3dZoom() {
		return clips.field2976;
	}

	@ObfuscatedName("aq")
	static int method4760() {
		return clips.field2985;
	}

	@ObfuscatedName("ap")
	public static void method4691(int[] var0, int var1, int var2, float[] var3) {
		if (var3 == null && field2670 == field2667) {
			field2670 = field2671;
		}

		field2670.method4799(var0, var1, var2, var3);
	}

	@ObfuscatedName("ae")
	@Export("resetRasterClipping")
	public static void resetRasterClipping() {
		method4693(Rasterizer2D.Rasterizer2D_xClipStart, Rasterizer2D.Rasterizer2D_yClipStart, Rasterizer2D.Rasterizer2D_xClipEnd, Rasterizer2D.Rasterizer2D_yClipEnd);
	}

	@ObfuscatedName("ax")
	static void method4693(int var0, int var1, int var2, int var3) {
		clips.field2985 = var2 - var0;
		clips.field2986 = var3 - var1;
		method4694();
		if (clips.Rasterizer3D_rowOffsets.length < clips.field2986) {
			clips.Rasterizer3D_rowOffsets = new int[Skeleton.method4848(clips.field2986)];
		}

		int var4 = var0 + Rasterizer2D.Rasterizer2D_width * var1;

		for (int var5 = 0; var5 < clips.field2986; ++var5) {
			clips.Rasterizer3D_rowOffsets[var5] = var4;
			var4 += Rasterizer2D.Rasterizer2D_width;
		}

	}

	@ObfuscatedName("ay")
	public static void method4694() {
		clips.method5380();
	}

	@ObfuscatedName("au")
	public static void method4695(int var0, int var1) {
		int var2 = clips.Rasterizer3D_rowOffsets[0];
		int var3 = var2 / Rasterizer2D.Rasterizer2D_width;
		int var4 = var2 - var3 * Rasterizer2D.Rasterizer2D_width;
		clips.method5379(var0, var4, var1, var3);
	}

	@ObfuscatedName("as")
	public static void method4678(int var0, int var1, int var2) {
		clips.method5382(var0, var1, var2);
	}

	@ObfuscatedName("aw")
	@Export("rasterGouraud")
	static void rasterGouraud(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
		field2670.vmethod5445(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
	}

	@ObfuscatedName("ad")
	@Export("rasterFlat")
	public static void rasterFlat(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
		field2670.vmethod5396(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
	}

	@ObfuscatedName("ai")
	static void method4699(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2670.vmethod5398(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("an")
	static void method4700(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
		field2670.vmethod5419(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
	}

	@ObfuscatedName("am")
	static void method4701(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
		field2670.method4802(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
	}

	@ObfuscatedName("ar")
	static void method4739(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
		field2670.method4803(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
	}
}
