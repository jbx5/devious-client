import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public enum class371 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4328(0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4327(1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4329(2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	field4330(3);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1851017691
	)
	public final int field4331;

	class371(int var3) {
		this.field4331 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4331;
	}
}
