import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("df")
public enum class124 implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1519(3, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1522(0, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1521(1, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1520(4, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1523(2, 4);
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1199083661)
	public final int field1524;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2124972105)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1524 = var3;
		this.id = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(CB)Z", garbageValue = "123")
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-1560947837")
	static int method2768(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			User.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			EnumComposition var10 = WorldMapIcon_1.getEnum(var3);
			if (var10.outputType != 's') {
			}
			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}
			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}
			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				EnumComposition var4 = WorldMapIcon_1.getEnum(var3);
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			User.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			EnumComposition var7 = WorldMapIcon_1.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}
						var7 = null;
						break;
					}
				}
				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}
				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
				}
				return 1;
			}
		}
	}
}