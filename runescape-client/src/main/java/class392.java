import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public enum class392 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4462(1, 1),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4457(0, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4458(2, 3),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4459(3, 10);

	@ObfuscatedName("ik")
	@ObfuscatedGetter(
		intValue = 1324658111
	)
	static int field4456;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -501705567
	)
	final int field4460;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -759638905
	)
	final int field4461;

	class392(int var3, int var4) {
		this.field4460 = var3; // L: 20
		this.field4461 = var4; // L: 21
	} // L: 22

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4461; // L: 26
	}
}
