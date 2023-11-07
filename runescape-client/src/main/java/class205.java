import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class205 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2239;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2232;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2233;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2246;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2235;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2234;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2237;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2236;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2242;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2240;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2241;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	public static final class205 field2231;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2243;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhm;"
	)
	static final class205 field2244;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1480867533
	)
	public final int field2245;

	static {
		field2239 = new class205(0);
		field2232 = new class205(1);
		field2233 = new class205(2);
		field2246 = new class205(3);
		field2235 = new class205(4, class192.field1983);
		field2234 = new class205(5);
		field2237 = new class205(6, class192.field1986);
		field2236 = new class205(7, class192.field1987);
		field2242 = new class205(8, class192.field1989);
		field2240 = new class205(9, class192.field1985);
		field2241 = new class205(10, class192.field1984);
		field2231 = new class205(11, class192.field1982);
		field2243 = new class205(12);
		field2244 = new class205(13);
	}

	class205(int var1) {
		this(var1, (class192)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhc;)V"
	)
	class205(int var1, class192 var2) {
		this.field2245 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;IIB)Lup;",
		garbageValue = "0"
	)
	static IndexedSprite method4097(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class162.SpriteBuffer_decode(var4);
			var3 = true;
		}

		if (!var3) {
			return null;
		} else {
			IndexedSprite var5 = new IndexedSprite();
			var5.width = class541.SpriteBuffer_spriteWidth;
			var5.height = GrandExchangeOfferWorldComparator.SpriteBuffer_spriteHeight;
			var5.xOffset = class541.SpriteBuffer_xOffsets[0];
			var5.yOffset = class541.SpriteBuffer_yOffsets[0];
			var5.subWidth = class541.SpriteBuffer_spriteWidths[0];
			var5.subHeight = class520.SpriteBuffer_spriteHeights[0];
			var5.palette = class541.SpriteBuffer_spritePalette;
			var5.pixels = class396.SpriteBuffer_pixels[0];
			class541.SpriteBuffer_xOffsets = null;
			class541.SpriteBuffer_yOffsets = null;
			class541.SpriteBuffer_spriteWidths = null;
			class520.SpriteBuffer_spriteHeights = null;
			class541.SpriteBuffer_spritePalette = null;
			class396.SpriteBuffer_pixels = null;
			return var5;
		}
	}
}
