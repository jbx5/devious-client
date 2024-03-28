import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class415 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -795795573
	)
	int field4604;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class415(int var1, boolean var2) {
		this.field4604 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1088158396"
	)
	public int method7647() {
		return this.field4604;
	}
}
