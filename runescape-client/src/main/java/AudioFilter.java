import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("ao")
	static float[][] field390;
	@ObfuscatedName("am")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("ac")
	static float field396;
	@ObfuscatedName("ae")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("ab")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("an")
	int[][][] field397;
	@ObfuscatedName("au")
	int[][][] field393;
	@ObfuscatedName("ax")
	int[] field394;

	static {
		field390 = new float[2][8];
		coefficients = new int[2][8];
	}

	AudioFilter() {
		this.pairs = new int[2];
		this.field397 = new int[2][2][4];
		this.field393 = new int[2][2][4];
		this.field394 = new int[2];
	}

	@ObfuscatedName("ab")
	float method1101(int var1, int var2, float var3) {
		float var4 = (float)this.field393[var1][0][var2] + var3 * (float)(this.field393[var1][1][var2] - this.field393[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfuscatedName("an")
	float method1103(int var1, int var2, float var3) {
		float var4 = (float)this.field397[var1][0][var2] + var3 * (float)(this.field397[var1][1][var2] - this.field397[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return normalize(var4);
	}

	@ObfuscatedName("au")
	@Export("compute")
	int compute(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field394[0] + (float)(this.field394[1] - this.field394[0]) * var2;
			var3 *= 0.0030517578F;
			field396 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			forwardMultiplier = (int)(field396 * 65536.0F);
		}

		if (this.pairs[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1101(var1, 0, var2);
			field390[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1103(var1, 0, var2));
			field390[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.pairs[var1]; ++var4) {
				var3 = this.method1101(var1, var4, var2);
				float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1103(var1, var4, var2));
				float var6 = var3 * var3;
				field390[var1][var4 * 2 + 1] = field390[var1][var4 * 2 - 1] * var6;
				field390[var1][var4 * 2] = field390[var1][var4 * 2 - 1] * var5 + field390[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field390[var1];
					var10000[var7] += field390[var1][var7 - 1] * var5 + field390[var1][var7 - 2] * var6;
				}

				var10000 = field390[var1];
				var10000[1] += field390[var1][0] * var5 + var6;
				var10000 = field390[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
					var10000 = field390[0];
					var10000[var4] *= field396;
				}
			}

			for (var4 = 0; var4 < this.pairs[var1] * 2; ++var4) {
				coefficients[var1][var4] = (int)(field390[var1][var4] * 65536.0F);
			}

			return this.pairs[var1] * 2;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvg;Lbe;)V"
	)
	final void method1105(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 15;
		if (var3 != 0) {
			this.field394[0] = var1.readUnsignedShort();
			this.field394[1] = var1.readUnsignedShort();
			int var7 = var1.readUnsignedByte();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					this.field397[var5][0][var6] = var1.readUnsignedShort();
					this.field393[var5][0][var6] = var1.readUnsignedShort();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					if ((var7 & 1 << var5 * 4 << var6) != 0) {
						this.field397[var5][1][var6] = var1.readUnsignedShort();
						this.field393[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field397[var5][1][var6] = this.field397[var5][0][var6];
						this.field393[var5][1][var6] = this.field393[var5][0][var6];
					}
				}
			}

			if (var7 != 0 || this.field394[1] != this.field394[0]) {
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field394;
			this.field394[1] = 0;
			var4[0] = 0;
		}

	}

	@ObfuscatedName("ay")
	@Export("normalize")
	static float normalize(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
