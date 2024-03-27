import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ah")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("at")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class470 field2827;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class470 field2850;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	static class470 field2783;
	@ObfuscatedName("bu")
	static boolean[] field2816;
	@ObfuscatedName("br")
	static boolean[] field2817;
	@ObfuscatedName("bb")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("by")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bk")
	static float[] field2820;
	@ObfuscatedName("bt")
	static int[] field2821;
	@ObfuscatedName("bq")
	static int[] field2822;
	@ObfuscatedName("bi")
	static int[] field2823;
	@ObfuscatedName("bw")
	static int[] field2824;
	@ObfuscatedName("ba")
	static char[] field2826;
	@ObfuscatedName("bv")
	static char[][] field2843;
	@ObfuscatedName("bg")
	static int[] field2819;
	@ObfuscatedName("cb")
	static int[][] field2831;
	@ObfuscatedName("cj")
	static int[] field2830;
	@ObfuscatedName("cr")
	static int[] field2801;
	@ObfuscatedName("cy")
	static int[] field2835;
	@ObfuscatedName("cg")
	static int[] field2832;
	@ObfuscatedName("cl")
	static float[] field2807;
	@ObfuscatedName("cw")
	static int[] field2795;
	@ObfuscatedName("ci")
	static int[] field2834;
	@ObfuscatedName("ct")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cm")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cd")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cc")
	static boolean field2840;
	@ObfuscatedName("cp")
	static int[] field2814;
	@ObfuscatedName("cu")
	static int[] field2844;
	@ObfuscatedName("ck")
	static int[] field2793;
	@ObfuscatedName("cs")
	static int[] field2846;
	@ObfuscatedName("cz")
	static final float field2849;
	@ObfuscatedName("aw")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ad")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("al")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("as")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ag")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ai")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ax")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ar")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("aj")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("au")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ay")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ap")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("av")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("aa")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("aq")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("am")
	public byte field2829;
	@ObfuscatedName("ac")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("ae")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ak")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bp")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bz")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bc")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bf")
	int[][] field2841;
	@ObfuscatedName("be")
	int[][] field2842;
	@ObfuscatedName("bn")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bd")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bo")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bx")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bl")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bh")
	@Export("radius")
	int radius;
	@ObfuscatedName("bs")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("ch")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cf")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cx")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cq")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ca")
	public short field2784;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2827 = new class470();
		field2850 = new class470();
		field2783 = new class470();
		field2816 = new boolean[6500];
		field2817 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2820 = new float[6500];
		field2821 = new int[6500];
		field2822 = new int[6500];
		field2823 = new int[6500];
		field2824 = new int[6500];
		field2826 = new char[6000];
		field2843 = new char[6000][512];
		field2819 = new int[12];
		field2831 = new int[12][2000];
		field2830 = new int[2000];
		field2801 = new int[2000];
		field2832 = new int[12];
		field2795 = new int[10];
		field2834 = new int[10];
		field2835 = new int[10];
		field2807 = new float[10];
		field2840 = true;
		field2814 = Rasterizer3D.Rasterizer3D_sine;
		field2844 = Rasterizer3D.Rasterizer3D_cosine;
		field2793 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2846 = Rasterizer3D.field2609;
		field2849 = class103.method2674(50);
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2829 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2829 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method5023(var1, var2, var3);
		this.field2829 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljn;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2829 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2829 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2829 == -1) {
					this.field2829 = var4.field2829;
				}
			}
		}

		this.method5023(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5058(var1[var3]);
		}

	}

	@ObfuscatedName("az")
	void method5023(int var1, int var2, int var3) {
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
		descriptor = "(Ljn;)V"
	)
	void method5020(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2829 != var1.field2829)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2829);
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	public void method5058(Model var1) {
		if (var1 != null) {
			this.method5020(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2829;
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljn;"
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
					var11.field2829 = this.field2829;
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljn;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZLjn;[B)Ljn;"
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
		var2.field2829 = this.field2829;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2841 = this.field2841;
		var2.field2842 = this.field2842;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("as")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2844[var1];
			int var9 = field2814[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = NpcOverrides.method3857(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var14 = this.verticesX[var10];
				int var15 = this.verticesZ[var10];
				int var13 = var8 * var15 - var14 * var9 >> 16;
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

	@ObfuscatedName("ag")
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
	void method4956() {
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
	public int method4947() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("ar")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lja;I)V"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V"
	)
	public void method4960(class138 var1, int var2) {
		Skeleton var3 = var1.field1635;
		class243 var4 = var3.method4697();
		if (var4 != null) {
			var3.method4697().method4651(var1, var2);
			this.method4962(var3.method4697(), var1.method3091());
		}

		if (var1.method3089()) {
			this.method4961(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfa;I)V"
	)
	void method4961(class138 var1, int var2) {
		Skeleton var3 = var1.field1635;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1633 != null && var1.field1633[var4] != null && var1.field1633[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class131 var6 = var1.field1633[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3025(var2) * 255.0F);
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	void method4962(class243 var1, int var2) {
		this.method4982(var1, var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lja;ILja;I[I)V"
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljy;Lfa;I[ZZZ)V"
	)
	public void method4964(Skeleton var1, class138 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class243 var7 = var1.method4697();
		if (var7 != null) {
			var7.method4646(var2, var3, var4, var5);
			if (var6) {
				this.method4962(var7, var2.method3091());
			}
		}

		if (!var5 && var2.method3089()) {
			this.method4961(var2, var3);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lja;I[IZ)V"
	)
	public void method5060(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("am")
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
								var15 = field2814[var14];
								var16 = field2844[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2814[var12];
								var16 = field2844[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2814[var13];
								var16 = field2844[var13];
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

	@ObfuscatedName("ac")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ae")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("ak")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bp")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2814[var1];
		int var3 = field2844[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bz")
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

	@ObfuscatedName("bc")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bf")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4956();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2814[var1];
		int var11 = field2844[var1];
		int var12 = field2814[var2];
		int var13 = field2844[var2];
		int var14 = field2814[var3];
		int var15 = field2844[var3];
		int var16 = field2814[var4];
		int var17 = field2844[var4];
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
			field2821[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2820[var19] = class103.method2674(var22);
			if (this.texIndicesCount > 0) {
				field2822[var19] = var20;
				field2823[var19] = var23;
				field2824[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("be")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4956();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2814[var1];
		int var12 = field2844[var1];
		int var13 = field2814[var2];
		int var14 = field2844[var2];
		int var15 = field2814[var3];
		int var16 = field2844[var3];
		int var17 = field2814[var4];
		int var18 = field2844[var4];
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
			field2821[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2820[var20] = class103.method2674(var8);
			if (this.texIndicesCount > 0) {
				field2822[var20] = var21;
				field2823[var20] = var24;
				field2824[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bn")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2826[var6] = 0;
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
					int var31;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2 && ArchiveDiskActionHandler.method6905(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2817[var7] = false;
							var31 = Rasterizer3D.method4574();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var31 && var12 <= var31 && var28 <= var31) {
								field2816[var7] = false;
							} else {
								field2816[var7] = true;
							}

							var15 = (field2821[var8] + field2821[var9] + field2821[var10]) / 3 + this.radius;
							field2843[var15][field2826[var15]++] = var7;
						}
					} else {
						var31 = field2822[var8];
						var15 = field2822[var9];
						var16 = field2822[var10];
						int var32 = field2823[var8];
						var18 = field2823[var9];
						int var19 = field2823[var10];
						int var20 = field2824[var8];
						int var21 = field2824[var9];
						int var22 = field2824[var10];
						var31 -= var15;
						var16 -= var15;
						var32 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var32 * var22 - var20 * var19;
						int var24 = var20 * var16 - var31 * var22;
						int var25 = var31 * var19 - var32 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2817[var7] = true;
							int var26 = (field2821[var8] + field2821[var9] + field2821[var10]) / 3 + this.radius;
							field2843[var26][field2826[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2826[var33];
					if (var34 > 0) {
						var27 = field2843[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2819[var33] = 0;
					field2832[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2826[var33];
					if (var34 > 0) {
						var27 = field2843[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2819[var36]++;
							field2831[var36][var28] = var35;
							if (var36 < 10) {
								int[] var37 = field2832;
								var37[var36] += var33;
							} else if (var36 == 10) {
								field2830[var28] = var33;
							} else {
								field2801[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2819[1] > 0 || field2819[2] > 0) {
					var33 = (field2832[1] + field2832[2]) / (field2819[1] + field2819[2]);
				}

				var8 = 0;
				if (field2819[3] > 0 || field2819[4] > 0) {
					var8 = (field2832[3] + field2832[4]) / (field2819[3] + field2819[4]);
				}

				var9 = 0;
				if (field2819[6] > 0 || field2819[8] > 0) {
					var9 = (field2832[8] + field2832[6]) / (field2819[8] + field2819[6]);
				}

				var11 = 0;
				var12 = field2819[10];
				int[] var13 = field2831[10];
				int[] var14 = field2830;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2819[11];
					var13 = field2831[11];
					var14 = field2801;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2831[11]) {
							var11 = 0;
							var12 = field2819[11];
							var13 = field2831[11];
							var14 = field2801;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2831[11]) {
							var11 = 0;
							var12 = field2819[11];
							var13 = field2831[11];
							var14 = field2801;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2831[11]) {
							var11 = 0;
							var12 = field2819[11];
							var13 = field2831[11];
							var14 = field2801;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2819[var15];
					int[] var17 = field2831[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2831[11]) {
						var11 = 0;
						var13 = field2831[11];
						var12 = field2819[11];
						var14 = field2801;
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

	@ObfuscatedName("bd")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2817[var1]) {
			this.method4980(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.field2893 = field2816[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.field2886 = 0;
			} else {
				Rasterizer3D.clips.field2886 = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method4979(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2820[var2], field2820[var3], field2820[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bo")
	boolean method4978(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2784;
	}

	@ObfuscatedName("bx")
	final void method4979(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.method4581(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2822[var18], field2822[var15], field2822[var16], field2823[var18], field2823[var15], field2823[var16], field2824[var18], field2824[var15], field2824[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method4581(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2822[var18], field2822[var15], field2822[var16], field2823[var18], field2823[var15], field2823[var16], field2824[var18], field2824[var15], field2824[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method4978(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.method4634(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2793[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2793[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.method4607(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bl")
	final void method4980(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2824[var5];
		int var9 = field2824[var6];
		int var10 = field2824[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.field2886 = 0;
		} else {
			Rasterizer3D.clips.field2886 = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2795[var4] = modelViewportXs[var5];
			field2834[var4] = modelViewportYs[var5];
			field2807[var4] = field2820[var7];
			field2835[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2822[var5];
			var12 = field2823[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2846[var10 - var8] * (50 - var8);
				field2795[var4] = var2 + (var11 + ((field2822[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2834[var4] = var3 + (var12 + ((field2823[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2807[var4] = field2849;
				field2835[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2846[var9 - var8] * (50 - var8);
				field2795[var4] = var2 + (var11 + ((field2822[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2834[var4] = var3 + (var12 + ((field2823[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2807[var4] = field2849;
				field2835[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2795[var4] = modelViewportXs[var6];
			field2834[var4] = modelViewportYs[var6];
			field2807[var4] = field2820[var7];
			field2835[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2822[var6];
			var12 = field2823[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2846[var8 - var9] * (50 - var9);
				field2795[var4] = var2 + (var11 + ((field2822[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2834[var4] = var3 + (var12 + ((field2823[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2807[var4] = field2849;
				field2835[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2846[var10 - var9] * (50 - var9);
				field2795[var4] = var2 + (var11 + ((field2822[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2834[var4] = var3 + (var12 + ((field2823[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2835[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2795[var4] = modelViewportXs[var7];
			field2834[var4] = modelViewportYs[var7];
			field2807[var4] = field2820[var7];
			field2835[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2822[var7];
			var12 = field2823[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2846[var9 - var10] * (50 - var10);
				field2795[var4] = var2 + (var11 + ((field2822[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2834[var4] = var3 + (var12 + ((field2823[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2807[var4] = field2849;
				field2835[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2846[var8 - var10] * (50 - var10);
				field2795[var4] = var2 + (var11 + ((field2822[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2834[var4] = var3 + (var12 + ((field2823[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2807[var4] = field2849;
				field2835[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2795[0];
		var12 = field2795[1];
		var13 = field2795[2];
		var14 = field2834[0];
		int var15 = field2834[1];
		int var16 = field2834[2];
		float var17 = field2807[0];
		float var18 = field2807[1];
		float var19 = field2807[2];
		Rasterizer3D.clips.field2893 = false;
		int var20 = Rasterizer3D.method4574();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.field2893 = true;
			}

			this.method4979(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2795[3] < 0 || field2795[3] > var20) {
				Rasterizer3D.clips.field2893 = true;
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
					Rasterizer3D.method4581(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26);
					Rasterizer3D.method4581(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26);
				} else {
					Rasterizer3D.method4581(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26);
					Rasterizer3D.method4581(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], field2835[0], field2835[2], field2835[3], field2822[var25], field2822[var22], field2822[var23], field2823[var25], field2823[var22], field2823[var23], field2824[var25], field2824[var22], field2824[var23], var26);
				}
			} else {
				boolean var21 = this.method4978(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2793[this.faceColors1[var1]];
					Rasterizer3D.method4634(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.method4634(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2793[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], var22);
				} else if (var21) {
					Rasterizer3D.method4607(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.method4607(var14, var16, field2834[3], var11, var13, field2795[3], 0.0F, 0.0F, 0.0F, field2835[0], field2835[2], field2835[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2835[0], field2835[1], field2835[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2834[3], var11, var13, field2795[3], var17, var19, field2807[3], field2835[0], field2835[2], field2835[3]);
				}
			}
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILsq;)V"
	)
	void method4981(int var1, class470 var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4872[0] * var3 + var2.field4872[4] * var4 + var2.field4872[8] * var5 + var2.field4872[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4872[1] * var3 + var2.field4872[5] * var4 + var2.field4872[9] * var5 + var2.field4872[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4872[2] * var3 + var2.field4872[6] * var4 + var2.field4872[10] * var5 + var2.field4872[14] * var6));
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	void method4982(class243 var1, int var2) {
		if (this.field2841 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2841[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2842[var3];
					field2827.method8435();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class128 var8 = var1.method4643(var7);
						if (var8 != null) {
							field2850.method8406((float)var5[var6] / 255.0F);
							field2783.method8411(var8.method2967(var2));
							field2783.method8414(field2850);
							field2827.method8413(field2783);
						}
					}

					this.method4981(var3, field2827);
				}
			}

		}
	}

	@ObfuscatedName("dd")
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
				if (var17 / var14 > Rasterizer3D.method4569()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method4590()) {
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
							int var28 = ViewportMouse.ViewportMouse_x;
							int var30 = ViewportMouse.ViewportMouse_y;
							boolean var32 = Player.method2361();
							boolean var33 = var9 != 0L && !class152.method3219(var9);
							boolean var35 = false;
							int var37;
							int var38;
							int var39;
							if (var33 && var32) {
								boolean var36 = false;
								if (field2840) {
									var36 = KitDefinition.method3805(this, var1, var6, var7, var8);
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
								var38 = field2814[var1];
								var39 = field2844[var1];
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
								field2821[var40] = var43 - var12;
								if (var43 >= 50) {
									modelViewportXs[var40] = var49 + var41 * Rasterizer3D.get3dZoom() / var43;
									modelViewportYs[var40] = var37 + var44 * Rasterizer3D.get3dZoom() / var43;
									field2820[var40] = class103.method2674(var43);
								} else {
									modelViewportXs[var40] = -5000;
									var25 = true;
								}

								if (var27) {
									field2822[var40] = var41;
									field2823[var40] = var44;
									field2824[var40] = var43;
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
}
