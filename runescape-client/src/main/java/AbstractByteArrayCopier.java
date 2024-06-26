import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("np")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-7"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1806958833"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lnx;I)I",
		garbageValue = "1352728934"
	)
	static int method7026(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var0.method6942(var1);
			return 1;
		}
	}
}
