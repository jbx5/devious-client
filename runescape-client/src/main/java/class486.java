import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
public enum class486 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	field5006(2, 1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	field5009(0, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	field5008(1, 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	field5010(3, 10);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1355997077
	)
	final int field5012;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -721672707
	)
	final int field5011;

	class486(int var3, int var4) {
		this.field5012 = var3;
		this.field5011 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5011;
	}
}
