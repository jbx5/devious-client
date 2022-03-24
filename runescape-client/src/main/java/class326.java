import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class326 {
	@ObfuscatedName("v")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lnm;")

	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("h")
	int[] field4043;
	@ObfuscatedName("g")
	int[] field4044;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1991693335)

	int field4045;

	public class326() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4043 = new int[2048];
		this.field4044 = new int[2048];
		this.field4045 = 0;
		HealthBar.method2351();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"15")

	void method6107(int var1) {
		int var2 = (var1 * 2) + 1;
		double[] var3 = Message.method1112(0.0, ((double) (((float) (var1)) / 3.0F)), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;

		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + (var8 * var2)] = ((int) (((var3[var9] * var3[var8]) / var4) * 256.0));
				if ((!var7) && (var10 > 0)) {
					var7 = true;
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lql;", garbageValue = 
	"3")

	SpritePixels method6084(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method6107(var1);
		}

		return ((SpritePixels) (this.spriteMap.get(var1)));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"-103")

	public final void method6091(int var1, int var2) {
		if (this.field4045 < this.field4043.length) {
			this.field4043[this.field4045] = var1;
			this.field4044[this.field4045] = var2;
			++this.field4045;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-726081819")

	public final void method6086() {
		this.field4045 = 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IILql;FI)V", garbageValue = 
	"-1878611374")

	public final void method6082(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = ((int) (18.0F * var4));
		SpritePixels var6 = this.method6084(var5);
		int var7 = (var5 * 2) + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4045; ++var10) {
			var11 = this.field4043[var10];
			var12 = this.field4044[var10];
			int var13 = ((int) (((float) (var11 - var1)) * var4)) - var5;
			int var14 = ((int) (((float) (var3.subHeight)) - (((float) (var12 - var2)) * var4))) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6985(var8, var9);
			this.method6087(var6, var3, var9);
		}

		System.nanoTime();
		System.nanoTime();

		for (var10 = 0; var10 < var3.pixels.length; ++var10) {
			if (var3.pixels[var10] == 0) {
				var3.pixels[var10] = -16777216;
			} else {
				var11 = ((var3.pixels[var10] + 64) - 1) / 256;
				if (var11 <= 0) {
					var3.pixels[var10] = -16777216;
				} else {
					if (var11 > class113.field1387.length) {
						var11 = class113.field1387.length;
					}

					var12 = class113.field1387[var11 - 1];
					var3.pixels[var10] = (-16777216) | var12;
				}
			}
		}

		System.nanoTime();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lql;Lql;Lnm;I)V", garbageValue = 
	"-839631696")

	void method6087(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if ((var3.highX != 0) && (var3.highY != 0)) {
			int var4 = 0;
			int var5 = 0;
			if (var3.lowX == 0) {
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) {
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + (var5 * var1.subWidth);
			int var7 = (var2.subWidth * var3.lowY) + var3.lowX;

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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"2127405993")

	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if ((var0 < 0) || (var0 >= 65536)) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}
}