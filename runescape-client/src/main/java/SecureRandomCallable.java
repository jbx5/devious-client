import java.util.concurrent.Callable;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -883666811
	)
	static int field1053;

	SecureRandomCallable() {
	}

	public Object call() {
		return class326.method6528();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-593584825"
	)
	public static int method2529(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)I",
		garbageValue = "1943486547"
	)
	static int method2521(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var0.method7435(var1);
			return 1;
		}
	}
}
