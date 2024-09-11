import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class401 {
	@ObfuscatedName("ac")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqy;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ag")
	int[] field4631;
	@ObfuscatedName("am")
	int[] field4628;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1092937495
	)
	int field4630;

	public class401() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4631 = new int[2048];
		this.field4628 = new int[2048];
		this.field4630 = 0;
		class171.method3743();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-45"
	)
	void method7725(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = class60.method1198(0.0D, (double)((float)var1 / 3.0F), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvv;",
		garbageValue = "0"
	)
	SpritePixels method7732(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method7725(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	public final void method7727(int var1, int var2) {
		if (this.field4630 < this.field4631.length) {
			this.field4631[this.field4630] = var1;
			this.field4628[this.field4630] = var2;
			++this.field4630;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "960513469"
	)
	public final void method7728() {
		this.field4630 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IILvv;FI)V",
		garbageValue = "1897573936"
	)
	public final void method7739(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4);
		SpritePixels var6 = this.method7732(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4630; ++var10) {
			var11 = this.field4631[var10];
			var12 = this.field4628[var10];
			int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8034(var8, var9);
			this.method7738(var6, var3, var9);
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
					if (var11 > ModelData0.field2920.length) {
						var11 = ModelData0.field2920.length;
					}

					var12 = ModelData0.field2920[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvv;Lvv;Lqy;I)V",
		garbageValue = "2069124842"
	)
	void method7738(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
			int var7 = var3.lowX + var2.subWidth * var3.lowY;

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
}
