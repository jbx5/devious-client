import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("Sound")
public class Sound {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1441315811
	)
	public int field2725;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1389220479
	)
	public int field2724;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 789342773
	)
	public int field2727;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 874354341
	)
	public int field2726;

	Sound(int var1, int var2, int var3, int var4) {
		this.field2725 = 0;
		this.field2724 = 0;
		this.field2727 = 0;
		this.field2726 = 0;
		this.field2725 = var1;
		this.field2724 = var2;
		this.field2727 = var3;
		this.field2726 = var4;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-397214552"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9';
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-442569072"
	)
	static int method5108(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.indexCheck.method5357(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.indexCheck.method5373(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
