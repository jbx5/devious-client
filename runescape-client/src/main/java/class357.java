import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
public enum class357 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	field3918(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	field3916(1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	field3920(2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	field3919(3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnh;"
	)
	field3921(4);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1992174529
	)
	static int field3922;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 976437053
	)
	final int field3917;

	class357(int var3) {
		this.field3917 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3917;
	}
}
