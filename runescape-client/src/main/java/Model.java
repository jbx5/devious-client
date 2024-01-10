import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ap")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("aj")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class466 field3031;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class466 field2976;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static class466 field2977;
	@ObfuscatedName("bv")
	static boolean[] field3028;
	@ObfuscatedName("bm")
	static boolean[] field3011;
	@ObfuscatedName("bq")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bb")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bh")
	static float[] field2987;
	@ObfuscatedName("bw")
	static int[] field3015;
	@ObfuscatedName("bi")
	static int[] field3030;
	@ObfuscatedName("bu")
	static int[] field3018;
	@ObfuscatedName("be")
	static int[] field2989;
	@ObfuscatedName("bl")
	static char[] field3020;
	@ObfuscatedName("bz")
	static char[][] field3022;
	@ObfuscatedName("bo")
	static int[] field2972;
	@ObfuscatedName("cg")
	static int[][] field3010;
	@ObfuscatedName("cb")
	static int[] field3024;
	@ObfuscatedName("ci")
	static int[] field3025;
	@ObfuscatedName("cv")
	static int[] field3026;
	@ObfuscatedName("ct")
	static int[] field3027;
	@ObfuscatedName("cp")
	static int[] field2971;
	@ObfuscatedName("cq")
	static int[] field3016;
	@ObfuscatedName("cl")
	static float[] field3014;
	@ObfuscatedName("cs")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cc")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cd")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cu")
	static boolean field3034;
	@ObfuscatedName("cn")
	static int[] field3037;
	@ObfuscatedName("ch")
	static int[] field3038;
	@ObfuscatedName("cr")
	static int[] field3042;
	@ObfuscatedName("ce")
	static int[] field3040;
	@ObfuscatedName("cm")
	static final float field2975;
	@ObfuscatedName("ao")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ae")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("aa")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("au")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("an")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ad")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ax")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("aw")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("az")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("av")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ak")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ay")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("as")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ab")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ah")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ai")
	public byte field2993;
	@ObfuscatedName("ac")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("al")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("at")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bj")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bd")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bg")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bt")
	int[][] field3000;
	@ObfuscatedName("br")
	int[][] field3001;
	@ObfuscatedName("ba")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bk")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bn")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("by")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bc")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bx")
	@Export("radius")
	int radius;
	@ObfuscatedName("bf")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("cj")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cf")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cw")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cx")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ca")
	public short field2995;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field3031 = new class466();
		field2976 = new class466();
		field2977 = new class466();
		field3028 = new boolean[6500];
		field3011 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2987 = new float[6500];
		field3015 = new int[6500];
		field3030 = new int[6500];
		field3018 = new int[6500];
		field2989 = new int[6500];
		field3020 = new char[6000];
		field3022 = new char[6000][512];
		field2972 = new int[12];
		field3010 = new int[12][2000];
		field3024 = new int[2000];
		field3025 = new int[2000];
		field3026 = new int[12];
		field3027 = new int[10];
		field2971 = new int[10];
		field3016 = new int[10];
		field3014 = new float[10];
		field3034 = true;
		field3037 = Rasterizer3D.Rasterizer3D_sine;
		field3038 = Rasterizer3D.Rasterizer3D_cosine;
		field3042 = Rasterizer3D.Rasterizer3D_colorPalette;
		field3040 = Rasterizer3D.field2804;
		field2975 = SoundSystem.method871(50);
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2993 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2993 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method5657(var1, var2, var3);
		this.field2993 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Lko;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2993 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2993 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2993 == -1) {
					this.field2993 = var4.field2993;
				}
			}
		}

		this.method5657(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5635(var1[var3]);
		}

	}

	@ObfuscatedName("am")
	void method5657(int var1, int var2, int var3) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	void method5636(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2993 != var1.field2993)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2993);
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	public void method5635(Model var1) {
		if (var1 != null) {
			this.method5636(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2993;
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lko;"
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
					var11.field2993 = this.field2993;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Z)Lko;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Z)Lko;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZLko;[B)Lko;"
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
		var2.field2993 = this.field2993;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field3000 = this.field3000;
		var2.field3001 = this.field3001;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("an")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field3038[var1];
			int var9 = field3037[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = class351.method6892(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var14 = this.verticesX[var10];
				int var15 = this.verticesZ[var10];
				int var13 = var8 * var15 - var9 * var14 >> 16;
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
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

	@ObfuscatedName("ad")
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

	@ObfuscatedName("ax")
	void method5697() {
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

	@ObfuscatedName("aw")
	public int method5644() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("az")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V"
	)
	public void method5749(class138 var1, int var2) {
		Skeleton var3 = var1.field1601;
		class270 var4 = var3.method5373();
		if (var4 != null) {
			var3.method5373().method5326(var1, var2);
			this.method5649(var3.method5373(), var1.method3160());
		}

		if (var1.method3161()) {
			this.method5648(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfu;I)V"
	)
	void method5648(class138 var1, int var2) {
		Skeleton var3 = var1.field1601;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1598 != null && var1.field1598[var4] != null && var1.field1598[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class131 var6 = var1.field1598[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3086(var2) * 255.0F);
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V"
	)
	void method5649(class270 var1, int var2) {
		this.method5669(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lky;ILky;I[I)V"
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkr;Lfu;I[ZZZ)V"
	)
	public void method5650(Skeleton var1, class138 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class270 var7 = var1.method5373();
		if (var7 != null) {
			var7.method5327(var2, var3, var4, var5);
			if (var6) {
				this.method5649(var7, var2.method3160());
			}
		}

		if (!var5 && var2.method3161()) {
			this.method5648(var2, var3);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lky;I[IZ)V"
	)
	public void method5652(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("ac")
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
								var15 = field3037[var14];
								var16 = field3038[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field3037[var12];
								var16 = field3038[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field3037[var13];
								var16 = field3038[var13];
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

	@ObfuscatedName("al")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("at")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bj")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bd")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3037[var1];
		int var3 = field3038[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bg")
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

	@ObfuscatedName("bt")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("br")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5697();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field3037[var1];
		int var11 = field3038[var1];
		int var12 = field3037[var2];
		int var13 = field3038[var2];
		int var14 = field3037[var3];
		int var15 = field3038[var3];
		int var16 = field3037[var4];
		int var17 = field3038[var4];
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
			field3015[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2987[var19] = SoundSystem.method871(var22);
			if (this.texIndicesCount > 0) {
				field3030[var19] = var20;
				field3018[var19] = var23;
				field2989[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("ba")
	public final void method5661(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5697();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field3037[var1];
		int var12 = field3038[var1];
		int var13 = field3037[var2];
		int var14 = field3038[var2];
		int var15 = field3037[var3];
		int var16 = field3038[var3];
		int var17 = field3037[var4];
		int var18 = field3038[var4];
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
			field3015[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2987[var20] = SoundSystem.method871(var8);
			if (this.texIndicesCount > 0) {
				field3030[var20] = var21;
				field3018[var20] = var24;
				field2989[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bk")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field3020[var6] = 0;
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
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2) {
							var15 = modelViewportYs[var8];
							var16 = modelViewportYs[var9];
							var30 = modelViewportYs[var10];
							var18 = var6 + ViewportMouse.ViewportMouse_y;
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) {
								var37 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var15 && var18 > var16 && var18 > var30) {
									var37 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var28) {
										var37 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var28) {
											var37 = false;
										} else {
											var37 = true;
										}
									}
								}
							}

							if (var37) {
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field3011[var7] = false;
							var29 = Rasterizer3D.method5259();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field3028[var7] = false;
							} else {
								field3028[var7] = true;
							}

							var15 = (field3015[var8] + field3015[var9] + field3015[var10]) / 3 + this.radius;
							field3022[var15][field3020[var15]++] = var7;
						}
					} else {
						var29 = field3030[var8];
						var15 = field3030[var9];
						var16 = field3030[var10];
						var30 = field3018[var8];
						var18 = field3018[var9];
						int var19 = field3018[var10];
						int var20 = field2989[var8];
						int var21 = field2989[var9];
						int var22 = field2989[var10];
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
							field3011[var7] = true;
							int var26 = (field3015[var8] + field3015[var9] + field3015[var10]) / 3 + this.radius;
							field3022[var26][field3020[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field3020[var33];
					if (var34 > 0) {
						var27 = field3022[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2972[var33] = 0;
					field3026[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field3020[var33];
					if (var34 > 0) {
						var27 = field3022[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2972[var36]++;
							field3010[var36][var28] = var35;
							if (var36 < 10) {
								int[] var38 = field3026;
								var38[var36] += var33;
							} else if (var36 == 10) {
								field3024[var28] = var33;
							} else {
								field3025[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2972[1] > 0 || field2972[2] > 0) {
					var33 = (field3026[1] + field3026[2]) / (field2972[1] + field2972[2]);
				}

				var8 = 0;
				if (field2972[3] > 0 || field2972[4] > 0) {
					var8 = (field3026[3] + field3026[4]) / (field2972[3] + field2972[4]);
				}

				var9 = 0;
				if (field2972[6] > 0 || field2972[8] > 0) {
					var9 = (field3026[8] + field3026[6]) / (field2972[8] + field2972[6]);
				}

				var11 = 0;
				var12 = field2972[10];
				int[] var13 = field3010[10];
				int[] var14 = field3024;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2972[11];
					var13 = field3010[11];
					var14 = field3025;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3010[11]) {
							var11 = 0;
							var12 = field2972[11];
							var13 = field3010[11];
							var14 = field3025;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3010[11]) {
							var11 = 0;
							var12 = field2972[11];
							var13 = field3010[11];
							var14 = field3025;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3010[11]) {
							var11 = 0;
							var12 = field2972[11];
							var13 = field3010[11];
							var14 = field3025;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2972[var15];
					int[] var17 = field3010[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field3010[11]) {
						var11 = 0;
						var13 = field3010[11];
						var12 = field2972[11];
						var14 = field3025;
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

	@ObfuscatedName("bn")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field3011[var1]) {
			this.method5667(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.field3098 = field3028[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.field3081 = 0;
			} else {
				Rasterizer3D.clips.field3081 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5666(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2987[var2], field2987[var3], field2987[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("by")
	boolean method5665(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2995;
	}

	@ObfuscatedName("bc")
	final void method5666(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.method5261(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3030[var18], field3030[var15], field3030[var16], field3018[var18], field3018[var15], field3018[var16], field2989[var18], field2989[var15], field2989[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method5261(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3030[var18], field3030[var15], field3030[var16], field3018[var18], field3018[var15], field3018[var16], field2989[var18], field2989[var15], field2989[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5665(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method5270(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3042[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3042[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method5291(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bx")
	final void method5667(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2989[var5];
		int var9 = field2989[var6];
		int var10 = field2989[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.field3081 = 0;
		} else {
			Rasterizer3D.clips.field3081 = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field3027[var4] = modelViewportXs[var5];
			field2971[var4] = modelViewportYs[var5];
			field3014[var4] = field2987[var7];
			field3016[var4++] = this.faceColors1[var1];
		} else {
			var11 = field3030[var5];
			var12 = field3018[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field3040[var10 - var8] * (50 - var8);
				field3027[var4] = var2 + (var11 + ((field3030[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2971[var4] = var3 + (var12 + ((field3018[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3014[var4] = field2975;
				field3016[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field3040[var9 - var8] * (50 - var8);
				field3027[var4] = var2 + (var11 + ((field3030[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2971[var4] = var3 + (var12 + ((field3018[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3014[var4] = field2975;
				field3016[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field3027[var4] = modelViewportXs[var6];
			field2971[var4] = modelViewportYs[var6];
			field3014[var4] = field2987[var7];
			field3016[var4++] = this.faceColors2[var1];
		} else {
			var11 = field3030[var6];
			var12 = field3018[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field3040[var8 - var9] * (50 - var9);
				field3027[var4] = var2 + (var11 + ((field3030[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2971[var4] = var3 + (var12 + ((field3018[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3014[var4] = field2975;
				field3016[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field3040[var10 - var9] * (50 - var9);
				field3027[var4] = var2 + (var11 + ((field3030[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2971[var4] = var3 + (var12 + ((field3018[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3016[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field3027[var4] = modelViewportXs[var7];
			field2971[var4] = modelViewportYs[var7];
			field3014[var4] = field2987[var7];
			field3016[var4++] = this.faceColors3[var1];
		} else {
			var11 = field3030[var7];
			var12 = field3018[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field3040[var9 - var10] * (50 - var10);
				field3027[var4] = var2 + (var11 + ((field3030[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2971[var4] = var3 + (var12 + ((field3018[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3014[var4] = field2975;
				field3016[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field3040[var8 - var10] * (50 - var10);
				field3027[var4] = var2 + (var11 + ((field3030[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2971[var4] = var3 + (var12 + ((field3018[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3014[var4] = field2975;
				field3016[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field3027[0];
		var12 = field3027[1];
		var13 = field3027[2];
		var14 = field2971[0];
		int var15 = field2971[1];
		int var16 = field2971[2];
		float var17 = field3014[0];
		float var18 = field3014[1];
		float var19 = field3014[2];
		Rasterizer3D.clips.field3098 = false;
		int var20 = Rasterizer3D.method5259();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.field3098 = true;
			}

			this.method5666(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3027[3] < 0 || field3027[3] > var20) {
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
					Rasterizer3D.method5261(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26);
					Rasterizer3D.method5261(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26);
				} else {
					Rasterizer3D.method5261(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26);
					Rasterizer3D.method5261(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], field3016[0], field3016[2], field3016[3], field3030[var25], field3030[var22], field3030[var23], field3018[var25], field3018[var22], field3018[var23], field2989[var25], field2989[var22], field2989[var23], var26);
				}
			} else {
				boolean var21 = this.method5665(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field3042[this.faceColors1[var1]];
					Rasterizer3D.method5270(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method5270(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field3042[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], var22);
				} else if (var21) {
					Rasterizer3D.method5291(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method5291(var14, var16, field2971[3], var11, var13, field3027[3], 0.0F, 0.0F, 0.0F, field3016[0], field3016[2], field3016[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3016[0], field3016[1], field3016[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2971[3], var11, var13, field3027[3], var17, var19, field3014[3], field3016[0], field3016[2], field3016[3]);
				}
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILrh;)V"
	)
	void method5668(int var1, class466 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4809[0] * var3 + var2.field4809[4] * var4 + var2.field4809[8] * var5 + var2.field4809[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4809[1] * var3 + var2.field4809[5] * var4 + var2.field4809[9] * var5 + var2.field4809[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4809[2] * var3 + var2.field4809[6] * var4 + var2.field4809[10] * var5 + var2.field4809[14] * var6));
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lkx;I)V"
	)
	void method5669(class270 var1, int var2) {
		if (this.field3000 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field3000[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field3001[var3];
					field3031.method8547();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class128 var8 = var1.method5324(var7);
						if (var8 != null) {
							field2976.method8549((float)var5[var6] / 255.0F);
							field2977.method8548(var8.method3037(var2));
							field2977.method8552(field2976);
							field3031.method8551(field2977);
						}
					}

					this.method5668(var3, field3031);
				}
			}

		}
	}

	@ObfuscatedName("do")
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
				if (var17 / var14 > Rasterizer3D.method5254()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method5257()) {
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
							int var28 = HttpResponse.method312();
							int var29 = MusicPatchNode2.method6036();
							boolean var30 = class59.method1184();
							boolean var31 = ByteArrayPool.method8033(var9);
							boolean var32 = false;
							int var37;
							int var38;
							int var39;
							int var40;
							int var41;
							int var46;
							int var47;
							int var51;
							if (var31 && var30) {
								boolean var33 = false;
								if (field3034) {
									boolean var34;
									if (!class59.method1184()) {
										var34 = false;
									} else {
										class181.method3687();
										AABB var36 = (AABB)this.aabb.get(var1);
										var37 = var36.xMid + var6;
										var38 = var7 + var36.yMid;
										var39 = var8 + var36.zMid;
										var40 = var36.xMidOffset;
										var41 = var36.yMidOffset;
										int var42 = var36.zMidOffset;
										int var43 = class403.field4501 - var37;
										int var44 = ViewportMouse.field3063 - var38;
										int var45 = ViewportMouse.field3054 - var39;
										if (Math.abs(var43) > var40 + class148.field1662) {
											var34 = false;
										} else if (Math.abs(var44) > var41 + UserComparator7.field1450) {
											var34 = false;
										} else if (Math.abs(var45) > var42 + DynamicObject.field998) {
											var34 = false;
										} else if (Math.abs(var45 * class151.field1681 - var44 * class140.field1625) > var41 * DynamicObject.field998 + var42 * UserComparator7.field1450) {
											var34 = false;
										} else if (Math.abs(var43 * class140.field1625 - var45 * ViewportMouse.field3055) > var42 * class148.field1662 + var40 * DynamicObject.field998) {
											var34 = false;
										} else if (Math.abs(var44 * ViewportMouse.field3055 - var43 * class151.field1681) > var41 * class148.field1662 + var40 * UserComparator7.field1450) {
											var34 = false;
										} else {
											var34 = true;
										}
									}

									var33 = var34;
								} else {
									var51 = var12 - var13;
									if (var51 <= 50) {
										var51 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var51;
									} else {
										var17 /= var14;
										var16 /= var51;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var51;
									} else {
										var21 /= var14;
										var23 /= var51;
									}

									var46 = var28 - Rasterizer3D.getClipMidX();
									var47 = var29 - Rasterizer3D.getClipMidY();
									if (var46 > var16 && var46 < var17 && var47 > var23 && var47 < var21) {
										var33 = true;
									}
								}

								if (var33) {
									if (this.isSingleTile) {
										TileItem.method2757(var9);
									} else {
										var32 = true;
									}
								}
							}

							int var50 = Rasterizer3D.getClipMidX();
							var51 = Rasterizer3D.getClipMidY();
							var46 = 0;
							var47 = 0;
							if (var1 != 0) {
								var46 = field3037[var1];
								var47 = field3038[var1];
							}

							for (var37 = 0; var37 < this.verticesCount; ++var37) {
								var38 = this.verticesX[var37];
								var39 = this.verticesY[var37];
								var40 = this.verticesZ[var37];
								if (var1 != 0) {
									var41 = var40 * var46 + var38 * var47 >> 16;
									var40 = var40 * var47 - var38 * var46 >> 16;
									var38 = var41;
								}

								var38 += var6;
								var39 += var7;
								var40 += var8;
								var41 = var40 * var4 + var5 * var38 >> 16;
								var40 = var5 * var40 - var38 * var4 >> 16;
								var38 = var41;
								var41 = var3 * var39 - var40 * var2 >> 16;
								var40 = var39 * var2 + var3 * var40 >> 16;
								field3015[var37] = var40 - var12;
								if (var40 >= 50) {
									modelViewportXs[var37] = var50 + var38 * Rasterizer3D.get3dZoom() / var40;
									modelViewportYs[var37] = var51 + var41 * Rasterizer3D.get3dZoom() / var40;
									field2987[var37] = SoundSystem.method871(var40);
								} else {
									modelViewportXs[var37] = -5000;
									var25 = true;
								}

								if (var27) {
									field3030[var37] = var38;
									field3018[var37] = var41;
									field2989[var37] = var40;
								}
							}

							try {
								this.draw0(var25, var32, this.isSingleTile, var9);
							} catch (Exception var49) {
							}

						}
					}
				}
			}
		}
	}
}
