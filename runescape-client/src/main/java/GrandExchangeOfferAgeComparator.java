import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("ls")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1960141359)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llf;Llf;I)I", garbageValue = "-1806719897")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : var1.age == var2.age ? 0 : 1;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)J", garbageValue = "1434117280")
	public static long method6010(CharSequence var0) {
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