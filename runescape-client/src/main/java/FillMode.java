import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vr")
@Implements("FillMode")
public enum FillMode implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	field5464(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvr;"
	)
	field5461(2, 2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -791127237
	)
	public final int field5463;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1351523445
	)
	final int field5465;

	FillMode(int var3, int var4) {
		this.field5463 = var3;
		this.field5465 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5465;
	}
}
