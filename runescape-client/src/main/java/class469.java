import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("su")
public enum class469 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	field4829(2, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	field4830(0, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	field4828(1, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsu;"
	)
	field4831(3, 10);

	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2008628485
	)
	final int field4832;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1216075445
	)
	final int field4833;

	class469(int var3, int var4) {
		this.field4832 = var3;
		this.field4833 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4833;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	public static void method8643() {
		class36.reflectionChecks = new IterableNodeDeque();
	}
}
