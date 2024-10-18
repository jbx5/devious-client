import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class496 implements class501 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	public final class531 field5123;

	@ObfuscatedSignature(
		descriptor = "(Luv;)V"
	)
	class496(class532 var1) {
		this.field5123 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Ltl;)V"
	)
	public class496(class497 var1) {
		this(new class532(var1));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1146878253"
	)
	public int method9317(int var1) {
		return this.field5123.vmethod9806(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1410873744"
	)
	public static boolean method9320(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lpe;IIB)Lvv;",
		garbageValue = "111"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!class53.method1110(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels var4 = new SpritePixels();
			var4.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
			var4.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
			var4.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[0];
			var4.yOffset = class497.SpriteBuffer_yOffsets[0];
			var4.subWidth = class7.SpriteBuffer_spriteWidths[0];
			var4.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[0];
			int var5 = var4.subWidth * var4.subHeight;
			byte[] var6 = class280.SpriteBuffer_pixels[0];
			var4.pixels = new int[var5];

			for (int var7 = 0; var7 < var5; ++var7) {
				var4.pixels[var7] = SpriteBufferProperties.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			class497.SpriteBuffer_yOffsets = null;
			class7.SpriteBuffer_spriteWidths = null;
			SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
			SpriteBufferProperties.SpriteBuffer_spritePalette = null;
			class280.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;BIB)I",
		garbageValue = "0"
	)
	public static int method9322(Buffer var0, byte var1, int var2) {
		int var3 = var1 >> var2 & 3;
		if (var3 == 3) {
			return var0.readInt();
		} else if (var3 == 2) {
			return var0.readShort();
		} else {
			return var3 == 1 ? var0.readByte() : 0;
		}
	}
}
