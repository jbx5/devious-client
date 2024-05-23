import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public abstract class class542 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lor;III)Lvc;",
		garbageValue = "-1974443202"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class108.method2769(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = class351.SpriteBuffer_spriteHeight;
			var4.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
			var4.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
			var4.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
			var4.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subHeight * var4.subWidth;
			byte[] var6 = PlayerCompositionColorTextureOverride.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = UrlRequest.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			SpriteBufferProperties.SpriteBuffer_yOffsets = null;
			SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
			SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
			UrlRequest.SpriteBuffer_spritePalette = null;
			PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = null;
			return var4;
		}
	}
}
