import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
@Implements("VorbisResidue")
public class VorbisResidue {
	@ObfuscatedName("ac")
	@Export("residueType")
	int residueType;
	@ObfuscatedName("al")
	@Export("begin")
	int begin;
	@ObfuscatedName("ak")
	@Export("end")
	int end;
	@ObfuscatedName("ax")
	@Export("partitionSize")
	int partitionSize;
	@ObfuscatedName("ao")
	@Export("classifications")
	int classifications;
	@ObfuscatedName("ah")
	@Export("classbook")
	int classbook;
	@ObfuscatedName("ar")
	@Export("cascade")
	int[] cascade;

	VorbisResidue() {
		class60 var1 = VorbisSample.field405;
		this.residueType = var1.method1171(16);
		this.begin = var1.method1171(24);
		this.end = var1.method1171(24);
		this.partitionSize = var1.method1171(24) + 1;
		this.classifications = var1.method1171(6) + 1;
		this.classbook = var1.method1171(8);
		int[] var2 = new int[this.classifications];

		int var3;
		for (var3 = 0; var3 < this.classifications; ++var3) {
			int var4 = 0;
			int var5 = var1.method1171(3);
			boolean var6 = var1.method1172() != 0;
			if (var6) {
				var4 = var1.method1171(5);
			}

			var2[var3] = var4 << 3 | var5;
		}

		this.cascade = new int[this.classifications * 8];

		for (var3 = 0; var3 < this.classifications * 8; ++var3) {
			this.cascade[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1171(8) : -1;
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([FIZLcz;)V"
	)
	void method867(float[] var1, int var2, boolean var3, class60 var4) {
		int var5;
		for (var5 = 0; var5 < var2; ++var5) {
			var1[var5] = 0.0F;
		}

		if (!var3) {
			var5 = VorbisSample.field396[this.classbook].field376;
			int var6 = this.end - this.begin;
			int var7 = var6 / this.partitionSize;
			int[] var8 = new int[var7];

			for (int var9 = 0; var9 < 8; ++var9) {
				int var10 = 0;

				while (var10 < var7) {
					int var11;
					int var12;
					if (var9 == 0) {
						var11 = VorbisSample.field396[this.classbook].method1064(var4);

						for (var12 = var5 - 1; var12 >= 0; --var12) {
							if (var10 + var12 < var7) {
								var8[var10 + var12] = var11 % this.classifications;
							}

							var11 /= this.classifications;
						}
					}

					for (var11 = 0; var11 < var5; ++var11) {
						var12 = var8[var10];
						int var13 = this.cascade[var9 + var12 * 8];
						if (var13 >= 0) {
							int var14 = var10 * this.partitionSize + this.begin;
							VorbisCodebook var15 = VorbisSample.field396[var13];
							int var16;
							if (this.residueType == 0) {
								var16 = this.partitionSize / var15.field376;

								for (int var20 = 0; var20 < var16; ++var20) {
									float[] var21 = var15.method1068(var4);

									for (int var19 = 0; var19 < var15.field376; ++var19) {
										var1[var14 + var20 + var19 * var16] += var21[var19];
									}
								}
							} else {
								var16 = 0;

								while (var16 < this.partitionSize) {
									float[] var17 = var15.method1068(var4);

									for (int var18 = 0; var18 < var15.field376; ++var18) {
										var1[var14 + var16] += var17[var18];
										++var16;
									}
								}
							}
						}

						++var10;
						if (var10 >= var7) {
							break;
						}
					}
				}
			}

		}
	}
}
