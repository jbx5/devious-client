import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public final class class398 {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "65535"
	)
	static int method7349(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field884 - 7.0D) * 256.0D);
	}
}
