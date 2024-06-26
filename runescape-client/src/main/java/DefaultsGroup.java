import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sw")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field5010;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static final DefaultsGroup field5011;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1592901653
	)
	@Export("group")
	final int group;

	static {
		field5010 = new DefaultsGroup(1);
		field5011 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1696739276"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		SpriteBufferProperties.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		UserComparator4.SpriteBuffer_xOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		LoginPacket.SpriteBuffer_yOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_spriteWidths = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		class315.SpriteBuffer_spriteHeights = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_pixels = new byte[SpriteBufferProperties.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			UserComparator4.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			LoginPacket.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			class315.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		SpriteBufferProperties.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (SpriteBufferProperties.SpriteBuffer_spritePalette[var3] == 0) {
				SpriteBufferProperties.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			int var4 = SpriteBufferProperties.SpriteBuffer_spriteWidths[var3];
			int var5 = class315.SpriteBuffer_spriteHeights[var3];
			int var6 = var4 * var5;
			byte[] var7 = new byte[var6];
			SpriteBufferProperties.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}
}
