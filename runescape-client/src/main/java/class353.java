import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class353 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1481351603
	)
	int field4239;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1371054721
	)
	int field4242;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2136791495
	)
	int field4241;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1546057299
	)
	int field4240;

	public String toString() {
		boolean var1 = true; // L: 15
		int var2 = 10 - Integer.toString(this.field4239).length(); // L: 16
		int var3 = 10 - Integer.toString(this.field4241).length(); // L: 17
		int var4 = 10 - Integer.toString(this.field4242).length(); // L: 18
		String var5 = "          ".substring(10 - var2); // L: 19
		String var6 = "          ".substring(10 - var3); // L: 20
		String var7 = "          ".substring(10 - var4); // L: 21
		return "    Size: " + this.field4239 + var5 + "Created: " + this.field4242 + var7 + "Total used: " + this.field4241 + var6 + "Max-In-Use: " + this.field4240; // L: 22
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIII)V",
		garbageValue = "1517796655"
	)
	static void method6683(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 47
			int var4 = (var3 + var2) / 2; // L: 48
			int var5 = var2; // L: 49
			String var6 = var0[var4]; // L: 50
			var0[var4] = var0[var3]; // L: 51
			var0[var3] = var6; // L: 52
			int var7 = var1[var4]; // L: 53
			var1[var4] = var1[var3]; // L: 54
			var1[var3] = var7; // L: 55

			for (int var8 = var2; var8 < var3; ++var8) { // L: 56
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 57
					String var9 = var0[var8]; // L: 58
					var0[var8] = var0[var5]; // L: 59
					var0[var5] = var9; // L: 60
					int var10 = var1[var8]; // L: 61
					var1[var8] = var1[var5]; // L: 62
					var1[var5++] = var10; // L: 63
				}
			}

			var0[var3] = var0[var5]; // L: 67
			var0[var5] = var6; // L: 68
			var1[var3] = var1[var5]; // L: 69
			var1[var5] = var7; // L: 70
			method6683(var0, var1, var2, var5 - 1); // L: 71
			method6683(var0, var1, var5 + 1, var3); // L: 72
		}

	} // L: 74

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lqu;",
		garbageValue = "7"
	)
	static IndexedSprite method6681() {
		IndexedSprite var0 = new IndexedSprite(); // L: 131
		var0.width = SecureRandomCallable.SpriteBuffer_spriteWidth; // L: 132
		var0.height = class402.SpriteBuffer_spriteHeight; // L: 133
		var0.xOffset = class458.SpriteBuffer_xOffsets[0]; // L: 134
		var0.yOffset = class458.SpriteBuffer_yOffsets[0]; // L: 135
		var0.subWidth = ApproximateRouteStrategy.SpriteBuffer_spriteWidths[0]; // L: 136
		var0.subHeight = UserComparator9.SpriteBuffer_spriteHeights[0]; // L: 137
		var0.palette = class458.SpriteBuffer_spritePalette; // L: 138
		var0.pixels = FileSystem.SpriteBuffer_pixels[0]; // L: 139
		class458.SpriteBuffer_xOffsets = null; // L: 141
		class458.SpriteBuffer_yOffsets = null; // L: 142
		ApproximateRouteStrategy.SpriteBuffer_spriteWidths = null; // L: 143
		UserComparator9.SpriteBuffer_spriteHeights = null; // L: 144
		class458.SpriteBuffer_spritePalette = null; // L: 145
		FileSystem.SpriteBuffer_pixels = null; // L: 146
		return var0; // L: 148
	}
}
