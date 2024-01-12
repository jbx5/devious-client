import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
public class class197 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("archive4")
	static EvictingDualNodeHashTable archive4;

	static {
		archive4 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Low;IIB)[Lut;",
		garbageValue = "80"
	)
	public static IndexedSprite[] method3853(AbstractArchive var0, int var1, int var2) {
		if (!Varcs.method2829(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
				var6.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class388.SpriteBuffer_yOffsets[var5];
				var6.subWidth = FriendsList.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights[var5];
				var6.palette = SecureUrlRequester.SpriteBuffer_spritePalette;
				var6.pixels = class230.SpriteBuffer_pixels[var5];
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			class388.SpriteBuffer_yOffsets = null;
			FriendsList.SpriteBuffer_spriteWidths = null;
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null;
			SecureUrlRequester.SpriteBuffer_spritePalette = null;
			class230.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "99"
	)
	static boolean method3854() {
		return (Client.drawPlayerNames & 4) != 0;
	}
}
