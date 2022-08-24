import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
@ObfuscatedName("fg")
public abstract class class165 {
	@ObfuscatedName("v")
	String field1783;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;Ljava/lang/String;)V")
	class165(class155 var1, String var2) {
		this.this$0 = var1;
		this.field1783 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2051475580")
	public abstract int vmethod3237();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "-91")
	public String vmethod3250() {
		return null;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1570944667")
	public int vmethod3239() {
		return -1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "293520700")
	public String method3238() {
		return this.field1783;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-389831112")
	static int method3253(int var0, Script var1, boolean var2) {
		Widget var3 = HitSplatDefinition.getWidget(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}