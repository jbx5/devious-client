import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ll")
public class class325 {
	@ObfuscatedName("c")
	@Export("spriteMap")
	final HashMap spriteMap;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lns;")
	@Export("bounds")
	Bounds bounds;

	@ObfuscatedName("q")
	int[] field4075;

	@ObfuscatedName("f")
	int[] field4074;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1023228515)
	int field4076;

	public class325() {
		this.spriteMap = new HashMap();
		this.bounds = new Bounds(0, 0);
		this.field4075 = new int[2048];
		this.field4074 = new int[2048];
		this.field4076 = 0;
		class344.field4152 = new int[2000];
		int var1 = 0;
		int var2 = 240;
		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = StructComposition.method3616(((double) (((float) (var2)) / 360.0F)), 0.9998999834060669, ((double) (0.075F + 0.425F * ((float) (var1)) / 16.0F)));
			class344.field4152[var1] = var4;
			++var1;
		}
		var2 = 48;
		for (int var6 = var2 / 6; var1 < class344.field4152.length; var2 -= var6) {
			var4 = var1 * 2;
			for (int var5 = StructComposition.method3616(((double) (((float) (var2)) / 360.0F)), 0.9998999834060669, 0.5); var1 < var4 && var1 < class344.field4152.length; ++var1) {
				class344.field4152[var1] = var5;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "273043499")
	void method6033(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = WorldMapEvent.method5119(0.0, ((double) (((float) (var1)) / 3.0F)), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;
		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = ((int) (256.0 * (var3[var9] * var3[var8] / var4)));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}
		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)Lqe;", garbageValue = "0")
	SpritePixels method6034(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method6033(var1);
		}
		return ((SpritePixels) (this.spriteMap.get(var1)));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-441809547")
	public final void method6048(int var1, int var2) {
		if (this.field4076 < this.field4075.length) {
			this.field4075[this.field4076] = var1;
			this.field4074[this.field4076] = var2;
			++this.field4076;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2031798375")
	public final void method6035() {
		this.field4076 = 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IILqe;FI)V", garbageValue = "-1870606235")
	public final void method6046(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = ((int) (18.0F * var4));
		SpritePixels var6 = this.method6034(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();
		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4076; ++var10) {
			var11 = this.field4075[var10];
			var12 = this.field4074[var10];
			int var13 = ((int) (var4 * ((float) (var11 - var1)))) - var5;
			int var14 = ((int) (((float) (var3.subHeight)) - ((float) (var12 - var2)) * var4)) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6895(var8, var9);
			this.method6037(var6, var3, var9);
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
					if (var11 > class344.field4152.length) {
						var11 = class344.field4152.length;
					}
					var12 = class344.field4152[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}
		System.nanoTime();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqe;Lqe;Lns;I)V", garbageValue = "-1668982828")
	void method6037(SpritePixels var1, SpritePixels var2, Bounds var3) {
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