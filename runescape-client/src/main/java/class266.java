import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("jc")
public class class266 {
	@ObfuscatedName("cg")
	@ObfuscatedSignature(descriptor = "Lqu;")
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)[Lqe;", garbageValue = "22")
	static SpritePixels[] method5212() {
		SpritePixels[] var0 = new SpritePixels[class456.SpriteBuffer_spriteCount];
		for (int var1 = 0; var1 < class456.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = ModelData0.SpriteBuffer_spriteWidth;
			var2.height = class456.SpriteBuffer_spriteHeight;
			var2.xOffset = class426.SpriteBuffer_xOffsets[var1];
			var2.yOffset = class142.SpriteBuffer_yOffsets[var1];
			var2.subWidth = class359.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = class456.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = class421.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];
			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = class13.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}
		SoundCache.method766();
		return var0;
	}
}