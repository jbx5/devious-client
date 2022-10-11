import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1921(1, 0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lfy;"
	)
	field1927(0, 2);

	@ObfuscatedName("ek")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static Archive field1926;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1423068571
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 2111839571
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3; // L: 18
		this.id = var4; // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 24
	}
}
