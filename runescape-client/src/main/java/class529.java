import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uu")
public enum class529 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5186(1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5177(2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5160(4),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5188(8),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5180(16),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5163(32),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5179(64, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5165(128),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5169(256, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5167(512),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5162(1024),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5164(2048),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5170(4096),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5171(8192),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5159(16384),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5173(32768),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5174(65536),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5175(131072),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5176(262144),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5161(524288),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5178(1048576),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5172(2097152),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5166(4194304),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5181(8388608),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5182(16777216),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5183(33554432),
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5184(67108864, true),
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5185(134217728),
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5168(268435456),
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5187(536870912, true),
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5158(1073741824, true),
	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	field5189(Integer.MIN_VALUE);

	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1487374277
	)
	final int field5190;

	class529(int var3) {
		this(var3, false);
	}

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class529(int var3, boolean var4) {
		this.field5190 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5190;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)Lpb;",
		garbageValue = "1237025991"
	)
	@Export("fontFromBytes")
	public static Font fontFromBytes(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, SpriteBufferProperties.SpriteBuffer_xOffsets, SpriteBufferProperties.SpriteBuffer_yOffsets, class235.SpriteBuffer_spriteWidths, SpriteBufferProperties.SpriteBuffer_spriteHeights, AbstractSocket.SpriteBuffer_spritePalette, SpriteBufferProperties.SpriteBuffer_pixels);
			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			SpriteBufferProperties.SpriteBuffer_yOffsets = null;
			class235.SpriteBuffer_spriteWidths = null;
			SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
			AbstractSocket.SpriteBuffer_spritePalette = null;
			SpriteBufferProperties.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
