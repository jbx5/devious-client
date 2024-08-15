import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
class class335 implements ThreadFactory {
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "[Lnq;"
	)
	static Widget[] field3622;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmr;)V"
	)
	class335(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "643829671"
	)
	public static void method6430() {
		class228.field1842.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lvc;",
		garbageValue = "1223202256"
	)
	static SpritePixels method6428() {
		SpritePixels var0 = new SpritePixels();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = class563.SpriteBuffer_spriteHeight;
		var0.xOffset = class149.SpriteBuffer_xOffsets[0];
		var0.yOffset = class563.SpriteBuffer_yOffsets[0];
		var0.subWidth = class563.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class372.SpriteBuffer_spriteHeights[0];
		int var1 = var0.subHeight * var0.subWidth;
		byte[] var2 = class563.SpriteBuffer_pixels[0];
		var0.pixels = new int[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var0.pixels[var3] = RouteStrategy.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class149.SpriteBuffer_xOffsets = null;
		class563.SpriteBuffer_yOffsets = null;
		class563.SpriteBuffer_spriteWidths = null;
		class372.SpriteBuffer_spriteHeights = null;
		RouteStrategy.SpriteBuffer_spritePalette = null;
		class563.SpriteBuffer_pixels = null;
		return var0;
	}
}
