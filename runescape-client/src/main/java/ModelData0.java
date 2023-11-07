import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("ModelData0")
public class ModelData0 {
	ModelData0() {
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "384222635"
	)
	static int method5818(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--DbTableType.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class422.method7907(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			DbTableType.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class421.method7884(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hs")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1205269572"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}
}
