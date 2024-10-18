import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vp")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	field5544(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	field5543(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1735217611
	)
	public final int field5546;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1782117955
	)
	final int field5547;

	FillMode(int var3, int var4) {
		this.field5546 = var3;
		this.field5547 = var4;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5547;
	}
}
