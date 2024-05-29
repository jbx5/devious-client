import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public class class238 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	public static final class238 field2538;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljr;"
	)
	public static final class238 field2537;
	@ObfuscatedName("sh")
	static boolean field2539;

	static {
		field2538 = new class238(-1);
		field2537 = new class238(1);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1"
	)
	class238(int var1) {
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)Z",
		garbageValue = "1329341436"
	)
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = FontName.method9303(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var2 == var3) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}

			return true;
		}
	}
}
