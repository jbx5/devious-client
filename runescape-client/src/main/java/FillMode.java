import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	field5283(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	field5284(2, 2);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2017597387
	)
	public final int field5286;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1973894159
	)
	final int field5282;

	FillMode(int var3, int var4) {
		this.field5286 = var3;
		this.field5282 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5282;
	}
}
