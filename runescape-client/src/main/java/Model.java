import java.util.Arrays;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("ay")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("au")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static TransformationMatrix field2168;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static TransformationMatrix field2156;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	static TransformationMatrix field2212;
	@ObfuscatedName("bf")
	static boolean[] field2190;
	@ObfuscatedName("bq")
	static boolean[] field2191;
	@ObfuscatedName("bt")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("bi")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("be")
	static float[] field2187;
	@ObfuscatedName("ba")
	static int[] field2198;
	@ObfuscatedName("bn")
	static int[] field2196;
	@ObfuscatedName("bw")
	static int[] field2197;
	@ObfuscatedName("bk")
	static int[] field2181;
	@ObfuscatedName("bb")
	static char[] field2200;
	@ObfuscatedName("by")
	static char[][] field2201;
	@ObfuscatedName("bl")
	static int[] field2158;
	@ObfuscatedName("cx")
	static int[] field2208;
	@ObfuscatedName("cu")
	static int[][] field2204;
	@ObfuscatedName("cz")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("cm")
	static int[] field2153;
	@ObfuscatedName("ct")
	static int[] field2211;
	@ObfuscatedName("cl")
	static float[] field2210;
	@ObfuscatedName("cb")
	static int[] field2206;
	@ObfuscatedName("cr")
	static int[] field2207;
	@ObfuscatedName("cj")
	static int[] field2209;
	@ObfuscatedName("cg")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("cp")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("cq")
	static boolean field2214;
	@ObfuscatedName("cn")
	static int[] field2217;
	@ObfuscatedName("cy")
	static int[] field2218;
	@ObfuscatedName("ce")
	static int[] field2180;
	@ObfuscatedName("cf")
	static int[] field2220;
	@ObfuscatedName("cs")
	static final float field2155;
	@ObfuscatedName("ca")
	static float[] field2169;
	@ObfuscatedName("ac")
	@Export("verticesCount")
	public int verticesCount;
	@ObfuscatedName("ae")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("ad")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("aq")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("al")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("aj")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("as")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("aw")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("af")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("aa")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("ah")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("ag")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("av")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("ar")
	@Export("textureFaces")
	byte[] textureFaces;
	@ObfuscatedName("ap")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("ak")
	public byte field2173;
	@ObfuscatedName("ai")
	@Export("texIndicesCount")
	public int texIndicesCount;
	@ObfuscatedName("at")
	@Export("texIndices1")
	int[] texIndices1;
	@ObfuscatedName("az")
	@Export("texIndices2")
	int[] texIndices2;
	@ObfuscatedName("bg")
	@Export("texIndices3")
	int[] texIndices3;
	@ObfuscatedName("bz")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("bj")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("bc")
	int[][] field2159;
	@ObfuscatedName("bo")
	int[][] field2182;
	@ObfuscatedName("bm")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("bd")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("bh")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("bx")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("bv")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("bu")
	@Export("radius")
	int radius;
	@ObfuscatedName("bp")
	@Export("aabb")
	HashMap aabb;
	@ObfuscatedName("cw")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("ck")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("ch")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cv")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cd")
	public short field2227;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2168 = new TransformationMatrix();
		field2156 = new TransformationMatrix();
		field2212 = new TransformationMatrix();
		field2190 = new boolean[6500];
		field2191 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2187 = new float[6500];
		field2198 = new int[6500];
		field2196 = new int[6500];
		field2197 = new int[6500];
		field2181 = new int[6500];
		field2200 = new char[6000];
		field2201 = new char[6000][512];
		field2158 = new int[12];
		field2204 = new int[12][2000];
		field2153 = new int[2000];
		field2211 = new int[2000];
		field2206 = new int[12];
		field2207 = new int[10];
		field2208 = new int[10];
		field2209 = new int[10];
		field2210 = new float[10];
		field2214 = true;
		field2217 = Rasterizer3D.Rasterizer3D_sine;
		field2218 = Rasterizer3D.Rasterizer3D_cosine;
		field2180 = Rasterizer3D.Rasterizer3D_colorPalette;
		field2220 = Rasterizer3D.field1937;
		field2155 = NPC.method2815(50);
		field2169 = new float[3];
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2173 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
	}

	public Model(int var1, int var2, int var3, byte var4) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2173 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.method4260(var1, var2, var3);
		this.field2173 = var4;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
	}

	@ObfuscatedSignature(
		descriptor = "([Lhr;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2173 = 0;
		this.texIndicesCount = 0;
		this.isSingleTile = false;
		this.aabb = new HashMap();
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;
		this.field2173 = -1;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			Model var4 = var1[var3];
			if (var4 != null) {
				this.verticesCount += var4.verticesCount;
				this.indicesCount += var4.indicesCount;
				this.texIndicesCount += var4.texIndicesCount;
				if (this.field2173 == -1) {
					this.field2173 = var4.field2173;
				}
			}
		}

		this.method4260(this.verticesCount, this.indicesCount, this.texIndicesCount);
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.texIndicesCount = 0;

		for (var3 = 0; var3 < var2; ++var3) {
			this.method4264(var1[var3]);
		}

	}

	@ObfuscatedName("ab")
	void method4260(int var1, int var2, int var3) {
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhr;)V"
	)
	void method4216(Model var1) {
		int var2 = this.indices1.length;
		if (this.faceRenderPriorities == null && (var1.faceRenderPriorities != null || this.field2173 != var1.field2173)) {
			this.faceRenderPriorities = new byte[var2];
			Arrays.fill(this.faceRenderPriorities, this.field2173);
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lhr;)V"
	)
	public void method4264(Model var1) {
		if (var1 != null) {
			this.method4216(var1);

			int var2;
			for (var2 = 0; var2 < var1.indicesCount; ++var2) {
				this.indices1[this.indicesCount] = this.verticesCount + var1.indices1[var2];
				this.indices2[this.indicesCount] = this.verticesCount + var1.indices2[var2];
				this.indices3[this.indicesCount] = this.verticesCount + var1.indices3[var2];
				this.faceColors1[this.indicesCount] = var1.faceColors1[var2];
				this.faceColors2[this.indicesCount] = var1.faceColors2[var2];
				this.faceColors3[this.indicesCount] = var1.faceColors3[var2];
				if (this.faceRenderPriorities != null) {
					this.faceRenderPriorities[this.indicesCount] = var1.faceRenderPriorities != null ? var1.faceRenderPriorities[var2] : var1.field2173;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lhr;"
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
					var11.field2173 = this.field2173;
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
		descriptor = "(Z)Lhr;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Z)Lhr;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZLhr;[B)Lhr;"
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
		var2.field2173 = this.field2173;
		var2.texIndices1 = this.texIndices1;
		var2.texIndices2 = this.texIndices2;
		var2.texIndices3 = this.texIndices3;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2159 = this.field2159;
		var2.field2182 = this.field2182;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("ac")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (!this.aabb.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2218[var1];
			int var9 = field2217[var1];

			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = class165.method3549(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var13 = class148.method3352(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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

			AABB var14 = new AABB((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var15 = true;
			if (var14.xMidOffset < 32) {
				var14.xMidOffset = 32;
			}

			if (var14.zMidOffset < 32) {
				var14.zMidOffset = 32;
			}

			if (this.isSingleTile) {
				boolean var16 = true;
				var14.xMidOffset += 8;
				var14.zMidOffset += 8;
			}

			this.aabb.put(var1, var14);
		}
	}

	@ObfuscatedName("as")
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

	@ObfuscatedName("aw")
	void method4303() {
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

	@ObfuscatedName("af")
	public int method4225() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("aa")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.aabb.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhp;I)V"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lfq;I)V"
	)
	public void method4349(class142 var1, int var2) {
		Skeleton var3 = var1.field1632;
		class182 var4 = var3.method3879();
		if (var4 != null) {
			var3.method3879().method3839(var1, var2);
			this.method4230(var3.method3879(), var1.method3263());
		}

		if (var1.method3262()) {
			this.method4229(var1, var2);
		}

		this.resetBounds();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lfq;I)V"
	)
	void method4229(class142 var1, int var2) {
		Skeleton var3 = var1.field1632;

		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1630 != null && var1.field1630[var4] != null && var1.field1630[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class134 var6 = var1.field1630[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method3188(var2) * 255.0F);
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V"
	)
	void method4230(class182 var1, int var2) {
		this.method4251(var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lhp;ILhp;I[I)V"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhq;Lfq;I[ZZZ)V"
	)
	public void method4232(Skeleton var1, class142 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class182 var7 = var1.method3879();
		if (var7 != null) {
			var7.method3831(var2, var3, var4, var5);
			if (var6) {
				this.method4230(var7, var2.method3263());
			}
		}

		if (!var5 && var2.method3262()) {
			this.method4229(var2, var3);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lhp;I[IZ)V"
	)
	public void method4233(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("at")
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
								var15 = field2217[var14];
								var16 = field2218[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2217[var12];
								var16 = field2218[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2217[var13];
								var16 = field2218[var13];
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

	@ObfuscatedName("az")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bg")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}

		this.resetBounds();
	}

	@ObfuscatedName("bz")
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
		int var2 = field2217[var1];
		int var3 = field2218[var1];

		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bc")
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

	@ObfuscatedName("bo")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}

		this.resetBounds();
	}

	@ObfuscatedName("bm")
	@Export("drawFrustum")
	public final void drawFrustum(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4303();
		}

		int var8 = Rasterizer3D.getClipMidX();
		int var9 = Rasterizer3D.getClipMidY();
		int var10 = field2217[var1];
		int var11 = field2218[var1];
		int var12 = field2217[var2];
		int var13 = field2218[var2];
		int var14 = field2217[var3];
		int var15 = field2218[var3];
		int var16 = field2217[var4];
		int var17 = field2218[var4];
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
			field2198[var19] = var22 - var18;
			modelViewportXs[var19] = var8 + var20 * Rasterizer3D.get3dZoom() / var22;
			modelViewportYs[var19] = var9 + var23 * Rasterizer3D.get3dZoom() / var22;
			field2187[var19] = NPC.method2815(var22);
			if (this.faceTextures != null) {
				field2196[var19] = var20;
				field2197[var19] = var23;
				field2181[var19] = var22;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	@ObfuscatedName("bd")
	@Export("drawOrtho")
	public final void drawOrtho(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4303();
		}

		int var9 = Rasterizer3D.getClipMidX();
		int var10 = Rasterizer3D.getClipMidY();
		int var11 = field2217[var1];
		int var12 = field2218[var1];
		int var13 = field2217[var2];
		int var14 = field2218[var2];
		int var15 = field2217[var3];
		int var16 = field2218[var3];
		int var17 = field2217[var4];
		int var18 = field2218[var4];
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
			field2198[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.get3dZoom() / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.get3dZoom() / var8;
			field2187[var20] = NPC.method2815(var8);
			if (this.faceTextures != null) {
				field2196[var20] = var21;
				field2197[var20] = var24;
				field2181[var20] = var23;
			}
		}

		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	@ObfuscatedName("bh")
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
		if (var14 > 50 && var12 < AbstractRasterizer.method3846()) {
			int var15 = var8 * var4 + var5 * var6 >> 16;
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.get3dZoom();
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2()) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.get3dZoom();
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipMidX2()) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.get3dZoom();
					if (var21 / var14 > Rasterizer3D.method3759()) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.get3dZoom();
						if (var23 / var14 < Rasterizer3D.method3735()) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.faceTextures != null;
							int var28 = ItemContainer.method2396();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = ViewportMouse.ViewportMouse_isInViewport;
							boolean var33 = class402.method7489(var9);
							boolean var34 = false;
							int var40;
							int var41;
							int var42;
							int var52;
							int var55;
							int var56;
							int var57;
							if (var33 && var31) {
								boolean var35 = false;
								if (field2214) {
									boolean var38 = ViewportMouse.ViewportMouse_isInViewport;
									boolean var36;
									if (!var38) {
										var36 = false;
									} else {
										int var44;
										int var45;
										int var46;
										int var47;
										int var48;
										if (!ViewportMouse.ViewportMouse_false0) {
											byte var43 = 50;
											var44 = AbstractRasterizer.method3846();
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var43 / Rasterizer3D.get3dZoom();
											var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var43 / Rasterizer3D.get3dZoom();
											var47 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var44 / Rasterizer3D.get3dZoom();
											var48 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var44 / Rasterizer3D.get3dZoom();
											int var49 = Script.method2285(var46, var43, var3, var2);
											var57 = class138.method3247(var46, var43, var3, var2);
											var46 = var49;
											var49 = Script.method2285(var48, var44, var3, var2);
											int var50 = var44 * var3 - var48 * var2 >> 16;
											var48 = var49;
											var49 = class132.method3183(var45, var57, var5, var4);
											var57 = ArchiveLoader.method2382(var45, var57, var5, var4);
											var45 = var49;
											var49 = class132.method3183(var47, var50, var5, var4);
											var44 = ArchiveLoader.method2382(var47, var50, var5, var4);
											ViewportMouse.field2233 = (var49 + var45) / 2;
											ViewportMouse.field2234 = (var48 + var46) / 2;
											InterfaceParent.field1055 = (var57 + var44) / 2;
											class164.field1782 = (var49 - var45) / 2;
											ViewportMouse.field2237 = (var48 - var46) / 2;
											HttpResponse.field78 = (var44 - var57) / 2;
											class60.field410 = Math.abs(class164.field1782);
											ViewportMouse.field2244 = Math.abs(ViewportMouse.field2237);
											Script.field992 = Math.abs(HttpResponse.field78);
											ViewportMouse.ViewportMouse_false0 = true;
										}

										AABB var51 = (AABB)this.aabb.get(var1);
										var40 = var51.xMid + var6;
										var41 = var7 + var51.yMid;
										var42 = var8 + var51.zMid;
										var57 = var51.xMidOffset;
										var44 = var51.yMidOffset;
										var45 = var51.zMidOffset;
										var46 = ViewportMouse.field2233 - var40;
										var47 = ViewportMouse.field2234 - var41;
										var48 = InterfaceParent.field1055 - var42;
										if (Math.abs(var46) > var57 + class60.field410) {
											var36 = false;
										} else if (Math.abs(var47) > var44 + ViewportMouse.field2244) {
											var36 = false;
										} else if (Math.abs(var48) > var45 + Script.field992) {
											var36 = false;
										} else if (Math.abs(var48 * ViewportMouse.field2237 - var47 * HttpResponse.field78) > var44 * Script.field992 + var45 * ViewportMouse.field2244) {
											var36 = false;
										} else if (Math.abs(var46 * HttpResponse.field78 - var48 * class164.field1782) > var45 * class60.field410 + var57 * Script.field992) {
											var36 = false;
										} else if (Math.abs(var47 * class164.field1782 - var46 * ViewportMouse.field2237) > var57 * ViewportMouse.field2244 + var44 * class60.field410) {
											var36 = false;
										} else {
											var36 = true;
										}
									}

									var35 = var36;
								} else {
									var56 = var12 - var13;
									if (var56 <= 50) {
										var56 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var56;
									} else {
										var17 /= var14;
										var16 /= var56;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var56;
									} else {
										var21 /= var14;
										var23 /= var56;
									}

									var52 = var28 - Rasterizer3D.getClipMidX();
									var55 = var29 - Rasterizer3D.getClipMidY();
									if (var52 > var16 && var52 < var17 && var55 > var23 && var55 < var21) {
										var35 = true;
									}
								}

								if (var35) {
									if (this.isSingleTile) {
										class345.method6489(var9);
									} else {
										var34 = true;
									}
								}
							}

							int var54 = Rasterizer3D.getClipMidX();
							var56 = Rasterizer3D.getClipMidY();
							var52 = 0;
							var55 = 0;
							if (var1 != 0) {
								var52 = field2217[var1];
								var55 = field2218[var1];
							}

							for (int var39 = 0; var39 < this.verticesCount; ++var39) {
								var40 = this.verticesX[var39];
								var41 = this.verticesY[var39];
								var42 = this.verticesZ[var39];
								if (var1 != 0) {
									var57 = var42 * var52 + var40 * var55 >> 16;
									var42 = var42 * var55 - var40 * var52 >> 16;
									var40 = var57;
								}

								var40 += var6;
								var41 += var7;
								var42 += var8;
								var57 = var42 * var4 + var5 * var40 >> 16;
								var42 = var5 * var42 - var40 * var4 >> 16;
								var40 = var57;
								var57 = var3 * var41 - var42 * var2 >> 16;
								var42 = var41 * var2 + var3 * var42 >> 16;
								field2198[var39] = var42 - var12;
								if (var42 >= 50) {
									modelViewportXs[var39] = var54 + var40 * Rasterizer3D.get3dZoom() / var42;
									modelViewportYs[var39] = var56 + var57 * Rasterizer3D.get3dZoom() / var42;
									field2187[var39] = NPC.method2815(var42);
								} else {
									modelViewportXs[var39] = -5000;
									var25 = true;
								}

								if (var27) {
									field2196[var39] = var40;
									field2197[var39] = var57;
									field2181[var39] = var42;
								}
							}

							try {
								this.draw0(var25, var34, this.isSingleTile, var9);
							} catch (Exception var53) {
							}

						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bx")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2200[var6] = 0;
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
							boolean var35;
							if (var18 < var15 && var18 < var16 && var18 < var30) {
								var35 = false;
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6;
								if (var18 > var15 && var18 > var16 && var18 > var30) {
									var35 = false;
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x;
									if (var18 < var11 && var18 < var12 && var18 < var28) {
										var35 = false;
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6;
										if (var18 > var11 && var18 > var12 && var18 > var28) {
											var35 = false;
										} else {
											var35 = true;
										}
									}
								}
							}

							if (var35) {
								class345.method6489(var4);
								var2 = false;
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2191[var7] = false;
							var29 = Rasterizer3D.method3738();
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= var29 && var12 <= var29 && var28 <= var29) {
								field2190[var7] = false;
							} else {
								field2190[var7] = true;
							}

							var15 = (field2198[var8] + field2198[var9] + field2198[var10]) / 3 + this.radius;
							field2201[var15][field2200[var15]++] = var7;
						}
					} else {
						var29 = field2196[var8];
						var15 = field2196[var9];
						var16 = field2196[var10];
						var30 = field2197[var8];
						var18 = field2197[var9];
						int var19 = field2197[var10];
						int var20 = field2181[var8];
						int var21 = field2181[var9];
						int var22 = field2181[var10];
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
							field2191[var7] = true;
							int var26 = (field2198[var8] + field2198[var9] + field2198[var10]) / 3 + this.radius;
							field2201[var26][field2200[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.faceRenderPriorities == null) {
				for (var31 = this.diameter - 1; var31 >= 0; --var31) {
					var32 = field2200[var31];
					if (var32 > 0) {
						var27 = field2201[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) {
					field2158[var31] = 0;
					field2206[var31] = 0;
				}

				for (var31 = this.diameter - 1; var31 >= 0; --var31) {
					var32 = field2200[var31];
					if (var32 > 0) {
						var27 = field2201[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							char var33 = var27[var10];
							byte var34 = this.faceRenderPriorities[var33];
							var28 = field2158[var34]++;
							field2204[var34][var28] = var33;
							if (var34 < 10) {
								int[] var36 = field2206;
								var36[var34] += var31;
							} else if (var34 == 10) {
								field2153[var28] = var31;
							} else {
								field2211[var28] = var31;
							}
						}
					}
				}

				var31 = 0;
				if (field2158[1] > 0 || field2158[2] > 0) {
					var31 = (field2206[1] + field2206[2]) / (field2158[1] + field2158[2]);
				}

				var8 = 0;
				if (field2158[3] > 0 || field2158[4] > 0) {
					var8 = (field2206[3] + field2206[4]) / (field2158[3] + field2158[4]);
				}

				var9 = 0;
				if (field2158[6] > 0 || field2158[8] > 0) {
					var9 = (field2206[8] + field2206[6]) / (field2158[8] + field2158[6]);
				}

				var11 = 0;
				var12 = field2158[10];
				int[] var13 = field2204[10];
				int[] var14 = field2153;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2158[11];
					var13 = field2204[11];
					var14 = field2211;
				}

				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var31) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2204[11]) {
							var11 = 0;
							var12 = field2158[11];
							var13 = field2204[11];
							var14 = field2211;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2204[11]) {
							var11 = 0;
							var12 = field2158[11];
							var13 = field2204[11];
							var14 = field2211;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2204[11]) {
							var11 = 0;
							var12 = field2158[11];
							var13 = field2204[11];
							var14 = field2211;
						}

						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2158[var15];
					int[] var17 = field2204[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}

				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2204[11]) {
						var11 = 0;
						var13 = field2204[11];
						var12 = field2158[11];
						var14 = field2211;
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

	@ObfuscatedName("bv")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2191[var1]) {
			this.method4249(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.clips.clipping = field2190[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.clips.currentFaceAlpha = 0;
			} else {
				Rasterizer3D.clips.currentFaceAlpha = (this.faceAlphas[var1] == -1 ? 253 : this.faceAlphas[var1]) & 255;
			}

			this.method4248(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], field2187[var2], field2187[var3], field2187[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("bu")
	boolean method4263(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2227;
	}

	@ObfuscatedName("bp")
	final void method4248(int var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10, int var11, int var12, int var13) {
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
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var11, var11, field2196[var18], field2196[var15], field2196[var16], field2197[var18], field2197[var15], field2197[var16], field2181[var18], field2181[var15], field2181[var16], this.faceTextures[var1]);
			} else {
				Rasterizer3D.rasterTextureWithShadingAndLighting(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, field2196[var18], field2196[var15], field2196[var16], field2197[var18], field2197[var15], field2197[var16], field2181[var18], field2181[var15], field2181[var16], this.faceTextures[var1]);
			}
		} else {
			boolean var14 = this.method4263(var1);
			if (this.faceColors3[var1] == -1 && var14) {
				Rasterizer3D.rasterTriangle(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2180[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				Rasterizer3D.rasterFlat(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2180[this.faceColors1[var1]]);
			} else if (var14) {
				Rasterizer3D.rasterTriangleWithGradient(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else {
				Rasterizer3D.rasterGouraud(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
			}
		}

	}

	@ObfuscatedName("br")
	final void method4249(int var1) {
		int var2 = Rasterizer3D.getClipMidX();
		int var3 = Rasterizer3D.getClipMidY();
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2181[var5];
		int var9 = field2181[var6];
		int var10 = field2181[var7];
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
			field2207[var4] = modelViewportXs[var5];
			field2208[var4] = modelViewportYs[var5];
			field2210[var4] = field2187[var7];
			field2209[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2196[var5];
			var12 = field2197[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2220[var10 - var8] * (50 - var8);
				field2207[var4] = var2 + (var11 + ((field2196[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2208[var4] = var3 + (var12 + ((field2197[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2210[var4] = field2155;
				field2209[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = field2220[var9 - var8] * (50 - var8);
				field2207[var4] = var2 + (var11 + ((field2196[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2208[var4] = var3 + (var12 + ((field2197[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2210[var4] = field2155;
				field2209[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2207[var4] = modelViewportXs[var6];
			field2208[var4] = modelViewportYs[var6];
			field2210[var4] = field2187[var7];
			field2209[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2196[var6];
			var12 = field2197[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2220[var8 - var9] * (50 - var9);
				field2207[var4] = var2 + (var11 + ((field2196[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2208[var4] = var3 + (var12 + ((field2197[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2210[var4] = field2155;
				field2209[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = field2220[var10 - var9] * (50 - var9);
				field2207[var4] = var2 + (var11 + ((field2196[var7] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2208[var4] = var3 + (var12 + ((field2197[var7] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2209[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2207[var4] = modelViewportXs[var7];
			field2208[var4] = modelViewportYs[var7];
			field2210[var4] = field2187[var7];
			field2209[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2196[var7];
			var12 = field2197[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2220[var9 - var10] * (50 - var10);
				field2207[var4] = var2 + (var11 + ((field2196[var6] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2208[var4] = var3 + (var12 + ((field2197[var6] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2210[var4] = field2155;
				field2209[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = field2220[var8 - var10] * (50 - var10);
				field2207[var4] = var2 + (var11 + ((field2196[var5] - var11) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2208[var4] = var3 + (var12 + ((field2197[var5] - var12) * var14 >> 16)) * Rasterizer3D.get3dZoom() / 50;
				field2210[var4] = field2155;
				field2209[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2207[0];
		var12 = field2207[1];
		var13 = field2207[2];
		var14 = field2208[0];
		int var15 = field2208[1];
		int var16 = field2208[2];
		float var17 = field2210[0];
		float var18 = field2210[1];
		float var19 = field2210[2];
		Rasterizer3D.clips.clipping = false;
		int var20 = Rasterizer3D.method3738();
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20) {
				Rasterizer3D.clips.clipping = true;
			}

			this.method4248(var1, var14, var15, var16, var11, var12, var13, var17, var18, var19, field2209[0], field2209[1], field2209[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > var20 || var12 > var20 || var13 > var20 || field2207[3] < 0 || field2207[3] > var20) {
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
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2196[var25], field2196[var22], field2196[var23], field2197[var25], field2197[var22], field2197[var23], field2181[var25], field2181[var22], field2181[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2208[3], var11, var13, field2207[3], var17, var19, field2210[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2196[var25], field2196[var22], field2196[var23], field2197[var25], field2197[var22], field2197[var23], field2181[var25], field2181[var22], field2181[var23], var26);
				} else {
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2209[0], field2209[1], field2209[2], field2196[var25], field2196[var22], field2196[var23], field2197[var25], field2197[var22], field2197[var23], field2181[var25], field2181[var22], field2181[var23], var26);
					Rasterizer3D.rasterTextureWithShadingAndLighting(var14, var16, field2208[3], var11, var13, field2207[3], var17, var19, field2210[3], field2209[0], field2209[2], field2209[3], field2196[var25], field2196[var22], field2196[var23], field2197[var25], field2197[var22], field2197[var23], field2181[var25], field2181[var22], field2181[var23], var26);
				}
			} else {
				boolean var21 = this.method4263(var1);
				if (this.faceColors3[var1] == -1 && var21) {
					var22 = field2180[this.faceColors1[var1]];
					Rasterizer3D.rasterTriangle(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
					Rasterizer3D.rasterTriangle(var14, var16, field2208[3], var11, var13, field2207[3], var17, var19, field2210[3], var22, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				} else if (this.faceColors3[var1] == -1) {
					var22 = field2180[this.faceColors1[var1]];
					Rasterizer3D.rasterFlat(var14, var15, var16, var11, var12, var13, var17, var18, var19, var22);
					Rasterizer3D.rasterFlat(var14, var16, field2208[3], var11, var13, field2207[3], var17, var19, field2210[3], var22);
				} else if (var21) {
					Rasterizer3D.rasterTriangleWithGradient(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2209[0], field2209[1], field2209[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
					Rasterizer3D.rasterTriangleWithGradient(var14, var16, field2208[3], var11, var13, field2207[3], 0.0F, 0.0F, 0.0F, field2209[0], field2209[2], field2209[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				} else {
					Rasterizer3D.rasterGouraud(var14, var15, var16, var11, var12, var13, var17, var18, var19, field2209[0], field2209[1], field2209[2]);
					Rasterizer3D.rasterGouraud(var14, var16, field2208[3], var11, var13, field2207[3], var17, var19, field2210[3], field2209[0], field2209[2], field2209[3]);
				}
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILqy;)V"
	)
	void method4250(int var1, TransformationMatrix var2) {
		float var3 = (float)this.verticesX[var1];
		float var4 = (float)(-this.verticesY[var1]);
		float var5 = (float)(-this.verticesZ[var1]);
		float var6 = 1.0F;
		this.verticesX[var1] = (int)(var2.field4686[0] * var3 + var2.field4686[4] * var4 + var2.field4686[8] * var5 + var2.field4686[12] * var6);
		this.verticesY[var1] = -((int)(var2.field4686[1] * var3 + var2.field4686[5] * var4 + var2.field4686[9] * var5 + var2.field4686[13] * var6));
		this.verticesZ[var1] = -((int)(var2.field4686[2] * var3 + var2.field4686[6] * var4 + var2.field4686[10] * var5 + var2.field4686[14] * var6));
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V"
	)
	void method4251(class182 var1, int var2) {
		if (this.field2159 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2159[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2182[var3];
					field2168.method7868();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class131 var8 = var1.method3828(var7);
						if (var8 != null) {
							field2156.method7870((float)var5[var6] / 255.0F);
							field2212.method7869(var8.method3141(var2));
							field2212.method7891(field2156);
							field2168.method7872(field2212);
						}
					}

					this.method4250(var3, field2168);
				}
			}

		}
	}

	@ObfuscatedName("ej")
	void vmethod4224(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
		int var15 = Rasterizer3D.Rasterizer3D_sine[var2];
		int var16 = Rasterizer3D.Rasterizer3D_cosine[var2];
		int var17 = Rasterizer3D.Rasterizer3D_sine[var3];
		int var18 = Rasterizer3D.Rasterizer3D_cosine[var3];
		this.draw(var1, var15, var16, var17, var18, var4 - var7, var5 - var8, var6 - var9, var10);
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(ILqy;IIIJ)V"
	)
	@Export("draw")
	void draw(int var1, TransformationMatrix var2, int var3, int var4, int var5, long var6) {
		if (this.boundsType != 1) {
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1);
		class419 var8 = new class419();
		var8.field4659 = new class424((float)((double)var1 * 0.0030679615D), 0.0F, 0.0F);
		var8.field4658 = new class423(1.0F, 1.0F, 1.0F);
		var8.field4657 = new class423((float)var3, (float)var4, (float)var5);
		TransformationMatrix var9 = new TransformationMatrix();
		var9.method7874(var8);
		var9.method7891(var2);
		int var10 = (int)var9.method7937(0.0F, 0.0F, 0.0F);
		boolean var11 = false;
		int var12 = Rasterizer3D.getClipMidX();
		int var13 = Rasterizer3D.getClipMidY();
		if (var1 != 0) {
		}

		for (int var14 = 0; var14 < this.verticesCount; ++var14) {
			int var15 = this.verticesX[var14];
			int var16 = this.verticesY[var14];
			int var17 = this.verticesZ[var14];
			var9.transformPoint((float)var15, (float)var16, (float)var17, field2169);
			var15 = (int)field2169[0];
			var16 = (int)field2169[1];
			var17 = (int)field2169[2];
			field2198[var14] = var17 - var10;
			if (var17 >= 50) {
				modelViewportXs[var14] = var12 + var15 * Rasterizer3D.get3dZoom() / var17;
				modelViewportYs[var14] = var13 + var16 * Rasterizer3D.get3dZoom() / var17;
				field2187[var14] = NPC.method2815(var17);
			} else {
				modelViewportXs[var14] = -5000;
				var11 = true;
			}

			if (this.faceTextures != null) {
				field2196[var14] = var15;
				field2197[var14] = var16;
				field2181[var14] = var17;
			}
		}

		boolean var20 = ViewportMouse.ViewportMouse_isInViewport;
		boolean var21 = var20 && class402.method7489(var6);

		try {
			this.draw0(var11, var21, this.isSingleTile, var6);
		} catch (Exception var19) {
		}

	}
}
