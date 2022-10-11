import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class358 {
	@ObfuscatedName("x")
	public static short[][] field4279;

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lqq;[IB)[Ljava/lang/Object;",
		garbageValue = "-11"
	)
	static Object[] method6730(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class434 var7 = class360.method6732(var1[var5]); // L: 35
				var3[var6] = var7.method7778(var0); // L: 36
			}
		}

		return var3; // L: 39
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "43"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 66
		if (var1 == null) { // L: 67
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 68 69
		}
	}
}
