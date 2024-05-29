import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("vi")
@Implements("SpriteBufferProperties")
public class SpriteBufferProperties {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1658667547
	)
	@Export("SpriteBuffer_spriteCount")
	static int SpriteBuffer_spriteCount;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1129412543
	)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;
	@ObfuscatedName("az")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("af")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("aa")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("at")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;
}
