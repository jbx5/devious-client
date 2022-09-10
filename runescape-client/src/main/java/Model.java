import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
@Implements("Model")
public class Model extends Renderable {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("Model_sharedSequenceModel")
	static Model Model_sharedSequenceModel;
	@ObfuscatedName("p")
	@Export("Model_sharedSequenceModelFaceAlphas")
	static byte[] Model_sharedSequenceModelFaceAlphas;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("Model_sharedSpotAnimationModel")
	static Model Model_sharedSpotAnimationModel;
	@ObfuscatedName("n")
	@Export("Model_sharedSpotAnimationModelFaceAlphas")
	static byte[] Model_sharedSpotAnimationModelFaceAlphas;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class389 field2543;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class389 field2544;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnw;"
	)
	static class389 field2545;
	@ObfuscatedName("ae")
	static boolean[] field2583;
	@ObfuscatedName("ay")
	static boolean[] field2584;
	@ObfuscatedName("ag")
	@Export("modelViewportXs")
	static int[] modelViewportXs;
	@ObfuscatedName("aw")
	@Export("modelViewportYs")
	static int[] modelViewportYs;
	@ObfuscatedName("ah")
	static int[] field2587;
	@ObfuscatedName("at")
	static int[] field2588;
	@ObfuscatedName("al")
	static int[] field2555;
	@ObfuscatedName("au")
	static int[] field2590;
	@ObfuscatedName("bw")
	static char[] field2592;
	@ObfuscatedName("bc")
	static char[][] field2593;
	@ObfuscatedName("bv")
	static int[] field2563;
	@ObfuscatedName("bi")
	static int[][] field2610;
	@ObfuscatedName("bj")
	static int[] field2564;
	@ObfuscatedName("by")
	static int[] field2605;
	@ObfuscatedName("bz")
	static int[] field2598;
	@ObfuscatedName("bo")
	static int[] field2599;
	@ObfuscatedName("br")
	static int[] field2603;
	@ObfuscatedName("bp")
	static int[] field2570;
	@ObfuscatedName("bd")
	@Export("Model_transformTempX")
	static int Model_transformTempX;
	@ObfuscatedName("bl")
	@Export("Model_transformTempY")
	static int Model_transformTempY;
	@ObfuscatedName("bk")
	@Export("Model_transformTempZ")
	static int Model_transformTempZ;
	@ObfuscatedName("bh")
	static boolean field2591;
	@ObfuscatedName("bf")
	static int[] field2608;
	@ObfuscatedName("ba")
	static int[] field2612;
	@ObfuscatedName("bt")
	static int[] field2576;
	@ObfuscatedName("bb")
	static int[] field2611;
	@ObfuscatedName("q")
	@Export("verticesCount")
	int verticesCount;
	@ObfuscatedName("m")
	@Export("verticesX")
	int[] verticesX;
	@ObfuscatedName("x")
	@Export("verticesY")
	int[] verticesY;
	@ObfuscatedName("j")
	@Export("verticesZ")
	int[] verticesZ;
	@ObfuscatedName("v")
	@Export("indicesCount")
	public int indicesCount;
	@ObfuscatedName("h")
	@Export("indices1")
	int[] indices1;
	@ObfuscatedName("t")
	@Export("indices2")
	int[] indices2;
	@ObfuscatedName("u")
	@Export("indices3")
	int[] indices3;
	@ObfuscatedName("d")
	@Export("faceColors1")
	int[] faceColors1;
	@ObfuscatedName("b")
	@Export("faceColors2")
	int[] faceColors2;
	@ObfuscatedName("a")
	@Export("faceColors3")
	int[] faceColors3;
	@ObfuscatedName("l")
	@Export("faceRenderPriorities")
	byte[] faceRenderPriorities;
	@ObfuscatedName("e")
	@Export("faceAlphas")
	byte[] faceAlphas;
	@ObfuscatedName("g")
	byte[] field2559;
	@ObfuscatedName("y")
	@Export("faceTextures")
	short[] faceTextures;
	@ObfuscatedName("i")
	byte field2540;
	@ObfuscatedName("r")
	int field2562;
	@ObfuscatedName("z")
	int[] field2541;
	@ObfuscatedName("o")
	int[] field2595;
	@ObfuscatedName("as")
	int[] field2565;
	@ObfuscatedName("ac")
	@Export("vertexLabels")
	int[][] vertexLabels;
	@ObfuscatedName("ao")
	@Export("faceLabelsAlpha")
	int[][] faceLabelsAlpha;
	@ObfuscatedName("ar")
	int[][] field2568;
	@ObfuscatedName("aq")
	int[][] field2569;
	@ObfuscatedName("ai")
	@Export("isSingleTile")
	public boolean isSingleTile;
	@ObfuscatedName("an")
	@Export("boundsType")
	int boundsType;
	@ObfuscatedName("aa")
	@Export("bottomY")
	int bottomY;
	@ObfuscatedName("ak")
	@Export("xzRadius")
	int xzRadius;
	@ObfuscatedName("am")
	@Export("diameter")
	int diameter;
	@ObfuscatedName("ap")
	@Export("radius")
	int radius;
	@ObfuscatedName("ab")
	@Export("xMid")
	int xMid;
	@ObfuscatedName("az")
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ad")
	@Export("zMid")
	int zMid;
	@ObfuscatedName("af")
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aj")
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ax")
	@Export("zMidOffset")
	int zMidOffset;
	@ObfuscatedName("bq")
	@Export("overrideHue")
	public byte overrideHue;
	@ObfuscatedName("bu")
	@Export("overrideSaturation")
	public byte overrideSaturation;
	@ObfuscatedName("bs")
	@Export("overrideLuminance")
	public byte overrideLuminance;
	@ObfuscatedName("cy")
	@Export("overrideAmount")
	public byte overrideAmount;
	@ObfuscatedName("cv")
	public short field2618;

	static {
		Model_sharedSequenceModel = new Model(); // L: 11
		Model_sharedSequenceModelFaceAlphas = new byte[1]; // L: 12
		Model_sharedSpotAnimationModel = new Model(); // L: 13
		Model_sharedSpotAnimationModelFaceAlphas = new byte[1]; // L: 14
		field2543 = new class389(); // L: 15
		field2544 = new class389(); // L: 16
		field2545 = new class389(); // L: 17
		field2583 = new boolean[6500]; // L: 58
		field2584 = new boolean[6500]; // L: 59
		modelViewportXs = new int[6500]; // L: 60
		modelViewportYs = new int[6500]; // L: 61
		field2587 = new int[6500]; // L: 62
		field2588 = new int[6500]; // L: 63
		field2555 = new int[6500]; // L: 64
		field2590 = new int[6500]; // L: 65
		field2592 = new char[6000]; // L: 67
		field2593 = new char[6000][512]; // L: 68
		field2563 = new int[12]; // L: 69
		field2610 = new int[12][2000]; // L: 70
		field2564 = new int[2000]; // L: 71
		field2605 = new int[2000]; // L: 72
		field2598 = new int[12]; // L: 73
		field2599 = new int[10]; // L: 74
		field2603 = new int[10]; // L: 75
		field2570 = new int[10]; // L: 76
		field2591 = true; // L: 80
		field2608 = Rasterizer3D.Rasterizer3D_sine; // L: 83
		field2612 = Rasterizer3D.Rasterizer3D_cosine; // L: 84
		field2576 = Rasterizer3D.Rasterizer3D_colorPalette; // L: 85
		field2611 = Rasterizer3D.field2394; // L: 86
	}

	Model() {
		this.verticesCount = 0;
		this.indicesCount = 0;
		this.field2540 = 0;
		this.field2562 = 0;
		this.isSingleTile = false;
		this.xMidOffset = -1;
		this.yMidOffset = -1;
		this.zMidOffset = -1;
	} // L: 95

	@ObfuscatedSignature(
		descriptor = "([Lha;I)V"
	)
	public Model(Model[] var1, int var2) {
		this.verticesCount = 0; // L: 18
		this.indicesCount = 0; // L: 22
		this.field2540 = 0; // L: 33
		this.field2562 = 0; // L: 34
		this.isSingleTile = false; // L: 42
		this.xMidOffset = -1; // L: 51
		this.yMidOffset = -1; // L: 52
		this.zMidOffset = -1; // L: 53
		boolean var3 = false; // L: 98
		boolean var4 = false; // L: 99
		boolean var5 = false; // L: 100
		boolean var6 = false; // L: 101
		this.verticesCount = 0; // L: 102
		this.indicesCount = 0; // L: 103
		this.field2562 = 0; // L: 104
		this.field2540 = -1; // L: 105

		int var7;
		Model var8;
		for (var7 = 0; var7 < var2; ++var7) { // L: 106
			var8 = var1[var7]; // L: 107
			if (var8 != null) { // L: 108
				this.verticesCount += var8.verticesCount; // L: 109
				this.indicesCount += var8.indicesCount; // L: 110
				this.field2562 += var8.field2562; // L: 111
				if (var8.faceRenderPriorities != null) { // L: 112
					var3 = true;
				} else {
					if (this.field2540 == -1) { // L: 114
						this.field2540 = var8.field2540;
					}

					if (this.field2540 != var8.field2540) { // L: 115
						var3 = true;
					}
				}

				var4 |= var8.faceAlphas != null; // L: 117
				var5 |= var8.faceTextures != null; // L: 118
				var6 |= var8.field2559 != null; // L: 119
			}
		}

		this.verticesX = new int[this.verticesCount]; // L: 122
		this.verticesY = new int[this.verticesCount]; // L: 123
		this.verticesZ = new int[this.verticesCount]; // L: 124
		this.indices1 = new int[this.indicesCount]; // L: 125
		this.indices2 = new int[this.indicesCount]; // L: 126
		this.indices3 = new int[this.indicesCount]; // L: 127
		this.faceColors1 = new int[this.indicesCount]; // L: 128
		this.faceColors2 = new int[this.indicesCount]; // L: 129
		this.faceColors3 = new int[this.indicesCount]; // L: 130
		if (var3) { // L: 131
			this.faceRenderPriorities = new byte[this.indicesCount];
		}

		if (var4) { // L: 132
			this.faceAlphas = new byte[this.indicesCount];
		}

		if (var5) { // L: 133
			this.faceTextures = new short[this.indicesCount];
		}

		if (var6) { // L: 134
			this.field2559 = new byte[this.indicesCount];
		}

		if (this.field2562 > 0) { // L: 135
			this.field2541 = new int[this.field2562]; // L: 136
			this.field2595 = new int[this.field2562]; // L: 137
			this.field2565 = new int[this.field2562]; // L: 138
		}

		this.verticesCount = 0; // L: 140
		this.indicesCount = 0; // L: 141
		this.field2562 = 0; // L: 142

		for (var7 = 0; var7 < var2; ++var7) { // L: 143
			var8 = var1[var7]; // L: 144
			if (var8 != null) { // L: 145
				int var9;
				for (var9 = 0; var9 < var8.indicesCount; ++var9) { // L: 146
					this.indices1[this.indicesCount] = this.verticesCount + var8.indices1[var9]; // L: 147
					this.indices2[this.indicesCount] = this.verticesCount + var8.indices2[var9]; // L: 148
					this.indices3[this.indicesCount] = this.verticesCount + var8.indices3[var9]; // L: 149
					this.faceColors1[this.indicesCount] = var8.faceColors1[var9]; // L: 150
					this.faceColors2[this.indicesCount] = var8.faceColors2[var9]; // L: 151
					this.faceColors3[this.indicesCount] = var8.faceColors3[var9]; // L: 152
					if (var3) { // L: 153
						if (var8.faceRenderPriorities != null) { // L: 154
							this.faceRenderPriorities[this.indicesCount] = var8.faceRenderPriorities[var9];
						} else {
							this.faceRenderPriorities[this.indicesCount] = var8.field2540; // L: 155
						}
					}

					if (var4 && var8.faceAlphas != null) { // L: 157 158
						this.faceAlphas[this.indicesCount] = var8.faceAlphas[var9];
					}

					if (var5) { // L: 160
						if (var8.faceTextures != null) { // L: 161
							this.faceTextures[this.indicesCount] = var8.faceTextures[var9];
						} else {
							this.faceTextures[this.indicesCount] = -1; // L: 162
						}
					}

					if (var6) { // L: 164
						if (var8.field2559 != null && var8.field2559[var9] != -1) { // L: 165
							this.field2559[this.indicesCount] = (byte)(this.field2562 + var8.field2559[var9]);
						} else {
							this.field2559[this.indicesCount] = -1; // L: 166
						}
					}

					++this.indicesCount; // L: 168
				}

				for (var9 = 0; var9 < var8.field2562; ++var9) { // L: 170
					this.field2541[this.field2562] = this.verticesCount + var8.field2541[var9]; // L: 171
					this.field2595[this.field2562] = this.verticesCount + var8.field2595[var9]; // L: 172
					this.field2565[this.field2562] = this.verticesCount + var8.field2565[var9]; // L: 173
					++this.field2562; // L: 174
				}

				for (var9 = 0; var9 < var8.verticesCount; ++var9) { // L: 176
					this.verticesX[this.verticesCount] = var8.verticesX[var9]; // L: 177
					this.verticesY[this.verticesCount] = var8.verticesY[var9]; // L: 178
					this.verticesZ[this.verticesCount] = var8.verticesZ[var9]; // L: 179
					++this.verticesCount; // L: 180
				}
			}
		}

	} // L: 184

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([[IIIIZI)Lha;"
	)
	@Export("contourGround")
	public Model contourGround(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.calculateBoundsCylinder(); // L: 187
		int var7 = var2 - this.xzRadius; // L: 188
		int var8 = var2 + this.xzRadius; // L: 189
		int var9 = var4 - this.xzRadius; // L: 190
		int var10 = var4 + this.xzRadius; // L: 191
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) { // L: 192
			var7 >>= 7; // L: 193
			var8 = var8 + 127 >> 7; // L: 194
			var9 >>= 7; // L: 195
			var10 = var10 + 127 >> 7; // L: 196
			if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) { // L: 197
				return this;
			} else {
				Model var11;
				if (var5) { // L: 199
					var11 = new Model(); // L: 200
					var11.verticesCount = this.verticesCount; // L: 201
					var11.indicesCount = this.indicesCount; // L: 202
					var11.field2562 = this.field2562; // L: 203
					var11.verticesX = this.verticesX; // L: 204
					var11.verticesZ = this.verticesZ; // L: 205
					var11.indices1 = this.indices1; // L: 206
					var11.indices2 = this.indices2; // L: 207
					var11.indices3 = this.indices3; // L: 208
					var11.faceColors1 = this.faceColors1; // L: 209
					var11.faceColors2 = this.faceColors2; // L: 210
					var11.faceColors3 = this.faceColors3; // L: 211
					var11.faceRenderPriorities = this.faceRenderPriorities; // L: 212
					var11.faceAlphas = this.faceAlphas; // L: 213
					var11.field2559 = this.field2559; // L: 214
					var11.faceTextures = this.faceTextures; // L: 215
					var11.field2540 = this.field2540; // L: 216
					var11.field2541 = this.field2541; // L: 217
					var11.field2595 = this.field2595; // L: 218
					var11.field2565 = this.field2565; // L: 219
					var11.vertexLabels = this.vertexLabels; // L: 220
					var11.faceLabelsAlpha = this.faceLabelsAlpha; // L: 221
					var11.isSingleTile = this.isSingleTile; // L: 222
					var11.verticesY = new int[var11.verticesCount]; // L: 223
				} else {
					var11 = this; // L: 226
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
				if (var6 == 0) { // L: 228
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 229
						var13 = var2 + this.verticesX[var12]; // L: 230
						var14 = var4 + this.verticesZ[var12]; // L: 231
						var15 = var13 & 127; // L: 232
						var16 = var14 & 127; // L: 233
						var17 = var13 >> 7; // L: 234
						var18 = var14 >> 7; // L: 235
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7; // L: 236
						var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7; // L: 237
						var21 = var19 * (128 - var16) + var20 * var16 >> 7; // L: 238
						var11.verticesY[var12] = var21 + this.verticesY[var12] - var3; // L: 239
					}
				} else {
					for (var12 = 0; var12 < var11.verticesCount; ++var12) { // L: 243
						var13 = (-this.verticesY[var12] << 16) / super.height; // L: 244
						if (var13 < var6) { // L: 245
							var14 = var2 + this.verticesX[var12]; // L: 246
							var15 = var4 + this.verticesZ[var12]; // L: 247
							var16 = var14 & 127; // L: 248
							var17 = var15 & 127; // L: 249
							var18 = var14 >> 7; // L: 250
							var19 = var15 >> 7; // L: 251
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7; // L: 252
							var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7; // L: 253
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7; // L: 254
							var11.verticesY[var12] = (var6 - var13) * (var22 - var3) / var6 + this.verticesY[var12]; // L: 255
						}
					}
				}

				var11.resetBounds(); // L: 259
				return var11; // L: 260
			}
		} else {
			return this;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Z)Lha;"
	)
	@Export("toSharedSequenceModel")
	public Model toSharedSequenceModel(boolean var1) {
		if (!var1 && Model_sharedSequenceModelFaceAlphas.length < this.indicesCount) { // L: 264
			Model_sharedSequenceModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSequenceModel, Model_sharedSequenceModelFaceAlphas); // L: 265
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Z)Lha;"
	)
	@Export("toSharedSpotAnimationModel")
	public Model toSharedSpotAnimationModel(boolean var1) {
		if (!var1 && Model_sharedSpotAnimationModelFaceAlphas.length < this.indicesCount) { // L: 269
			Model_sharedSpotAnimationModelFaceAlphas = new byte[this.indicesCount + 100];
		}

		return this.buildSharedModel(var1, Model_sharedSpotAnimationModel, Model_sharedSpotAnimationModelFaceAlphas); // L: 270
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZLha;[B)Lha;"
	)
	@Export("buildSharedModel")
	Model buildSharedModel(boolean var1, Model var2, byte[] var3) {
		var2.verticesCount = this.verticesCount; // L: 274
		var2.indicesCount = this.indicesCount; // L: 275
		var2.field2562 = this.field2562; // L: 276
		if (var2.verticesX == null || var2.verticesX.length < this.verticesCount) { // L: 277
			var2.verticesX = new int[this.verticesCount + 100]; // L: 278
			var2.verticesY = new int[this.verticesCount + 100]; // L: 279
			var2.verticesZ = new int[this.verticesCount + 100]; // L: 280
		}

		int var4;
		for (var4 = 0; var4 < this.verticesCount; ++var4) { // L: 282
			var2.verticesX[var4] = this.verticesX[var4]; // L: 283
			var2.verticesY[var4] = this.verticesY[var4]; // L: 284
			var2.verticesZ[var4] = this.verticesZ[var4]; // L: 285
		}

		if (var1) { // L: 287
			var2.faceAlphas = this.faceAlphas;
		} else {
			var2.faceAlphas = var3; // L: 289
			if (this.faceAlphas == null) { // L: 290
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 291
					var2.faceAlphas[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.indicesCount; ++var4) { // L: 294
					var2.faceAlphas[var4] = this.faceAlphas[var4];
				}
			}
		}

		var2.indices1 = this.indices1; // L: 297
		var2.indices2 = this.indices2; // L: 298
		var2.indices3 = this.indices3; // L: 299
		var2.faceColors1 = this.faceColors1; // L: 300
		var2.faceColors2 = this.faceColors2; // L: 301
		var2.faceColors3 = this.faceColors3; // L: 302
		var2.faceRenderPriorities = this.faceRenderPriorities; // L: 303
		var2.field2559 = this.field2559; // L: 304
		var2.faceTextures = this.faceTextures; // L: 305
		var2.field2540 = this.field2540; // L: 306
		var2.field2541 = this.field2541; // L: 307
		var2.field2595 = this.field2595; // L: 308
		var2.field2565 = this.field2565; // L: 309
		var2.vertexLabels = this.vertexLabels; // L: 310
		var2.faceLabelsAlpha = this.faceLabelsAlpha; // L: 311
		var2.field2568 = this.field2568; // L: 312
		var2.field2569 = this.field2569; // L: 313
		var2.isSingleTile = this.isSingleTile; // L: 314
		var2.resetBounds(); // L: 315
		var2.overrideAmount = 0; // L: 316
		return var2; // L: 317
	}

	@ObfuscatedName("q")
	@Export("calculateBoundingBox")
	void calculateBoundingBox(int var1) {
		if (this.xMidOffset == -1) { // L: 321
			int var2 = 0; // L: 322
			int var3 = 0; // L: 323
			int var4 = 0; // L: 324
			int var5 = 0; // L: 325
			int var6 = 0; // L: 326
			int var7 = 0; // L: 327
			int var8 = field2612[var1]; // L: 328
			int var9 = field2608[var1]; // L: 329

			for (int var10 = 0; var10 < this.verticesCount; ++var10) { // L: 330
				int var11 = Rasterizer3D.method4152(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 331
				int var12 = this.verticesY[var10]; // L: 332
				int var13 = Rasterizer3D.method4153(this.verticesX[var10], this.verticesZ[var10], var8, var9); // L: 333
				if (var11 < var2) { // L: 334
					var2 = var11;
				}

				if (var11 > var5) { // L: 335
					var5 = var11;
				}

				if (var12 < var3) { // L: 336
					var3 = var12;
				}

				if (var12 > var6) { // L: 337
					var6 = var12;
				}

				if (var13 < var4) { // L: 338
					var4 = var13;
				}

				if (var13 > var7) { // L: 339
					var7 = var13;
				}
			}

			this.xMid = (var5 + var2) / 2; // L: 341
			this.yMid = (var6 + var3) / 2; // L: 342
			this.zMid = (var7 + var4) / 2; // L: 343
			this.xMidOffset = (var5 - var2 + 1) / 2; // L: 344
			this.yMidOffset = (var6 - var3 + 1) / 2; // L: 345
			this.zMidOffset = (var7 - var4 + 1) / 2; // L: 346
			boolean var14 = true; // L: 347
			if (this.xMidOffset < 32) { // L: 348
				this.xMidOffset = 32;
			}

			if (this.zMidOffset < 32) { // L: 349
				this.zMidOffset = 32;
			}

			if (this.isSingleTile) { // L: 350
				boolean var15 = true; // L: 351
				this.xMidOffset += 8; // L: 352
				this.zMidOffset += 8; // L: 353
			}

		}
	} // L: 355

	@ObfuscatedName("m")
	@Export("calculateBoundsCylinder")
	public void calculateBoundsCylinder() {
		if (this.boundsType != 1) { // L: 358
			this.boundsType = 1; // L: 359
			super.height = 0; // L: 360
			this.bottomY = 0; // L: 361
			this.xzRadius = 0; // L: 362

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 363
				int var2 = this.verticesX[var1]; // L: 364
				int var3 = this.verticesY[var1]; // L: 365
				int var4 = this.verticesZ[var1]; // L: 366
				if (-var3 > super.height) { // L: 367
					super.height = -var3;
				}

				if (var3 > this.bottomY) { // L: 368
					this.bottomY = var3;
				}

				int var5 = var2 * var2 + var4 * var4; // L: 369
				if (var5 > this.xzRadius) { // L: 370
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 372
			this.radius = (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + super.height * super.height)) + 0.99D); // L: 373
			this.diameter = this.radius + (int)(Math.sqrt((double)(this.xzRadius * this.xzRadius + this.bottomY * this.bottomY)) + 0.99D); // L: 374
		}
	} // L: 375

	@ObfuscatedName("x")
	void method4513() {
		if (this.boundsType != 2) { // L: 378
			this.boundsType = 2; // L: 379
			this.xzRadius = 0; // L: 380

			for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 381
				int var2 = this.verticesX[var1]; // L: 382
				int var3 = this.verticesY[var1]; // L: 383
				int var4 = this.verticesZ[var1]; // L: 384
				int var5 = var2 * var2 + var4 * var4 + var3 * var3; // L: 385
				if (var5 > this.xzRadius) { // L: 386
					this.xzRadius = var5;
				}
			}

			this.xzRadius = (int)(Math.sqrt((double)this.xzRadius) + 0.99D); // L: 388
			this.radius = this.xzRadius; // L: 389
			this.diameter = this.xzRadius + this.xzRadius; // L: 390
		}
	} // L: 391

	@ObfuscatedName("j")
	public int method4514() {
		this.calculateBoundsCylinder(); // L: 394
		return this.xzRadius; // L: 395
	}

	@ObfuscatedName("v")
	@Export("resetBounds")
	public void resetBounds() {
		this.boundsType = 0; // L: 399
		this.xMidOffset = -1; // L: 400
	} // L: 401

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V"
	)
	@Export("animate")
	public void animate(Frames var1, int var2) {
		if (this.vertexLabels != null) { // L: 404
			if (var2 != -1) { // L: 405
				Animation var3 = var1.frames[var2]; // L: 406
				Skeleton var4 = var3.skeleton; // L: 407
				Model_transformTempX = 0; // L: 408
				Model_transformTempY = 0; // L: 409
				Model_transformTempZ = 0; // L: 410

				for (int var5 = 0; var5 < var3.transformCount; ++var5) { // L: 411
					int var6 = var3.transformSkeletonLabels[var5]; // L: 412
					this.transform(var4.transformTypes[var6], var4.labels[var6], var3.transformXs[var5], var3.transformYs[var5], var3.transformZs[var5]); // L: 413
				}

				this.resetBounds(); // L: 415
			}
		}
	} // L: 416

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V"
	)
	public void method4601(class123 var1, int var2) {
		Skeleton var3 = var1.field1516; // L: 419
		class202 var4 = var3.method4249(); // L: 420
		if (var4 != null) { // L: 421
			var3.method4249().method4230(var1, var2); // L: 422
			this.method4519(var3.method4249(), var1.method2945()); // L: 423
		}

		if (var1.method2931()) { // L: 425
			this.method4518(var1, var2); // L: 426
		}

		this.resetBounds(); // L: 428
	} // L: 429

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V"
	)
	void method4518(class123 var1, int var2) {
		Skeleton var3 = var1.field1516; // L: 432

		for (int var4 = 0; var4 < var3.count; ++var4) { // L: 433
			int var5 = var3.transformTypes[var4]; // L: 434
			if (var5 == 5 && var1.field1514 != null && var1.field1514[var4] != null && var1.field1514[var4][0] != null && this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 435 436
				class118 var6 = var1.field1514[var4][0]; // L: 437
				int[] var7 = var3.labels[var4]; // L: 438
				int var8 = var7.length; // L: 439

				for (int var9 = 0; var9 < var8; ++var9) { // L: 440
					int var10 = var7[var9]; // L: 441
					if (var10 < this.faceLabelsAlpha.length) { // L: 442
						int[] var11 = this.faceLabelsAlpha[var10]; // L: 443

						for (int var12 = 0; var12 < var11.length; ++var12) { // L: 444
							int var13 = var11[var12]; // L: 445
							int var14 = (int)((float)(this.faceAlphas[var13] & 255) + var6.method2870(var2) * 255.0F); // L: 446
							if (var14 < 0) { // L: 447
								var14 = 0;
							} else if (var14 > 255) { // L: 448
								var14 = 255;
							}

							this.faceAlphas[var13] = (byte)var14; // L: 449
						}
					}
				}
			}
		}

	} // L: 456

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lge;I)V"
	)
	void method4519(class202 var1, int var2) {
		this.method4586(var1, var2); // L: 460
	} // L: 462

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lgt;ILgt;I[I)V"
	)
	@Export("animate2")
	public void animate2(Frames var1, int var2, Frames var3, int var4, int[] var5) {
		if (var2 != -1) { // L: 465
			if (var5 != null && var4 != -1) { // L: 466
				Animation var6 = var1.frames[var2]; // L: 470
				Animation var7 = var3.frames[var4]; // L: 471
				Skeleton var8 = var6.skeleton; // L: 472
				Model_transformTempX = 0; // L: 473
				Model_transformTempY = 0; // L: 474
				Model_transformTempZ = 0; // L: 475
				byte var9 = 0; // L: 476
				int var13 = var9 + 1; // L: 477
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.transformCount; ++var11) { // L: 478
					for (var12 = var6.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 479 480
					}

					if (var12 != var10 || var8.transformTypes[var12] == 0) { // L: 481
						this.transform(var8.transformTypes[var12], var8.labels[var12], var6.transformXs[var11], var6.transformYs[var11], var6.transformZs[var11]);
					}
				}

				Model_transformTempX = 0; // L: 483
				Model_transformTempY = 0; // L: 484
				Model_transformTempZ = 0; // L: 485
				var9 = 0; // L: 486
				var13 = var9 + 1; // L: 487
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.transformCount; ++var11) { // L: 488
					for (var12 = var7.transformSkeletonLabels[var11]; var12 > var10; var10 = var5[var13++]) { // L: 489 490
					}

					if (var12 == var10 || var8.transformTypes[var12] == 0) { // L: 491
						this.transform(var8.transformTypes[var12], var8.labels[var12], var7.transformXs[var11], var7.transformYs[var11], var7.transformZs[var11]);
					}
				}

				this.resetBounds(); // L: 493
			} else {
				this.animate(var1, var2); // L: 467
			}
		}
	} // L: 468 494

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lgm;Ldy;I[ZZZ)V"
	)
	public void method4517(Skeleton var1, class123 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class202 var7 = var1.method4249(); // L: 497
		if (var7 != null) { // L: 498
			var7.method4235(var2, var3, var4, var5); // L: 499
			if (var6) { // L: 500
				this.method4519(var7, var2.method2945()); // L: 501
			}
		}

		if (!var5 && var2.method2931()) { // L: 504
			this.method4518(var2, var3); // L: 505
		}

	} // L: 507

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I[IZ)V"
	)
	public void method4522(Frames var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) { // L: 510
			this.animate(var1, var2); // L: 511
		} else {
			Animation var5 = var1.frames[var2]; // L: 514
			Skeleton var6 = var5.skeleton; // L: 515
			byte var7 = 0; // L: 516
			int var11 = var7 + 1; // L: 517
			int var8 = var3[var7];
			Model_transformTempX = 0; // L: 518
			Model_transformTempY = 0; // L: 519
			Model_transformTempZ = 0; // L: 520

			for (int var9 = 0; var9 < var5.transformCount; ++var9) { // L: 521
				int var10;
				for (var10 = var5.transformSkeletonLabels[var9]; var10 > var8; var8 = var3[var11++]) { // L: 522 523
				}

				if (var4) { // L: 524
					if (var10 == var8 || var6.transformTypes[var10] == 0) { // L: 525
						this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]);
					}
				} else if (var10 != var8 || var6.transformTypes[var10] == 0) {
					this.transform(var6.transformTypes[var10], var6.labels[var10], var5.transformXs[var9], var5.transformYs[var9], var5.transformZs[var9]); // L: 528
				}
			}

		}
	} // L: 512 531

	@ObfuscatedName("e")
	@Export("transform")
	void transform(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length; // L: 534
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) { // L: 535
			var7 = 0; // L: 536
			Model_transformTempX = 0; // L: 537
			Model_transformTempY = 0; // L: 538
			Model_transformTempZ = 0; // L: 539

			for (var8 = 0; var8 < var6; ++var8) { // L: 540
				int var18 = var2[var8]; // L: 541
				if (var18 < this.vertexLabels.length) { // L: 542
					int[] var19 = this.vertexLabels[var18]; // L: 543

					for (var11 = 0; var11 < var19.length; ++var11) { // L: 544
						var12 = var19[var11]; // L: 545
						Model_transformTempX += this.verticesX[var12]; // L: 546
						Model_transformTempY += this.verticesY[var12]; // L: 547
						Model_transformTempZ += this.verticesZ[var12]; // L: 548
						++var7; // L: 549
					}
				}
			}

			if (var7 > 0) { // L: 553
				Model_transformTempX = var3 + Model_transformTempX / var7; // L: 554
				Model_transformTempY = var4 + Model_transformTempY / var7; // L: 555
				Model_transformTempZ = var5 + Model_transformTempZ / var7; // L: 556
			} else {
				Model_transformTempX = var3; // L: 559
				Model_transformTempY = var4; // L: 560
				Model_transformTempZ = var5; // L: 561
			}

		} else {
			int[] var9;
			int var10;
			int[] var10000;
			if (var1 == 1) { // L: 565
				for (var7 = 0; var7 < var6; ++var7) { // L: 566
					var8 = var2[var7]; // L: 567
					if (var8 < this.vertexLabels.length) { // L: 568
						var9 = this.vertexLabels[var8]; // L: 569

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 570
							var11 = var9[var10]; // L: 571
							var10000 = this.verticesX; // L: 572
							var10000[var11] += var3;
							var10000 = this.verticesY; // L: 573
							var10000[var11] += var4;
							var10000 = this.verticesZ; // L: 574
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) { // L: 580
				for (var7 = 0; var7 < var6; ++var7) { // L: 581
					var8 = var2[var7]; // L: 582
					if (var8 < this.vertexLabels.length) { // L: 583
						var9 = this.vertexLabels[var8]; // L: 584

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 585
							var11 = var9[var10]; // L: 586
							var10000 = this.verticesX; // L: 587
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 588
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 589
							var10000[var11] -= Model_transformTempZ;
							var12 = (var3 & 255) * 8; // L: 590
							int var13 = (var4 & 255) * 8; // L: 591
							int var14 = (var5 & 255) * 8; // L: 592
							int var15;
							int var16;
							int var17;
							if (var14 != 0) { // L: 593
								var15 = field2608[var14]; // L: 594
								var16 = field2612[var14]; // L: 595
								var17 = var15 * this.verticesY[var11] + var16 * this.verticesX[var11] >> 16; // L: 596
								this.verticesY[var11] = var16 * this.verticesY[var11] - var15 * this.verticesX[var11] >> 16; // L: 597
								this.verticesX[var11] = var17; // L: 598
							}

							if (var12 != 0) { // L: 600
								var15 = field2608[var12]; // L: 601
								var16 = field2612[var12]; // L: 602
								var17 = var16 * this.verticesY[var11] - var15 * this.verticesZ[var11] >> 16; // L: 603
								this.verticesZ[var11] = var15 * this.verticesY[var11] + var16 * this.verticesZ[var11] >> 16; // L: 604
								this.verticesY[var11] = var17; // L: 605
							}

							if (var13 != 0) { // L: 607
								var15 = field2608[var13]; // L: 608
								var16 = field2612[var13]; // L: 609
								var17 = var15 * this.verticesZ[var11] + var16 * this.verticesX[var11] >> 16; // L: 610
								this.verticesZ[var11] = var16 * this.verticesZ[var11] - var15 * this.verticesX[var11] >> 16; // L: 611
								this.verticesX[var11] = var17; // L: 612
							}

							var10000 = this.verticesX; // L: 614
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 615
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 616
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 3) { // L: 622
				for (var7 = 0; var7 < var6; ++var7) { // L: 623
					var8 = var2[var7]; // L: 624
					if (var8 < this.vertexLabels.length) { // L: 625
						var9 = this.vertexLabels[var8]; // L: 626

						for (var10 = 0; var10 < var9.length; ++var10) { // L: 627
							var11 = var9[var10]; // L: 628
							var10000 = this.verticesX; // L: 629
							var10000[var11] -= Model_transformTempX;
							var10000 = this.verticesY; // L: 630
							var10000[var11] -= Model_transformTempY;
							var10000 = this.verticesZ; // L: 631
							var10000[var11] -= Model_transformTempZ;
							this.verticesX[var11] = var3 * this.verticesX[var11] / 128; // L: 632
							this.verticesY[var11] = var4 * this.verticesY[var11] / 128; // L: 633
							this.verticesZ[var11] = var5 * this.verticesZ[var11] / 128; // L: 634
							var10000 = this.verticesX; // L: 635
							var10000[var11] += Model_transformTempX;
							var10000 = this.verticesY; // L: 636
							var10000[var11] += Model_transformTempY;
							var10000 = this.verticesZ; // L: 637
							var10000[var11] += Model_transformTempZ;
						}
					}
				}

			} else if (var1 == 5) { // L: 643
				if (this.faceLabelsAlpha != null && this.faceAlphas != null) { // L: 644
					for (var7 = 0; var7 < var6; ++var7) { // L: 645
						var8 = var2[var7]; // L: 646
						if (var8 < this.faceLabelsAlpha.length) { // L: 647
							var9 = this.faceLabelsAlpha[var8]; // L: 648

							for (var10 = 0; var10 < var9.length; ++var10) { // L: 649
								var11 = var9[var10]; // L: 650
								var12 = (this.faceAlphas[var11] & 255) + var3 * 8; // L: 651
								if (var12 < 0) { // L: 652
									var12 = 0;
								} else if (var12 > 255) { // L: 653
									var12 = 255;
								}

								this.faceAlphas[var11] = (byte)var12; // L: 654
							}
						}
					}
				}

			}
		}
	} // L: 563 578 620 641 659 661

	@ObfuscatedName("g")
	@Export("rotateY90Ccw")
	public void rotateY90Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 664
			int var2 = this.verticesX[var1]; // L: 665
			this.verticesX[var1] = this.verticesZ[var1]; // L: 666
			this.verticesZ[var1] = -var2; // L: 667
		}

		this.resetBounds(); // L: 669
	} // L: 670

	@ObfuscatedName("y")
	@Export("rotateY180")
	public void rotateY180() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 673
			this.verticesX[var1] = -this.verticesX[var1]; // L: 674
			this.verticesZ[var1] = -this.verticesZ[var1]; // L: 675
		}

		this.resetBounds(); // L: 677
	} // L: 678

	@ObfuscatedName("i")
	@Export("rotateY270Ccw")
	public void rotateY270Ccw() {
		for (int var1 = 0; var1 < this.verticesCount; ++var1) { // L: 681
			int var2 = this.verticesZ[var1]; // L: 682
			this.verticesZ[var1] = this.verticesX[var1]; // L: 683
			this.verticesX[var1] = -var2; // L: 684
		}

		this.resetBounds(); // L: 686
	} // L: 687

	@ObfuscatedName("r")
	@Export("rotateZ")
	public void rotateZ(int var1) {
		int var2 = field2608[var1]; // L: 690
		int var3 = field2612[var1]; // L: 691

		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 692
			int var5 = var3 * this.verticesY[var4] - var2 * this.verticesZ[var4] >> 16; // L: 693
			this.verticesZ[var4] = var2 * this.verticesY[var4] + var3 * this.verticesZ[var4] >> 16; // L: 694
			this.verticesY[var4] = var5; // L: 695
		}

		this.resetBounds(); // L: 697
	} // L: 698

	@ObfuscatedName("z")
	@Export("offsetBy")
	public void offsetBy(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 701
			int[] var10000 = this.verticesX; // L: 702
			var10000[var4] += var1;
			var10000 = this.verticesY; // L: 703
			var10000[var4] += var2;
			var10000 = this.verticesZ; // L: 704
			var10000[var4] += var3;
		}

		this.resetBounds(); // L: 706
	} // L: 707

	@ObfuscatedName("o")
	@Export("scale")
	public void scale(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.verticesCount; ++var4) { // L: 710
			this.verticesX[var4] = this.verticesX[var4] * var1 / 128; // L: 711
			this.verticesY[var4] = var2 * this.verticesY[var4] / 128; // L: 712
			this.verticesZ[var4] = var3 * this.verticesZ[var4] / 128; // L: 713
		}

		this.resetBounds(); // L: 715
	} // L: 716

	@ObfuscatedName("as")
	public final void method4530(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 719
			this.method4513();
		}

		int var8 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 720
		int var9 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 721
		int var10 = field2608[var1]; // L: 722
		int var11 = field2612[var1]; // L: 723
		int var12 = field2608[var2]; // L: 724
		int var13 = field2612[var2]; // L: 725
		int var14 = field2608[var3]; // L: 726
		int var15 = field2612[var3]; // L: 727
		int var16 = field2608[var4]; // L: 728
		int var17 = field2612[var4]; // L: 729
		int var18 = var16 * var6 + var17 * var7 >> 16; // L: 730

		for (int var19 = 0; var19 < this.verticesCount; ++var19) { // L: 731
			int var20 = this.verticesX[var19]; // L: 732
			int var21 = this.verticesY[var19]; // L: 733
			int var22 = this.verticesZ[var19]; // L: 734
			int var23;
			if (var3 != 0) { // L: 735
				var23 = var21 * var14 + var20 * var15 >> 16; // L: 736
				var21 = var21 * var15 - var20 * var14 >> 16; // L: 737
				var20 = var23; // L: 738
			}

			if (var1 != 0) { // L: 740
				var23 = var21 * var11 - var22 * var10 >> 16; // L: 741
				var22 = var21 * var10 + var22 * var11 >> 16; // L: 742
				var21 = var23; // L: 743
			}

			if (var2 != 0) { // L: 745
				var23 = var22 * var12 + var20 * var13 >> 16; // L: 746
				var22 = var22 * var13 - var20 * var12 >> 16; // L: 747
				var20 = var23; // L: 748
			}

			var20 += var5; // L: 750
			var21 += var6; // L: 751
			var22 += var7; // L: 752
			var23 = var21 * var17 - var22 * var16 >> 16; // L: 753
			var22 = var21 * var16 + var22 * var17 >> 16; // L: 754
			field2587[var19] = var22 - var18; // L: 756
			modelViewportXs[var19] = var20 * Rasterizer3D.Rasterizer3D_zoom / var22 + var8; // L: 757
			modelViewportYs[var19] = var23 * Rasterizer3D.Rasterizer3D_zoom / var22 + var9; // L: 758
			if (this.field2562 > 0) { // L: 759
				field2588[var19] = var20; // L: 760
				field2555[var19] = var23; // L: 761
				field2590[var19] = var22; // L: 762
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 766
		} catch (Exception var25) { // L: 768
		}

	} // L: 769

	@ObfuscatedName("ac")
	public final void method4600(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.boundsType != 2 && this.boundsType != 1) { // L: 772
			this.method4513();
		}

		int var9 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 773
		int var10 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 774
		int var11 = field2608[var1]; // L: 775
		int var12 = field2612[var1]; // L: 776
		int var13 = field2608[var2]; // L: 777
		int var14 = field2612[var2]; // L: 778
		int var15 = field2608[var3]; // L: 779
		int var16 = field2612[var3]; // L: 780
		int var17 = field2608[var4]; // L: 781
		int var18 = field2612[var4]; // L: 782
		int var19 = var17 * var6 + var18 * var7 >> 16; // L: 783

		for (int var20 = 0; var20 < this.verticesCount; ++var20) { // L: 784
			int var21 = this.verticesX[var20]; // L: 785
			int var22 = this.verticesY[var20]; // L: 786
			int var23 = this.verticesZ[var20]; // L: 787
			int var24;
			if (var3 != 0) { // L: 788
				var24 = var22 * var15 + var21 * var16 >> 16; // L: 789
				var22 = var22 * var16 - var21 * var15 >> 16; // L: 790
				var21 = var24; // L: 791
			}

			if (var1 != 0) { // L: 793
				var24 = var22 * var12 - var23 * var11 >> 16; // L: 794
				var23 = var22 * var11 + var23 * var12 >> 16; // L: 795
				var22 = var24; // L: 796
			}

			if (var2 != 0) { // L: 798
				var24 = var23 * var13 + var21 * var14 >> 16; // L: 799
				var23 = var23 * var14 - var21 * var13 >> 16; // L: 800
				var21 = var24; // L: 801
			}

			var21 += var5; // L: 803
			var22 += var6; // L: 804
			var23 += var7; // L: 805
			var24 = var22 * var18 - var23 * var17 >> 16; // L: 806
			var23 = var22 * var17 + var23 * var18 >> 16; // L: 807
			field2587[var20] = var23 - var19; // L: 809
			modelViewportXs[var20] = var9 + var21 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 810
			modelViewportYs[var20] = var10 + var24 * Rasterizer3D.Rasterizer3D_zoom / var8; // L: 811
			if (this.field2562 > 0) { // L: 812
				field2588[var20] = var21; // L: 813
				field2555[var20] = var24; // L: 814
				field2590[var20] = var23; // L: 815
			}
		}

		try {
			this.draw0(false, false, false, 0L); // L: 819
		} catch (Exception var26) { // L: 821
		}

	} // L: 822

	@ObfuscatedName("ao")
	@Export("draw0")
	final void draw0(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.diameter < 6000) { // L: 967
			int var6;
			for (var6 = 0; var6 < this.diameter; ++var6) { // L: 968
				field2592[var6] = 0;
			}

			var6 = var3 ? 20 : 5; // L: 969

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var15;
			int var16;
			int var18;
			int var28;
			for (char var7 = 0; var7 < this.indicesCount; ++var7) { // L: 970
				if (this.faceColors3[var7] != -2) { // L: 971
					var8 = this.indices1[var7]; // L: 972
					var9 = this.indices2[var7]; // L: 973
					var10 = this.indices3[var7]; // L: 974
					var11 = modelViewportXs[var8]; // L: 975
					var12 = modelViewportXs[var9]; // L: 976
					var28 = modelViewportXs[var10]; // L: 977
					int var29;
					int var30;
					if (!var1 || var11 != -5000 && var12 != -5000 && var28 != -5000) { // L: 978
						if (var2) { // L: 1004
							var15 = modelViewportYs[var8]; // L: 1006
							var16 = modelViewportYs[var9]; // L: 1007
							var30 = modelViewportYs[var10]; // L: 1008
							var18 = var6 + ViewportMouse.ViewportMouse_y; // L: 1010
							boolean var37;
							if (var18 < var15 && var18 < var16 && var18 < var30) { // L: 1011
								var37 = false; // L: 1012
							} else {
								var18 = ViewportMouse.ViewportMouse_y - var6; // L: 1015
								if (var18 > var15 && var18 > var16 && var18 > var30) { // L: 1016
									var37 = false; // L: 1017
								} else {
									var18 = var6 + ViewportMouse.ViewportMouse_x; // L: 1020
									if (var18 < var11 && var18 < var12 && var18 < var28) { // L: 1021
										var37 = false; // L: 1022
									} else {
										var18 = ViewportMouse.ViewportMouse_x - var6; // L: 1025
										if (var18 > var11 && var18 > var12 && var18 > var28) { // L: 1026
											var37 = false; // L: 1027
										} else {
											var37 = true; // L: 1030
										}
									}
								}
							}

							if (var37) { // L: 1032
								ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var4; // L: 1035
								var2 = false; // L: 1037
							}
						}

						if ((var11 - var12) * (modelViewportYs[var10] - modelViewportYs[var9]) - (var28 - var12) * (modelViewportYs[var8] - modelViewportYs[var9]) > 0) { // L: 1040
							field2584[var7] = false; // L: 1041
							if (var11 >= 0 && var12 >= 0 && var28 >= 0 && var11 <= Rasterizer3D.Rasterizer3D_clipWidth && var12 <= Rasterizer3D.Rasterizer3D_clipWidth && var28 <= Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1042
								field2583[var7] = false; // L: 1043
							} else {
								field2583[var7] = true;
							}

							var29 = (field2587[var8] + field2587[var9] + field2587[var10]) / 3 + this.radius; // L: 1044
							field2593[var29][field2592[var29]++] = var7; // L: 1045
						}
					} else {
						var29 = field2588[var8]; // L: 979
						var15 = field2588[var9]; // L: 980
						var16 = field2588[var10]; // L: 981
						var30 = field2555[var8]; // L: 982
						var18 = field2555[var9]; // L: 983
						int var19 = field2555[var10]; // L: 984
						int var20 = field2590[var8]; // L: 985
						int var21 = field2590[var9]; // L: 986
						int var22 = field2590[var10]; // L: 987
						var29 -= var15; // L: 988
						var16 -= var15; // L: 989
						var30 -= var18; // L: 990
						var19 -= var18; // L: 991
						var20 -= var21; // L: 992
						var22 -= var21; // L: 993
						int var23 = var30 * var22 - var20 * var19; // L: 994
						int var24 = var20 * var16 - var29 * var22; // L: 995
						int var25 = var29 * var19 - var30 * var16; // L: 996
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) { // L: 997
							field2584[var7] = true; // L: 998
							int var26 = (field2587[var8] + field2587[var9] + field2587[var10]) / 3 + this.radius; // L: 999
							field2593[var26][field2592[var26]++] = var7; // L: 1000
						}
					}
				}
			}

			char[] var27;
			int var33;
			char var34;
			if (this.faceRenderPriorities == null) { // L: 1049
				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1050
					var34 = field2592[var33]; // L: 1051
					if (var34 > 0) { // L: 1052
						var27 = field2593[var33]; // L: 1053

						for (var10 = 0; var10 < var34; ++var10) { // L: 1054
							this.drawFace(var27[var10]);
						}
					}
				}

			} else {
				for (var33 = 0; var33 < 12; ++var33) { // L: 1059
					field2563[var33] = 0; // L: 1060
					field2598[var33] = 0; // L: 1061
				}

				for (var33 = this.diameter - 1; var33 >= 0; --var33) { // L: 1063
					var34 = field2592[var33]; // L: 1064
					if (var34 > 0) { // L: 1065
						var27 = field2593[var33]; // L: 1066

						for (var10 = 0; var10 < var34; ++var10) { // L: 1067
							char var35 = var27[var10]; // L: 1068
							byte var36 = this.faceRenderPriorities[var35]; // L: 1069
							var28 = field2563[var36]++; // L: 1070
							field2610[var36][var28] = var35; // L: 1071
							if (var36 < 10) { // L: 1072
								int[] var38 = field2598;
								var38[var36] += var33;
							} else if (var36 == 10) { // L: 1073
								field2564[var28] = var33;
							} else {
								field2605[var28] = var33; // L: 1074
							}
						}
					}
				}

				var33 = 0; // L: 1078
				if (field2563[1] > 0 || field2563[2] > 0) { // L: 1079
					var33 = (field2598[1] + field2598[2]) / (field2563[1] + field2563[2]);
				}

				var8 = 0; // L: 1080
				if (field2563[3] > 0 || field2563[4] > 0) { // L: 1081
					var8 = (field2598[3] + field2598[4]) / (field2563[3] + field2563[4]);
				}

				var9 = 0; // L: 1082
				if (field2563[6] > 0 || field2563[8] > 0) { // L: 1083
					var9 = (field2598[8] + field2598[6]) / (field2563[8] + field2563[6]);
				}

				var11 = 0; // L: 1085
				var12 = field2563[10]; // L: 1086
				int[] var13 = field2610[10]; // L: 1087
				int[] var14 = field2564; // L: 1088
				if (var11 == var12) { // L: 1089
					var11 = 0; // L: 1090
					var12 = field2563[11]; // L: 1091
					var13 = field2610[11]; // L: 1092
					var14 = field2605; // L: 1093
				}

				if (var11 < var12) { // L: 1095
					var10 = var14[var11];
				} else {
					var10 = -1000; // L: 1096
				}

				for (var15 = 0; var15 < 10; ++var15) { // L: 1097
					while (var15 == 0 && var10 > var33) { // L: 1098
						this.drawFace(var13[var11++]); // L: 1099
						if (var11 == var12 && var13 != field2610[11]) { // L: 1100
							var11 = 0; // L: 1101
							var12 = field2563[11]; // L: 1102
							var13 = field2610[11]; // L: 1103
							var14 = field2605; // L: 1104
						}

						if (var11 < var12) { // L: 1106
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1107
						}
					}

					while (var15 == 3 && var10 > var8) { // L: 1109
						this.drawFace(var13[var11++]); // L: 1110
						if (var11 == var12 && var13 != field2610[11]) { // L: 1111
							var11 = 0; // L: 1112
							var12 = field2563[11]; // L: 1113
							var13 = field2610[11]; // L: 1114
							var14 = field2605; // L: 1115
						}

						if (var11 < var12) { // L: 1117
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1118
						}
					}

					while (var15 == 5 && var10 > var9) { // L: 1120
						this.drawFace(var13[var11++]); // L: 1121
						if (var11 == var12 && var13 != field2610[11]) { // L: 1122
							var11 = 0; // L: 1123
							var12 = field2563[11]; // L: 1124
							var13 = field2610[11]; // L: 1125
							var14 = field2605; // L: 1126
						}

						if (var11 < var12) { // L: 1128
							var10 = var14[var11];
						} else {
							var10 = -1000; // L: 1129
						}
					}

					var16 = field2563[var15]; // L: 1131
					int[] var17 = field2610[var15]; // L: 1132

					for (var18 = 0; var18 < var16; ++var18) { // L: 1133
						this.drawFace(var17[var18]); // L: 1134
					}
				}

				while (var10 != -1000) { // L: 1137
					this.drawFace(var13[var11++]); // L: 1138
					if (var11 == var12 && var13 != field2610[11]) { // L: 1139
						var11 = 0; // L: 1140
						var13 = field2610[11]; // L: 1141
						var12 = field2563[11]; // L: 1142
						var14 = field2605; // L: 1143
					}

					if (var11 < var12) { // L: 1145
						var10 = var14[var11];
					} else {
						var10 = -1000; // L: 1146
					}
				}

			}
		}
	} // L: 1057 1148

	@ObfuscatedName("ar")
	@Export("drawFace")
	final void drawFace(int var1) {
		if (field2584[var1]) { // L: 1151
			this.method4537(var1); // L: 1152
		} else {
			int var2 = this.indices1[var1]; // L: 1155
			int var3 = this.indices2[var1]; // L: 1156
			int var4 = this.indices3[var1]; // L: 1157
			Rasterizer3D.field2372 = field2583[var1]; // L: 1158
			if (this.faceAlphas == null) { // L: 1159
				Rasterizer3D.Rasterizer3D_alpha = 0; // L: 1160
			} else {
				Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1163
			}

			this.method4535(var1, modelViewportYs[var2], modelViewportYs[var3], modelViewportYs[var4], modelViewportXs[var2], modelViewportXs[var3], modelViewportXs[var4], this.faceColors1[var1], this.faceColors2[var1], this.faceColors3[var1]); // L: 1165
		}
	} // L: 1153 1166

	@ObfuscatedName("aq")
	boolean method4568(int var1) {
		return this.overrideAmount > 0 && var1 < this.field2618; // L: 1169
	}

	@ObfuscatedName("ai")
	final void method4535(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1173
			int var12;
			int var13;
			int var15;
			if (this.field2559 != null && this.field2559[var1] != -1) { // L: 1192
				int var14 = this.field2559[var1] & 255; // L: 1193
				var15 = this.field2541[var14]; // L: 1194
				var12 = this.field2595[var14]; // L: 1195
				var13 = this.field2565[var14]; // L: 1196
			} else {
				var15 = this.indices1[var1]; // L: 1199
				var12 = this.indices2[var1]; // L: 1200
				var13 = this.indices3[var1]; // L: 1201
			}

			if (this.faceColors3[var1] == -1) { // L: 1203
				Rasterizer3D.method4147(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2588[var15], field2588[var12], field2588[var13], field2555[var15], field2555[var12], field2555[var13], field2590[var15], field2590[var12], field2590[var13], this.faceTextures[var1]); // L: 1204
			} else {
				Rasterizer3D.method4147(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2588[var15], field2588[var12], field2588[var13], field2555[var15], field2555[var12], field2555[var13], field2590[var15], field2590[var12], field2590[var13], this.faceTextures[var1]); // L: 1207
			}
		} else {
			boolean var11 = this.method4568(var1); // L: 1174
			if (this.faceColors3[var1] == -1 && var11) { // L: 1175
				Rasterizer3D.method4151(var2, var3, var4, var5, var6, var7, field2576[this.faceColors1[var1]], this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1176
			} else if (this.faceColors3[var1] == -1) { // L: 1178
				Rasterizer3D.method4173(var2, var3, var4, var5, var6, var7, field2576[this.faceColors1[var1]]); // L: 1179
			} else if (var11) { // L: 1181
				Rasterizer3D.method4168(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1182
			} else {
				Rasterizer3D.method4140(var2, var3, var4, var5, var6, var7, var8, var9, var10); // L: 1185
			}
		}

	} // L: 1210

	@ObfuscatedName("an")
	final void method4537(int var1) {
		int var2 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 1213
		int var3 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 1214
		int var4 = 0; // L: 1215
		int var5 = this.indices1[var1]; // L: 1216
		int var6 = this.indices2[var1]; // L: 1217
		int var7 = this.indices3[var1]; // L: 1218
		int var8 = field2590[var5]; // L: 1219
		int var9 = field2590[var6]; // L: 1220
		int var10 = field2590[var7]; // L: 1221
		if (this.faceAlphas == null) { // L: 1222
			Rasterizer3D.Rasterizer3D_alpha = 0;
		} else {
			Rasterizer3D.Rasterizer3D_alpha = this.faceAlphas[var1] & 255; // L: 1223
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) { // L: 1224
			field2599[var4] = modelViewportXs[var5]; // L: 1225
			field2603[var4] = modelViewportYs[var5]; // L: 1226
			field2570[var4++] = this.faceColors1[var1]; // L: 1227
		} else {
			var11 = field2588[var5]; // L: 1230
			var12 = field2555[var5]; // L: 1231
			var13 = this.faceColors1[var1]; // L: 1232
			if (var10 >= 50) { // L: 1233
				var14 = field2611[var10 - var8] * (50 - var8); // L: 1234
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var7] - var11) * var14 >> 16)) / 50; // L: 1235
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var7] - var12) * var14 >> 16)) / 50; // L: 1236
				field2570[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1237
			}

			if (var9 >= 50) { // L: 1239
				var14 = field2611[var9 - var8] * (50 - var8); // L: 1240
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var6] - var11) * var14 >> 16)) / 50; // L: 1241
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var6] - var12) * var14 >> 16)) / 50; // L: 1242
				field2570[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1243
			}
		}

		if (var9 >= 50) { // L: 1246
			field2599[var4] = modelViewportXs[var6]; // L: 1247
			field2603[var4] = modelViewportYs[var6]; // L: 1248
			field2570[var4++] = this.faceColors2[var1]; // L: 1249
		} else {
			var11 = field2588[var6]; // L: 1252
			var12 = field2555[var6]; // L: 1253
			var13 = this.faceColors2[var1]; // L: 1254
			if (var8 >= 50) { // L: 1255
				var14 = field2611[var8 - var9] * (50 - var9); // L: 1256
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var5] - var11) * var14 >> 16)) / 50; // L: 1257
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var5] - var12) * var14 >> 16)) / 50; // L: 1258
				field2570[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1259
			}

			if (var10 >= 50) { // L: 1261
				var14 = field2611[var10 - var9] * (50 - var9); // L: 1262
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var7] - var11) * var14 >> 16)) / 50; // L: 1263
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var7] - var12) * var14 >> 16)) / 50; // L: 1264
				field2570[var4++] = var13 + ((this.faceColors3[var1] - var13) * var14 >> 16); // L: 1265
			}
		}

		if (var10 >= 50) { // L: 1268
			field2599[var4] = modelViewportXs[var7]; // L: 1269
			field2603[var4] = modelViewportYs[var7]; // L: 1270
			field2570[var4++] = this.faceColors3[var1]; // L: 1271
		} else {
			var11 = field2588[var7]; // L: 1274
			var12 = field2555[var7]; // L: 1275
			var13 = this.faceColors3[var1]; // L: 1276
			if (var9 >= 50) { // L: 1277
				var14 = field2611[var9 - var10] * (50 - var10); // L: 1278
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var6] - var11) * var14 >> 16)) / 50; // L: 1279
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var6] - var12) * var14 >> 16)) / 50; // L: 1280
				field2570[var4++] = var13 + ((this.faceColors2[var1] - var13) * var14 >> 16); // L: 1281
			}

			if (var8 >= 50) { // L: 1283
				var14 = field2611[var8 - var10] * (50 - var10); // L: 1284
				field2599[var4] = var2 + Rasterizer3D.Rasterizer3D_zoom * (var11 + ((field2588[var5] - var11) * var14 >> 16)) / 50; // L: 1285
				field2603[var4] = var3 + Rasterizer3D.Rasterizer3D_zoom * (var12 + ((field2555[var5] - var12) * var14 >> 16)) / 50; // L: 1286
				field2570[var4++] = var13 + ((this.faceColors1[var1] - var13) * var14 >> 16); // L: 1287
			}
		}

		var11 = field2599[0]; // L: 1290
		var12 = field2599[1]; // L: 1291
		var13 = field2599[2]; // L: 1292
		var14 = field2603[0]; // L: 1293
		int var15 = field2603[1]; // L: 1294
		int var16 = field2603[2]; // L: 1295
		Rasterizer3D.field2372 = false; // L: 1296
		if (var4 == 3) { // L: 1297
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1298
				Rasterizer3D.field2372 = true;
			}

			this.method4535(var1, var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2]); // L: 1299
		}

		if (var4 == 4) { // L: 1301
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > Rasterizer3D.Rasterizer3D_clipWidth || var12 > Rasterizer3D.Rasterizer3D_clipWidth || var13 > Rasterizer3D.Rasterizer3D_clipWidth || field2599[3] < 0 || field2599[3] > Rasterizer3D.Rasterizer3D_clipWidth) { // L: 1302
				Rasterizer3D.field2372 = true;
			}

			int var18;
			if (this.faceTextures != null && this.faceTextures[var1] != -1) { // L: 1303
				int var19;
				int var21;
				if (this.field2559 != null && this.field2559[var1] != -1) { // L: 1328
					int var20 = this.field2559[var1] & 255; // L: 1329
					var21 = this.field2541[var20]; // L: 1330
					var18 = this.field2595[var20]; // L: 1331
					var19 = this.field2565[var20]; // L: 1332
				} else {
					var21 = var5; // L: 1335
					var18 = var6; // L: 1336
					var19 = var7; // L: 1337
				}

				short var22 = this.faceTextures[var1]; // L: 1339
				if (this.faceColors3[var1] == -1) { // L: 1340
					Rasterizer3D.method4147(var14, var15, var16, var11, var12, var13, this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22); // L: 1341
					Rasterizer3D.method4147(var14, var16, field2603[3], var11, var13, field2599[3], this.faceColors1[var1], this.faceColors1[var1], this.faceColors1[var1], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22); // L: 1342
				} else {
					Rasterizer3D.method4147(var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22); // L: 1345
					Rasterizer3D.method4147(var14, var16, field2603[3], var11, var13, field2599[3], field2570[0], field2570[2], field2570[3], field2588[var21], field2588[var18], field2588[var19], field2555[var21], field2555[var18], field2555[var19], field2590[var21], field2590[var18], field2590[var19], var22); // L: 1346
				}
			} else {
				boolean var17 = this.method4568(var1); // L: 1304
				if (this.faceColors3[var1] == -1 && var17) { // L: 1305
					var18 = field2576[this.faceColors1[var1]]; // L: 1306
					Rasterizer3D.method4151(var14, var15, var16, var11, var12, var13, var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1307
					Rasterizer3D.method4151(var14, var16, field2603[3], var11, var13, field2599[3], var18, this.overrideHue, this.overrideSaturation, this.overrideLuminance, this.overrideAmount); // L: 1308
				} else if (this.faceColors3[var1] == -1) { // L: 1310
					var18 = field2576[this.faceColors1[var1]]; // L: 1311
					Rasterizer3D.method4173(var14, var15, var16, var11, var12, var13, var18); // L: 1312
					Rasterizer3D.method4173(var14, var16, field2603[3], var11, var13, field2599[3], var18); // L: 1313
				} else if (var17) { // L: 1315
					Rasterizer3D.method4168(var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1316
					Rasterizer3D.method4168(var14, var16, field2603[3], var11, var13, field2599[3], field2570[0], field2570[2], field2570[3], this.overrideHue, this.overrideLuminance, this.overrideSaturation, this.overrideAmount); // L: 1317
				} else {
					Rasterizer3D.method4140(var14, var15, var16, var11, var12, var13, field2570[0], field2570[1], field2570[2]); // L: 1320
					Rasterizer3D.method4140(var14, var16, field2603[3], var11, var13, field2599[3], field2570[0], field2570[2], field2570[3]); // L: 1321
				}
			}
		}

	} // L: 1350

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILnw;)V"
	)
	void method4593(int var1, class389 var2) {
		float var3 = (float)this.verticesX[var1]; // L: 1353
		float var4 = (float)(-this.verticesY[var1]); // L: 1354
		float var5 = (float)(-this.verticesZ[var1]); // L: 1355
		float var6 = 1.0F; // L: 1356
		this.verticesX[var1] = (int)(var2.field4440[0] * var3 + var2.field4440[4] * var4 + var2.field4440[8] * var5 + var2.field4440[12] * var6); // L: 1357
		this.verticesY[var1] = -((int)(var2.field4440[1] * var3 + var2.field4440[5] * var4 + var2.field4440[9] * var5 + var2.field4440[13] * var6)); // L: 1358
		this.verticesZ[var1] = -((int)(var2.field4440[2] * var3 + var2.field4440[6] * var4 + var2.field4440[10] * var5 + var2.field4440[14] * var6)); // L: 1359
	} // L: 1360

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lge;I)V"
	)
	void method4586(class202 var1, int var2) {
		if (this.field2568 != null) { // L: 1363
			for (int var3 = 0; var3 < this.verticesCount; ++var3) { // L: 1364
				int[] var4 = this.field2568[var3]; // L: 1365
				if (var4 != null && var4.length != 0) { // L: 1366
					int[] var5 = this.field2569[var3]; // L: 1367
					field2543.method7173(); // L: 1368

					for (int var6 = 0; var6 < var4.length; ++var6) { // L: 1369
						int var7 = var4[var6]; // L: 1370
						class116 var8 = var1.method4232(var7); // L: 1371
						if (var8 != null) { // L: 1372
							field2544.method7201((float)var5[var6] / 255.0F); // L: 1373
							field2545.method7227(var8.method2827(var2)); // L: 1374
							field2545.method7178(field2544); // L: 1375
							field2543.method7221(field2545); // L: 1376
						}
					}

					this.method4593(var3, field2543); // L: 1378
				}
			}

		}
	} // L: 1380

	@ObfuscatedName("cw")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.boundsType != 1) { // L: 825
			this.calculateBoundsCylinder();
		}

		this.calculateBoundingBox(var1); // L: 826
		int var11 = var5 * var8 - var4 * var6 >> 16; // L: 827
		int var12 = var2 * var7 + var3 * var11 >> 16; // L: 828
		int var13 = var3 * this.xzRadius >> 16; // L: 829
		int var14 = var12 + var13; // L: 830
		if (var14 > 50 && var12 < 3500) { // L: 831
			int var15 = var8 * var4 + var5 * var6 >> 16; // L: 832
			int var16 = (var15 - this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 833
			if (var16 / var14 < Rasterizer3D.Rasterizer3D_clipMidX2) { // L: 834
				int var17 = (var15 + this.xzRadius) * Rasterizer3D.Rasterizer3D_zoom; // L: 835
				if (var17 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidX) { // L: 836
					int var18 = var3 * var7 - var11 * var2 >> 16; // L: 837
					int var19 = var2 * this.xzRadius >> 16; // L: 838
					int var20 = (var3 * this.bottomY >> 16) + var19; // L: 839
					int var21 = (var18 + var20) * Rasterizer3D.Rasterizer3D_zoom; // L: 840
					if (var21 / var14 > Rasterizer3D.Rasterizer3D_clipNegativeMidY) { // L: 841
						int var22 = (var3 * super.height >> 16) + var19; // L: 842
						int var23 = (var18 - var22) * Rasterizer3D.Rasterizer3D_zoom; // L: 843
						if (var23 / var14 < Rasterizer3D.Rasterizer3D_clipMidY2) { // L: 844
							int var24 = var13 + (var2 * super.height >> 16); // L: 845
							boolean var25 = false; // L: 846
							boolean var26 = false; // L: 847
							if (var12 - var24 <= 50) { // L: 848
								var26 = true;
							}

							boolean var27 = var26 || this.field2562 > 0; // L: 849
							int var28 = ViewportMouse.ViewportMouse_x; // L: 852
							int var30 = ViewportMouse.ViewportMouse_y; // L: 857
							boolean var32 = ViewportMouse.ViewportMouse_isInViewport; // L: 862
							boolean var35 = 0L != var9; // L: 867
							boolean var36;
							if (var35) { // L: 868
								var36 = (int)(var9 >>> 16 & 1L) == 1; // L: 871
								var35 = !var36; // L: 873
							}

							var36 = false; // L: 878
							int var38;
							int var39;
							int var40;
							if (var35 && var32) { // L: 879
								boolean var37 = false; // L: 880
								if (field2591) { // L: 881
									var37 = JagexCache.method3439(this, var6, var7, var8); // L: 882
								} else {
									var38 = var12 - var13; // L: 885
									if (var38 <= 50) { // L: 886
										var38 = 50;
									}

									if (var15 > 0) { // L: 887
										var16 /= var14; // L: 888
										var17 /= var38; // L: 889
									} else {
										var17 /= var14; // L: 892
										var16 /= var38; // L: 893
									}

									if (var18 > 0) { // L: 895
										var23 /= var14; // L: 896
										var21 /= var38; // L: 897
									} else {
										var21 /= var14; // L: 900
										var23 /= var38; // L: 901
									}

									var39 = var28 - Rasterizer3D.Rasterizer3D_clipMidX; // L: 903
									var40 = var30 - Rasterizer3D.Rasterizer3D_clipMidY; // L: 904
									if (var39 > var16 && var39 < var17 && var40 > var23 && var40 < var21) { // L: 905
										var37 = true; // L: 906
									}
								}

								if (var37) { // L: 909
									if (this.isSingleTile) { // L: 910
										ViewportMouse.ViewportMouse_entityTags[++ViewportMouse.ViewportMouse_entityCount - 1] = var9; // L: 913
									} else {
										var36 = true; // L: 916
									}
								}
							}

							int var50 = Rasterizer3D.Rasterizer3D_clipMidX; // L: 919
							var38 = Rasterizer3D.Rasterizer3D_clipMidY; // L: 920
							var39 = 0; // L: 921
							var40 = 0; // L: 922
							if (var1 != 0) { // L: 923
								var39 = field2608[var1]; // L: 924
								var40 = field2612[var1]; // L: 925
							}

							for (int var41 = 0; var41 < this.verticesCount; ++var41) { // L: 927
								int var42 = this.verticesX[var41]; // L: 928
								int var43 = this.verticesY[var41]; // L: 929
								int var44 = this.verticesZ[var41]; // L: 930
								int var45;
								if (var1 != 0) { // L: 931
									var45 = var44 * var39 + var42 * var40 >> 16; // L: 932
									var44 = var44 * var40 - var42 * var39 >> 16; // L: 933
									var42 = var45; // L: 934
								}

								var42 += var6; // L: 936
								var43 += var7; // L: 937
								var44 += var8; // L: 938
								var45 = var44 * var4 + var5 * var42 >> 16; // L: 939
								var44 = var5 * var44 - var42 * var4 >> 16; // L: 940
								var42 = var45; // L: 941
								var45 = var3 * var43 - var44 * var2 >> 16; // L: 942
								var44 = var43 * var2 + var3 * var44 >> 16; // L: 943
								field2587[var41] = var44 - var12; // L: 945
								if (var44 >= 50) { // L: 946
									modelViewportXs[var41] = var42 * Rasterizer3D.Rasterizer3D_zoom / var44 + var50; // L: 947
									modelViewportYs[var41] = var45 * Rasterizer3D.Rasterizer3D_zoom / var44 + var38; // L: 948
								} else {
									modelViewportXs[var41] = -5000; // L: 951
									var25 = true; // L: 952
								}

								if (var27) { // L: 954
									field2588[var41] = var42; // L: 955
									field2555[var41] = var45; // L: 956
									field2590[var41] = var44; // L: 957
								}
							}

							try {
								this.draw0(var25, var36, this.isSingleTile, var9); // L: 961
							} catch (Exception var49) { // L: 963
							}

						}
					}
				}
			}
		}
	} // L: 964
}
