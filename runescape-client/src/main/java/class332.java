import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class332 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("clock")
	static Clock clock;

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1427775858"
	)
	static int method6542(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field891 - 7.0D) * 256.0D);
	}
}
