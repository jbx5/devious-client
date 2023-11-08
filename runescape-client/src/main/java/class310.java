import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class310 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		longValue = 8209621284057925845L
	)
	static long field3388;

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)I",
		garbageValue = "1270605570"
	)
	static int method5938(Widget var0) {
		if (var0.type != 11) {
			--class127.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var0.method6677(var1);
			return 1;
		}
	}
}
