import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public final class class347 {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1428903067
	)
	public static int field4205;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -582353665
	)
	static int field4201;
	@ObfuscatedName("c")
	final Object field4204;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 661897961
	)
	int field4206;

	class347(Object var1, int var2) {
		this.field4204 = var1; // L: 170
		this.field4206 = var2; // L: 171
	} // L: 172

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1566177198"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-884152245"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		return var1 && var0 >= 0 ? AccessFile.method7683(var0, 10, var1) : Integer.toString(var0); // L: 106 107
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I)I",
		garbageValue = "389867560"
	)
	static int method6510(Widget var0) {
		if (var0.type != 11) { // L: 1226
			Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 1227
			return 1; // L: 1228
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1230
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var0.method5792(var1); // L: 1231
			return 1; // L: 1232
		}
	}
}
