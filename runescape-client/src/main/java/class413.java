import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pz")
public class class413 {
	@ObfuscatedName("ak")
	static char[] field4654;
	@ObfuscatedName("al")
	static char[] field4650;
	@ObfuscatedName("aj")
	static char[] field4651;
	@ObfuscatedName("az")
	static int[] field4652;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	static Bounds field4655;

	static {
		field4654 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4654[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4654[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4654[var0] = (char)(var0 + 48 - 52);
		}

		field4654[62] = '+';
		field4654[63] = '/';
		field4650 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4650[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4650[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4650[var0] = (char)(var0 + 48 - 52);
		}

		field4650[62] = '*';
		field4650[63] = '-';
		field4651 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4651[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4651[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4651[var0] = (char)(var0 + 48 - 52);
		}

		field4651[62] = '-';
		field4651[63] = '_';
		field4652 = new int[128];

		for (var0 = 0; var0 < field4652.length; ++var0) {
			field4652[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4652[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4652[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4652[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4652;
		field4652[43] = 62;
		var2[42] = 62;
		int[] var1 = field4652;
		field4652[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "678084481"
	)
	static int method7701(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
