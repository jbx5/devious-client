import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class328 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static final class328 field4130;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static final class328 field4129;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	static final class328 field4127;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 253333673
	)
	static int field4128;

	static {
		field4130 = new class328(); // L: 4
		field4129 = new class328(); // L: 5
		field4127 = new class328(); // L: 6
	}

	class328() {
	} // L: 8

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1937226628"
	)
	public static boolean method6220(int var0) {
		return (var0 >> 28 & 1) != 0; // L: 33
	}
}
