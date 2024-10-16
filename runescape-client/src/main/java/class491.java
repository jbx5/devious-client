import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public enum class491 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	field5086(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	field5083(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	field5085(2, 2);

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	static IndexedSprite[] field5088;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1181429251
	)
	final int field5084;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2003654123
	)
	final int field5082;

	class491(int var3, int var4) {
		this.field5084 = var3;
		this.field5082 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5082;
	}
}
