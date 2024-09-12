import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("um")
public class class543 {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1184393861
	)
	static final int field5361;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1415297489
	)
	static final int field5359;

	static {
		field5361 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5359 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lvv;",
		garbageValue = "-785202724"
	)
	static SpritePixels[] method9848() {
		SpritePixels[] var0 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

		for (int var1 = 0; var1 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var1) {
			SpritePixels var2 = var0[var1] = new SpritePixels();
			var2.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var2.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var2.xOffset = HttpAuthenticationHeader.SpriteBuffer_xOffsets[var1];
			var2.yOffset = Login.SpriteBuffer_yOffsets[var1];
			var2.subWidth = GrandExchangeEvents.SpriteBuffer_spriteWidths[var1];
			var2.subHeight = ModelData0.SpriteBuffer_spriteHeights[var1];
			int var3 = var2.subHeight * var2.subWidth;
			byte[] var4 = MusicPatchPcmStream.SpriteBuffer_pixels[var1];
			var2.pixels = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var2.pixels[var5] = SpriteBufferProperties.SpriteBuffer_spritePalette[var4[var5] & 255];
			}
		}

		class151.method3492();
		return var0;
	}
}
