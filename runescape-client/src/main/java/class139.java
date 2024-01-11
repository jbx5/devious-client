import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public enum class139 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1611(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1613(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1609(2, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1610(3, 3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1607(4, 4),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1612(5, 5),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1608(6, 6),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1614(7, 7),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	field1615(8, 8);

	@ObfuscatedName("bd")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 583594835
	)
	final int field1616;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 492789235
	)
	final int field1617;

	class139(int var3, int var4) {
		this.field1616 = var3;
		this.field1617 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1617;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-30"
	)
	static int method3189(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--UserComparator6.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class219.method4339(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			UserComparator6.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class425.method7990(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
