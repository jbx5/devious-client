import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public enum class468 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	field4808(0, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	field4806(2, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	field4811(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	field4805(1, 10);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -999727485
	)
	final int field4809;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1026791841
	)
	final int field4810;

	class468(int var3, int var4) {
		this.field4809 = var3;
		this.field4810 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4810;
	}
}
