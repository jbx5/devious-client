import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class239 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lia;")

	static final class239 field2823;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lia;")

	static final class239 field2819;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lmr;")

	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1289934013)

	@Export("value")
	final int value;
	static 
	{
		field2823 = new class239(0);
		field2819 = new class239(1);
	}

	class239(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"1230087081")

	public static boolean method4998(int var0) {
		return ((var0 >> 29) & 1) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1849384967")

	static int method4999(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++class295.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			ChatChannel.Interpreter_stringStackSize += 2;
			return 1;
		} else if (((((var0 != 7102) && (var0 != 7103)) && (var0 != 7104)) && (var0 != 7105)) && (var0 != 7109)) {
			if (var0 == 7106) {
				++class295.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++class295.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class230.method4890()) ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--class295.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				class295.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				class295.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++class295.Interpreter_intStackSize;
			return 1;
		}
	}
}