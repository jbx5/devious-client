import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("uf")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2005589249
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 594510337
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1015359733
	)
	@Export("SpriteBuffer_spriteHeight")
	static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_xOffsets")
	static int[] SpriteBuffer_xOffsets;
}
