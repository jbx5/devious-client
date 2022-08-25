import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("er")
public class class154 extends class165 {
	@ObfuscatedName("s")
	String field1699;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;Ljava/lang/String;Ljava/lang/String;)V")
	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1699 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2051475580")
	public int vmethod3237() {
		return 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "-91")
	public String vmethod3250() {
		return this.field1699;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lkn;I)I", garbageValue = "1587324314")
	static int method3103(Widget var0) {
		if (var0.type != 11) {
			--UserComparator8.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var0.method5552(var1);
			return 1;
		}
	}
}