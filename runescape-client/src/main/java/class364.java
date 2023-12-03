import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public enum class364 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4236(-1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4237(0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4238(1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4239(2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1121525677
	)
	final int field4240;

	class364(int var3) {
		this.field4240 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4240;
	}
}
