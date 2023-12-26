import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
@Implements("SpriteBufferUtils")
public class SpriteBufferUtils {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1658967602"
	)
	@Export("SpriteBuffer_reset")
	static void SpriteBuffer_reset() {
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		class520.SpriteBuffer_spriteHeights = null;
		SpriteBufferProperties.SpriteBuffer_spritePalette = null;
		class396.SpriteBuffer_pixels = null;
	}
}
