import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
public class class234 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 464194777
	)
	int field2487;

	@ObfuscatedSignature(
		descriptor = "(Lju;I)V"
	)
	class234(class239 var1, int var2) {
		this.field2487 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1472171673"
	)
	public int method4447() {
		return this.field2487;
	}
}
