import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("c")
	@Export("Messages_channels")
	static final Map Messages_channels;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -513745227
	)
	@Export("Messages_count")
	static int Messages_count;
	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;

	static {
		Messages_channels = new HashMap(); // L: 9
		Messages_hashTable = new IterableNodeHashTable(1024); // L: 10
		Messages_queue = new IterableDualNodeQueue(); // L: 11
		Messages_count = 0; // L: 12
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "28"
	)
	static String method2651(byte[] var0, int var1, int var2) {
		StringBuilder var3 = new StringBuilder(); // L: 62

		for (int var4 = var1; var4 < var2 + var1; var4 += 3) { // L: 63
			int var5 = var0[var4] & 255; // L: 64
			var3.append(class343.field4188[var5 >>> 2]); // L: 65
			if (var4 < var2 - 1) { // L: 66
				int var6 = var0[var4 + 1] & 255; // L: 67
				var3.append(class343.field4188[(var5 & 3) << 4 | var6 >>> 4]); // L: 68
				if (var4 < var2 - 2) { // L: 69
					int var7 = var0[var4 + 2] & 255; // L: 70
					var3.append(class343.field4188[(var6 & 15) << 2 | var7 >>> 6]).append(class343.field4188[var7 & 63]); // L: 71
				} else {
					var3.append(class343.field4188[(var6 & 15) << 2]).append("="); // L: 73
				}
			} else {
				var3.append(class343.field4188[(var5 & 3) << 4]).append("=="); // L: 75
			}
		}

		return var3.toString(); // L: 77
	}
}
