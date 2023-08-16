import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
public class class395 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -482776237
	)
	int field4471;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class395(int var1, boolean var2) {
		this.field4471 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "28670"
	)
	public int method7419() {
		return this.field4471;
	}
}
