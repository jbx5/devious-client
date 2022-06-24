import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("of")
public enum class390 implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lof;")
	field4422(0, 1),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lof;")
	field4418(1, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lof;")
	field4419(3, 3),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lof;")
	field4420(2, 10);
	@ObfuscatedName("tm")
	@ObfuscatedGetter(intValue = 1311264541)
	static int field4423;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1525922993)
	final int field4417;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1014236719)
	final int field4421;

	class390(int var3, int var4) {
		this.field4417 = var3;
		this.field4421 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4421;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)Lqu;", garbageValue = "14")
	static IndexedSprite method7053() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = ModelData0.SpriteBuffer_spriteWidth;
		var0.height = class456.SpriteBuffer_spriteHeight;
		var0.xOffset = class426.SpriteBuffer_xOffsets[0];
		var0.yOffset = class142.SpriteBuffer_yOffsets[0];
		var0.subWidth = class359.SpriteBuffer_spriteWidths[0];
		var0.subHeight = class456.SpriteBuffer_spriteHeights[0];
		var0.palette = class13.SpriteBuffer_spritePalette;
		var0.pixels = class421.SpriteBuffer_pixels[0];
		class426.SpriteBuffer_xOffsets = null;
		class142.SpriteBuffer_yOffsets = null;
		class359.SpriteBuffer_spriteWidths = null;
		class456.SpriteBuffer_spriteHeights = null;
		class13.SpriteBuffer_spritePalette = null;
		class421.SpriteBuffer_pixels = null;
		return var0;
	}
}