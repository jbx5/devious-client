import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public enum class492 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	field5091(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	field5089(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	field5094(2, 2);

	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1553482921
	)
	final int field5092;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1474716795
	)
	final int field5093;

	class492(int var3, int var4) {
		this.field5092 = var3;
		this.field5093 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5093;
	}
}
