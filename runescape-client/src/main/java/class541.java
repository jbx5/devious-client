import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
public enum class541 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("SOLID")
	SOLID(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	field5221(1, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	field5222(2, 2);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1285038799
	)
	public final int field5223;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -732230309
	)
	final int field5224;

	class541(int var3, int var4) {
		this.field5223 = var3;
		this.field5224 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5224;
	}
}
