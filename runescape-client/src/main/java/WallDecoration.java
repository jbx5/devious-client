import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1952135175)

	@Export("z")
	int z;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1874922275)

	@Export("x")
	int x;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	1796467831)

	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1898535773)

	@Export("orientation")
	int orientation;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-398764443)

	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-689013995)

	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1862395077)

	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lgh;")

	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lgh;")

	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("r")
	@ObfuscatedGetter(longValue = 
	3480899029470944713L)

	@Export("tag")
	public long tag;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-454015765)

	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Llq;III)[Lqx;", garbageValue = 
	"1626861036")

	public static IndexedSprite[] method4516(AbstractArchive var0, int var1, int var2) {
		if (!GrandExchangeEvent.method6045(var0, var1, var2)) {
			return null;
		} else {
			IndexedSprite[] var4 = new IndexedSprite[class451.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < class451.SpriteBuffer_spriteCount; ++var5) {
				IndexedSprite var6 = var4[var5] = new IndexedSprite();
				var6.width = class451.SpriteBuffer_spriteWidth;
				var6.height = class451.SpriteBuffer_spriteHeight;
				var6.xOffset = class451.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class451.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class451.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = class451.SpriteBuffer_spriteHeights[var5];
				var6.palette = GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette;
				var6.pixels = class460.SpriteBuffer_pixels[var5];
			}

			RouteStrategy.method3872();
			return var4;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)Lbr;", garbageValue = 
	"104")

	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? World.World_worlds[(++World.World_listCount) - 1] : null;
	}
}