import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("aw")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ai")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field2986;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field3050;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static class469 field2988;
	@ObfuscatedName("bn")
	static boolean[] field3021;
	@ObfuscatedName("br")
	static boolean[] field3008;
	@ObfuscatedName("bp")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bf")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bg")
	static float[] field3013;
	@ObfuscatedName("be")
	static int[] field3026;
	@ObfuscatedName("bc")
	static int[] field3036;
	@ObfuscatedName("bz")
	static int[] field2987;
	@ObfuscatedName("bh")
	static int[] field3029;
	@ObfuscatedName("bj")
	static char[] field3031;
	@ObfuscatedName("bl")
	static char[][] field3032;
	@ObfuscatedName("bx")
	static int[] field3033;
	@ObfuscatedName("cs")
	static int[][] field3003;
	@ObfuscatedName("ch")
	static int[] field3035;
	@ObfuscatedName("co")
	static int[] field3040;
	@ObfuscatedName("cd")
	static int[] field3037;
	@ObfuscatedName("cg")
	static int[] field3038;
	@ObfuscatedName("cn")
	static int[] field3039;
	@ObfuscatedName("cz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("ci")
	static int[] field3022;
	@ObfuscatedName("cl")
	static float[] field3041;
	@ObfuscatedName("cm")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cx")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cw")
	static boolean field3045;
	@ObfuscatedName("ce")
	static int[] field3049;
	@ObfuscatedName("cv")
	static int[] field3052;
	@ObfuscatedName("cj")
	static int[] field3009;
	@ObfuscatedName("ct")
	static int[] field3018;
	@ObfuscatedName("cp")
	static final float field3019;
	@ObfuscatedName("az")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ao")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("au")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ak")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ah")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aj")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("af")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ax")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("an")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("ag")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("am")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ad")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("at")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ay")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ae")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ac")
	public byte field2991;
	@ObfuscatedName("ab")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("av")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ap")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bu")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bo")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bd")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bi")
	int[][] field3011;
	@ObfuscatedName("bq")
	int[][] field3012;
	@ObfuscatedName("ba")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bt")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bk")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bm")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bw")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bv")
	@Export("radius")
	int radius;
	@ObfuscatedName("by")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("cc")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cb")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cq")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cf")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cr")
	public short field3059;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2986 = new class469();
		field3050 = new class469();
		field2988 = new class469();
		field3021 = new boolean[6500];
		field3008 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field3013 = new float[6500];
		field3026 = new int[6500];
		field3036 = new int[6500];
		field2987 = new int[6500];
		field3029 = new int[6500];
		field3031 = new char[6000];
		field3032 = new char[6000][512];
		field3033 = new int[12];
		field3003 = new int[12][2000];
		field3035 = new int[2000];
		field3040 = new int[2000];
		field3037 = new int[12];
		field3038 = new int[10];
		field3039 = new int[10];
		field3022 = new int[10];
		field3041 = new float[10];
		field3045 = true;
		field3049 = Rasterizer3D.Rasterizer3D_sine;
		field3052 = Rasterizer3D.Rasterizer3D_cosine;
		field3009 = Rasterizer3D.Rasterizer3D_colorPalette;
		field3018 = Rasterizer3D.field2817;
		field3019 = ClanSettings.method3332(50);
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2991 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2991 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method5681(var1, var2, var3);
		this.field2991 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Lkz;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2991 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2991 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2991 == -1) {
					this.field2991 = var4.field2991;
				}
			}
		}

		this.method5681(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5683(var1[var3]);
		}

	}

	@ObfuscatedName("aq")
	void method5681(int var1, int var2, int var3) {
		this.verticesX = new int[var1];
		this.verticesY = new int[var1];
		this.verticesZ = new int[var1];
		this.indices1 = new int[var2];
		this.indices2 = new int[var2];
		this.indices3 = new int[var2];
		this.faceColors1 = new int[var2];
		this.faceColors2 = new int[var2];
		this.faceColors3 = new int[var2];
		if (var3 > 0) {
			this.texIndices1 = new int[var3];
			this.texIndices2 = new int[var3];
			this.texIndices3 = new int[var3];
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	void method5682(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2991 != var1.field2991)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2991);
		}

		if (this.faceAlphas == null && var1.faceAlphas != null) {
			this.faceAlphas = new byte[var2];
			Arrays.fill(this.faceAlphas, (byte)0);
		}

		if (this.faceTextures == null && var1.faceTextures != null) {
			this.faceTextures = new short[var2];
			Arrays.fill(this.faceTextures, (short)-1);
		}

		if (this.textureFaces == null && var1.textureFaces != null) {
			this.textureFaces = new byte[var2];
			Arrays.fill(this.textureFaces, (byte)-1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lkz;)V"
	)
	public void method5683(Model var1) {
		if (var1 != null) {
			this.method5682(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2991;
				}

				if (this.faceAlphas != null && var1.faceAlphas != null) {
					this.faceAlphas[this.indicesCount] = var1.faceAlphas[var2];
				}

				if (this.faceTextures != null) {
					this.faceTextures[this.indicesCount] = var1.faceTextures != null ? var1.faceTextures[var2] : -1;
				}

				if (this.textureFaces != null) {
					if (var1.textureFaces != null && var1.textureFaces[var2] != -1) {
						this.textureFaces[this.indicesCount] = (byte)(var1.textureFaces[var2] + this.texIndicesCount);
					} else {
						this.textureFaces[this.indicesCount] = -1;
					}
				}

				++this.indicesCount;
			}

			for (var2 = 0; var2 < var1.texIndicesCount; ++var2) {
				this.texIndices1[this.texIndicesCount] = this.verticesCount + var1.texIndices1[var2];
				this.texIndices2[this.texIndicesCount] = this.verticesCount + var1.texIndices2[var2];
				this.texIndices3[this.texIndicesCount] = this.verticesCount + var1.texIndices3[var2];
				++this.texIndicesCount;
			}

			for (var2 = 0; var2 < var1.verticesCount; ++var2) {
				this.verticesX[this.verticesCount] = var1.verticesX[var2];
				this.verticesY[this.verticesCount] = var1.verticesY[var2];
				this.verticesZ[this.verticesCount] = var1.verticesZ[var2];
				++this.verticesCount;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lkz;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder();
		int var7 = var2 - this.xzRadius;
		int var8 = var2 + this.xzRadius;
		int var9 = var4 - this.xzRadius;
		int var10 = var4 + this.xzRadius;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
				return this;
			} else {
				Model var11;
				if (var5) {
					var11 = new Model();
					var11.verticesCount = this.verticesCount;
					var11.indicesCount = this.indicesCount;
					var11.texIndicesCount = this.texIndicesCount;
					var11.verticesX = this.verticesX;
					var11.verticesZ = this.verticesZ;
					var11.indices1 = this.indices1;
					var11.indices2 = this.indices2;
					var11.indices3 = this.indices3;
					var11.faceColors1 = this.faceColors1;
					var11.faceColors2 = this.faceColors2;
					var11.faceColors3 = this.faceColors3;
					var11.faceRenderPriorities = this.faceRenderPriorities;
					var11.faceAlphas = this.faceAlphas;
					var11.textureFaces = this.textureFaces;
					var11.faceTextures = this.faceTextures;
					var11.field2991 = this.field2991;
					var11.texIndices1 = this.texIndices1;
					var11.texIndices2 = this.texIndices2;
					var11.texIndices3 = this.texIndices3;
					var11.vertexLabels = this.vertexLabels;
					var11.faceLabelsAlpha = this.faceLabelsAlpha;
					var11.isSingleTile = this.isSingleTile;
					var11.verticesY = new int[var11.verticesCount];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = var2 + this.verticesX[var12];
						var14 = var4 + this.verticesZ[var12];
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) {
						var13 = (-this.verticesY[var12] << 16) / super.height;
						if (var13 < var6) {
							var14 = var2 + this.verticesX[var12];
							var15 = var4 + this.verticesZ[var12];
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12];
						}
					}
				}

				var11.resetBounds();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkz;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Z)Lkz;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZLkz;[B)Lkz;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.texIndicesCount = this.texIndicesCount;
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) {
			var2.verticesX = new int[this.verticesCount + 100];
			var2.verticesY = new int[this.verticesCount + 100];
			var2.verticesZ = new int[this.verticesCount + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) {
			var2.verticesX[var4] = this.verticesX[var4];
			var2.verticesY[var4] = this.verticesY[var4];
			var2.verticesZ[var4] = this.verticesZ[var4];
		}

		if (var1) {
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3;
			if (this.faceAlphas == null) {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) {
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1;
		var2.indices2 = this.indices2;
		var2.indices3 = this.indices3;
		var2.faceColors1 = this.faceColors1;
		var2.faceColors2 = this.faceColors2;
		var2.faceColors3 = this.faceColors3;
		var2.faceRenderPriorities = this.faceRenderPriorities;
		var2.textureFaces = this.textureFaces;
		var2.faceTextures = this.faceTextures;
		var2.field2991 = this.field2991;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field3011 = this.field3011;
		var2.field3012 = this.field3012;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("ah")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field3052[var1];
			int var9 = field3049[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var12 = this.verticesX[var10];
				int var13 = this.verticesZ[var10];
				int var11 = var12 * var8 + var9 * var13 >> 16;
				int var15 = this.verticesY[var10];
				int var16 = class224.method4378(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var15 < var3) {
					var3 = var15;
				}

				if (var15 > var6) {
					var6 = var15;
				}

				if (var16 < var4) {
					var4 = var16;
				}

				if (var16 > var7) {
					var7 = var16;
				}
			}

			AABB var17 = new AABB((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var18 = true;
			if (var17.xMidOffset < 32) {
				var17.xMidOffset = 32;
			}

			if (var17.zMidOffset < 32) {
				var17.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var19 = true;
				var17.xMidOffset += 8;
				var17.zMidOffset += 8;
			}

			this.aabb.put(var1, var17);
		}
	}

	@ObfuscatedName("aj")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) {
			this.boundsType = 1;
			super.height = 0;
			this.bottomY = 0;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				if (-var3 > super.height) {
					super.height = -var3;
				}

				if (var3 > this.bottomY) {
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D);
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D);
		}
	}

	@ObfuscatedName("af")
	void method5707() {
		if (this.boundsType != 2) {
			this.boundsType = 2;
			this.xzRadius = 0;

			for (int var1 = 0; var1 < this.verticesCount; ++var1) {
				int var2 = this.verticesX[var1];
				int var3 = this.verticesY[var1];
				int var4 = this.verticesZ[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.xzRadius) {
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D);
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("ax")
	public int method5710() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("an")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lks;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) {
			if (var2 != -1) {
				Animation var3 = var1.frames[var2];
				Skeleton var4 = var3.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;

				for (int var5 = 0; var5 < var3.transformCount; ++var5) {
					int var6 = var3.transformSkeletonLabels[var5];
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]);
				}

				this.resetBounds();
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V"
	)
	public void method5694(class140 var1, int var2) {
		Skeleton var3 = var1.field1635;
		class272 var4 = var3.method5414();
		if (var4 != null) {
			var3.method5414().method5350(var1, var2);
			this.method5696(var3.method5414(), var1.method3155());
		}

		if (var1.method3156()) {
			this.method5695(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V"
	)
	void method5695(class140 var1, int var2) {
		Skeleton var3 = var1.field1635;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1632 != null && var1.field1632[var4] != null && var1.field1632[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class132 var6 = var1.field1632[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3085(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V"
	)
	void method5696(class272 var1, int var2) {
		this.method5777(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lks;ILks;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				Animation var6 = var1.frames[var2];
				Animation var7 = var3.frames[var4];
				Skeleton var8 = var6.skeleton;
				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) {
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0;
				Model_transformTempY = 0;
				Model_transformTempZ = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) {
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) {
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds();
			} else {
				this.animate(var1, var2);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lku;Lfc;I[ZZZ)V"
	)
	public void method5698(Skeleton var1, class140 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class272 var7 = var1.method5414();
		if (var7 != null) {
			var7.method5353(var2, var3, var4, var5);
			if (var6) {
				this.method5696(var7, var2.method3155());
			}
		}

		if (!var5 && var2.method3156()) {
			this.method5695(var2, var3);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lks;I[IZ)V"
	)
	public void method5699(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.animate(var1, var2);
		} else {
			Animation var5 = var1.frames[var2];
			Skeleton var6 = var5.skeleton;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (int var9 = 0; var9 < var5.transformCount; ++var9) {
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.transformTypes[var10] == 0) {
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
				}
			}

		}
	}

	@ObfuscatedName("ab")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			Model_transformTempX = 0;
			Model_transformTempY = 0;
			Model_transformTempZ = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var18 = var2[var8];
				if (var18 < this.vertexLabels.length) {
					int[] var19 = this.vertexLabels[var18];

					for (var11 = 0; var11 < var19.length; ++var11) {
						var12 = var19[var11];
						Model_transformTempX += this.verticesX[var12];
						Model_transformTempY += this.verticesY[var12];
						Model_transformTempZ += this.verticesZ[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				Model_transformTempX = var3 + Model_transformTempX / var7;
				Model_transformTempY = var4 + Model_transformTempY / var7;
				Model_transformTempZ = var5 + Model_transformTempZ / var7;
			} else {
				Model_transformTempX = var3;
				Model_transformTempY = var4;
				Model_transformTempZ = var5;
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] += var3;
							var10000 = this.verticesY;
							var10000[var11] += var4;
							var10000 = this.verticesZ;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field3049[var14];
								var16 = field3052[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field3049[var12];
								var16 = field3052[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field3049[var13];
								var16 = field3052[var13];
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.vertexLabels.length) {
						var9 = this.vertexLabels[var8];

						for (var10 = 0; var10 < var9.length; ++var10) {
							var11 = var9[var10];
							var10000 = this.verticesX;
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128;
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128;
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128;
							var10000 = this.verticesX;
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY;
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ;
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.faceLabelsAlpha.length) {
							var9 = this.faceLabelsAlpha[var8];

							for (var10 = 0; var10 < var9.length; ++var10) {
								var11 = var9[var10];
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("av")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ap")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bu")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3049[var1];
		int var3 = field3052[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bd")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int[] var10000 = this.verticesX;
			var10000[var4] += var1;
			var10000 = this.verticesY;
			var10000[var4] += var2;
			var10000 = this.verticesZ;
			var10000[var4] += var3;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bi")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bq")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5707();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field3049[var1];
		int var11 = field3052[var1];
		int var12 = field3049[var2];
		int var13 = field3052[var2];
		int var14 = field3049[var3];
		int var15 = field3052[var3];
		int var16 = field3049[var4];
		int var17 = field3052[var4];
		int var18 = var16 * var6 + var17 * var7 >> 16;

		for (int var19 = 0; var19 < this.verticesCount; ++var19) {
			int var20 = this.verticesX[var19];
			int var21 = this.verticesY[var19];
			int var22 = this.verticesZ[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field3026[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field3013[var19] = ClanSettings.method3332(var22);
			if (this.texIndicesCount > 0) {
				field3036[var19] = var20;
				field2987[var19] = var23;
				field3029[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("ba")
	public final void method5708(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5707();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field3049[var1];
		int var12 = field3052[var1];
		int var13 = field3049[var2];
		int var14 = field3052[var2];
		int var15 = field3049[var3];
		int var16 = field3052[var3];
		int var17 = field3049[var4];
		int var18 = field3052[var4];
		int var19 = var17 * var6 + var18 * var7 >> 16;

		for (int var20 = 0; var20 < this.verticesCount; ++var20) {
			int var21 = this.verticesX[var20];
			int var22 = this.verticesY[var20];
			int var23 = this.verticesZ[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field3026[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field3013[var20] = ClanSettings.method3332(var8);
			if (this.texIndicesCount > 0) {
				field3036[var20] = var21;
				field2987[var20] = var24;
				field3029[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bt")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field3031[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var28 = modelViewportXs[var10];
					int var29;
					if (var1 && (var11 == -5000 || var12 == -5000 || var28 == -5000)) {
						var29 = field3036[var8];
						var15 = field3036[var9];
						var16 = field3036[var10];
						int var30 = field2987[var8];
						var18 = field2987[var9];
						int var19 = field2987[var10];
						int var20 = field3029[var8];
						int var21 = field3029[var9];
						int var22 = field3029[var10];
						var29 -= var15;
						var16 -= var15;
						var30 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var30 * var22 - var20 * var19;
						int var24 = var20 * var16 - var29 * var22;
						int var25 = var29 * var19 - var30 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field3008[var7] = true;
							int var26 = (field3026[var8] + field3026[var9] + field3026[var10]) / 3 + this.radius;
							field3032[var26][field3031[var26]++] = var7;
						}
					} else {
						if (var2 && ObjectSound.method1954(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
							class152.method3290(var4);
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field3008[var7] = false;
							var29 = Rasterizer3D.method5290();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field3021[var7] = false;
							} else {
								field3021[var7] = true;
							}

							var15 = (field3026[var8] + field3026[var9] + field3026[var10]) / 3 + this.radius;
							field3032[var15][field3031[var15]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) {
				for (var31 = this.diameter - 1; var31 >= 0; --var31) {
					var32 = field3031[var31];
					if (var32 > 0) {
						var27 = field3032[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) {
					field3033[var31] = 0;
					field3037[var31] = 0;
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) {
					var32 = field3031[var31];
					if (var32 > 0) {
						var27 = field3032[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							char var33 = var27[var10];
							byte var34 = this.faceRenderPriorities[var33];
							var28 = field3033[var34]++;
							field3003[var34][var28] = var33;
							if (var34 < 10) {
								int[] var35 = field3037;
								var35[var34] += var31;
							} else if (var34 == 10) {
								field3035[var28] = var31;
							} else {
								field3040[var28] = var31;
							}
						}
					}
				}

				var31 = 0;
				if (field3033[1] > 0 || field3033[2] > 0) {
					var31 = (field3037[1] + field3037[2]) / (field3033[1] + field3033[2]);
				}

				var8 = 0;
				if (field3033[3] > 0 || field3033[4] > 0) {
					var8 = (field3037[3] + field3037[4]) / (field3033[3] + field3033[4]);
				}

				var9 = 0;
				if (field3033[6] > 0 || field3033[8] > 0) {
					var9 = (field3037[8] + field3037[6]) / (field3033[8] + field3033[6]);
				}

				var11 = 0;
				var12 = field3033[10];
				int[] var13 = field3003[10];
				int[] var14 = field3035;
				if (var11 == var12) {
					var11 = 0;
					var12 = field3033[11];
					var13 = field3003[11];
					var14 = field3040;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var31) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3003[11]) {
							var11 = 0;
							var12 = field3033[11];
							var13 = field3003[11];
							var14 = field3040;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3003[11]) {
							var11 = 0;
							var12 = field3033[11];
							var13 = field3003[11];
							var14 = field3040;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3003[11]) {
							var11 = 0;
							var12 = field3033[11];
							var13 = field3003[11];
							var14 = field3040;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field3033[var15];
					int[] var17 = field3003[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field3003[11]) {
						var11 = 0;
						var13 = field3003[11];
						var12 = field3033[11];
						var14 = field3040;
					}

					if (var11 < var12) {
						var10 = var14[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	@ObfuscatedName("bk")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field3008[var1]) {
			this.method5714(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.field3098 = field3021[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.field3086 = 0;
			} else {
				Rasterizer3D.clips.field3086 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5689(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field3013[var2], field3013[var3], field3013[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bm")
	boolean method5712(int var1) {
		return this.overrideAmount > 0 && var1 < this.field3059;
	}

	@ObfuscatedName("bw")
	final void method5689(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var15;
			int var16;
			int var18;
			if (this.textureFaces != null && this.textureFaces[var1] != -1) {
				int var17 = this.textureFaces[var1] & 255;
				var18 = this.texIndices1[var17];
				var15 = this.texIndices2[var17];
				var16 = this.texIndices3[var17];
			} else {
				var18 = this.indices1[var1];
				var15 = this.indices2[var1];
				var16 = this.indices3[var1];
			}

			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method5285(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3036[var18], field3036[var15], field3036[var16], field2987[var18], field2987[var15], field2987[var16], field3029[var18], field3029[var15], field3029[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method5285(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3036[var18], field3036[var15], field3036[var16], field2987[var18], field2987[var15], field2987[var16], field3029[var18], field3029[var15], field3029[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5712(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method5284(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3009[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3009[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method5301(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bv")
	final void method5714(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field3029[var5];
		int var9 = field3029[var6];
		int var10 = field3029[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.field3086 = 0;
		} else {
			Rasterizer3D.clips.field3086 = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field3038[var4] = modelViewportXs[var5];
			field3039[var4] = modelViewportYs[var5];
			field3041[var4] = field3013[var7];
			field3022[var4++] = this.faceColors1[var1];
		} else {
			var11 = field3036[var5];
			var12 = field2987[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field3018[var10 - var8] * (50 - var8);
				field3038[var4] = var2 + (var11 + ((field3036[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3039[var4] = var3 + (var12 + ((field2987[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3041[var4] = field3019;
				field3022[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field3018[var9 - var8] * (50 - var8);
				field3038[var4] = var2 + (var11 + ((field3036[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3039[var4] = var3 + (var12 + ((field2987[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3041[var4] = field3019;
				field3022[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field3038[var4] = modelViewportXs[var6];
			field3039[var4] = modelViewportYs[var6];
			field3041[var4] = field3013[var7];
			field3022[var4++] = this.faceColors2[var1];
		} else {
			var11 = field3036[var6];
			var12 = field2987[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field3018[var8 - var9] * (50 - var9);
				field3038[var4] = var2 + (var11 + ((field3036[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3039[var4] = var3 + (var12 + ((field2987[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3041[var4] = field3019;
				field3022[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field3018[var10 - var9] * (50 - var9);
				field3038[var4] = var2 + (var11 + ((field3036[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3039[var4] = var3 + (var12 + ((field2987[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3022[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field3038[var4] = modelViewportXs[var7];
			field3039[var4] = modelViewportYs[var7];
			field3041[var4] = field3013[var7];
			field3022[var4++] = this.faceColors3[var1];
		} else {
			var11 = field3036[var7];
			var12 = field2987[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field3018[var9 - var10] * (50 - var10);
				field3038[var4] = var2 + (var11 + ((field3036[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3039[var4] = var3 + (var12 + ((field2987[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3041[var4] = field3019;
				field3022[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field3018[var8 - var10] * (50 - var10);
				field3038[var4] = var2 + (var11 + ((field3036[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3039[var4] = var3 + (var12 + ((field2987[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3041[var4] = field3019;
				field3022[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field3038[0];
		var12 = field3038[1];
		var13 = field3038[2];
		var14 = field3039[0];
		int var15 = field3039[1];
		int var16 = field3039[2];
		float var17 = field3041[0];
		float var18 = field3041[1];
		float var19 = field3041[2];
		Rasterizer3D.clips.field3098 = false;
		int var20 = Rasterizer3D.method5290();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.field3098 = true;
			}

			this.method5689(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3038[3] < 0 || field3038[3] > var20) {
				Rasterizer3D.clips.field3098 = true;
			}

			int var22;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var23;
				int var25;
				if (this.textureFaces != null && this.textureFaces[var1] != -1) {
					int var24 = this.textureFaces[var1] & 255;
					var25 = this.texIndices1[var24];
					var22 = this.texIndices2[var24];
					var23 = this.texIndices3[var24];
				} else {
					var25 = var5;
					var22 = var6;
					var23 = var7;
				}

				short var26 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method5285(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26);
					Rasterizer3D.method5285(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26);
				} else {
					Rasterizer3D.method5285(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26);
					Rasterizer3D.method5285(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], field3022[0], field3022[2], field3022[3], field3036[var25], field3036[var22], field3036[var23], field2987[var25], field2987[var22], field2987[var23], field3029[var25], field3029[var22], field3029[var23], var26);
				}
			} else {
				boolean var21 = this.method5712(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field3009[this.faceColors1[var1]];
					Rasterizer3D.method5284(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method5284(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field3009[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], var22);
				} else if (var21) {
					Rasterizer3D.method5301(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method5301(var14, var16, field3039[3], var11, var13, field3038[3], 0.0F, 0.0F, 0.0F, field3022[0], field3022[2], field3022[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3022[0], field3022[1], field3022[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field3039[3], var11, var13, field3038[3], var17, var19, field3041[3], field3022[0], field3022[2], field3022[3]);
				}
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILsr;)V"
	)
	void method5715(int var1, class469 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4843[0] * var3 + var2.field4843[4] * var4 + var2.field4843[8] * var5 + var2.field4843[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4843[1] * var3 + var2.field4843[5] * var4 + var2.field4843[9] * var5 + var2.field4843[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4843[2] * var3 + var2.field4843[6] * var4 + var2.field4843[10] * var5 + var2.field4843[14] * var6));
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lkn;I)V"
	)
	void method5777(class272 var1, int var2) {
		if (this.field3011 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field3011[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field3012[var3];
					field2986.method8656();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class129 var8 = var1.method5358(var7);
						if (var8 != null) {
							field3050.method8630((float)var5[var6] / 255.0F);
							field2988.method8629(var8.method3060(var2));
							field2988.method8633(field3050);
							field2986.method8657(field2988);
						}
					}

					this.method5715(var3, field2986);
				}
			}

		}
	}

	@ObfuscatedName("de")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		int var11 = var5 * var8 - var4 * var6 >> 16;
		int var12 = var2 * var7 + var3 * var11 >> 16;
		int var13 = var3 * this.xzRadius >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.method5298()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method5288()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.texIndicesCount > 0;
							int var28 = InvDefinition.method3541();
							int var29 = class93.method2438();
							boolean var30 = UserComparator8.method2944();
							boolean var31 = 0L != var9 && !class164.method3461(var9);
							boolean var33 = false;
							int var37;
							int var38;
							int var39;
							int var40;
							int var55;
							int var59;
							int var60;
							int var61;
							if (var31 && var30) {
								boolean var34 = false;
								if (field3045) {
									boolean var35;
									if (!UserComparator8.method2944()) {
										var35 = false;
									} else {
										int var43;
										int var44;
										int var45;
										int var46;
										if (!ViewportMouse.ViewportMouse_false0) {
											var37 = Scene.Scene_cameraPitchSine;
											var38 = Scene.Scene_cameraPitchCosine;
											var39 = Scene.Scene_cameraYawSine;
											var40 = Scene.Scene_cameraYawCosine;
											byte var41 = 50;
											short var42 = 3500;
											var43 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var41 / Rasterizer3D.get3dZoom();
											var44 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var41 / Rasterizer3D.get3dZoom();
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var42 / Rasterizer3D.get3dZoom();
											var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var42 / Rasterizer3D.get3dZoom();
											int var48 = var41 * var37 + var38 * var44 >> 16;
											int var49 = var41 * var38 - var37 * var44 >> 16;
											int var50 = var38 * var46 + var42 * var37 >> 16;
											int var51 = var38 * var42 - var46 * var37 >> 16;
											int var52 = var43 * var40 - var39 * var49 >> 16;
											var60 = class17.method210(var43, var49, var40, var39);
											int var53 = var40 * var45 - var39 * var51 >> 16;
											var61 = class17.method210(var45, var51, var40, var39);
											ViewportMouse.field3064 = (var53 + var52) / 2;
											HttpRequestTask.field90 = (var48 + var50) / 2;
											class73.field921 = (var61 + var60) / 2;
											class235.field2478 = (var53 - var52) / 2;
											BuddyRankComparator.field1480 = (var50 - var48) / 2;
											class473.field4870 = (var61 - var60) / 2;
											BufferedSink.field4801 = Math.abs(class235.field2478);
											FileSystem.field2340 = Math.abs(BuddyRankComparator.field1480);
											class7.field21 = Math.abs(class473.field4870);
										}

										AABB var54 = (AABB)this.aabb.get(var1);
										var38 = var54.xMid + var6;
										var39 = var7 + var54.yMid;
										var40 = var8 + var54.zMid;
										var60 = var54.xMidOffset;
										var61 = var54.yMidOffset;
										var43 = var54.zMidOffset;
										var44 = ViewportMouse.field3064 - var38;
										var45 = HttpRequestTask.field90 - var39;
										var46 = class73.field921 - var40;
										if (Math.abs(var44) > var60 + BufferedSink.field4801) {
											var35 = false;
										} else if (Math.abs(var45) > var61 + FileSystem.field2340) {
											var35 = false;
										} else if (Math.abs(var46) > var43 + class7.field21) {
											var35 = false;
										} else if (Math.abs(var46 * BuddyRankComparator.field1480 - var45 * class473.field4870) > var61 * class7.field21 + var43 * FileSystem.field2340) {
											var35 = false;
										} else if (Math.abs(var44 * class473.field4870 - var46 * class235.field2478) > var43 * BufferedSink.field4801 + var60 * class7.field21) {
											var35 = false;
										} else if (Math.abs(var45 * class235.field2478 - var44 * BuddyRankComparator.field1480) > var60 * FileSystem.field2340 + var61 * BufferedSink.field4801) {
											var35 = false;
										} else {
											var35 = true;
										}
									}

									var34 = var35;
								} else {
									var59 = var12 - var13;
									if (var59 <= 50) {
										var59 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var59;
									} else {
										var17 /= var14;
										var16 /= var59;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var59;
									} else {
										var21 /= var14;
										var23 /= var59;
									}

									var55 = var28 - Rasterizer3D.getClipMidX();
									var37 = var29 - Rasterizer3D.getClipMidY();
									if (var55 > var16 && var55 < var17 && var37 > var23 && var37 < var21) {
										var34 = true;
									}
								}

								if (var34) {
									if (this.isSingleTile) {
										class152.method3290(var9);
									} else {
										var33 = true;
									}
								}
							}

							int var58 = Rasterizer3D.getClipMidX();
							var59 = Rasterizer3D.getClipMidY();
							var55 = 0;
							var37 = 0;
							if (var1 != 0) {
								var55 = field3049[var1];
								var37 = field3052[var1];
							}

							for (var38 = 0; var38 < this.verticesCount; ++var38) {
								var39 = this.verticesX[var38];
								var40 = this.verticesY[var38];
								var60 = this.verticesZ[var38];
								if (var1 != 0) {
									var61 = var60 * var55 + var39 * var37 >> 16;
									var60 = var60 * var37 - var39 * var55 >> 16;
									var39 = var61;
								}

								var39 += var6;
								var40 += var7;
								var60 += var8;
								var61 = var60 * var4 + var5 * var39 >> 16;
								var60 = var5 * var60 - var39 * var4 >> 16;
								var39 = var61;
								var61 = var3 * var40 - var60 * var2 >> 16;
								var60 = var40 * var2 + var3 * var60 >> 16;
								field3026[var38] = var60 - var12;
								if (var60 >= 50) {
									modelViewportXs[var38] = var58 + var39 * Rasterizer3D.get3dZoom() / var60;
									modelViewportYs[var38] = var59 + var61 * Rasterizer3D.get3dZoom() / var60;
									field3013[var38] = ClanSettings.method3332(var60);
								} else {
									modelViewportXs[var38] = -5000;
									var25 = true;
								}

								if (var27) {
									field3036[var38] = var39;
									field2987[var38] = var61;
									field3029[var38] = var60;
								}
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9);
							} catch (Exception var57) {
							}

						}
					}
				}
			}
		}
	}
}
