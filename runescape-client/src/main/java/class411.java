import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pi")
public class class411 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1242749267
	)
	int field4543;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class411(int var1, boolean var2) {
		this.field4543 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-94"
	)
	public int method7743() {
		return this.field4543;
	}
}
