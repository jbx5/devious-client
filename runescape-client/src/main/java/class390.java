import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
public final class class390 {
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	public static class369 field4441;
	@ObfuscatedName("au")
	final Object field4440;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1645243627
	)
	int field4439;

	class390(Object var1, int var2) {
		this.field4440 = var1;
		this.field4439 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)I",
		garbageValue = "-490718469"
	)
	static int method7221(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var0.method6407(var1);
			return 1;
		}
	}
}
