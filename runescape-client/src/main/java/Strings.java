import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fs")
	public static String field4044;
	@ObfuscatedName("kl")
	public static String field4176;
	@ObfuscatedName("kk")
	public static String field4177;
	@ObfuscatedName("kc")
	public static String field4178;

	static {
		field4044 = "Please visit the support page for assistance.";
		field4176 = "";
		field4177 = "Page has opened in the browser.";
		field4178 = "";
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "64"
	)
	static final void method6621(String var0) {
		UserComparator8.method2870(var0 + " is already on your friend list");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-116"
	)
	static final int method6622(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
