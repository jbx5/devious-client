import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class208 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lvl;",
		garbageValue = "-1806441543"
	)
	public static IndexedSprite method3917() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
		var0.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = Ignored.SpriteBuffer_spriteHeights[0];
		var0.palette = class126.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		SpriteBufferProperties.SpriteBuffer_xOffsets = null;
		SpriteBufferProperties.SpriteBuffer_yOffsets = null;
		SpriteBufferProperties.SpriteBuffer_spriteWidths = null;
		Ignored.SpriteBuffer_spriteHeights = null;
		class126.SpriteBuffer_spritePalette = null;
		SpriteBufferProperties.SpriteBuffer_pixels = null;
		return var0;
	}
}
