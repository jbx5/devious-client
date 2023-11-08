import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class252 {
	@ObfuscatedName("gj")
	@ObfuscatedGetter(
		intValue = -1314320635
	)
	@Export("currentPort")
	static int currentPort;

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "8601"
	)
	public static void method4944() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}
}
