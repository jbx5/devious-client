import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
public enum class383 implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4495(-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4494(0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4493(1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4496(2);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -691785361
	)
	final int field4497;

	class383(int var3) {
		this.field4497 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4497;
	}
}
