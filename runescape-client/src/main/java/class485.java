import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public enum class485 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	field5026(2, 1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	field5027(0, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	field5024(3, 3),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	field5028(1, 10);

	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	public static class398 field5030;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1939532321
	)
	final int field5025;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -94895125
	)
	final int field5029;

	class485(int var3, int var4) {
		this.field5025 = var3;
		this.field5029 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5029;
	}
}
