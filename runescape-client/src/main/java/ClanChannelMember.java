import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ew")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("c")
	@Export("rank")
	public byte rank;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 44459875)
	@Export("world")
	public int world;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqa;")
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;III)[Lqu;", garbageValue = "658098688")
	public static IndexedSprite[] method2867(AbstractArchive var0, int var1, int var2) {
		if (!Ignored.method6774(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class456.SpriteBuffer_spriteCount];
			for (int var5 = 0; var5 < class456.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = ModelData0.SpriteBuffer_spriteWidth;
				var6.height = class456.SpriteBuffer_spriteHeight;
				var6.xOffset = class426.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class142.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class359.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class456.SpriteBuffer_spriteHeights[var5];
				var6.palette = class13.SpriteBuffer_spritePalette;
				var6.pixels = class421.SpriteBuffer_pixels[var5];
			}
			class426.SpriteBuffer_xOffsets = null;
			class142.SpriteBuffer_yOffsets = null;
			class359.SpriteBuffer_spriteWidths = null;
			class456.SpriteBuffer_spriteHeights = null;
			class13.SpriteBuffer_spritePalette = null;
			class421.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("v")
	static boolean method2865(long var0) {
		return class7.method51(var0) == 2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "88442168")
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
		return var1 == null ? 0 : var1.size();
	}
}