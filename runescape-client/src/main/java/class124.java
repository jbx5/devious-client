import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public enum class124 implements MouseWheel {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1474(3, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1469(0, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1470(2, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1471(1, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1472(4, 4);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -636253437
	)
	public final int field1468;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1971092133
	)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1468 = var3;
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
