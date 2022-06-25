import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hy")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lhy;")
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;

	@ObfuscatedName("v")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lhy;")
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;

	@ObfuscatedName("f")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lny;")
	static class387 field2542;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lny;")
	static class387 field2510;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lny;")
	static class387 field2511;

	@ObfuscatedName("ai")
	static boolean[] field2549;

	@ObfuscatedName("az")
	static boolean[] field2550;

	@ObfuscatedName("av")
	@Export("modelViewportXs")
	static int[] modelViewportXs;

	@ObfuscatedName("aw")
	@Export("modelViewportYs")
	static int[] modelViewportYs;

	@ObfuscatedName("au")
	static int[] field2553;

	@ObfuscatedName("aa")
	static int[] field2520;

	@ObfuscatedName("ay")
	static int[] field2555;

	@ObfuscatedName("as")
	static int[] field2559;

	@ObfuscatedName("bz")
	static int[] field2558;

	@ObfuscatedName("bp")
	static int[][] field2509;

	@ObfuscatedName("bf")
	static int[] field2560;

	@ObfuscatedName("bg")
	static int[][] field2532;

	@ObfuscatedName("br")
	static int[] field2562;

	@ObfuscatedName("bn")
	static int[] field2508;

	@ObfuscatedName("bq")
	static int[] field2564;

	@ObfuscatedName("bc")
	static int[] field2505;

	@ObfuscatedName("bl")
	static int[] field2566;

	@ObfuscatedName("bv")
	static int[] field2567;

	@ObfuscatedName("bt")
	@Export("Model_transformTempX")
	static int Model_transformTempX;

	@ObfuscatedName("bh")
	@Export("Model_transformTempY")
	static int Model_transformTempY;

	@ObfuscatedName("bs")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;

	@ObfuscatedName("bk")
	static boolean field2524;

	@ObfuscatedName("bu")
	@Export("Model_sine")
	static int[] Model_sine;

	@ObfuscatedName("bw")
	@Export("Model_cosine")
	static int[] Model_cosine;

	@ObfuscatedName("bi")
	@Export("Model_colorPalette")
	static int[] Model_colorPalette;

	@ObfuscatedName("bo")
	static int[] field2547;

	@ObfuscatedName("w")
	@Export("verticesCount")
	int verticesCount;

	@ObfuscatedName("y")
	@Export("verticesX")
	int[] verticesX;

	@ObfuscatedName("i")
	@Export("verticesY")
	int[] verticesY;

	@ObfuscatedName("s")
	@Export("verticesZ")
	int[] verticesZ;

	@ObfuscatedName("t")
	@Export("indicesCount")
	int indicesCount;

	@ObfuscatedName("z")
	@Export("indices1")
	int[] indices1;

	@ObfuscatedName("r")
	@Export("indices2")
	int[] indices2;

	@ObfuscatedName("u")
	@Export("indices3")
	int[] indices3;

	@ObfuscatedName("k")
	@Export("faceColors1")
	int[] faceColors1;

	@ObfuscatedName("h")
	@Export("faceColors2")
	int[] faceColors2;

	@ObfuscatedName("x")
	@Export("faceColors3")
	int[] faceColors3;

	@ObfuscatedName("l")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;

	@ObfuscatedName("a")
	@Export("faceAlphas")
	byte[] faceAlphas;

	@ObfuscatedName("p")
	byte[] field2525;

	@ObfuscatedName("b")
	@Export("faceTextures")
	short[] faceTextures;

	@ObfuscatedName("n")
	byte field2527;

	@ObfuscatedName("o")
	int field2528;

	@ObfuscatedName("m")
	int[] field2529;

	@ObfuscatedName("d")
	int[] field2522;

	@ObfuscatedName("ad")
	int[] field2531;

	@ObfuscatedName("ak")
	@Export("vertexLabels")
	int[][] vertexLabels;

	@ObfuscatedName("al")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;

	@ObfuscatedName("ao")
	int[][] field2534;

	@ObfuscatedName("ab")
	int[][] field2519;

	@ObfuscatedName("ap")
	@Export("isSingleTile")
	public boolean isSingleTile;

	@ObfuscatedName("ac")
	@Export("boundsType")
	int boundsType;

	@ObfuscatedName("ae")
	@Export("bottomY")
	int bottomY;

	@ObfuscatedName("aj")
	@Export("xzRadius")
	int xzRadius;

	@ObfuscatedName("am")
	@Export("diameter")
	int diameter;

	@ObfuscatedName("an")
	@Export("radius")
	int radius;

	@ObfuscatedName("af")
	@Export("xMid")
	int xMid;

	@ObfuscatedName("ax")
	@Export("yMid")
	int yMid;

	@ObfuscatedName("ar")
	@Export("zMid")
	int zMid;

	@ObfuscatedName("at")
	@Export("xMidOffset")
	int xMidOffset;

	@ObfuscatedName("ag")
	@Export("yMidOffset")
	int yMidOffset;

	@ObfuscatedName("aq")
	@Export("zMidOffset")
	int zMidOffset;

	@ObfuscatedName("by")
	@Export("overrideHue")
	public byte overrideHue;

	@ObfuscatedName("bj")
	@Export("overrideSaturation")
	public byte overrideSaturation;

	@ObfuscatedName("bd")
	@Export("overrideLuminance")
	public byte overrideLuminance;

	@ObfuscatedName("cr")
	@Export("overrideAmount")
	public byte overrideAmount;

	static {
		Model_sharedSequenceModel = new Model();
		Model_sharedSequenceModelFaceAlphas = new byte[1];
		Model_sharedSpotAnimationModel = new Model();
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1];
		field2542 = new class387();
		field2510 = new class387();
		field2511 = new class387();
		field2549 = new boolean[6500];
		field2550 = new boolean[6500];
		modelViewportXs = new int[6500];
		modelViewportYs = new int[6500];
		field2553 = new int[6500];
		field2520 = new int[6500];
		field2555 = new int[6500];
		field2559 = new int[6500];
		field2558 = new int[1600];
		field2509 = new int[1600][512];
		field2560 = new int[12];
		field2532 = new int[12][2000];
		field2562 = new int[2000];
		field2508 = new int[2000];
		field2564 = new int[12];
		field2505 = new int[10];
		field2566 = new int[10];
		field2567 = new int[10];
		field2524 = true;
		Model_sine = Rasterizer3D.Rasterizer3D_sine;
		Model_cosine = Rasterizer3D.Rasterizer3D_cosine;
		Model_colorPalette = Rasterizer3D.Rasterizer3D_colorPalette;
		field2547 = Rasterizer3D.field2347;
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2527 = 0;
		this.field2528 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	}

	@ObfuscatedSignature(descriptor = "([Lhy;I)V")
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2527 = 0;
		this.field2528 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2528 = 0;
		this.field2527 = -1;
		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				this.verticesCount += var8.verticesCount;
				this.indicesCount += var8.indicesCount;
				this.field2528 += var8.field2528;
				if (var8.faceRenderPriorities != null) {
					var3 = true;
				} else {
					if (this.field2527 == -1) {
						this.field2527 = var8.field2527;
					}
					if (this.field2527 != var8.field2527) {
						var3 = true;
					}
				}
				var4 |= var8.faceAlphas != null;
				var5 |= var8.faceTextures != null;
				var6 |= var8.field2525 != null;
			}
		}
		this.verticesX = new int[this.verticesCount];
		this.verticesY = new int[this.verticesCount];
		this.verticesZ = new int[this.verticesCount];
		this.indices1 = new int[this.indicesCount];
		this.indices2 = new int[this.indicesCount];
		this.indices3 = new int[this.indicesCount];
		this.faceColors1 = new int[this.indicesCount];
		this.faceColors2 = new int[this.indicesCount];
		this.faceColors3 = new int[this.indicesCount];
		if (var3) {
			this.faceRenderPriorities = new byte[this.indicesCount];
		}
		if (var4) {
			this.faceAlphas = new byte[this.indicesCount];
		}
		if (var5) {
			this.faceTextures = new short[this.indicesCount];
		}
		if (var6) {
			this.field2525 = new byte[this.indicesCount];
		}
		if (this.field2528 > 0) {
			this.field2529 = new int[this.field2528];
			this.field2522 = new int[this.field2528];
			this.field2531 = new int[this.field2528];
		}
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2528 = 0;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) {
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9];
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9];
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9];
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9];
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9];
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9];
					if (var3) {
						if (var8.faceRenderPriorities != null) {
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2527;
						}
					}
					if (var4 && var8.faceAlphas != null) {
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}
					if (var5) {
						if (var8.faceTextures != null) {
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1;
						}
					}
					if (var6) {
						if (var8.field2525 != null && var8.field2525[var9] != -1) {
							this.field2525[this.indicesCount] = ((byte) (this.field2528 + var8.field2525[var9]));
						} else {
							this.field2525[this.indicesCount] = -1;
						}
					}
					++this.indicesCount;
				}
				for (var9 = 0; var9 < var8.field2528; ++var9) {
					this.field2529[this.field2528] = this.verticesCount + var8.field2529[var9];
					this.field2522[this.field2528] = this.verticesCount + var8.field2522[var9];
					this.field2531[this.field2528] = this.verticesCount + var8.field2531[var9];
					++this.field2528;
				}
				for (var9 = 0; var9 < var8.verticesCount; ++var9) {
					this.verticesX[this.verticesCount] = var8.verticesX[var9];
					this.verticesY[this.verticesCount] = var8.verticesY[var9];
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9];
					++this.verticesCount;
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([[IIIIZI)Lhy;")
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
					var11.field2528 = this.field2528;
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
					var11.field2525 = this.field2525;
					var11.faceTextures = this.faceTextures;
					var11.field2527 = this.field2527;
					var11.field2529 = this.field2529;
					var11.field2522 = this.field2522;
					var11.field2531 = this.field2531;
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Z)Lhy;")
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model.Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}
		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Z)Lhy;")
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model.Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) {
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}
		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ZLhy;[B)Lhy;")
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount;
		var2.indicesCount = this.indicesCount;
		var2.field2528 = this.field2528;
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
		var2.field2525 = this.field2525;
		var2.faceTextures = this.faceTextures;
		var2.field2527 = this.field2527;
		var2.field2529 = this.field2529;
		var2.field2522 = this.field2522;
		var2.field2531 = this.field2531;
		var2.vertexLabels = this.vertexLabels;
		var2.faceLabelsAlpha = this.faceLabelsAlpha;
		var2.field2534 = this.field2534;
		var2.field2519 = this.field2519;
		var2.isSingleTile = this.isSingleTile;
		var2.resetBounds();
		var2.overrideAmount = 0;
		return var2;
	}

	@ObfuscatedName("w")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = Model_cosine[var1];
			int var9 = Model_sine[var1];
			for (int var10 = 0; var10 < this.verticesCount; ++var10) {
				int var11 = Rasterizer3D.method4052(this.verticesX[var10], this.verticesZ[var10], var8, var9);
				int var12 = this.verticesY[var10];
				int var13 = Rasterizer3D.method4072(this.verticesX[var10], this.verticesZ[var10], var8, var9);
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
			this.xMid = (var5 + var2) / 2;
			this.yMid = (var6 + var3) / 2;
			this.zMid = (var7 + var4) / 2;
			this.xMidOffset = (var5 - var2 + 1) / 2;
			this.yMidOffset = (var6 - var3 + 1) / 2;
			this.zMidOffset = (var7 - var4 + 1) / 2;
			boolean var14 = true;
			if (this.xMidOffset < 32) {
				this.xMidOffset = 32;
			}
			if (this.zMidOffset < 32) {
				this.zMidOffset = 32;
			}
			if (this.isSingleTile) {
				boolean var15 = true;
				this.xMidOffset += 8;
				this.zMidOffset += 8;
			}
		}
	}

	@ObfuscatedName("y")
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
			this.xzRadius = ((int) (Math.sqrt(((double) (this.xzRadius))) + 0.99));
			this.radius = ((int) (Math.sqrt(((double) (this.xzRadius * this.xzRadius + super.height * super.height))) + 0.99));
			this.diameter = this.radius + ((int) (Math.sqrt(((double) (this.xzRadius * this.xzRadius + this.bottomY * this.bottomY))) + 0.99));
		}
	}

	@ObfuscatedName("i")
	void method4391() {
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
			this.xzRadius = ((int) (Math.sqrt(((double) (this.xzRadius))) + 0.99));
			this.radius = this.xzRadius;
			this.diameter = this.xzRadius + this.xzRadius;
		}
	}

	@ObfuscatedName("s")
	public int method4456() {
		this.calculateBoundsCylinder();
		return this.xzRadius;
	}

	@ObfuscatedName("t")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0;
		this.xMidOffset = -1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lgh;I)V")
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Lda;I)V")
	public void method4404(class122 var1, int var2) {
		Skeleton var3 = var1.field1523;
		class201 var4 = var3.method4150();
		if (var4 != null) {
			var3.method4150().method4146(var1, var2);
			this.method4403(var3.method4150(), var1.method2766());
		}
		if (var1.method2778()) {
			this.method4396(var1, var2);
		}
		this.resetBounds();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lda;I)V")
	void method4396(class122 var1, int var2) {
		Skeleton var3 = var1.field1523;
		for (int var4 = 0; var4 < var3.count; ++var4) {
			int var5 = var3.transformTypes[var4];
			if (var5 == 5 && var1.field1518 != null && var1.field1518[var4] != null && var1.field1518[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) {
				class117 var6 = var1.field1518[var4][0];
				int[] var7 = var3.labels[var4];
				int var8 = var7.length;
				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.faceLabelsAlpha.length) {
						int[] var11 = this.faceLabelsAlpha[var10];
						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = ((int) (((float) (this.faceAlphas[var13] & 255)) + var6.method2701(var2) * 255.0F));
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}
							this.faceAlphas[var13] = ((byte) (var14));
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lgq;I)V")
	void method4403(class201 var1, int var2) {
		this.method4424(var1, var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lgh;ILgh;I[I)V")
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Lda;I[ZZ)V")
	public void method4399(class122 var1, int var2, boolean[] var3, boolean var4) {
		Skeleton var5 = var1.field1523;
		class201 var6 = var5.method4150();
		if (var6 != null) {
			var6.method4126(var1, var2, var3, var4);
			this.method4403(var6, var1.method2766());
		}
		if (var1.method2778()) {
			this.method4396(var1, var2);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lgh;I[IZ)V")
	public void method4398(Frames var1, int var2, int[] var3, boolean var4) {
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

	@ObfuscatedName("a")
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
								var15 = Model_sine[var14];
								var16 = Model_cosine[var14];
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16;
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16;
								this.verticesX[var11] = var17;
							}
							if (var12 != 0) {
								var15 = Model_sine[var12];
								var16 = Model_cosine[var12];
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16;
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16;
								this.verticesY[var11] = var17;
							}
							if (var13 != 0) {
								var15 = Model_sine[var13];
								var16 = Model_cosine[var13];
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
								this.faceAlphas[var11] = ((byte) (var12));
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("p")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesX[var1];
			this.verticesX[var1] = this.verticesZ[var1];
			this.verticesZ[var1] = -var2;
		}
		this.resetBounds();
	}

	@ObfuscatedName("b")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			this.verticesX[var1] = -this.verticesX[var1];
			this.verticesZ[var1] = -this.verticesZ[var1];
		}
		this.resetBounds();
	}

	@ObfuscatedName("n")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) {
			int var2 = this.verticesZ[var1];
			this.verticesZ[var1] = this.verticesX[var1];
			this.verticesX[var1] = -var2;
		}
		this.resetBounds();
	}

	@ObfuscatedName("o")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = Model_sine[var1];
		int var3 = Model_cosine[var1];
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16;
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16;
			this.verticesY[var4] = var5;
		}
		this.resetBounds();
	}

	@ObfuscatedName("m")
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

	@ObfuscatedName("d")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) {
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128;
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128;
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128;
		}
		this.resetBounds();
	}

	@ObfuscatedName("ad")
	public final void method4442(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		field2558[0] = -1;
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4391();
		}
		int var8 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var10 = Model_sine[var1];
		int var11 = Model_cosine[var1];
		int var12 = Model_sine[var2];
		int var13 = Model_cosine[var2];
		int var14 = Model_sine[var3];
		int var15 = Model_cosine[var3];
		int var16 = Model_sine[var4];
		int var17 = Model_cosine[var4];
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
			field2553[var19] = var22 - var18;
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8;
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9;
			if (this.field2528 > 0) {
				field2520[var19] = var20;
				field2555[var19] = var23;
				field2559[var19] = var22;
			}
		}
		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var25) {
		}
	}

	@ObfuscatedName("ak")
	public final void method4462(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		field2558[0] = -1;
		if (this.boundsType != 2 && this.boundsType != 1) {
			this.method4391();
		}
		int var9 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var11 = Model_sine[var1];
		int var12 = Model_cosine[var1];
		int var13 = Model_sine[var2];
		int var14 = Model_cosine[var2];
		int var15 = Model_sine[var3];
		int var16 = Model_cosine[var3];
		int var17 = Model_sine[var4];
		int var18 = Model_cosine[var4];
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
			field2553[var20] = var23 - var19;
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8;
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8;
			if (this.field2528 > 0) {
				field2520[var20] = var21;
				field2555[var20] = var24;
				field2559[var20] = var23;
			}
		}
		try {
			this.draw0(false, false, false, 0L);
		} catch (Exception var26) {
		}
	}

	@ObfuscatedName("al")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 1600) {
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) {
				field2558[var6] = 0;
			}
			var6 = (var3) ? 20 : 5;
			int var7;
			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (var7 = 0; var7 < this.indicesCount; ++var7) {
				if (this.faceColors3[var7] != -2) {
					var8 = this.indices1[var7];
					var9 = this.indices2[var7];
					var10 = this.indices3[var7];
					var11 = modelViewportXs[var8];
					var12 = modelViewportXs[var9];
					var28 = modelViewportXs[var10];
					int var29;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) {
						if (var2 && class101.method2549(modelViewportYs[var8], modelViewportYs[var9], modelViewportYs[var10], var11, var12, var28, var6)) {
							class249.method5123(var4);
							var2 = false;
						}
						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) {
							field2550[var7] = false;
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) {
								field2549[var7] = false;
							} else {
								field2549[var7] = true;
							}
							var29 = (field2553[var8] + field2553[var9] + field2553[var10]) / 3 + this.radius;
							field2509[var29][field2558[var29]++] = var7;
						}
					} else {
						var29 = field2520[var8];
						var15 = field2520[var9];
						var16 = field2520[var10];
						int var30 = field2555[var8];
						var18 = field2555[var9];
						int var19 = field2555[var10];
						int var20 = field2559[var8];
						int var21 = field2559[var9];
						int var22 = field2559[var10];
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
							field2550[var7] = true;
							int var26 = (field2553[var8] + field2553[var9] + field2553[var10]) / 3 + this.radius;
							field2509[var26][field2558[var26]++] = var7;
						}
					}
				}
			}
			int[] var27;
			if (this.faceRenderPriorities == null) {
				for (var7 = this.diameter - 1; var7 >= 0; --var7) {
					var8 = field2558[var7];
					if (var8 > 0) {
						var27 = field2509[var7];
						for (var10 = 0; var10 < var8; ++var10) {
							this.drawFace(var27[var10]);
						}
					}
				}
			} else {
				for (var7 = 0; var7 < 12; ++var7) {
					field2560[var7] = 0;
					field2564[var7] = 0;
				}
				for (var7 = this.diameter - 1; var7 >= 0; --var7) {
					var8 = field2558[var7];
					if (var8 > 0) {
						var27 = field2509[var7];
						for (var10 = 0; var10 < var8; ++var10) {
							var11 = var27[var10];
							byte var31 = this.faceRenderPriorities[var11];
							var28 = field2560[var31]++;
							field2532[var31][var28] = var11;
							if (var31 < 10) {
								int[] var10000 = field2564;
								var10000[var31] += var7;
							} else if (var31 == 10) {
								field2562[var28] = var7;
							} else {
								field2508[var28] = var7;
							}
						}
					}
				}
				var7 = 0;
				if (field2560[1] > 0 || field2560[2] > 0) {
					var7 = (field2564[1] + field2564[2]) / (field2560[1] + field2560[2]);
				}
				var8 = 0;
				if (field2560[3] > 0 || field2560[4] > 0) {
					var8 = (field2564[3] + field2564[4]) / (field2560[3] + field2560[4]);
				}
				var9 = 0;
				if (field2560[6] > 0 || field2560[8] > 0) {
					var9 = (field2564[8] + field2564[6]) / (field2560[8] + field2560[6]);
				}
				var11 = 0;
				var12 = field2560[10];
				int[] var13 = field2532[10];
				int[] var14 = field2562;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2560[11];
					var13 = field2532[11];
					var14 = field2508;
				}
				if (var11 < var12) {
					var10 = var14[var11];
				} else {
					var10 = -1000;
				}
				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var7) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2532[11]) {
							var11 = 0;
							var12 = field2560[11];
							var13 = field2532[11];
							var14 = field2508;
						}
						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					} 
					while (var15 == 3 && var10 > var8) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2532[11]) {
							var11 = 0;
							var12 = field2560[11];
							var13 = field2532[11];
							var14 = field2508;
						}
						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					} 
					while (var15 == 5 && var10 > var9) {
						this.drawFace(var13[var11++]);
						if (var11 == var12 && var13 != field2532[11]) {
							var11 = 0;
							var12 = field2560[11];
							var13 = field2532[11];
							var14 = field2508;
						}
						if (var11 < var12) {
							var10 = var14[var11];
						} else {
							var10 = -1000;
						}
					} 
					var16 = field2560[var15];
					int[] var17 = field2532[var15];
					for (var18 = 0; var18 < var16; ++var18) {
						this.drawFace(var17[var18]);
					}
				}
				while (var10 != -1000) {
					this.drawFace(var13[var11++]);
					if (var11 == var12 && var13 != field2532[11]) {
						var11 = 0;
						var13 = field2532[11];
						var12 = field2560[11];
						var14 = field2508;
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

	@ObfuscatedName("ao")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2550[var1]) {
			this.method4453(var1);
		} else {
			int var2 = this.indices1[var1];
			int var3 = this.indices2[var1];
			int var4 = this.indices3[var1];
			Rasterizer3D.field2345 = field2549[var1];
			if (this.faceAlphas == null) {
				Rasterizer3D.Rasterizer3D_alpha = 0;
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
			}
			this.method4413(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]);
		}
	}

	@ObfuscatedName("ab")
	final void method4413(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) {
			int var11;
			int var12;
			int var13;
			if (this.field2525 != null && this.field2525[var1] != -1) {
				int var14 = this.field2525[var1] & 255;
				var11 = this.field2529[var14];
				var12 = this.field2522[var14];
				var13 = this.field2531[var14];
			} else {
				var11 = this.indices1[var1];
				var12 = this.indices2[var1];
				var13 = this.indices3[var1];
			}
			if (this.faceColors3[var1] == -1) {
				Rasterizer3D.method4070(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2520[var11], field2520[var12], field2520[var13], field2555[var11], field2555[var12], field2555[var13], field2559[var11], field2559[var12], field2559[var13], this.faceTextures[var1]);
			} else {
				Rasterizer3D.method4070(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2520[var11], field2520[var12], field2520[var13], field2555[var11], field2555[var12], field2555[var13], field2559[var11], field2559[var12], field2559[var13], this.faceTextures[var1]);
			}
		} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) {
			Rasterizer3D.method4035(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
		} else if (this.faceColors3[var1] == -1) {
			Rasterizer3D.method4116(var2, var3, var4, var5, var6, var7, Model_colorPalette[this.faceColors1[var1]]);
		} else if (this.overrideAmount > 0) {
			Rasterizer3D.method4032(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
		} else {
			Rasterizer3D.method4096(var2, var3, var4, var5, var6, var7, var8, var9, var10);
		}
	}

	@ObfuscatedName("ap")
	final void method4453(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX;
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY;
		int var4 = 0;
		int var5 = this.indices1[var1];
		int var6 = this.indices2[var1];
		int var7 = this.indices3[var1];
		int var8 = field2559[var5];
		int var9 = field2559[var6];
		int var10 = field2559[var7];
		if (this.faceAlphas == null) {
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255;
		}
		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2505[var4] = modelViewportXs[var5];
			field2566[var4] = modelViewportYs[var5];
			field2567[var4++] = this.faceColors1[var1];
		} else {
			var11 = field2520[var5];
			var12 = field2555[var5];
			var13 = this.faceColors1[var1];
			if (var10 >= 50) {
				var14 = field2547[var10 - var8] * (50 - var8);
				field2505[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2520[var7] - var11) * var14 >> 16)) / 50;
				field2566[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var7] - var12) * var14 >> 16)) / 50;
				field2567[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
			if (var9 >= 50) {
				var14 = field2547[var9 - var8] * (50 - var8);
				field2505[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2520[var6] - var11) * var14 >> 16)) / 50;
				field2566[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var6] - var12) * var14 >> 16)) / 50;
				field2567[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
		}
		if (var9 >= 50) {
			field2505[var4] = modelViewportXs[var6];
			field2566[var4] = modelViewportYs[var6];
			field2567[var4++] = this.faceColors2[var1];
		} else {
			var11 = field2520[var6];
			var12 = field2555[var6];
			var13 = this.faceColors2[var1];
			if (var8 >= 50) {
				var14 = field2547[var8 - var9] * (50 - var9);
				field2505[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2520[var5] - var11) * var14 >> 16)) / 50;
				field2566[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var5] - var12) * var14 >> 16)) / 50;
				field2567[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
			if (var10 >= 50) {
				var14 = field2547[var10 - var9] * (50 - var9);
				field2505[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2520[var7] - var11) * var14 >> 16)) / 50;
				field2566[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var7] - var12) * var14 >> 16)) / 50;
				field2567[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16);
			}
		}
		if (var10 >= 50) {
			field2505[var4] = modelViewportXs[var7];
			field2566[var4] = modelViewportYs[var7];
			field2567[var4++] = this.faceColors3[var1];
		} else {
			var11 = field2520[var7];
			var12 = field2555[var7];
			var13 = this.faceColors3[var1];
			if (var9 >= 50) {
				var14 = field2547[var9 - var10] * (50 - var10);
				field2505[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2520[var6] - var11) * var14 >> 16)) / 50;
				field2566[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var6] - var12) * var14 >> 16)) / 50;
				field2567[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16);
			}
			if (var8 >= 50) {
				var14 = field2547[var8 - var10] * (50 - var10);
				field2505[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2520[var5] - var11) * var14 >> 16)) / 50;
				field2566[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var5] - var12) * var14 >> 16)) / 50;
				field2567[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16);
			}
		}
		var11 = field2505[0];
		var12 = field2505[1];
		var13 = field2505[2];
		var14 = field2566[0];
		int var15 = field2566[1];
		int var16 = field2566[2];
		Rasterizer3D.field2345 = false;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) {
				Rasterizer3D.field2345 = true;
			}
			this.method4413(var1, var14, var15, var16, var11, var12, var13, field2567[0], field2567[1], field2567[2]);
		}
		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2505[3] < 0 || field2505[3] > Rasterizer3D.Rasterizer3D_clipWidth) {
				Rasterizer3D.field2345 = true;
			}
			int var17;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) {
				int var18;
				int var19;
				if (this.field2525 != null && this.field2525[var1] != -1) {
					int var20 = this.field2525[var1] & 255;
					var17 = this.field2529[var20];
					var18 = this.field2522[var20];
					var19 = this.field2531[var20];
				} else {
					var17 = var5;
					var18 = var6;
					var19 = var7;
				}
				short var21 = this.faceTextures[var1];
				if (this.faceColors3[var1] == -1) {
					Rasterizer3D.method4070(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2520[var17], field2520[var18], field2520[var19], field2555[var17], field2555[var18], field2555[var19], field2559[var17], field2559[var18], field2559[var19], var21);
					Rasterizer3D.method4070(var14, var16, field2566[3], var11, var13, field2505[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2520[var17], field2520[var18], field2520[var19], field2555[var17], field2555[var18], field2555[var19], field2559[var17], field2559[var18], field2559[var19], var21);
				} else {
					Rasterizer3D.method4070(var14, var15, var16, var11, var12, var13, field2567[0], field2567[1], field2567[2], field2520[var17], field2520[var18], field2520[var19], field2555[var17], field2555[var18], field2555[var19], field2559[var17], field2559[var18], field2559[var19], var21);
					Rasterizer3D.method4070(var14, var16, field2566[3], var11, var13, field2505[3], field2567[0], field2567[2], field2567[3], field2520[var17], field2520[var18], field2520[var19], field2555[var17], field2555[var18], field2555[var19], field2559[var17], field2559[var18], field2559[var19], var21);
				}
			} else if (this.faceColors3[var1] == -1 && this.overrideAmount > 0) {
				var17 = Model_colorPalette[this.faceColors1[var1]];
				Rasterizer3D.method4035(var14, var15, var16, var11, var12, var13, var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
				Rasterizer3D.method4035(var14, var16, field2566[3], var11, var13, field2505[3], var17, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount);
			} else if (this.faceColors3[var1] == -1) {
				var17 = Model_colorPalette[this.faceColors1[var1]];
				Rasterizer3D.method4116(var14, var15, var16, var11, var12, var13, var17);
				Rasterizer3D.method4116(var14, var16, field2566[3], var11, var13, field2505[3], var17);
			} else if (this.overrideAmount > 0) {
				Rasterizer3D.method4032(var14, var15, var16, var11, var12, var13, field2567[0], field2567[1], field2567[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
				Rasterizer3D.method4032(var14, var16, field2566[3], var11, var13, field2505[3], field2567[0], field2567[2], field2567[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount);
			} else {
				Rasterizer3D.method4096(var14, var15, var16, var11, var12, var13, field2567[0], field2567[1], field2567[2]);
				Rasterizer3D.method4096(var14, var16, field2566[3], var11, var13, field2505[3], field2567[0], field2567[2], field2567[3]);
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(ILny;)V")
	void method4415(int var1, class387 var2) {
		float var3 = ((float) (this.verticesX[var1]));
		float var4 = ((float) (-this.verticesY[var1]));
		float var5 = ((float) (-this.verticesZ[var1]));
		float var6 = 1.0F;
		this.verticesX[var1] = ((int) (var2.field4394[0] * var3 + var2.field4394[4] * var4 + var2.field4394[8] * var5 + var2.field4394[12] * var6));
		this.verticesY[var1] = -((int) (var2.field4394[1] * var3 + var2.field4394[5] * var4 + var2.field4394[9] * var5 + var2.field4394[13] * var6));
		this.verticesZ[var1] = -((int) (var2.field4394[2] * var3 + var2.field4394[6] * var4 + var2.field4394[10] * var5 + var2.field4394[14] * var6));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(Lgq;I)V")
	void method4424(class201 var1, int var2) {
		if (this.field2534 != null) {
			for (int var3 = 0; var3 < this.verticesCount; ++var3) {
				int[] var4 = this.field2534[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2519[var3];
					field2542.method7016();
					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class115 var8 = var1.method4123(var7);
						if (var8 != null) {
							field2510.method6963(((float) (var5[var6])) / 255.0F);
							field2511.method6973(var8.method2651(var2));
							field2511.method6962(field2510);
							field2542.method6965(field2511);
						}
					}
					this.method4415(var3, field2542);
				}
			}
		}
	}

	@ObfuscatedName("cv")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		field2558[0] = -1;
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
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom;
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) {
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom;
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) {
					int var18 = var3 * var7 - var11 * var2 >> 16;
					int var19 = var2 * this.xzRadius >> 16;
					int var20 = (var3 * this.bottomY >> 16) + var19;
					int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom;
					if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) {
						int var22 = (var3 * super.height >> 16) + var19;
						int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom;
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) {
							int var24 = var13 + (var2 * super.height >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}
							boolean var27 = var26 || this.field2528 > 0;
							int var28 = class120.method2758();
							int var29 = ViewportMouse.ViewportMouse_y;
							boolean var31 = class174.method3458();
							boolean var32 = Canvas.method322(var9);
							boolean var33 = false;
							int var37;
							int var38;
							int var39;
							int var40;
							int var48;
							int var52;
							int var53;
							int var54;
							if (var32 && var31) {
								boolean var34 = false;
								if (field2524) {
									boolean var35;
									if (!class174.method3458()) {
										var35 = false;
									} else {
										int var43;
										int var44;
										int var45;
										if (!ViewportMouse.ViewportMouse_false0) {
											var37 = Scene.Scene_cameraPitchSine;
											var38 = Scene.Scene_cameraPitchCosine;
											var39 = Scene.Scene_cameraYawSine;
											var40 = Scene.Scene_cameraYawCosine;
											byte var41 = 50;
											short var42 = 3500;
											var43 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var41 / Rasterizer3D.Rasterizer3D_zoom;
											var44 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var41 / Rasterizer3D.Rasterizer3D_zoom;
											var45 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.Rasterizer3D_clipMidX) * var42 / Rasterizer3D.Rasterizer3D_zoom;
											int var46 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.Rasterizer3D_clipMidY) * var42 / Rasterizer3D.Rasterizer3D_zoom;
											int var47 = Rasterizer3D.method4045(var44, var41, var38, var37);
											var53 = Rasterizer3D.method4046(var44, var41, var38, var37);
											var44 = var47;
											var47 = Rasterizer3D.method4045(var46, var42, var38, var37);
											var54 = Rasterizer3D.method4046(var46, var42, var38, var37);
											var46 = var47;
											var47 = Rasterizer3D.method4025(var43, var53, var40, var39);
											var53 = Rasterizer3D.method4044(var43, var53, var40, var39);
											var43 = var47;
											var47 = Rasterizer3D.method4025(var45, var54, var40, var39);
											var54 = Rasterizer3D.method4044(var45, var54, var40, var39);
											ViewportMouse.field2588 = (var43 + var47) / 2;
											GZipDecompressor.field4821 = (var46 + var44) / 2;
											class340.field4138 = (var54 + var53) / 2;
											ViewportMouse.field2589 = (var47 - var43) / 2;
											ItemComposition.field2148 = (var46 - var44) / 2;
											User.field4308 = (var54 - var53) / 2;
											class421.field4607 = Math.abs(ViewportMouse.field2589);
											ViewportMouse.field2590 = Math.abs(ItemComposition.field2148);
											class136.field1612 = Math.abs(User.field4308);
										}
										var37 = this.xMid + var6;
										var38 = var7 + this.yMid;
										var39 = var8 + this.zMid;
										var40 = this.xMidOffset;
										var53 = this.yMidOffset;
										var54 = this.zMidOffset;
										var43 = ViewportMouse.field2588 - var37;
										var44 = GZipDecompressor.field4821 - var38;
										var45 = class340.field4138 - var39;
										if (Math.abs(var43) > var40 + class421.field4607) {
											var35 = false;
										} else if (Math.abs(var44) > var53 + ViewportMouse.field2590) {
											var35 = false;
										} else if (Math.abs(var45) > var54 + class136.field1612) {
											var35 = false;
										} else if (Math.abs(var45 * ItemComposition.field2148 - var44 * User.field4308) > var53 * class136.field1612 + var54 * ViewportMouse.field2590) {
											var35 = false;
										} else if (Math.abs(var43 * User.field4308 - var45 * ViewportMouse.field2589) > var54 * class421.field4607 + var40 * class136.field1612) {
											var35 = false;
										} else if (Math.abs(var44 * ViewportMouse.field2589 - var43 * ItemComposition.field2148) > var40 * ViewportMouse.field2590 + var53 * class421.field4607) {
											var35 = false;
										} else {
											var35 = true;
										}
									}
									var34 = var35;
								} else {
									var52 = var12 - var13;
									if (var52 <= 50) {
										var52 = 50;
									}
									if (var15 > 0) {
										var16 /= var14;
										var17 /= var52;
									} else {
										var17 /= var14;
										var16 /= var52;
									}
									if (var18 > 0) {
										var23 /= var14;
										var21 /= var52;
									} else {
										var21 /= var14;
										var23 /= var52;
									}
									var48 = var28 - Rasterizer3D.Rasterizer3D_clipMidX;
									var37 = var29 - Rasterizer3D.Rasterizer3D_clipMidY;
									if (var48 > var16 && var48 < var17 && var37 > var23 && var37 < var21) {
										var34 = true;
									}
								}
								if (var34) {
									if (this.isSingleTile) {
										class249.method5123(var9);
									} else {
										var33 = true;
									}
								}
							}
							int var51 = Rasterizer3D.Rasterizer3D_clipMidX;
							var52 = Rasterizer3D.Rasterizer3D_clipMidY;
							var48 = 0;
							var37 = 0;
							if (var1 != 0) {
								var48 = Model_sine[var1];
								var37 = Model_cosine[var1];
							}
							for (var38 = 0; var38 < this.verticesCount; ++var38) {
								var39 = this.verticesX[var38];
								var40 = this.verticesY[var38];
								var53 = this.verticesZ[var38];
								if (var1 != 0) {
									var54 = var53 * var48 + var39 * var37 >> 16;
									var53 = var53 * var37 - var39 * var48 >> 16;
									var39 = var54;
								}
								var39 += var6;
								var40 += var7;
								var53 += var8;
								var54 = var53 * var4 + var5 * var39 >> 16;
								var53 = var5 * var53 - var39 * var4 >> 16;
								var39 = var54;
								var54 = var3 * var40 - var53 * var2 >> 16;
								var53 = var40 * var2 + var3 * var53 >> 16;
								field2553[var38] = var53 - var12;
								if (var53 >= 50) {
									modelViewportXs[var38] = var39 * Rasterizer3D.Rasterizer3D_zoom / var53 + var51;
									modelViewportYs[var38] = var54 * Rasterizer3D.Rasterizer3D_zoom / var53 + var52;
								} else {
									modelViewportXs[var38] = -5000;
									var25 = true;
								}
								if (var27) {
									field2520[var38] = var39;
									field2555[var38] = var54;
									field2559[var38] = var53;
								}
							}
							try {
								this.draw0(var25, var33, this.isSingleTile, var9);
							} catch (Exception var50) {
							}
						}
					}
				}
			}
		}
	}
}