


import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
public class class160 {
	@ObfuscatedName("ps")
	@ObfuscatedSignature(descriptor = 
	"Lcj;")

	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lcw;")

	public UrlRequest field1737;
	@ObfuscatedName("c")
	public float[] field1735;

	@ObfuscatedSignature(descriptor = 
	"Lev;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lev;)V")

	class160(class155 var1) {
		this.this$0 = var1;
		this.field1735 = new float[4];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-1437558717")

	static int method3279(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.getWindowedMode();
			return 1;
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if ((var3 == 1) || (var3 == 2)) {
					class131.setWindowedMode(var3);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class131.clientPreferences.method2251();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == 5310) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5311) {
					Interpreter.Interpreter_intStackSize -= 2;
					return 1;
				} else if (var0 == 5312) {
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5350) {
					class122.Interpreter_stringStackSize -= 2;
					--Interpreter.Interpreter_intStackSize;
					return 1;
				} else if (var0 == 5351) {
					--class122.Interpreter_stringStackSize;
					return 1;
				} else {
					return 2;
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if ((var3 == 1) || (var3 == 2)) {
					class131.clientPreferences.method2250(var3);
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)Ljava/lang/String;", garbageValue = 
	"-75")

	static String method3280(String var0) {
		PlayerType[] var1 = WorldMapManager.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if ((var3.modIcon != (-1)) && var0.startsWith(Script.method1990(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}