import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class414 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -810247749
	)
	int field4582;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class414(int var1, boolean var2) {
		this.field4582 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "60"
	)
	public int method7832() {
		return this.field4582;
	}
}
