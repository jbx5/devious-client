import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class143 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "-20"
	)
	public static void method3389(String[] var0, int[] var1) {
		HttpMethod.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1751582925"
	)
	public static int method3390() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}
}
