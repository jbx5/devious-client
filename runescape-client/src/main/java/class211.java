import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class211 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1696727415
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lnc;I)V",
		garbageValue = "-816241909"
	)
	public static void method4228(Huffman var0) {
		class353.huffman = var0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1178349206"
	)
	static int method4229(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}
}
