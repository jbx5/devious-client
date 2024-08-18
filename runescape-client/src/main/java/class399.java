import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class399 {
	@ObfuscatedName("ab")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("an")
	int[] field4575;
	@ObfuscatedName("au")
	int[] field4578;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -720284285
	)
	int field4577;

	public class399() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4575 = new int[2048];
		this.field4578 = new int[2048];
		this.field4577 = 0;
		class318.method6149();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1343565913"
	)
	void method7455(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = Decimator.method1088(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvc;",
		garbageValue = "69"
	)
	SpritePixels method7456(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7455(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-216887763"
	)
	public final void method7458(int var1, int var2) {
		if (this.field4577 < this.field4575.length) {
			this.field4575[this.field4577] = var1;
			this.field4578[this.field4577] = var2;
			++this.field4577;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1171719607"
	)
	public final void method7465() {
		this.field4577 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILvc;FI)V",
		garbageValue = "-807780240"
	)
	public final void method7472(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method7456(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4577; ++var10) {
			var11 = this.field4575[var10];
			var12 = this.field4578[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method7774(var8, var9);
			this.method7459(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > MouseRecorder.field1083.length) {
						var11 = MouseRecorder.field1083.length;
					}

					var12 = MouseRecorder.field1083[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvc;Lvc;Lqw;I)V",
		garbageValue = "1421977397"
	)
	void method7459(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth;
			int var7 = var2.subWidth * var3.lowY + var3.lowX;

			for (int var8 = 0; var8 < var3.highY; ++var8) {
				for (int var9 = 0; var9 < var3.highX; ++var9) {
					int[] var10000 = var2.pixels;
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX;
				var7 += var2.subWidth - var3.highX;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1295737342"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
