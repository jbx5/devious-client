import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public class class356 {
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-29527757)

	static int field4185;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1300878569")

	static int method6582(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (PacketBufferNode.method5187(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (GrandExchangeOfferOwnWorldComparator.method1130(var3)) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (GrandExchangeOfferOwnWorldComparator.method1138(var3)) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}