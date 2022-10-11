import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
class class428 implements Iterator {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2130092703
	)
	int field4678;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	final class429 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lpf;)V"
	)
	class428(class429 var1) {
		this.this$0 = var1; // L: 51
	}

	public Object next() {
		int var1 = ++this.field4678 - 1; // L: 61
		class395 var2 = (class395)this.this$0.field4679.get((long)var1); // L: 62
		return var2 != null ? var2 : this.this$0.method7731(var1); // L: 63 64
	}

	public boolean hasNext() {
		return this.field4678 < this.this$0.method7267(); // L: 56
	}

	public void remove() {
		throw new UnsupportedOperationException(); // L: 69
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "125"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 185
		var1.offset = var0.length - 2; // L: 186
		class458.SpriteBuffer_spriteCount = var1.readUnsignedShort(); // L: 187
		class458.SpriteBuffer_xOffsets = new int[class458.SpriteBuffer_spriteCount]; // L: 188
		class458.SpriteBuffer_yOffsets = new int[class458.SpriteBuffer_spriteCount]; // L: 189
		ApproximateRouteStrategy.SpriteBuffer_spriteWidths = new int[class458.SpriteBuffer_spriteCount]; // L: 190
		UserComparator9.SpriteBuffer_spriteHeights = new int[class458.SpriteBuffer_spriteCount]; // L: 191
		FileSystem.SpriteBuffer_pixels = new byte[class458.SpriteBuffer_spriteCount][]; // L: 192
		var1.offset = var0.length - 7 - class458.SpriteBuffer_spriteCount * 8; // L: 193
		SecureRandomCallable.SpriteBuffer_spriteWidth = var1.readUnsignedShort(); // L: 194
		class402.SpriteBuffer_spriteHeight = var1.readUnsignedShort(); // L: 195
		int var2 = (var1.readUnsignedByte() & 255) + 1; // L: 196

		int var3;
		for (var3 = 0; var3 < class458.SpriteBuffer_spriteCount; ++var3) { // L: 197
			class458.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class458.SpriteBuffer_spriteCount; ++var3) { // L: 198
			class458.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class458.SpriteBuffer_spriteCount; ++var3) { // L: 199
			ApproximateRouteStrategy.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class458.SpriteBuffer_spriteCount; ++var3) { // L: 200
			UserComparator9.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class458.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3; // L: 201
		class458.SpriteBuffer_spritePalette = new int[var2]; // L: 202

		for (var3 = 1; var3 < var2; ++var3) { // L: 203
			class458.SpriteBuffer_spritePalette[var3] = var1.readMedium(); // L: 204
			if (class458.SpriteBuffer_spritePalette[var3] == 0) { // L: 205
				class458.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0; // L: 207

		for (var3 = 0; var3 < class458.SpriteBuffer_spriteCount; ++var3) { // L: 208
			int var4 = ApproximateRouteStrategy.SpriteBuffer_spriteWidths[var3]; // L: 209
			int var5 = UserComparator9.SpriteBuffer_spriteHeights[var3]; // L: 210
			int var6 = var5 * var4; // L: 211
			byte[] var7 = new byte[var6]; // L: 212
			FileSystem.SpriteBuffer_pixels[var3] = var7; // L: 213
			int var8 = var1.readUnsignedByte(); // L: 214
			int var9;
			if (var8 == 0) { // L: 215
				for (var9 = 0; var9 < var6; ++var9) { // L: 216
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) { // L: 218
				for (var9 = 0; var9 < var4; ++var9) { // L: 219
					for (int var10 = 0; var10 < var5; ++var10) { // L: 220
						var7[var9 + var4 * var10] = var1.readByte(); // L: 221
					}
				}
			}
		}

	} // L: 226
}
