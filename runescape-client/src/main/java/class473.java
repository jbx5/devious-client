import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public enum class473 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	field4893(1, 1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	field4894(0, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	field4895(3, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	field4896(2, 10);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1961207145
	)
	final int field4897;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -14554463
	)
	final int field4898;

	class473(int var3, int var4) {
		this.field4897 = var3;
		this.field4898 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4898;
	}
}
