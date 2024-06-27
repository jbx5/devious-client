import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vh")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1853843341
	)
	@Export("SpriteBuffer_spriteCount")
	public static int SpriteBuffer_spriteCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 432701269
	)
	@Export("SpriteBuffer_spriteWidth")
	public static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 596356767
	)
	@Export("SpriteBuffer_spriteHeight")
	public static int SpriteBuffer_spriteHeight;
	@ObfuscatedName("an")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("av")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ab")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
}
