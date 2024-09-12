import java.util.Iterator;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("ft")
	public static String field4267;
	@ObfuscatedName("kw")
	public static String field4320;
	@ObfuscatedName("kq")
	public static String field4403;
	@ObfuscatedName("ky")
	public static String field4187;
	@ObfuscatedName("pw")
	@ObfuscatedGetter(
		intValue = 1043309719
	)
	static int field4449;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = 1529744005
	)
	static int field4450;

	static {
		field4267 = "Please visit the support page for assistance.";
		field4320 = "";
		field4403 = "Page has opened in the browser.";
		field4187 = "";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-161366658"
	)
	public static void method7442(int var0, int var1) {
		Iterator var2 = class334.field3623.iterator();

		while (var2.hasNext()) {
			class340 var3 = (class340)var2.next();
			var3.vmethod6713(var0, var1);
		}

	}
}
