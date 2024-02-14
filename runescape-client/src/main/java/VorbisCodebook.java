import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cs")
@Implements("VorbisCodebook")
public class VorbisCodebook {
	@ObfuscatedName("aq")
	int field359;
	@ObfuscatedName("aw")
	@Export("entries")
	int entries;
	@ObfuscatedName("al")
	@Export("lengthMap")
	int[] lengthMap;
	@ObfuscatedName("ai")
	int[] field358;
	@ObfuscatedName("ar")
	float[][] field360;
	@ObfuscatedName("as")
	@Export("keys")
	int[] keys;

	VorbisCodebook() {
		class60 var1 = VorbisSample.field392;
		var1.method1138(24);
		this.field359 = var1.method1138(16);
		this.entries = var1.method1138(24);
		this.lengthMap = new int[this.entries];
		boolean var2 = var1.method1139() != 0;
		int var3;
		int var4;
		int var6;
		if (var2) {
			var3 = 0;

			for (var4 = var1.method1138(5) + 1; var3 < this.entries; ++var4) {
				int var5 = var1.method1138(WorldMapAreaData.iLog(this.entries - var3));

				for (var6 = 0; var6 < var5; ++var6) {
					this.lengthMap[var3++] = var4;
				}
			}
		} else {
			boolean var15 = var1.method1139() != 0;

			for (var4 = 0; var4 < this.entries; ++var4) {
				if (var15 && var1.method1139() == 0) {
					this.lengthMap[var4] = 0;
				} else {
					this.lengthMap[var4] = var1.method1138(5) + 1;
				}
			}
		}

		this.method1043();
		var3 = var1.method1138(4);
		if (var3 > 0) {
			float var16 = VorbisSample.float32Unpack(var1.method1138(32));
			float var17 = VorbisSample.float32Unpack(var1.method1138(32));
			var6 = var1.method1138(4) + 1;
			boolean var7 = var1.method1139() != 0;
			int var8;
			if (var3 == 1) {
				var8 = mapType1QuantValues(this.entries, this.field359);
			} else {
				var8 = this.entries * this.field359;
			}

			this.field358 = new int[var8];

			int var9;
			for (var9 = 0; var9 < var8; ++var9) {
				this.field358[var9] = var1.method1138(var6);
			}

			this.field360 = new float[this.entries][this.field359];
			float var10;
			int var11;
			int var12;
			if (var3 == 1) {
				for (var9 = 0; var9 < this.entries; ++var9) {
					var10 = 0.0F;
					var11 = 1;

					for (var12 = 0; var12 < this.field359; ++var12) {
						int var13 = var9 / var11 % var8;
						float var14 = (float)this.field358[var13] * var17 + var16 + var10;
						this.field360[var9][var12] = var14;
						if (var7) {
							var10 = var14;
						}

						var11 *= var8;
					}
				}
			} else {
				for (var9 = 0; var9 < this.entries; ++var9) {
					var10 = 0.0F;
					var11 = var9 * this.field359;

					for (var12 = 0; var12 < this.field359; ++var12) {
						float var18 = (float)this.field358[var11] * var17 + var16 + var10;
						this.field360[var9][var12] = var18;
						if (var7) {
							var10 = var18;
						}

						++var11;
					}
				}
			}
		}

	}

	@ObfuscatedName("aw")
	void method1043() {
		int[] var1 = new int[this.entries];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.entries; ++var3) {
			var4 = this.lengthMap[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				int var12;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var12 = var2[var8];
						if (var12 != var6) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var12 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var12 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var12 = var2[var8];
					if (var12 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.keys = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.entries; ++var3) {
			var4 = this.lengthMap[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.keys[var6] == 0) {
							this.keys[var6] = var11;
						}

						var6 = this.keys[var6];
					} else {
						++var6;
					}

					if (var6 >= this.keys.length) {
						int[] var9 = new int[this.keys.length * 2];

						for (var10 = 0; var10 < this.keys.length; ++var10) {
							var9[var10] = this.keys[var10];
						}

						this.keys = var9;
					}

					var8 >>>= 1;
				}

				this.keys[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)I"
	)
	int method1042(class60 var1) {
		int var2;
		for (var2 = 0; this.keys[var2] >= 0; var2 = var1.method1139() != 0 ? this.keys[var2] : var2 + 1) {
		}

		return ~this.keys[var2];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcl;)[F"
	)
	float[] method1050(class60 var1) {
		return this.field360[this.method1042(var1)];
	}

	@ObfuscatedName("aq")
	@Export("mapType1QuantValues")
	static int mapType1QuantValues(int var0, int var1) {
		int var2;
		for (var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class148.method3252(var2, var1) > var0; --var2) {
		}

		return var2;
	}
}
