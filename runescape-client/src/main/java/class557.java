import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vm")
public enum class557 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	field5426(1, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	field5427(2, 2);

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1771953401
	)
	public final int field5429;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -906848393
	)
	final int field5428;

	class557(int var3, int var4) {
		this.field5429 = var3;
		this.field5428 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5428;
	}
}
