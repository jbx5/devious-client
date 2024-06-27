import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ad")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("ak")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static class424 field3114;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static class424 field3085;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqg;"
	)
	static class424 field3127;
	@ObfuscatedName("bw")
	static boolean[] field3116;
	@ObfuscatedName("bl")
	static boolean[] field3120;
	@ObfuscatedName("bc")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bv")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bb")
	static float[] field3123;
	@ObfuscatedName("bn")
	static int[] field3094;
	@ObfuscatedName("bh")
	static int[] field3146;
	@ObfuscatedName("bq")
	static int[] field3141;
	@ObfuscatedName("bd")
	static int[] field3124;
	@ObfuscatedName("bk")
	static char[] field3126;
	@ObfuscatedName("br")
	static char[][] field3130;
	@ObfuscatedName("bf")
	static int[] field3131;
	@ObfuscatedName("cf")
	static int[][] field3132;
	@ObfuscatedName("cv")
	static int[] field3086;
	@ObfuscatedName("cl")
	static float[] field3153;
	@ObfuscatedName("cm")
	static int[] field3139;
	@ObfuscatedName("cg")
	static int[] field3145;
	@ObfuscatedName("cu")
	static int[] field3080;
	@ObfuscatedName("cn")
	static int[] field3089;
	@ObfuscatedName("ce")
	static int[] field3138;
	@ObfuscatedName("co")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("ch")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("ct")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cd")
	static boolean field3143;
	@ObfuscatedName("cs")
	static int[] field3105;
	@ObfuscatedName("cp")
	static int[] field3147;
	@ObfuscatedName("cy")
	static int[] field3135;
	@ObfuscatedName("cw")
	static int[] field3149;
	@ObfuscatedName("cc")
	static final float field3151;
	@ObfuscatedName("ca")
	static float[] field3157;
	@ObfuscatedName("av")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ab")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ai")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("ae")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("au")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ah")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("az")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ax")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("ac")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("al")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ay")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ao")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("aa")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("as")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("aw")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("at")
	public byte field3155;
	@ObfuscatedName("af")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("am")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ar")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bt")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bj")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("be")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bm")
	int[][] field3109;
	@ObfuscatedName("bo")
	int[][] field3110;
	@ObfuscatedName("bi")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("ba")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bg")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bs")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bp")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bx")
	@Export("radius")
	int radius;
	@ObfuscatedName("bu")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("cr")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cb")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cz")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cj")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cx")
	public short field3156;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field3114 = new class424();
		field3085 = new class424();
		field3127 = new class424();
		field3116 = new boolean[6500];
		field3120 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field3123 = new float[6500];
		field3094 = new int[6500];
		field3146 = new int[6500];
		field3141 = new int[6500];
		field3124 = new int[6500];
		field3126 = new char[6000];
		field3130 = new char[6000][512];
		field3131 = new int[12];
		field3132 = new int[12][2000];
		field3086 = new int[2000];
		field3139 = new int[2000];
		field3145 = new int[12];
		field3080 = new int[10];
		field3089 = new int[10];
		field3138 = new int[10];
		field3153 = new float[10];
		field3143 = true;
		field3105 = Rasterizer3D.Rasterizer3D_sine;
		field3147 = Rasterizer3D.Rasterizer3D_cosine;
		field3135 = Rasterizer3D.Rasterizer3D_colorPalette;
		field3149 = Rasterizer3D.field2880;
		field3151 = class386.method7177(50);
		field3157 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3155 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3155 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method5878(var1, var2, var3);
		this.field3155 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Llv;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field3155 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field3155 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field3155 == -1) {
					this.field3155 = var4.field3155;
				}
			}
		}

		this.method5878(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5759(var1[var3]);
		}

	}

	@ObfuscatedName("aq")
	void method5878(int var1, int var2, int var3) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Llv;)V"
	)
	void method5758(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field3155 != var1.field3155)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field3155);
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Llv;)V"
	)
	public void method5759(Model var1) {
		if (var1 != null) {
			this.method5758(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field3155;
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Llv;"
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
					var11.field3155 = this.field3155;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Z)Llv;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Z)Llv;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZLlv;[B)Llv;"
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
		var2.field3155 = this.field3155;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field3109 = this.field3109;
		var2.field3110 = this.field3110;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("av")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field3147[var1];
			int var9 = field3105[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var12 = this.verticesX[var10];
				int var13 = this.verticesZ[var10];
				int var11 = var12 * var8 + var9 * var13 >> 16;
				int var15 = this.verticesY[var10];
				int var16 = class221.method4242(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

	@ObfuscatedName("ab")
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

	@ObfuscatedName("ai")
	void method5766() {
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

	@ObfuscatedName("ae")
	public int method5767() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("au")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Llf;I)V"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lft;I)V"
	)
	public void method5822(class142 var1, int var2) {
		Skeleton var3 = var1.field1651;
		class279 var4 = var3.method5407();
		if (var4 != null) {
			var3.method5407().method5345(var1, var2);
			this.method5800(var3.method5407(), var1.method3205());
		}

		if (var1.method3206()) {
			this.method5771(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lft;I)V"
	)
	void method5771(class142 var1, int var2) {
		Skeleton var3 = var1.field1651;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1654 != null && var1.field1654[var4] != null && var1.field1654[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class135 var6 = var1.field1654[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3137(var2) * 255.0F);
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	void method5800(class279 var1, int var2) {
		this.method5794(var1, var2);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Llf;ILlf;I[I)V"
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lft;I[ZZZ)V"
	)
	public void method5860(Skeleton var1, class142 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class279 var7 = var1.method5407();
		if (var7 != null) {
			var7.method5346(var2, var3, var4, var5);
			if (var6) {
				this.method5800(var7, var2.method3205());
			}
		}

		if (!var5 && var2.method3206()) {
			this.method5771(var2, var3);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Llf;I[IZ)V"
	)
	public void method5775(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("af")
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
								var15 = field3105[var14];
								var16 = field3147[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field3105[var12];
								var16 = field3147[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field3105[var13];
								var16 = field3147[var13];
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

	@ObfuscatedName("am")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ar")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bt")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bj")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field3105[var1];
		int var3 = field3147[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("be")
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

	@ObfuscatedName("bm")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bo")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5766();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field3105[var1];
		int var11 = field3147[var1];
		int var12 = field3105[var2];
		int var13 = field3147[var2];
		int var14 = field3105[var3];
		int var15 = field3147[var3];
		int var16 = field3105[var4];
		int var17 = field3147[var4];
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
			field3094[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field3123[var19] = class386.method7177(var22);
			if (this.texIndicesCount > 0) {
				field3146[var19] = var20;
				field3141[var19] = var23;
				field3124[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bi")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method5766();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field3105[var1];
		int var12 = field3147[var1];
		int var13 = field3105[var2];
		int var14 = field3147[var2];
		int var15 = field3105[var3];
		int var16 = field3147[var3];
		int var17 = field3105[var4];
		int var18 = field3147[var4];
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
			field3094[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field3123[var20] = class386.method7177(var8);
			if (this.texIndicesCount > 0) {
				field3146[var20] = var21;
				field3141[var20] = var24;
				field3124[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("ba")
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
		if (var14 > 50 && var12 < AbstractRasterizer.method5369()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method5271()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method5255()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.texIndicesCount > 0;
							int var28 = ViewportMouse.ViewportMouse_x;
							int var30 = class225.method4306();
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var34 = var9 != 0L;
							boolean var35;
							if (var34) {
								var35 = (int)(var9 >>> 16 & 1L) == 1;
								var34 = !var35;
							}

							var35 = false;
							int var37;
							int var38;
							int var39;
							if (var34 && var31) {
								boolean var36 = false;
								if (field3143) {
									var36 = WorldMapRegion.method4785(this, var1, var6, var7, var8, var2, var3, var4, var5);
								} else {
									var37 = var12 - var13;
									if (var37 <= 50) {
										var37 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var37;
									} else {
										var17 /= var14;
										var16 /= var37;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var37;
									} else {
										var21 /= var14;
										var23 /= var37;
									}

									var38 = var28 - Rasterizer3D.getClipMidX();
									var39 = var30 - Rasterizer3D.getClipMidY();
									if (var38 > var16 && var38 < var17 && var39 > var23 && var39 < var21) {
										var36 = true;
									}
								}

								if (var36) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var35 = true;
									}
								}
							}

							int var49 = Rasterizer3D.getClipMidX();
							var37 = Rasterizer3D.getClipMidY();
							var38 = 0;
							var39 = 0;
							if (var1 != 0) {
								var38 = field3105[var1];
								var39 = field3147[var1];
							}

							for (int var40 = 0; var40 < this.verticesCount; ++var40) {
								int var41 = this.verticesX[var40];
								int var42 = this.verticesY[var40];
								int var43 = this.verticesZ[var40];
								int var44;
								if (var1 != 0) {
									var44 = var43 * var38 + var41 * var39 >> 16;
									var43 = var43 * var39 - var41 * var38 >> 16;
									var41 = var44;
								}

								var41 += var6;
								var42 += var7;
								var43 += var8;
								var44 = var43 * var4 + var5 * var41 >> 16;
								var43 = var5 * var43 - var41 * var4 >> 16;
								var41 = var44;
								var44 = var3 * var42 - var43 * var2 >> 16;
								var43 = var42 * var2 + var3 * var43 >> 16;
								field3094[var40] = var43 - var12;
								if (var43 >= 50) {
									modelViewportXs[var40] = var49 + var41 * Rasterizer3D.get3dZoom() / var43;
									modelViewportYs[var40] = var37 + var44 * Rasterizer3D.get3dZoom() / var43;
									field3123[var40] = class386.method7177(var43);
								} else {
									modelViewportXs[var40] = -5000;
									var25 = true;
								}

								if (var27) {
									field3146[var40] = var41;
									field3141[var40] = var44;
									field3124[var40] = var43;
								}
							}

							try {
								this.draw0(var25, var35, this.isSingleTile, var9);
							} catch (Exception var48) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bg")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field3126[var6] = 0;
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
						var29 = field3146[var8];
						var15 = field3146[var9];
						var16 = field3146[var10];
						int var30 = field3141[var8];
						var18 = field3141[var9];
						int var19 = field3141[var10];
						int var20 = field3124[var8];
						int var21 = field3124[var9];
						int var22 = field3124[var10];
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
							field3120[var7] = true;
							int var26 = (field3094[var8] + field3094[var9] + field3094[var10]) / 3 + this.radius;
							field3130[var26][field3126[var26]++] = var7;
						}
					} else {
						if (var2 && class47.method902(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field3120[var7] = false;
							var29 = Rasterizer3D.method5258();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field3116[var7] = false;
							} else {
								field3116[var7] = true;
							}

							var15 = (field3094[var8] + field3094[var9] + field3094[var10]) / 3 + this.radius;
							field3130[var15][field3126[var15]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field3126[var33];
					if (var34 > 0) {
						var27 = field3130[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field3131[var33] = 0;
					field3145[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field3126[var33];
					if (var34 > 0) {
						var27 = field3130[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field3131[var36]++;
							field3132[var36][var28] = var35;
							if (var36 < 10) {
								int[] var37 = field3145;
								var37[var36] += var33;
							} else if (var36 == 10) {
								field3086[var28] = var33;
							} else {
								field3139[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field3131[1] > 0 || field3131[2] > 0) {
					var33 = (field3145[1] + field3145[2]) / (field3131[1] + field3131[2]);
				}

				var8 = 0;
				if (field3131[3] > 0 || field3131[4] > 0) {
					var8 = (field3145[3] + field3145[4]) / (field3131[3] + field3131[4]);
				}

				var9 = 0;
				if (field3131[6] > 0 || field3131[8] > 0) {
					var9 = (field3145[8] + field3145[6]) / (field3131[8] + field3131[6]);
				}

				var11 = 0;
				var12 = field3131[10];
				int[] var13 = field3132[10];
				int[] var14 = field3086;
				if (var11 == var12) {
					var11 = 0;
					var12 = field3131[11];
					var13 = field3132[11];
					var14 = field3139;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3132[11]) {
							var11 = 0;
							var12 = field3131[11];
							var13 = field3132[11];
							var14 = field3139;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3132[11]) {
							var11 = 0;
							var12 = field3131[11];
							var13 = field3132[11];
							var14 = field3139;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field3132[11]) {
							var11 = 0;
							var12 = field3131[11];
							var13 = field3132[11];
							var14 = field3139;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field3131[var15];
					int[] var17 = field3132[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field3132[11]) {
						var11 = 0;
						var13 = field3132[11];
						var12 = field3131[11];
						var14 = field3139;
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

	@ObfuscatedName("bs")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field3120[var1]) {
			this.method5792(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.field3192 = field3116[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.field3186 = 0;
			} else {
				Rasterizer3D.clips.field3186 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5864(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field3123[var2], field3123[var3], field3123[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bp")
	boolean method5870(int var1) {
		return this.overrideAmount > 0 && var1 < this.field3156;
	}

	@ObfuscatedName("bx")
	final void method5864(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.method5267(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field3146[var18], field3146[var15], field3146[var16], field3141[var18], field3141[var15], field3141[var16], field3124[var18], field3124[var15], field3124[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method5267(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field3146[var18], field3146[var15], field3146[var16], field3141[var18], field3141[var15], field3141[var16], field3124[var18], field3124[var15], field3124[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5870(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method5270(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3135[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field3135[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method5269(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bu")
	final void method5792(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field3124[var5];
		int var9 = field3124[var6];
		int var10 = field3124[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.field3186 = 0;
		} else {
			Rasterizer3D.clips.field3186 = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field3080[var4] = modelViewportXs[var5];
			field3089[var4] = modelViewportYs[var5];
			field3153[var4] = field3123[var7];
			field3138[var4++] = this.faceColors1[var1];
		} else {
			var11 = field3146[var5];
			var12 = field3141[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field3149[var10 - var8] * (50 - var8);
				field3080[var4] = var2 + (var11 + ((field3146[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3089[var4] = var3 + (var12 + ((field3141[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3153[var4] = field3151;
				field3138[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field3149[var9 - var8] * (50 - var8);
				field3080[var4] = var2 + (var11 + ((field3146[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3089[var4] = var3 + (var12 + ((field3141[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3153[var4] = field3151;
				field3138[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field3080[var4] = modelViewportXs[var6];
			field3089[var4] = modelViewportYs[var6];
			field3153[var4] = field3123[var7];
			field3138[var4++] = this.faceColors2[var1];
		} else {
			var11 = field3146[var6];
			var12 = field3141[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field3149[var8 - var9] * (50 - var9);
				field3080[var4] = var2 + (var11 + ((field3146[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3089[var4] = var3 + (var12 + ((field3141[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3153[var4] = field3151;
				field3138[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field3149[var10 - var9] * (50 - var9);
				field3080[var4] = var2 + (var11 + ((field3146[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3089[var4] = var3 + (var12 + ((field3141[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3138[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field3080[var4] = modelViewportXs[var7];
			field3089[var4] = modelViewportYs[var7];
			field3153[var4] = field3123[var7];
			field3138[var4++] = this.faceColors3[var1];
		} else {
			var11 = field3146[var7];
			var12 = field3141[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field3149[var9 - var10] * (50 - var10);
				field3080[var4] = var2 + (var11 + ((field3146[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3089[var4] = var3 + (var12 + ((field3141[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3153[var4] = field3151;
				field3138[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field3149[var8 - var10] * (50 - var10);
				field3080[var4] = var2 + (var11 + ((field3146[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3089[var4] = var3 + (var12 + ((field3141[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field3153[var4] = field3151;
				field3138[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field3080[0];
		var12 = field3080[1];
		var13 = field3080[2];
		var14 = field3089[0];
		int var15 = field3089[1];
		int var16 = field3089[2];
		float var17 = field3153[0];
		float var18 = field3153[1];
		float var19 = field3153[2];
		Rasterizer3D.clips.field3192 = false;
		int var20 = Rasterizer3D.method5258();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.field3192 = true;
			}

			this.method5864(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field3080[3] < 0 || field3080[3] > var20) {
				Rasterizer3D.clips.field3192 = true;
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
					Rasterizer3D.method5267(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26);
					Rasterizer3D.method5267(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26);
				} else {
					Rasterizer3D.method5267(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26);
					Rasterizer3D.method5267(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], field3138[0], field3138[2], field3138[3], field3146[var25], field3146[var22], field3146[var23], field3141[var25], field3141[var22], field3141[var23], field3124[var25], field3124[var22], field3124[var23], var26);
				}
			} else {
				boolean var21 = this.method5870(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field3135[this.faceColors1[var1]];
					Rasterizer3D.method5270(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method5270(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field3135[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], var22);
				} else if (var21) {
					Rasterizer3D.method5269(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method5269(var14, var16, field3089[3], var11, var13, field3080[3], 0.0F, 0.0F, 0.0F, field3138[0], field3138[2], field3138[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field3138[0], field3138[1], field3138[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field3089[3], var11, var13, field3080[3], var17, var19, field3153[3], field3138[0], field3138[2], field3138[3]);
				}
			}
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILqg;)V"
	)
	void method5793(int var1, class424 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4709[0] * var3 + var2.field4709[4] * var4 + var2.field4709[8] * var5 + var2.field4709[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4709[1] * var3 + var2.field4709[5] * var4 + var2.field4709[9] * var5 + var2.field4709[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4709[2] * var3 + var2.field4709[6] * var4 + var2.field4709[10] * var5 + var2.field4709[14] * var6));
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lkj;I)V"
	)
	void method5794(class279 var1, int var2) {
		if (this.field3109 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field3109[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field3110[var3];
					field3114.method7781();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class132 var8 = var1.method5343(var7);
						if (var8 != null) {
							field3085.method7783((float)var5[var6] / 255.0F);
							field3127.method7809(var8.method3093(var2));
							field3127.method7785(field3085);
							field3114.method7782(field3127);
						}
					}

					this.method5793(var3, field3114);
				}
			}

		}
	}

	@ObfuscatedName("eh")
	void vmethod5778(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10) {
		int var12 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var13 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var14 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var15 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var12, var13, var14, var15, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(ILqg;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, class424 var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class418 var8 = new class418();
		var8.field4681 = new class423((float)((double)var1 * 0.0030679615D), 0.0F, 0.0F);
		var8.field4684 = new class422(1.0F, 1.0F, 1.0F);
		var8.field4682 = new class422((float)var3, (float)var4, (float)var5);
		class424 var9 = new class424();
		var9.method7786(var8);
		var9.method7785(var2);
		int var10 = (int)var9.method7795(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = Rasterizer3D.getClipMidX();
		int var13 = Rasterizer3D.getClipMidY();
		if (var1 != 0) {
		}

		for (int var14 = 0; var14 < this.verticesCount; ++var14) {
			int var15 = this.verticesX[var14];
			int var16 = this.verticesY[var14];
			int var17 = this.verticesZ[var14];
			var9.method7792((float)var15, (float)var16, (float)var17, field3157);
			var15 = (int)field3157[0];
			var16 = (int)field3157[1];
			var17 = (int)field3157[2];
			field3094[var14] = var17 - var10;
			if (var17 >= 50) {
				modelViewportXs[var14] = var12 + var15 * Rasterizer3D.get3dZoom() / var17;
				modelViewportYs[var14] = var13 + var16 * Rasterizer3D.get3dZoom() / var17;
				field3123[var14] = class386.method7177(var17);
			} else {
				modelViewportXs[var14] = -5000;
				var11 = true;
			}

			if (this.texIndicesCount > 0) {
				field3146[var14] = var15;
				field3141[var14] = var16;
				field3124[var14] = var17;
			}
		}

		boolean var21 = ViewportMouse.ViewportMouse_isInViewport;
		boolean var22 = var21;
		if (var21) {
			boolean var24 = 0L != var6;
			if (var24) {
				boolean var18 = (int)(var6 >>> 16 & 1L) == 1;
				var24 = !var18;
			}

			var22 = var24;
		}

		boolean var23 = var22;

		try {
			this.draw0(var11, var23, this.isSingleTile, var6);
		} catch (Exception var20) {
		}

	}
}
