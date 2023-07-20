import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class509 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 576167947
	)
	static final int field5054;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -235500959
	)
	static final int field5055;

	static {
		field5054 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5055 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZB)Ljava/lang/String;",
		garbageValue = "113"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? class327.method6113(var0, 10, var1) : Integer.toString(var0);
	}
}
