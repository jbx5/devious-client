import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
public enum class465 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	field4789(1, 1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	field4792(0, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	field4788(3, 3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	field4790(2, 10);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1389347181
	)
	final int field4791;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 595331113
	)
	final int field4793;

	class465(int var3, int var4) {
		this.field4791 = var3;
		this.field4793 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4793;
	}
}
