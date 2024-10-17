import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public enum class495 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	field5117(0, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	field5119(1, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	field5118(2, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	field5121(3, 10);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2049297215
	)
	final int field5120;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1553965775
	)
	final int field5116;

	class495(int var3, int var4) {
		this.field5120 = var3;
		this.field5116 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5116;
	}
}
