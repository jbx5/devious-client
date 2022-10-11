import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
@Implements("Renderable")
public abstract class Renderable extends DualNode {
	@ObfuscatedName("dt")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1165159491
	)
	@Export("height")
	public int height;

	protected Renderable() {
		this.height = 1000; // L: 6
	} // L: 8

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "13"
	)
	@Export("getModel")
	protected Model getModel() {
		return null; // L: 19
	}

	@ObfuscatedName("cw")
	@Export("draw")
	void draw(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		Model var11 = this.getModel(); // L: 11
		if (var11 != null) { // L: 12
			this.height = var11.height; // L: 13
			var11.draw(var1, var2, var3, var4, var5, var6, var7, var8, var9); // L: 14
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[Lct;",
		garbageValue = "16663677"
	)
	static class82[] method4463() {
		return new class82[]{class82.field1062, class82.field1065, class82.field1069, class82.field1068, class82.field1064}; // L: 16
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lbt;",
		garbageValue = "-95"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var5 = class120.method2925(var3, var0); // L: 43
		if (var5 != null) { // L: 44
			return var5; // L: 45
		} else {
			int var4 = class221.method4682(var2, var0); // L: 47
			var5 = class120.method2925(var4, var0); // L: 48
			return var5 != null ? var5 : null; // L: 49 52
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ldi;FZI)F",
		garbageValue = "-1587158874"
	)
	static float method4464(class118 var0, float var1, boolean var2) {
		float var3 = 0.0F; // L: 137
		if (var0 != null && var0.method2876() != 0) { // L: 138
			float var4 = (float)var0.field1467[0].field1407; // L: 141
			float var5 = (float)var0.field1467[var0.method2876() - 1].field1407; // L: 142
			float var6 = var5 - var4; // L: 143
			if ((double)var6 == 0.0D) { // L: 144
				return var0.field1467[0].field1409; // L: 145
			} else {
				float var7 = 0.0F; // L: 147
				if (var1 > var5) { // L: 148
					var7 = (var1 - var5) / var6; // L: 149
				} else {
					var7 = (var1 - var4) / var6; // L: 152
				}

				double var8 = (double)((int)var7); // L: 154
				float var10 = Math.abs((float)((double)var7 - var8)); // L: 155
				float var11 = var10 * var6; // L: 156
				var8 = Math.abs(var8 + 1.0D); // L: 157
				double var12 = var8 / 2.0D; // L: 158
				double var14 = (double)((int)var12); // L: 159
				var10 = (float)(var12 - var14); // L: 160
				float var16;
				float var17;
				if (var2) { // L: 163
					if (var0.field1454 == class117.field1446) { // L: 164
						if ((double)var10 != 0.0D) { // L: 165
							var11 += var4; // L: 166
						} else {
							var11 = var5 - var11; // L: 169
						}
					} else if (var0.field1454 != class117.field1445 && var0.field1454 != class117.field1443) { // L: 172
						if (var0.field1454 == class117.field1444) { // L: 175
							var11 = var4 - var1; // L: 176
							var16 = var0.field1467[0].field1406; // L: 177
							var17 = var0.field1467[0].field1412; // L: 178
							var3 = var0.field1467[0].field1409; // L: 179
							if (0.0D != (double)var16) { // L: 180
								var3 -= var11 * var17 / var16; // L: 181
							}

							return var3; // L: 183
						}
					} else {
						var11 = var5 - var11; // L: 173
					}
				} else if (var0.field1455 == class117.field1446) { // L: 187
					if ((double)var10 != 0.0D) { // L: 188
						var11 = var5 - var11; // L: 189
					} else {
						var11 += var4; // L: 192
					}
				} else if (var0.field1455 != class117.field1445 && var0.field1455 != class117.field1443) { // L: 195
					if (var0.field1455 == class117.field1444) { // L: 198
						var11 = var1 - var5; // L: 199
						var16 = var0.field1467[var0.method2876() - 1].field1410; // L: 200
						var17 = var0.field1467[var0.method2876() - 1].field1411; // L: 201
						var3 = var0.field1467[var0.method2876() - 1].field1409; // L: 202
						if (0.0D != (double)var16) { // L: 203
							var3 += var17 * var11 / var16; // L: 204
						}

						return var3; // L: 206
					}
				} else {
					var11 += var4; // L: 196
				}

				var3 = class33.method636(var0, var11); // L: 209
				float var18;
				if (var2 && var0.field1454 == class117.field1443) { // L: 211
					var18 = var0.field1467[var0.method2876() - 1].field1409 - var0.field1467[0].field1409; // L: 212
					var3 = (float)((double)var3 - var8 * (double)var18); // L: 213
				} else if (!var2 && var0.field1455 == class117.field1443) { // L: 215
					var18 = var0.field1467[var0.method2876() - 1].field1409 - var0.field1467[0].field1409; // L: 216
					var3 = (float)((double)var3 + (double)var18 * var8); // L: 217
				}

				return var3; // L: 219
			}
		} else {
			return var3; // L: 139
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqf;B)I",
		garbageValue = "113"
	)
	static int method4461(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 370
		int var2;
		if (var1 == 0) { // L: 372
			var2 = 0;
		} else if (var1 == 1) { // L: 373
			var2 = var0.readBits(5);
		} else if (var1 == 2) { // L: 374
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 375
		}

		return var2; // L: 376
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1519012832"
	)
	public static int method4462(int var0) {
		return (var0 & class440.field4720) - 1; // L: 26
	}
}
