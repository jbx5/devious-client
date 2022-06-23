import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("lg")
public class class326 {
	@ObfuscatedName("rz")
	static boolean field4082;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llg;")
	static final class326 field4079;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llg;")
	static final class326 field4083;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llg;")
	static final class326 field4080;

	@ObfuscatedName("j")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;

	static {
		field4079 = new class326();
		field4083 = new class326();
		field4080 = new class326();
	}

	class326() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(CI)C", garbageValue = "-408398263")
	static char method6050(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}