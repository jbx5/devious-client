import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class264 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3046;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3047;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3057;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3054;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3049;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3051;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3052;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3053;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3056;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3055;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ljw;"
	)
	public static final class264 field3050;

	static {
		field3046 = new class264(15); // L: 5
		field3047 = new class264(5); // L: 6
		field3057 = new class264(6); // L: 7
		field3054 = new class264(14); // L: 8
		field3049 = new class264(3); // L: 9
		field3051 = new class264(4); // L: 10
		field3052 = new class264(7); // L: 11
		field3053 = new class264(2); // L: 12
		field3056 = new class264(5); // L: 13
		field3055 = new class264(4); // L: 14
		field3050 = new class264(5); // L: 15
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "15"
	)
	class264(int var1) {
	} // L: 21

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I)Z",
		garbageValue = "-2102361500"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) { // L: 10455
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) { // L: 10456
				int var2 = ReflectionCheck.method648(var0, var1); // L: 10457
				int var3 = var0.cs1ComparisonValues[var1]; // L: 10458
				if (var0.cs1Comparisons[var1] == 2) { // L: 10459
					if (var2 >= var3) { // L: 10460
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) { // L: 10462
					if (var2 <= var3) { // L: 10463
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) { // L: 10465
					if (var2 == var3) { // L: 10466
						return false;
					}
				} else if (var3 != var2) { // L: 10468
					return false;
				}
			}

			return true; // L: 10470
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1968082006"
	)
	static final void method5345(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11617
		Player.clientPreferences.method2405(var0); // L: 11618
	} // L: 11619
}
