import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("lx")
public class class326 {
	@ObfuscatedName("ig")
	@ObfuscatedGetter(intValue = -810263539)
	static int field4097;

	@ObfuscatedName("o")
	@Export("spriteMap")
	final HashMap spriteMap = new HashMap();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnz;")
	@Export("bounds")
	Bounds bounds = new Bounds(0, 0);

	@ObfuscatedName("f")
	int[] field4093 = new int[2048];

	@ObfuscatedName("u")
	int[] field4095 = new int[2048];

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 237344629)
	int field4094 = 0;

	public class326() {
		UserComparator7.field1366 = new int[2000];
		int var1 = 0;
		int var2 = 240;
		int var3;
		int var4;
		for (var3 = 12; var1 < 16; var2 -= var3) {
			var4 = VarbitComposition.method3556(((double) (((float) (var2)) / 360.0F)), 0.9998999834060669, ((double) (0.075F + ((float) (var1)) * 0.425F / 16.0F)));
			UserComparator7.field1366[var1] = var4;
			++var1;
		}
		var2 = 48;
		for (var3 = var2 / 6; var1 < UserComparator7.field1366.length; var2 -= var3) {
			var4 = var1 * 2;
			for (int var5 = VarbitComposition.method3556(((double) (((float) (var2)) / 360.0F)), 0.9998999834060669, 0.5); var1 < var4 && var1 < UserComparator7.field1366.length; ++var1) {
				UserComparator7.field1366[var1] = var5;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1593801136")
	void method6064(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = class149.method3135(0.0, ((double) (((float) (var1)) / 3.0F)), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;
		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var8 * var2] = ((int) (256.0 * (var3[var9] * var3[var8] / var4)));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}
		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lqj;", garbageValue = "-1504842146")
	SpritePixels method6056(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method6064(var1);
		}
		return ((SpritePixels) (this.spriteMap.get(var1)));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIS)V", garbageValue = "848")
	public final void method6058(int var1, int var2) {
		if (this.field4094 < this.field4093.length) {
			this.field4093[this.field4094] = var1;
			this.field4095[this.field4094] = var2;
			++this.field4094;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "417107789")
	public final void method6055() {
		this.field4094 = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IILqj;FI)V", garbageValue = "1484661304")
	public final void method6060(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = ((int) (var4 * 18.0F));
		SpritePixels var6 = this.method6056(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();
		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4094; ++var10) {
			var11 = this.field4093[var10];
			var12 = this.field4095[var10];
			int var13 = ((int) (((float) (var11 - var1)) * var4)) - var5;
			int var14 = ((int) (((float) (var3.subHeight)) - var4 * ((float) (var12 - var2)))) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6937(var8, var9);
			this.method6061(var6, var3, var9);
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
					if (var11 > UserComparator7.field1366.length) {
						var11 = UserComparator7.field1366.length;
					}
					var12 = UserComparator7.field1366[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}
		System.nanoTime();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqj;Lqj;Lnz;I)V", garbageValue = "594445038")
	void method6061(SpritePixels var1, SpritePixels var2, Bounds var3) {
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