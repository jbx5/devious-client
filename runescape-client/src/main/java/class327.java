import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lm")
public class class327 {
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("c")
	@Export("spriteMap")
	final HashMap spriteMap;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("bounds")
	Bounds bounds;
	@ObfuscatedName("f")
	int[] field4125;
	@ObfuscatedName("n")
	int[] field4122;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1382063769
	)
	int field4123;

	public class327() {
		this.spriteMap = new HashMap(); // L: 10
		this.bounds = new Bounds(0, 0); // L: 11
		this.field4125 = new int[2048]; // L: 12
		this.field4122 = new int[2048]; // L: 13
		this.field4123 = 0; // L: 14
		InterfaceParent.field1040 = new int[2000]; // L: 22
		int var1 = 0; // L: 23
		int var2 = 240; // L: 24

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) { // L: 25
			var4 = class11.method121((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F)); // L: 27
			InterfaceParent.field1040[var1] = var4; // L: 28
			++var1; // L: 26
		}

		var2 = 48; // L: 30

		for (int var6 = var2 / 6; var1 < InterfaceParent.field1040.length; var2 -= var6) { // L: 31 32 38
			var4 = var1 * 2; // L: 33

			for (int var5 = class11.method121((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < InterfaceParent.field1040.length; ++var1) { // L: 34 35
				InterfaceParent.field1040[var1] = var5; // L: 36
			}
		}

	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1313706428"
	)
	void method6199(int var1) {
		int var2 = var1 * 2 + 1; // L: 44
		double[] var3 = class82.method2261(0.0D, (double)((float)var1 / 3.0F), var1); // L: 45
		double var4 = var3[var1] * var3[var1]; // L: 46
		int[] var6 = new int[var2 * var2]; // L: 47
		boolean var7 = false; // L: 48

		for (int var8 = 0; var8 < var2; ++var8) { // L: 49
			for (int var9 = 0; var9 < var2; ++var9) { // L: 50
				int var10 = var6[var9 + var8 * var2] = (int)(var3[var9] * var3[var8] / var4 * 256.0D); // L: 51
				if (!var7 && var10 > 0) { // L: 52
					var7 = true; // L: 53
				}
			}
		}

		SpritePixels var11 = new SpritePixels(var6, var2, var2); // L: 57
		this.spriteMap.put(var1, var11); // L: 58
	} // L: 59

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lqi;",
		garbageValue = "-1092501019"
	)
	SpritePixels method6200(int var1) {
		if (!this.spriteMap.containsKey(var1)) { // L: 62
			this.method6199(var1); // L: 63
		}

		return (SpritePixels)this.spriteMap.get(var1); // L: 65
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1438069586"
	)
	public final void method6201(int var1, int var2) {
		if (this.field4123 < this.field4125.length) { // L: 69
			this.field4125[this.field4123] = var1; // L: 70
			this.field4122[this.field4123] = var2; // L: 71
			++this.field4123; // L: 72
		}
	} // L: 73

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public final void method6207() {
		this.field4123 = 0; // L: 76
	} // L: 77

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IILqi;FI)V",
		garbageValue = "-975934270"
	)
	public final void method6203(int var1, int var2, SpritePixels var3, float var4) {
		int var5 = (int)(18.0F * var4); // L: 80
		SpritePixels var6 = this.method6200(var5); // L: 81
		int var7 = var5 * 2 + 1; // L: 82
		Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight); // L: 83
		Bounds var9 = new Bounds(0, 0); // L: 84
		this.bounds.setHigh(var7, var7); // L: 85
		System.nanoTime(); // L: 86

		int var10;
		int var11;
		int var12;
		for (var10 = 0; var10 < this.field4123; ++var10) { // L: 87
			var11 = this.field4125[var10]; // L: 88
			var12 = this.field4122[var10]; // L: 89
			int var13 = (int)((float)(var11 - var1) * var4) - var5; // L: 90
			int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5; // L: 91
			this.bounds.setLow(var13, var14); // L: 92
			this.bounds.method7096(var8, var9); // L: 93
			this.method6204(var6, var3, var9); // L: 94
		}

		System.nanoTime(); // L: 96
		System.nanoTime(); // L: 97

		for (var10 = 0; var10 < var3.pixels.length; ++var10) { // L: 98
			if (var3.pixels[var10] == 0) { // L: 99
				var3.pixels[var10] = -16777216; // L: 100
			} else {
				var11 = (var3.pixels[var10] + 64 - 1) / 256; // L: 103
				if (var11 <= 0) { // L: 104
					var3.pixels[var10] = -16777216; // L: 105
				} else {
					if (var11 > InterfaceParent.field1040.length) { // L: 108
						var11 = InterfaceParent.field1040.length;
					}

					var12 = InterfaceParent.field1040[var11 - 1]; // L: 109
					var3.pixels[var10] = -16777216 | var12; // L: 110
				}
			}
		}

		System.nanoTime(); // L: 112
	} // L: 113

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;Lnk;I)V",
		garbageValue = "-199663267"
	)
	void method6204(SpritePixels var1, SpritePixels var2, Bounds var3) {
		if (var3.highX != 0 && var3.highY != 0) { // L: 116
			int var4 = 0; // L: 117
			int var5 = 0; // L: 118
			if (var3.lowX == 0) { // L: 119
				var4 = var1.subWidth - var3.highX;
			}

			if (var3.lowY == 0) { // L: 120
				var5 = var1.subHeight - var3.highY;
			}

			int var6 = var4 + var5 * var1.subWidth; // L: 121
			int var7 = var3.lowX + var2.subWidth * var3.lowY; // L: 122

			for (int var8 = 0; var8 < var3.highY; ++var8) { // L: 123
				for (int var9 = 0; var9 < var3.highX; ++var9) { // L: 124
					int[] var10000 = var2.pixels; // L: 125
					int var10001 = var7++;
					var10000[var10001] += var1.pixels[var6++];
				}

				var6 += var1.subWidth - var3.highX; // L: 127
				var7 += var2.subWidth - var3.highX; // L: 128
			}

		}
	} // L: 130
}
