import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("px")
public class class403 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static final class403 field4689;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static final class403 field4687;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static final class403 field4688;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	static final class403 field4686;

	static {
		field4689 = new class403();
		field4687 = new class403();
		field4688 = new class403();
		field4686 = new class403();
	}

	class403() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1141784791"
	)
	static int method7840(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.method7409() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return DynamicObject.method2461(var3);
		} else {
			return var0 == 1709 ? SecureRandomCallable.method2521(var3) : 2;
		}
	}
}
