import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fa")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1571265211")
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "56")
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lls;I)V", garbageValue = "-596131229")
	public static void method3265(AbstractArchive var0) {
		VarcInt.VarcInt_archive = var0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lls;III)Lqe;", garbageValue = "325266913")
	static IndexedSprite method3260(AbstractArchive var0, int var1, int var2) {
		if (!Tile.method3937(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite var4 = new IndexedSprite();
			var4.width = class457.SpriteBuffer_spriteWidth;
			var4.height = class457.SpriteBuffer_spriteHeight;
			var4.xOffset = class457.SpriteBuffer_xOffsets[0];
			var4.yOffset = InterfaceParent.SpriteBuffer_yOffsets[0];
			var4.subWidth = class457.SpriteBuffer_spriteWidths[0];
			var4.subHeight = SoundCache.SpriteBuffer_spriteHeights[0];
			var4.palette = class457.SpriteBuffer_spritePalette;
			var4.pixels = class181.SpriteBuffer_pixels[0];
			class457.SpriteBuffer_xOffsets = null;
			InterfaceParent.SpriteBuffer_yOffsets = null;
			class457.SpriteBuffer_spriteWidths = null;
			SoundCache.SpriteBuffer_spriteHeights = null;
			class457.SpriteBuffer_spritePalette = null;
			class181.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-332792055")
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("eg")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "11")
	static final void method3264() {
		if (Client.logoutTimer > 0) {
			UserComparator8.logOut();
		} else {
			Client.timer.method6468();
			class4.updateGameState(40);
			PacketBufferNode.field3045 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}