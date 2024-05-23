import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class323 {
	@ObfuscatedName("ja")
	@ObfuscatedGetter(
		intValue = 44592861
	)
	static int field3544;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)Ljava/lang/String;",
		garbageValue = "2006881842"
	)
	public static String method6188(Buffer var0) {
		return SoundCache.method864(var0, 32767);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "-28"
	)
	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
