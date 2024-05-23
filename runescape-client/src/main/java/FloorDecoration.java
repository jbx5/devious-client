import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2036021473
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1144628483
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2027200960
	)
	@Export("y")
	int y;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 3445693261772232823L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1918367719
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-643853821"
	)
	static final int method4666(int var0, int var1) {
		int var2 = UserComparator6.method3021(var0 - 1, var1 - 1) + UserComparator6.method3021(1 + var0, var1 - 1) + UserComparator6.method3021(var0 - 1, var1 + 1) + UserComparator6.method3021(1 + var0, 1 + var1);
		int var3 = UserComparator6.method3021(var0 - 1, var1) + UserComparator6.method3021(var0 + 1, var1) + UserComparator6.method3021(var0, var1 - 1) + UserComparator6.method3021(var0, 1 + var1);
		int var4 = UserComparator6.method3021(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "418571588"
	)
	static int method4667(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.indexCheck.method4450(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.indexCheck.method4419(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
