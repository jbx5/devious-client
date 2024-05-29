import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class415 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field4660;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lcl;"
	)
	@Export("World_worlds")
	static World[] World_worlds;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "11"
	)
	static void method7750(int var0) {
		class423.field4693 = var0;
		class423.field4691 = new class423[var0];
		AccessFile.field5239 = 0;
	}
}
