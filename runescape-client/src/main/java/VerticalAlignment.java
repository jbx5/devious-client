import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jg")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field2619(1, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljg;"
	)
	field2618(0, 2);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1412075025
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1999280539
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
