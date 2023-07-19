import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class370 {
	@ObfuscatedName("aw")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrk;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("ar")
	int[] field4360;
	@ObfuscatedName("am")
	int[] field4366;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -720294865
	)
	int field4362;

	public class370() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4360 = new int[2048];
		this.field4366 = new int[2048];
		this.field4362 = 0;
		ModelData0.field2804 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = Archive.method6745((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
			ModelData0.field2804[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < ModelData0.field2804.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = Archive.method6745((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < ModelData0.field2804.length; ++var1) {
				ModelData0.field2804[var1] = var5;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method6963(int var1) {
		int var2 = var1 * 2 + 1;
		double var4 = (double)((float)var1 / 3.0F);
		int var6 = var1 * 2 + 1;
		double[] var7 = new double[var6];
		int var8 = -var1;

		for (int var9 = 0; var8 <= var1; ++var9) {
			var7[var9] = class14.method190((double)var8, 0.0D, var4);
			++var8;
		}

		double[] var14 = var7;
		double var15 = var7[var1] * var7[var1];
		int[] var17 = new int[var2 * var2];
		boolean var10 = false;

		for (int var11 = 0; var11 < var2; ++var11) {
			for (int var12 = 0; var12 < var2; ++var12) {
				int var13 = var17[var12 + var2 * var11] = (int)(256.0D * (var14[var12] * var14[var11] / var15));
				if (!var10 && var13 > 0) {
					var10 = true;
				}
			}
		}

		SpritePixels var18 = new SpritePixels(var17, var2, var2);
		this.spriteMap.put(var1, var18);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Lud;",
		garbageValue = "1395339509"
	)
	SpritePixels method6964(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method6963(var1);
		}

		return (SpritePixels)this.spriteMap.get(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-205352827"
	)
	public final void method6965(int var1, int var2) {
		if (this.field4362 < this.field4360.length) {
			this.field4360[this.field4362] = var1;
			this.field4366[this.field4362] = var2;
			++this.field4362;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1967755634"
	)
	public final void method6966() {
		this.field4362 = 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILud;FI)V",
		garbageValue = "-114256156"
	)
	public final void method6967(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(var4 * 18.0F);
		SpritePixels var6 = this.method6964(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4362; ++var10) {
			var11 = this.field4360[var10];
			var12 = this.field4366[var10];
			int var13 = (int)((float)(var11 - var1) * var4) - var5;
			int var14 = (int)((float)var3.subHeight - (float)(var12 - var2) * var4) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method8195(var8, var9);
			this.method6968(var6, var3, var9);
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
					if (var11 > ModelData0.field2804.length) {
						var11 = ModelData0.field2804.length;
					}

					var12 = ModelData0.field2804[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lud;Lud;Lrk;S)V",
		garbageValue = "-20246"
	)
	void method6968(SpritePixels var1, SpritePixels var2, Bounds var3) {
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
