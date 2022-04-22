import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class93 {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(intValue = 
	-1393536385)

	static int field1253;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	static IndexedSprite field1254;
	@ObfuscatedName("or")
	@ObfuscatedGetter(intValue = 
	1900010659)

	static int field1252;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	479487429)

	int field1251;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1483191049)

	int field1248;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	1476000165)

	int field1247;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-602846795)

	int field1250;

	class93(int var1, int var2, int var3, int var4) {
		this.field1251 = var1;
		this.field1248 = var2;
		this.field1247 = var3;
		this.field1250 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"70")

	int method2370() {
		return this.field1251;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"194991061")

	int method2380() {
		return this.field1248;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1753372833")

	int method2372() {
		return this.field1247;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1314673051")

	int method2373() {
		return this.field1250;
	}

	@ObfuscatedName("v")
	public static final void method2384(long var0) {
		if (var0 > 0L) {
			if (0L == (var0 % 10L)) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Ljava/lang/String;Ljava/lang/String;I)[Lqq;", garbageValue = 
	"18034657")

	public static IndexedSprite[] method2386(AbstractArchive var0, String var1, String var2) {
		int var3 = var0.getGroupId(var1);
		int var4 = var0.getFileId(var3, var2);
		byte[] var7 = var0.takeFile(var3, var4);
		boolean var6;
		if (var7 == null) {
			var6 = false;
		} else {
			WorldMapArea.SpriteBuffer_decode(var7);
			var6 = true;
		}

		IndexedSprite[] var5;
		if (!var6) {
			var5 = null;
		} else {
			IndexedSprite[] var8 = new IndexedSprite[class451.SpriteBuffer_spriteCount];

			for (int var9 = 0; var9 < class451.SpriteBuffer_spriteCount; ++var9) {
				IndexedSprite var10 = var8[var9] = new IndexedSprite();
				var10.width = class451.SpriteBuffer_spriteWidth;
				var10.height = class451.SpriteBuffer_spriteHeight;
				var10.xOffset = class451.SpriteBuffer_xOffsets[var9];
				var10.yOffset = class271.SpriteBuffer_yOffsets[var9];
				var10.subWidth = class451.SpriteBuffer_spriteWidths[var9];
				var10.subHeight = class451.SpriteBuffer_spriteHeights[var9];
				var10.palette = NetFileRequest.SpriteBuffer_spritePalette;
				var10.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var9];
			}

			ArchiveDiskActionHandler.method5813();
			var5 = var8;
		}

		return var5;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(descriptor = 
	"(Lcb;II)V", garbageValue = 
	"-314734464")

	static final void method2376(Actor var0, int var1) {
		VarbitComposition.worldToScreen(var0.x, var0.y, var1);
	}
}