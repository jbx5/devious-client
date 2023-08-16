import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public enum class89 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1113(0, -1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1107(1, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1106(2, 7),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1109(3, 8),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	field1115(4, 9);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1282500441
	)
	final int field1111;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -423643843
	)
	final int field1110;

	class89(int var3, int var4) {
		this.field1111 = var3;
		this.field1110 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1110;
	}
}
