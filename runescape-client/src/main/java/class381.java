import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public enum class381 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4411(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4409(1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4410(2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4408(3);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -20084053
	)
	public final int field4412;

	class381(int var3) {
		this.field4412 = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4412;
	}
}
