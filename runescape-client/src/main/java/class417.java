import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class417 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	public class422 field4667;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	public class421 field4668;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	public class421 field4669;

	public class417() {
		this.field4667 = new class422();
		this.field4668 = new class421();
		this.field4669 = new class421(1.0F, 1.0F, 1.0F);
	}

	public String toString() {
		return "[" + this.field4667.toString() + "|" + this.field4668.toString() + "|" + this.field4669.toString() + "]";
	}

	public int hashCode() {
		boolean var1 = true;
		byte var2 = 1;
		int var3 = var2 * 31 + this.field4667.hashCode();
		var3 = 31 * var3 + this.field4668.hashCode();
		var3 = 31 * var3 + this.field4669.hashCode();
		return var3;
	}

	public boolean equals(Object var1) {
		if (var1 == null) {
			return false;
		} else if (this == var1) {
			return true;
		} else if (!(var1 instanceof class417)) {
			return false;
		} else {
			class417 var2 = (class417)var1;
			return this.field4667.equals(var2.field4667) && this.field4668.method7798(var2.field4668) && this.field4669.method7798(var2.field4669);
		}
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-60"
	)
	static int method7760(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--class13.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class332.method6430(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			class13.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class446.method8344(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
