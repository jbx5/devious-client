import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	static AbstractArchive field1896;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 599500437
	)
	public int field1889;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 9926773
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -143305259
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1176483417
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2060952257
	)
	public int field1897;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -726630169
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -494185453
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -84573275
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1564018069
	)
	@Export("width")
	public int width;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 223804869
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	public HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1;
		this.field1897 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-200358726"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 36
			if (var2 == 0) { // L: 37
				return; // L: 40
			}

			this.decodeNext(var1, var2); // L: 38
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "1056918045"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 43
			var1.readUnsignedShort(); // L: 44
		} else if (var2 == 2) { // L: 46
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 47
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 48
			this.int3 = 0;
		} else if (var2 == 5) { // L: 49
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) { // L: 50
			var1.readUnsignedByte(); // L: 51
		} else if (var2 == 7) { // L: 53
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) { // L: 54
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) { // L: 55
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) { // L: 56
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 57
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 59

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-1254951118"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) { // L: 62
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 63
			if (var1 != null) {
				return var1; // L: 64
			} else {
				var1 = class114.SpriteBuffer_getSprite(field1896, this.frontSpriteID, 0); // L: 65
				if (var1 != null) { // L: 66
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1; // L: 68
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-2053454719"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) { // L: 72
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 73
			if (var1 != null) { // L: 74
				return var1;
			} else {
				var1 = class114.SpriteBuffer_getSprite(field1896, this.backSpriteID, 0); // L: 75
				if (var1 != null) { // L: 76
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1; // L: 78
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "532204450"
	)
	public static boolean method3605(int var0) {
		return (var0 & 1) != 0; // L: 9
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1172087263"
	)
	public static boolean method3606(int var0) {
		return (var0 >> 20 & 1) != 0; // L: 21
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(Lkw;III)V",
		garbageValue = "-701255800"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) { // L: 10390
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) { // L: 10391
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) { // L: 10392
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) { // L: 10393
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) { // L: 10394
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14); // L: 10395
		}

		if (var0.yAlignment == 0) { // L: 10396
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) { // L: 10397
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) { // L: 10398
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14; // L: 10399
		} else if (var0.yAlignment == 4) { // L: 10400
			var0.y = (var2 * var0.rawY >> 14) + (var2 - var0.height) / 2;
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14); // L: 10401
		}

	} // L: 10402
}
