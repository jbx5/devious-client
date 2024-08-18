import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class434 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1304685955
	)
	int field4743;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class434(int var1, boolean var2) {
		this.field4743 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2024160359"
	)
	public int method8151() {
		return this.field4743;
	}
}
