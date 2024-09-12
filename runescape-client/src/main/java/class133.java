import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class133 {
	@ObfuscatedName("am")
	public static final float field1561;
	@ObfuscatedName("ax")
	public static final float field1565;

	static {
		field1561 = Math.ulp(1.0F);
		field1565 = 2.0F * field1561;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfu;",
		garbageValue = "-109"
	)
	static class139 method3273(int var0) {
		class139[] var1 = new class139[]{class139.field1638, class139.field1650, class139.field1639, class139.field1656, class139.field1646, class139.field1642, class139.field1637, class139.field1644, class139.field1641, class139.field1645, class139.field1643, class139.field1648, class139.field1649, class139.field1640, class139.field1647, class139.field1652, class139.field1653};
		class139 var2 = (class139)ArchiveDiskAction.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class139.field1638;
		}

		return var2;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1298079788"
	)
	static int method3274(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--class320.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class132.method3256(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			class320.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class450.method8628(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
