import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
@Implements("FillMode")
public enum FillMode implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	field5220(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	field5222(2, 2);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1892074699
	)
	public final int field5221;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1671352301
	)
	final int field5224;

	FillMode(int var3, int var4) {
		this.field5221 = var3;
		this.field5224 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5224;
	}
}
