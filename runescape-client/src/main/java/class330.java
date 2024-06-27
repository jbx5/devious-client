import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class330 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field3583;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field3579;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static AbstractArchive field3591;
	@ObfuscatedName("ak")
	public static ArrayList field3582;
	@ObfuscatedName("ap")
	public static LinkedList field3587;
	@ObfuscatedName("an")
	@Export("musicSongs")
	public static ArrayList musicSongs;
	@ObfuscatedName("aj")
	public static ArrayList field3585;
	@ObfuscatedName("av")
	public static ArrayList field3581;
	@ObfuscatedName("ab")
	public static final List field3588;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 554380341
	)
	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 664447525
	)
	public static int field3589;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1265911605
	)
	public static int field3590;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -950072303
	)
	public static int field3586;
	@ObfuscatedName("nx")
	@ObfuscatedGetter(
		intValue = -311136091
	)
	@Export("menuWidth")
	static int menuWidth;

	static {
		field3582 = null;
		field3587 = new LinkedList();
		musicSongs = new ArrayList(3);
		field3585 = new ArrayList(3);
		field3581 = new ArrayList();
		field3588 = new ArrayList();
		musicPlayerStatus = 0;
		field3589 = 0;
		field3590 = 0;
		field3586 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIB)[Lvv;",
		garbageValue = "0"
	)
	public static IndexedSprite[] method6173(AbstractArchive var0, int var1, int var2) {
		if (!class146.method3260(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
				var6.xOffset = UserComparator4.SpriteBuffer_xOffsets[var5];
				var6.yOffset = LoginPacket.SpriteBuffer_yOffsets[var5];
				var6.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class315.SpriteBuffer_spriteHeights[var5];
				var6.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
				var6.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var5];
			}

			Calendar.method7029();
			return var4;
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1234876312"
	)
	static final boolean method6183(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}
