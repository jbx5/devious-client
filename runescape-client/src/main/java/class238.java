import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class238 {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-27"
	)
	static String method4767() {
		String var0;
		if (class449.clientPreferences.method2454()) {
			String var2 = Login.Login_username;
			String var1 = class270.method5493('*', var2.length());
			var0 = var1;
		} else {
			var0 = Login.Login_username;
		}

		return var0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1067657553"
	)
	public static boolean method4765(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-50"
	)
	static int method4766(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field674.method4120(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field674.method4110(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field674.method4105(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
