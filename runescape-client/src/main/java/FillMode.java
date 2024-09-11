import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vo")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	field5494(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	field5496(2, 2);

	@ObfuscatedName("ai")
	static String[] field5499;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1940594437
	)
	public final int field5497;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1129057521
	)
	final int field5498;

	FillMode(int var3, int var4) {
		this.field5497 = var3;
		this.field5498 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5498;
	}
}
