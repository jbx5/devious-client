import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public class class330 implements Comparator {
	class330() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmu;Lmu;B)I",
		garbageValue = "1"
	)
	int method6197(class323 var1, class323 var2) {
		return var1.field3494 - var2.field3494;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6197((class323)var1, (class323)var2);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZB)I",
		garbageValue = "-1"
	)
	static int method6205(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			NPCComposition var6 = class190.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = class190.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3792(var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3794(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class190.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1170534602"
	)
	static void method6204(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
