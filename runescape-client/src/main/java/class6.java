import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("s")
public enum class6 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ls;")

	field14(0, 0);

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lah;")

	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-758443575)

	public final int field12;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	834021789)

	final int field13;

	class6(int var3, int var4) {
		this.field12 = var3;
		this.field13 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field13;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lln;III)Lqi;", garbageValue = 
	"-1027602960")

	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			WorldMapArea.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			SpritePixels var5 = new SpritePixels();
			var5.width = class451.SpriteBuffer_spriteWidth;
			var5.height = class451.SpriteBuffer_spriteHeight;
			var5.xOffset = class451.SpriteBuffer_xOffsets[0];
			var5.yOffset = class271.SpriteBuffer_yOffsets[0];
			var5.subWidth = class451.SpriteBuffer_spriteWidths[0];
			var5.subHeight = class451.SpriteBuffer_spriteHeights[0];
			int var6 = var5.subWidth * var5.subHeight;
			byte[] var7 = FriendLoginUpdate.SpriteBuffer_pixels[0];
			var5.pixels = new int[var6];

			for (int var8 = 0; var8 < var6; ++var8) {
				var5.pixels[var8] = NetFileRequest.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			ArchiveDiskActionHandler.method5813();
			return var5;
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"144596898")

	static boolean method36() {
		return (Client.drawPlayerNames & 8) != 0;
	}}