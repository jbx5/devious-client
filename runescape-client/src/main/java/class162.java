import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class162 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -489866399
	)
	int field1757;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1027796971
	)
	int field1758;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class162(class147 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1757 = var1.readInt();
		this.field1758 = var1.readInt();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3336(this.field1757, this.field1758);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "6"
	)
	static void method3451() {
		ChatChannel.field996 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = ArchiveLoader.method2328((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var0 / 16.0F + 0.075F));
			ChatChannel.field996[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < ChatChannel.field996.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = ArchiveLoader.method2328((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < ChatChannel.field996.length; ++var0) {
				ChatChannel.field996[var0] = var4;
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "33"
	)
	@Export("SpriteBuffer_decode")
	public static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		class541.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		class541.SpriteBuffer_xOffsets = new int[class541.SpriteBuffer_spriteCount];
		class541.SpriteBuffer_yOffsets = new int[class541.SpriteBuffer_spriteCount];
		class541.SpriteBuffer_spriteWidths = new int[class541.SpriteBuffer_spriteCount];
		class520.SpriteBuffer_spriteHeights = new int[class541.SpriteBuffer_spriteCount];
		class396.SpriteBuffer_pixels = new byte[class541.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - class541.SpriteBuffer_spriteCount * 8;
		class541.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) {
			class541.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) {
			class541.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) {
			class541.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) {
			class520.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - class541.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		class541.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			class541.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (class541.SpriteBuffer_spritePalette[var3] == 0) {
				class541.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < class541.SpriteBuffer_spriteCount; ++var3) {
			int var4 = class541.SpriteBuffer_spriteWidths[var3];
			int var5 = class520.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			class396.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var4 * var10] = var1.readByte();
					}
				}
			}
		}

	}
}
