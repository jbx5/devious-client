import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("mx")
public final class class339 {
	@ObfuscatedName("rx")
	@ObfuscatedSignature(descriptor = "Lqg;")
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)J", garbageValue = "2080916438")
	static long method6244(CharSequence var0) {
		long var1 = 0L;
		int var3 = var0.length();
		for (int var4 = 0; var4 < var3; ++var4) {
			var1 *= 37L;
			char var5 = var0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += ((long) (var5 + 1 - 65));
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += ((long) (var5 + 1 - 97));
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += ((long) (var5 + 27 - 48));
			}
			if (var1 >= 177917621779460413L) {
				break;
			}
		}
		while (var1 % 37L == 0L && 0L != var1) {
			var1 /= 37L;
		} 
		return var1;
	}
}