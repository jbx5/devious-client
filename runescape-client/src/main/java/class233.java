import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class233 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1214006285
	)
	int field2507;

	@ObfuscatedSignature(
		descriptor = "(Ljr;I)V"
	)
	public class233(class238 var1, int var2) {
		this.field2507 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method4493() {
		return this.field2507;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3179692"
	)
	public static void method4496() {
		class203.field2007.clear();
	}
}
