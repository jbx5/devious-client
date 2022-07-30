import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("gj")
public class class201 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "[Ldo;")
	class115[] field2356;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 222817089)
	int field2357;

	@ObfuscatedSignature(descriptor = "(Lqw;I)V")
	class201(Buffer var1, int var2) {
		this.field2356 = new class115[var2];
		this.field2357 = var1.readUnsignedByte();
		for (int var3 = 0; var3 < this.field2356.length; ++var3) {
			class115 var4 = new class115(this.field2357, var1, false);
			this.field2356[var3] = var4;
		}
		this.method4080();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1812745146")
	void method4080() {
		class115[] var1 = this.field2356;
		for (int var2 = 0; var2 < var1.length; ++var2) {
			class115 var3 = var1[var2];
			if (var3.field1406 >= 0) {
				var3.field1405 = this.field2356[var3.field1406];
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "815727117")
	public int method4091() {
		return this.field2356.length;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)Ldo;", garbageValue = "2068313172")
	class115 method4098(int var1) {
		return this.field2356[var1];
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(B)[Ldo;", garbageValue = "-71")
	class115[] method4083() {
		return this.field2356;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ldj;II)V", garbageValue = "363132792")
	void method4084(class122 var1, int var2) {
		this.method4085(var1, var2, ((boolean[]) (null)), false);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ldj;I[ZZI)V", garbageValue = "-1144276391")
	void method4085(class122 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2827();
		int var6 = 0;
		class115[] var7 = this.method4083();
		for (int var8 = 0; var8 < var7.length; ++var8) {
			class115 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method2829(var2, var9, var6, var5);
			}
			++var6;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "554768114")
	public static boolean method4100(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1432343073")
	static int method4089(int var0, Script var1, boolean var2) {
		if (var0 >= 7200 && var0 < 7204) {
			TaskHandler.Interpreter_intStackSize -= 5;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7204) {
			TaskHandler.Interpreter_intStackSize -= 6;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7205 && var0 < 7209) {
			Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 == 7209) {
			TaskHandler.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else if (var0 >= 7210 && var0 < 7214) {
			--TaskHandler.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7214) {
			TaskHandler.Interpreter_intStackSize -= 2;
			return 1;
		} else {
			return 2;
		}
	}
}