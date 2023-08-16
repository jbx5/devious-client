import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("AudioFilter")
public class AudioFilter {
	@ObfuscatedName("ai")
	static float[][] field434;
	@ObfuscatedName("az")
	@Export("coefficients")
	static int[][] coefficients;
	@ObfuscatedName("ap")
	static float field439;
	@ObfuscatedName("aa")
	@Export("forwardMultiplier")
	static int forwardMultiplier;
	@ObfuscatedName("au")
	@Export("pairs")
	int[] pairs;
	@ObfuscatedName("ao")
	int[][][] field442;
	@ObfuscatedName("at")
	int[][][] field435;
	@ObfuscatedName("ac")
	int[] field438;

	static {
		field434 = new float[2][8];
		coefficients = new int[2][8];
	}

	AudioFilter() {
		this.pairs = new int[2];
		this.field442 = new int[2][2][4];
		this.field435 = new int[2][2][4];
		this.field438 = new int[2];
	}

	@ObfuscatedName("au")
	float method1138(int var1, int var2, float var3) {
		float var4 = (float)this.field435[var1][0][var2] + var3 * (float)(this.field435[var1][1][var2] - this.field435[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	@ObfuscatedName("ao")
	float method1140(int var1, int var2, float var3) {
		float var4 = (float)this.field442[var1][0][var2] + var3 * (float)(this.field442[var1][1][var2] - this.field442[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return normalize(var4);
	}

	@ObfuscatedName("at")
	@Export("compute")
	int compute(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field438[0] + (float)(this.field438[1] - this.field438[0]) * var2;
			var3 *= 0.0030517578F;
			field439 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			forwardMultiplier = (int)(field439 * 65536.0F);
		}

		if (this.pairs[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1138(var1, 0, var2);
			field434[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method1140(var1, 0, var2));
			field434[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.pairs[var1]; ++var4) {
				var3 = this.method1138(var1, var4, var2);
				float var5 = -2.0F * var3 * (float)Math.cos((double)this.method1140(var1, var4, var2));
				float var6 = var3 * var3;
				field434[var1][var4 * 2 + 1] = field434[var1][var4 * 2 - 1] * var6;
				field434[var1][var4 * 2] = field434[var1][var4 * 2 - 1] * var5 + field434[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field434[var1];
					var10000[var7] += field434[var1][var7 - 1] * var5 + field434[var1][var7 - 2] * var6;
				}

				var10000 = field434[var1];
				var10000[1] += field434[var1][0] * var5 + var6;
				var10000 = field434[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.pairs[0] * 2; ++var4) {
					var10000 = field434[0];
					var10000[var4] *= field439;
				}
			}

			for (var4 = 0; var4 < this.pairs[var1] * 2; ++var4) {
				coefficients[var1][var4] = (int)(field434[var1][var4] * 65536.0F);
			}

			return this.pairs[var1] * 2;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Lbr;)V"
	)
	final void method1137(Buffer var1, SoundEnvelope var2) {
		int var3 = var1.readUnsignedByte();
		this.pairs[0] = var3 >> 4;
		this.pairs[1] = var3 & 15;
		if (var3 != 0) {
			this.field438[0] = var1.readUnsignedShort();
			this.field438[1] = var1.readUnsignedShort();
			int var7 = var1.readUnsignedByte();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					this.field442[var5][0][var6] = var1.readUnsignedShort();
					this.field435[var5][0][var6] = var1.readUnsignedShort();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.pairs[var5]; ++var6) {
					if ((var7 & 1 << var5 * 4 << var6) != 0) {
						this.field442[var5][1][var6] = var1.readUnsignedShort();
						this.field435[var5][1][var6] = var1.readUnsignedShort();
					} else {
						this.field442[var5][1][var6] = this.field442[var5][0][var6];
						this.field435[var5][1][var6] = this.field435[var5][0][var6];
					}
				}
			}

			if (var7 != 0 || this.field438[1] != this.field438[0]) {
				var2.decodeSegments(var1);
			}
		} else {
			int[] var4 = this.field438;
			this.field438[1] = 0;
			var4[0] = 0;
		}

	}

	@ObfuscatedName("ae")
	@Export("normalize")
	static float normalize(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}
}
