import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bn")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("q")
	static float[][] field413 = new float[2][8];

	@ObfuscatedName("i")
	@Export("coefficients")
	static int[][] coefficients = new int[2][8];

	@ObfuscatedName("k")
	static float field415;

	@ObfuscatedName("o")
	@Export("forwardMultiplier")
	static int forwardMultiplier;

	@ObfuscatedName("s")
	@Export("pairs")
	int[] pairs = new int[2];

	@ObfuscatedName("w")
	int[][][] field410 = new int[2][2][4];

	@ObfuscatedName("v")
	int[][][] field411 = new int[2][2][4];

	@ObfuscatedName("c")
	int[] field409 = new int[2];

	AudioFilter() {
	}

	@ObfuscatedName("s")
	float method1007(int var1, int var2, float var3) {
		float var4 = ((float) (this.field411[var1][0][var2])) + var3 * ((float) (this.field411[var1][1][var2] - this.field411[var1][0][var2]));
		var4 *= 0.0015258789F;
		return 1.0F - ((float) (Math.pow(10.0, ((double) (-var4 / 20.0F)))));
	}

	@ObfuscatedName("w")
	float method1009(int var1, int var2, float var3) {
		float var4 = ((float) (this.field410[var1][0][var2])) + var3 * ((float) (this.field410[var1][1][var2] - this.field410[var1][0][var2]));
		var4 *= 1.2207031E-4F;
		return normalize(var4);
	}

	@ObfuscatedName("v")
	@Export("compute")
	int compute(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = ((float) (this.field409[0])) + ((float) (this.field409[1] - this.field409[0])) * var2;
			var3 *= 0.0030517578F;
			field415 = ((float) (Math.pow(0.1, ((double) (var3 / 20.0F)))));
			forwardMultiplier = ((int) (field415 * 65536.0F));
		}
		if (this.pairs[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1007(var1, 0, var2);
			field413[var1][0] = -2.0F * var3 * ((float) (Math.cos(((double) (this.method1009(var1, 0, var2))))));
			field413[var1][1] = var3 * var3;
			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.pairs[var1]; ++var4) {
				var3 = this.method1007(var1, var4, var2);
				float var5 = -2.0F * var3 * ((float) (Math.cos(((double) (this.method1009(var1, var4, var2))))));
				float var6 = var3 * var3;
				field413[var1][var4 * 2 + 1] = field413[var1][var4 * 2 - 1] * var6;
				field413[var1][var4 * 2] = field413[var1][var4 * 2 - 1] * var5 + field413[var1][var4 * 2 - 2] * var6;
				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field413[var1];
					var10000[var7] += field413[var1][var7 - 1] * var5 + field413[var1][var7 - 2] * var6;
				}
				var10000 = field413[var1];
				var10000[1] += field413[var1][0] * var5 + var6;
				var10000 = field413[var1];
				var10000[0] += var5;
			}
			if (var1 == 0) {
				for (var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
					var10000 = field413[0];
					var10000[var4] *= field415;
				}
			}
			for (var4 = 0; var4 < this.pairs[var1] * 2; ++var4) {
				coefficients[var1][var4] = ((int) (field413[var1][var4] * 65536.0F));
			}
			return this.pairs[var1] * 2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqr;Law;)V")
	final void method1011(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 15;
		if (var3 != 0) {
			this.field409[0] = var1.readUnsignedShort();
			this.field409[1] = var1.readUnsignedShort();
			int var7 = var1.readUnsignedByte();
			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					this.field410[var5][0][var6] = var1.readUnsignedShort();
					this.field411[var5][0][var6] = var1.readUnsignedShort();
				}
			}
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					if ((var7 & 1 << var5 * 4 << var6) != 0) {
						this.field410[var5][1][var6] = var1.readUnsignedShort();
						this.field411[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field410[var5][1][var6] = this.field410[var5][0][var6];
						this.field411[var5][1][var6] = this.field411[var5][0][var6];
					}
				}
			}
			if (var7 != 0 || this.field409[1] != this.field409[0]) {
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field409;
			this.field409[1] = 0;
			var4[0] = 0;
		}
	}

	@ObfuscatedName("h")
	@Export("normalize")
	static float normalize(float var0) {
		float var1 = 32.703197F * ((float) (Math.pow(2.0, ((double) (var0)))));
		return var1 * 3.1415927F / 11025.0F;
	}
}