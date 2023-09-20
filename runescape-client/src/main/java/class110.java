import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class110 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1400;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1401;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1388;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1402;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1387;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1386;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1392;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1393;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1394;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1390;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1396;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1397;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1398;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1399;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1404;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	static final class110 field1389;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1975980019
	)
	int field1391;

	static {
		field1400 = new class110(0);
		field1401 = new class110(1);
		field1388 = new class110(2);
		field1402 = new class110(3);
		field1387 = new class110(4);
		field1386 = new class110(5);
		field1392 = new class110(6);
		field1393 = new class110(7);
		field1394 = new class110(8);
		field1390 = new class110(9);
		field1396 = new class110(10);
		field1397 = new class110(11);
		field1398 = new class110(12);
		field1399 = new class110(13);
		field1404 = new class110(14);
		field1389 = new class110(15);
	}

	class110(int var1) {
		this.field1391 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnm;I)I",
		garbageValue = "48072594"
	)
	static int method2752(Widget var0) {
		if (var0.type != 11) {
			--class180.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6641(var1);
			return 1;
		}
	}
}
