import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public enum class6 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	field12(0, 0);

	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -192586663
	)
	final int field10;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1555852815
	)
	final int field11;

	class6(int var3, int var4) {
		this.field10 = var3;
		this.field11 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field11;
	}
}
