import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class436 {
	@ObfuscatedName("ae")
	public static String field4791;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1750296731
	)
	int field4792;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class436(int var1, boolean var2) {
		this.field4792 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1082197733"
	)
	public int method8417() {
		return this.field4792;
	}
}
