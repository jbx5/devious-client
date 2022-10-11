import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dd")
public class class127 extends class129 {
	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static class429 HitSplatDefinition_cachedSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = 8032391392508483815L
	)
	long field1553;
	@ObfuscatedName("p")
	String field1552;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class127(class132 var1) {
		this.this$0 = var1;
		this.field1553 = -1L; // L: 74
		this.field1552 = null; // L: 75
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 80
			--var1.offset; // L: 81
			this.field1553 = var1.readLong(); // L: 82
		}

		this.field1552 = var1.readStringCp1252NullTerminatedOrNull(); // L: 84
	} // L: 85

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3117(this.field1553, this.field1552, 0); // L: 88
	} // L: 89

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-1440587934"
	)
	static int method2992(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 1236
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1237
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = SoundCache.Widget_unpackTargetMask(class97.getWidgetFlags(var3)); // L: 1238
			return 1; // L: 1239
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1241
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1248
				if (var3.dataText == null) { // L: 1249
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1250
				}

				return 1; // L: 1251
			} else {
				return 2; // L: 1253
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1242
			--var4; // L: 1243
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1244
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1245
			} else {
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1246
		}
	}
}
