import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("lj")
public class class321 {
	@ObfuscatedName("uk")
	@ObfuscatedSignature(descriptor = "Lbg;")
	@Export("friendSystem")
	public static FriendSystem friendSystem;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(ILbz;ZB)I", garbageValue = "100")
	static int method5912(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (VarbitComposition.method3501(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class301.method5664(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class78.method2054(var3)) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}