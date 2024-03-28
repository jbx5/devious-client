import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
public enum class370 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4324(-1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4320(0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4321(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	field4319(2);

	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1262682605
	)
	final int field4322;

	class370(int var3) {
		this.field4322 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4322;
	}

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-574157606"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
