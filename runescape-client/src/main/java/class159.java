import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class159 extends class163 {
	@ObfuscatedName("gi")
	@ObfuscatedGetter(
		intValue = 957518491
	)
	static int field1789;
	@ObfuscatedName("aq")
	String field1787;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1439169443
	)
	int field1788;
	@ObfuscatedName("ag")
	byte field1786;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class159(class164 var1) {
		this.this$0 = var1;
		this.field1787 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "-1435141567"
	)
	void vmethod3524(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1787 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1788 = var1.readUnsignedShort();
		this.field1786 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "902480534"
	)
	void vmethod3523(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1787);
		var2.world = this.field1788;
		var2.rank = this.field1786;
		var1.addMember(var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-955766921"
	)
	static boolean method3418(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "-414202999"
	)
	static IndexedSprite method3419() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
		var0.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
		var0.xOffset = UserComparator4.SpriteBuffer_xOffsets[0];
		var0.yOffset = LoginPacket.SpriteBuffer_yOffsets[0];
		var0.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class315.SpriteBuffer_spriteHeights[0];
		var0.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
		var0.pixels = SpriteBufferProperties.SpriteBuffer_pixels[0];
		Calendar.method7029();
		return var0;
	}
}
