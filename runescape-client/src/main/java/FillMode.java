import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public enum FillMode implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	field4810(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	field4814(2, 2);

	@ObfuscatedName("fq")
	@ObfuscatedGetter(
		intValue = 929632721
	)
	static int field4809;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -281576607
	)
	public final int field4812;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1146170719
	)
	final int field4813;

	FillMode(int var3, int var4) {
		this.field4812 = var3; // L: 19
		this.field4813 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4813; // L: 25
	}
}
