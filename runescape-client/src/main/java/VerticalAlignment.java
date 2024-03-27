import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	field2156(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(2, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	field2150(1, 2);

	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1517045021
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 618118699
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1527744421"
	)
	public static final synchronized long method3924() {
		long var0 = System.currentTimeMillis();
		if (var0 < class317.field3472) {
			class317.field3470 += class317.field3472 - var0;
		}

		class317.field3472 = var0;
		return class317.field3470 + var0;
	}
}
