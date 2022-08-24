import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("le")
public class class326 {
	@ObfuscatedName("o")
	static int[] field4084;

	@ObfuscatedName("s")
	@Export("spriteMap")
	final HashMap spriteMap = new HashMap();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lnh;")
	@Export("bounds")
	Bounds bounds = new Bounds(0, 0);

	@ObfuscatedName("w")
	int[] field4080 = new int[2048];

	@ObfuscatedName("v")
	int[] field4081 = new int[2048];

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -307734671)
	int field4085 = 0;

	public class326() {
		field4084 = new int[2000];
		int var1 = 0;
		int var2 = 240;
		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = PcmPlayer.method666(((double) (((float) (var2)) / 360.0F)), 0.9998999834060669, ((double) (0.075F + ((float) (var1)) * 0.425F / 16.0F)));
			field4084[var1] = var4;
			++var1;
		}
		var2 = 48;
		for (int var6 = var2 / 6; var1 < class326.field4084.length; var2 -= var6) {
			var4 = var1 * 2;
			for (int var5 = PcmPlayer.method666(((double) (((float) (var2)) / 360.0F)), 0.9998999834060669, 0.5); var1 < var4 && var1 < class326.field4084.length; ++var1) {
				field4084[var1] = var5;
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "14191")
	void method5976(int var1) {
		int var2 = var1 * 2 + 1;
		double[] var3 = Occluder.method4235(0.0, ((double) (((float) (var1)) / 3.0F)), var1);
		double var4 = var3[var1] * var3[var1];
		int[] var6 = new int[var2 * var2];
		boolean var7 = false;
		for (int var8 = 0; var8 < var2; ++var8) {
			for (int var9 = 0; var9 < var2; ++var9) {
				int var10 = var6[var9 + var2 * var8] = ((int) (var3[var8] * var3[var9] / var4 * 256.0));
				if (!var7 && var10 > 0) {
					var7 = true;
				}
			}
		}
		SpritePixels var11 = new SpritePixels(var6, var2, var2);
		this.spriteMap.put(var1, var11);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IS)Lqn;", garbageValue = "-23513")
	SpritePixels method5962(int var1) {
		if (!this.spriteMap.containsKey(var1)) {
			this.method5976(var1);
		}
		return ((SpritePixels) (this.spriteMap.get(var1)));
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1758451771")
	public final void method5964(int var1, int var2) {
		if (this.field4085 < this.field4080.length) {
			this.field4080[this.field4085] = var1;
			this.field4081[this.field4085] = var2;
			++this.field4085;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "109")
	public final void method5977() {
		this.field4085 = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IILqn;FI)V", garbageValue = "575666917")
	public final void method5965(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = ((int) (var4 * 18.0F));
		SpritePixels var6 = this.method5962(var5);
		int var7 = var5 * 2 + 1;
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
		Bounds var9 = new Bounds(0, 0);
		this.bounds.setHigh(var7, var7);
		System.nanoTime();
		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4085; ++var10) {
			var11 = this.field4080[var10];
			var12 = this.field4081[var10];
			int var13 = ((int) (var4 * ((float) (var11 - var1)))) - var5;
			int var14 = ((int) (((float) (var3.subHeight)) - var4 * ((float) (var12 - var2)))) - var5;
			this.bounds.setLow(var13, var14);
			this.bounds.method6848(var8, var9);
			this.method5967(var6, var3, var9);
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
					if (var11 > class326.field4084.length) {
						var11 = class326.field4084.length;
					}
					var12 = field4084[var11 - 1];
					var3.pixels[var10] = -16777216 | var12;
				}
			}
		}
		System.nanoTime();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqn;Lqn;Lnh;I)V", garbageValue = "-1601570159")
	void method5967(SpritePixels var1, SpritePixels var2, Bounds var3) {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([BIIS)Ljava/lang/String;", garbageValue = "-3634")
	public static String method5963(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder();
		for (int var4 = var1; var4 < var2 + var1; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class342.field4144[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class342.field4144[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class342.field4144[(var6 & 15) << 2 | var7 >>> 6]).append(class342.field4144[var7 & 63]);
				} else {
					var3.append(class342.field4144[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class342.field4144[(var5 & 3) << 4]).append("==");
			}
		}
		return var3.toString();
	}
}