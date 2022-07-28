import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kn")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("cl")
	public static String field3728 = "Please visit the support page for assistance.";

	@ObfuscatedName("ec")
	public static String field3725 = "Please visit the support page for assistance.";

	@ObfuscatedName("ku")
	public static String field3913 = "";

	@ObfuscatedName("kv")
	public static String field3887 = "Page has opened in a new window.";

	@ObfuscatedName("kg")
	public static String field3863 = "(Please check your popup blocker.)";

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;IZI)I", garbageValue = "436171263")
	public static int method5775(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();
			for (int var7 = 0; var7 < var6; ++var7) {
				int var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == 45) {
						var3 = true;
						continue;
					}
					if (var8 == 43) {
						continue;
					}
				}
				if (var8 >= 48 && var8 <= 57) {
					var8 -= 48;
				} else if (var8 >= 65 && var8 <= 90) {
					var8 -= 55;
				} else {
					if (var8 < 97 || var8 > 122) {
						throw new NumberFormatException();
					}
					var8 -= 87;
				}
				if (var8 >= var1) {
					throw new NumberFormatException();
				}
				if (var3) {
					var8 = -var8;
				}
				int var9 = var5 * var1 + var8;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}
				var5 = var9;
				var4 = true;
			}
			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = "(Lcz;III)V", garbageValue = "-1228075316")
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class14.SequenceDefinition_get(var1).field2175;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1174 = 0;
			}
			if (var3 == 2) {
				var0.field1174 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class14.SequenceDefinition_get(var1).field2168 >= class14.SequenceDefinition_get(var0.sequence).field2168) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1174 = 0;
			var0.field1203 = var0.pathLength;
		}
	}
}