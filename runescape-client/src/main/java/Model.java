import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ae")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("am")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static TransformationMatrix field2819;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static TransformationMatrix field2870;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	static TransformationMatrix field2799;
	@ObfuscatedName("bi")
	static boolean[] field2798;
	@ObfuscatedName("bg")
	static boolean[] field2869;
	@ObfuscatedName("bl")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bz")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("bu")
	static float[] field2838;
	@ObfuscatedName("br")
	static int[] field2839;
	@ObfuscatedName("bo")
	static int[] field2840;
	@ObfuscatedName("bv")
	static int[] field2841;
	@ObfuscatedName("bt")
	static int[] field2835;
	@ObfuscatedName("bk")
	static char[] field2844;
	@ObfuscatedName("be")
	static char[][] field2845;
	@ObfuscatedName("bc")
	static int[] field2861;
	@ObfuscatedName("cn")
	static int[][] field2847;
	@ObfuscatedName("ch")
	static int[] field2848;
	@ObfuscatedName("cf")
	static int[] field2849;
	@ObfuscatedName("cu")
	static int[] field2850;
	@ObfuscatedName("cm")
	static int[] field2851;
	@ObfuscatedName("cj")
	static int[] field2871;
	@ObfuscatedName("cx")
	static int[] field2853;
	@ObfuscatedName("ci")
	static float[] field2854;
	@ObfuscatedName("cy")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("co")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cv")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cg")
	static boolean field2858;
	@ObfuscatedName("cc")
	static int[] field2812;
	@ObfuscatedName("cz")
	static int[] field2862;
	@ObfuscatedName("cw")
	static int[] field2863;
	@ObfuscatedName("cr")
	static int[] field2864;
	@ObfuscatedName("ca")
	static final float field2866;
	@ObfuscatedName("ck")
	static float[] field2868;
	@ObfuscatedName("at")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("au")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ar")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("al")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("ad")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("ah")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("ap")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("ab")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("az")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("aa")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ai")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ao")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("as")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ay")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("aj")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("av")
	public byte field2817;
	@ObfuscatedName("aw")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("an")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("ak")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bn")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bh")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bd")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bx")
	int[][] field2824;
	@ObfuscatedName("bf")
	int[][] field2825;
	@ObfuscatedName("bm")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bs")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bw")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ba")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bj")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bp")
	@Export("radius")
	int radius;
	@ObfuscatedName("by")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("cs")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("cp")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("cb")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cd")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("ce")
	public short field2834;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2819 = new TransformationMatrix();
		field2870 = new TransformationMatrix();
		field2799 = new TransformationMatrix();
		field2798 = new boolean[6500];
		field2869 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2838 = new float[6500];
		field2839 = new int[6500];
		field2840 = new int[6500];
		field2841 = new int[6500];
		field2835 = new int[6500];
		field2844 = new char[6000];
		field2845 = new char[6000][512];
		field2861 = new int[12];
		field2847 = new int[12][2000];
		field2848 = new int[2000];
		field2849 = new int[2000];
		field2850 = new int[12];
		field2851 = new int[10];
		field2871 = new int[10];
		field2853 = new int[10];
		field2854 = new float[10];
		field2858 = true;
		field2812 = Rasterizer3D.Rasterizer3D_sine;
		field2862 = Rasterizer3D.Rasterizer3D_cosine;
		field2863 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2864 = Rasterizer3D.field2585;
		field2866 = class142.method3386(50);
		field2868 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2817 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2817 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method5302(var1, var2, var3);
		this.field2817 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Ljm;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2817 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2817 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2817 == -1) {
					this.field2817 = var4.field2817;
				}
			}
		}

		this.method5302(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method5346(var1[var3]);
		}

	}

	@ObfuscatedName("ac")
	void method5302(int var1, int var2, int var3) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljm;)V"
	)
	void method5227(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2817 != var1.field2817)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2817);
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
		descriptor = "(Ljm;)V"
	)
	public void method5346(Model var1) {
		if (var1 != null) {
			this.method5227(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2817;
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Ljm;"
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
					var11.field2817 = this.field2817;
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljm;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Z)Ljm;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZLjm;[B)Ljm;"
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
		var2.field2817 = this.field2817;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2824 = this.field2824;
		var2.field2825 = this.field2825;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("at")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2862[var1];
			int var9 = field2812[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = class272.method5652(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

	@ObfuscatedName("au")
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

	@ObfuscatedName("ar")
	void method5235() {
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

	@ObfuscatedName("al")
	public int method5236() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("az")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljk;I)V"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V"
	)
	public void method5308(class145 var1, int var2) {
		Skeleton var3 = var1.field1673;
		class241 var4 = var3.method4887();
		if (var4 != null) {
			var3.method4887().method4832(var1, var2);
			this.method5228(var3.method4887(), var1.method3397());
		}

		if (var1.method3395()) {
			this.method5240(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lfo;I)V"
	)
	void method5240(class145 var1, int var2) {
		Skeleton var3 = var1.field1673;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1672 != null && var1.field1672[var4] != null && var1.field1672[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class137 var6 = var1.field1672[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3323(var2) * 255.0F);
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
		descriptor = "(Ljp;I)V"
	)
	void method5228(class241 var1, int var2) {
		this.method5262(var1, var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljk;ILjk;I[I)V"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljg;Lfo;I[ZZZ)V"
	)
	public void method5243(Skeleton var1, class145 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class241 var7 = var1.method4887();
		if (var7 != null) {
			var7.method4839(var2, var3, var4, var5);
			if (var6) {
				this.method5228(var7, var2.method3397());
			}
		}

		if (!var5 && var2.method3395()) {
			this.method5240(var2, var3);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljk;I[IZ)V"
	)
	public void method5297(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("aw")
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
								var15 = field2812[var14];
								var16 = field2862[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2812[var12];
								var16 = field2862[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2812[var13];
								var16 = field2862[var13];
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

	@ObfuscatedName("an")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("ak")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bn")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bh")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2812[var1];
		int var3 = field2862[var1];

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

	@ObfuscatedName("bx")
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
		if (this.boundsType != 2) {
			this.method5235();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2812[var1];
		int var11 = field2862[var1];
		int var12 = field2812[var2];
		int var13 = field2862[var2];
		int var14 = field2812[var3];
		int var15 = field2862[var3];
		int var16 = field2812[var4];
		int var17 = field2862[var4];
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
			field2839[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2838[var19] = class142.method3386(var22);
			if (this.faceTextures != null) {
				field2840[var19] = var20;
				field2841[var19] = var23;
				field2835[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bm")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2) {
			this.method5235();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2812[var1];
		int var12 = field2862[var1];
		int var13 = field2812[var2];
		int var14 = field2862[var2];
		int var15 = field2812[var3];
		int var16 = field2862[var3];
		int var17 = field2812[var4];
		int var18 = field2862[var4];
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
			field2839[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2838[var20] = class142.method3386(var8);
			if (this.faceTextures != null) {
				field2840[var20] = var21;
				field2841[var20] = var24;
				field2835[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bs")
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
		if (var14 > 50 && var12 < AbstractRasterizer.method4851()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method4734()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method4754()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = class174.method3769();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = class271.method5639();
							boolean var32 = class225.method4527(var9);
							boolean var33 = false;
							int var38;
							int var39;
							int var40;
							int var41;
							int var42;
							int var47;
							int var48;
							int var54;
							if (var32 && var31) {
								boolean var34 = false;
								if (field2858) {
									boolean var35;
									if (!class271.method5639()) {
										var35 = false;
									} else {
										ClientPreferences.method2853(var2, var3, var4, var5);
										AABB var37 = (AABB)this.aabb.get(var1);
										var38 = var37.xMid + var6;
										var39 = var7 + var37.yMid;
										var40 = var8 + var37.zMid;
										var41 = var37.xMidOffset;
										var42 = var37.yMidOffset;
										int var43 = var37.zMidOffset;
										int var44 = class431.field4760 - var38;
										int var45 = WorldMapEvent.field3276 - var39;
										int var46 = ViewportMouse.field2877 - var40;
										if (Math.abs(var44) > var41 + class439.field4819) {
											var35 = false;
										} else if (Math.abs(var45) > var42 + DefaultsGroup.field5051) {
											var35 = false;
										} else if (Math.abs(var46) > var43 + ViewportMouse.field2878) {
											var35 = false;
										} else if (Math.abs(var46 * AbstractSocket.field5024 - var45 * ArchiveLoader.field1072) > var43 * DefaultsGroup.field5051 + var42 * ViewportMouse.field2878) {
											var35 = false;
										} else if (Math.abs(var44 * ArchiveLoader.field1072 - var46 * class145.field1679) > var43 * class439.field4819 + var41 * ViewportMouse.field2878) {
											var35 = false;
										} else if (Math.abs(var45 * class145.field1679 - var44 * AbstractSocket.field5024) > var41 * DefaultsGroup.field5051 + var42 * class439.field4819) {
											var35 = false;
										} else {
											var35 = true;
										}
									}

									var34 = var35;
								} else {
									var54 = var12 - var13;
									if (var54 <= 50) {
										var54 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var54;
									} else {
										var17 /= var14;
										var16 /= var54;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var54;
									} else {
										var21 /= var14;
										var23 /= var54;
									}

									var47 = var28 - Rasterizer3D.getClipMidX();
									var48 = var29 - Rasterizer3D.getClipMidY();
									if (var47 > var16 && var47 < var17 && var48 > var23 && var48 < var21) {
										var34 = true;
									}
								}

								if (var34) {
									if (this.isSingleTile) {
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9;
									} else {
										var33 = true;
									}
								}
							}

							int var53 = Rasterizer3D.getClipMidX();
							var54 = Rasterizer3D.getClipMidY();
							var47 = 0;
							var48 = 0;
							if (var1 != 0) {
								var47 = field2812[var1];
								var48 = field2862[var1];
							}

							for (var38 = 0; var38 < this.verticesCount; ++var38) {
								var39 = this.verticesX[var38];
								var40 = this.verticesY[var38];
								var41 = this.verticesZ[var38];
								if (var1 != 0) {
									var42 = var41 * var47 + var39 * var48 >> 16;
									var41 = var41 * var48 - var39 * var47 >> 16;
									var39 = var42;
								}

								var39 += var6;
								var40 += var7;
								var41 += var8;
								var42 = var41 * var4 + var5 * var39 >> 16;
								var41 = var5 * var41 - var39 * var4 >> 16;
								var39 = var42;
								var42 = var3 * var40 - var41 * var2 >> 16;
								var41 = var40 * var2 + var3 * var41 >> 16;
								var25 |= this.method5255(var38, var39, var42, var41, var12, var53, var54, var27);
							}

							try {
								this.draw0(var25, var33, this.isSingleTile, var9);
							} catch (Exception var52) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bw")
	boolean method5255(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
		field2839[var1] = var4 - var5;
		if (var8) {
			field2840[var1] = var2;
			field2841[var1] = var3;
			field2835[var1] = var4;
		}

		if (var4 >= 50) {
			modelViewportXs[var1] = var6 + var2 * Rasterizer3D.get3dZoom() / var4;
			modelViewportYs[var1] = var7 + var3 * Rasterizer3D.get3dZoom() / var4;
			field2838[var1] = class142.method3386(var4);
			return false;
		} else {
			modelViewportXs[var1] = -5000;
			return true;
		}
	}

	@ObfuscatedName("ba")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2844[var6] = 0;
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
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2 && HorizontalAlignment.method3958(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
							ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4;
							var2 = false;
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2869[var7] = false;
							var29 = Rasterizer3D.method4807();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field2798[var7] = false;
							} else {
								field2798[var7] = true;
							}

							var15 = (field2839[var8] + field2839[var9] + field2839[var10]) / 3 + this.radius;
							field2845[var15][field2844[var15]++] = var7;
						}
					} else {
						var29 = field2840[var8];
						var15 = field2840[var9];
						var16 = field2840[var10];
						int var30 = field2841[var8];
						var18 = field2841[var9];
						int var19 = field2841[var10];
						int var20 = field2835[var8];
						int var21 = field2835[var9];
						int var22 = field2835[var10];
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
							field2869[var7] = true;
							int var26 = (field2839[var8] + field2839[var9] + field2839[var10]) / 3 + this.radius;
							field2845[var26][field2844[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) {
				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2844[var33];
					if (var34 > 0) {
						var27 = field2845[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) {
					field2861[var33] = 0;
					field2850[var33] = 0;
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) {
					var34 = field2844[var33];
					if (var34 > 0) {
						var27 = field2845[var33];

						for (var10 = 0; var10 < var34; ++var10) {
							char var35 = var27[var10];
							byte var36 = this.faceRenderPriorities[var35];
							var28 = field2861[var36]++;
							field2847[var36][var28] = var35;
							if (var36 < 10) {
								int[] var37 = field2850;
								var37[var36] += var33;
							} else if (var36 == 10) {
								field2848[var28] = var33;
							} else {
								field2849[var28] = var33;
							}
						}
					}
				}

				var33 = 0;
				if (field2861[1] > 0 || field2861[2] > 0) {
					var33 = (field2850[1] + field2850[2]) / (field2861[1] + field2861[2]);
				}

				var8 = 0;
				if (field2861[3] > 0 || field2861[4] > 0) {
					var8 = (field2850[3] + field2850[4]) / (field2861[3] + field2861[4]);
				}

				var9 = 0;
				if (field2861[6] > 0 || field2861[8] > 0) {
					var9 = (field2850[8] + field2850[6]) / (field2861[8] + field2861[6]);
				}

				var11 = 0;
				var12 = field2861[10];
				int[] var13 = field2847[10];
				int[] var14 = field2848;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2861[11];
					var13 = field2847[11];
					var14 = field2849;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var33) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2847[11]) {
							var11 = 0;
							var12 = field2861[11];
							var13 = field2847[11];
							var14 = field2849;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2847[11]) {
							var11 = 0;
							var12 = field2861[11];
							var13 = field2847[11];
							var14 = field2849;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2847[11]) {
							var11 = 0;
							var12 = field2861[11];
							var13 = field2847[11];
							var14 = field2849;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2861[var15];
					int[] var17 = field2847[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2847[11]) {
						var11 = 0;
						var13 = field2847[11];
						var12 = field2861[11];
						var14 = field2849;
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

	@ObfuscatedName("bj")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2869[var1]) {
			this.method5260(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2798[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method5244(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2838[var2], field2838[var3], field2838[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bp")
	boolean method5258(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2834;
	}

	@ObfuscatedName("by")
	final void method5244(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2840[var18], field2840[var15], field2840[var16], field2841[var18], field2841[var15], field2841[var16], field2835[var18], field2835[var15], field2835[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2840[var18], field2840[var15], field2840[var16], field2841[var18], field2841[var15], field2841[var16], field2835[var18], field2835[var15], field2835[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method5258(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2863[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2863[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("bb")
	final void method5260(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2835[var5];
		int var9 = field2835[var6];
		int var10 = field2835[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.clips.currentFaceAlpha = 0;
		} else {
			Rasterizer3D.clips.currentFaceAlpha = this.faceAlphas[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2851[var4] = modelViewportXs[var5];
			field2871[var4] = modelViewportYs[var5];
			field2854[var4] = field2838[var7];
			field2853[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2840[var5];
			var12 = field2841[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2864[var10 - var8] * (50 - var8);
				field2851[var4] = var2 + (var11 + ((field2840[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2871[var4] = var3 + (var12 + ((field2841[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2854[var4] = field2866;
				field2853[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2864[var9 - var8] * (50 - var8);
				field2851[var4] = var2 + (var11 + ((field2840[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2871[var4] = var3 + (var12 + ((field2841[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2854[var4] = field2866;
				field2853[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2851[var4] = modelViewportXs[var6];
			field2871[var4] = modelViewportYs[var6];
			field2854[var4] = field2838[var7];
			field2853[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2840[var6];
			var12 = field2841[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2864[var8 - var9] * (50 - var9);
				field2851[var4] = var2 + (var11 + ((field2840[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2871[var4] = var3 + (var12 + ((field2841[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2854[var4] = field2866;
				field2853[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2864[var10 - var9] * (50 - var9);
				field2851[var4] = var2 + (var11 + ((field2840[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2871[var4] = var3 + (var12 + ((field2841[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2853[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2851[var4] = modelViewportXs[var7];
			field2871[var4] = modelViewportYs[var7];
			field2854[var4] = field2838[var7];
			field2853[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2840[var7];
			var12 = field2841[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2864[var9 - var10] * (50 - var10);
				field2851[var4] = var2 + (var11 + ((field2840[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2871[var4] = var3 + (var12 + ((field2841[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2854[var4] = field2866;
				field2853[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2864[var8 - var10] * (50 - var10);
				field2851[var4] = var2 + (var11 + ((field2840[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2871[var4] = var3 + (var12 + ((field2841[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2854[var4] = field2866;
				field2853[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2851[0];
		var12 = field2851[1];
		var13 = field2851[2];
		var14 = field2871[0];
		int var15 = field2871[1];
		int var16 = field2871[2];
		float var17 = field2854[0];
		float var18 = field2854[1];
		float var19 = field2854[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method4807();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method5244(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2853[0], field2853[1], field2853[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2851[3] < 0 || field2851[3] > var20) {
				Rasterizer3D.clips.clipping = true;
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
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2840[var25], field2840[var22], field2840[var23], field2841[var25], field2841[var22], field2841[var23], field2835[var25], field2835[var22], field2835[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2871[3], var11, var13, field2851[3], var17, var19, field2854[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2840[var25], field2840[var22], field2840[var23], field2841[var25], field2841[var22], field2841[var23], field2835[var25], field2835[var22], field2835[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2853[0], field2853[1], field2853[2], field2840[var25], field2840[var22], field2840[var23], field2841[var25], field2841[var22], field2841[var23], field2835[var25], field2835[var22], field2835[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2871[3], var11, var13, field2851[3], var17, var19, field2854[3], field2853[0], field2853[2], field2853[3], field2840[var25], field2840[var22], field2840[var23], field2841[var25], field2841[var22], field2841[var23], field2835[var25], field2835[var22], field2835[var23], var26);
				}
			} else {
				boolean var21 = this.method5258(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2863[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.rasterTriangle(var14, var16, field2871[3], var11, var13, field2851[3], var17, var19, field2854[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2863[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2871[3], var11, var13, field2851[3], var17, var19, field2854[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2853[0], field2853[1], field2853[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2871[3], var11, var13, field2851[3], 0.0F, 0.0F, 0.0F, field2853[0], field2853[2], field2853[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2853[0], field2853[1], field2853[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2871[3], var11, var13, field2851[3], var17, var19, field2854[3], field2853[0], field2853[2], field2853[3]);
				}
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILqf;)V"
	)
	void method5261(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4737[0] * var3 + var2.field4737[4] * var4 + var2.field4737[8] * var5 + var2.field4737[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4737[1] * var3 + var2.field4737[5] * var4 + var2.field4737[9] * var5 + var2.field4737[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4737[2] * var3 + var2.field4737[6] * var4 + var2.field4737[10] * var5 + var2.field4737[14] * var6));
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V"
	)
	void method5262(class241 var1, int var2) {
		if (this.field2824 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2824[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2825[var3];
					field2819.method8131();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class134 var8 = var1.method4824(var7);
						if (var8 != null) {
							field2870.method8202((float)var5[var6] / 255.0F);
							field2799.method8132(var8.method3282(var2));
							field2799.method8135(field2870);
							field2819.method8144(field2799);
						}
					}

					this.method5261(var3, field2819);
				}
			}

		}
	}

	@ObfuscatedName("eo")
	void vmethod5241(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(
		descriptor = "(ILqf;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class421 var8 = new class421();
		var8.field4704.method8118((float)var1 * 0.0030679614F, 0.0F, 0.0F);
		var8.field4706.method8078(1.0F, 1.0F, 1.0F);
		var8.field4707.method8078((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = class172.method3757();
		var9.method8136(var8);
		var9.method8135(var2);
		int var10 = (int)var9.method8143(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = var10 - this.radius;
		boolean var13 = var12 <= 50 || this.faceTextures != null;
		int var14 = Rasterizer3D.getClipMidX();
		int var15 = Rasterizer3D.getClipMidY();

		for (int var16 = 0; var16 < this.verticesCount; ++var16) {
			int var17 = this.verticesX[var16];
			int var18 = this.verticesY[var16];
			int var19 = this.verticesZ[var16];
			var9.transformPoint((float)var17, (float)var18, (float)var19, field2868);
			var17 = (int)field2868[0];
			var18 = (int)field2868[1];
			var19 = (int)field2868[2];
			var11 |= this.method5255(var16, var17, var18, var19, var10, var14, var15, var13);
		}

		boolean var22 = class271.method5639() && class225.method4527(var6);
		var8.method8020();
		var9.method8125();

		try {
			this.draw0(var11, var22, this.isSingleTile, var6);
		} catch (Exception var21) {
		}

	}
}
