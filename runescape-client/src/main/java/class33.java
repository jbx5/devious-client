import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bn")
public class class33 {
	@ObfuscatedName("jn")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1247328515
	)
	int field177;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -764887695
	)
	int field173;

	class33(int var1, int var2) {
		this.field177 = var1;
		this.field173 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbt;I)Z",
		garbageValue = "-1051519216"
	)
	boolean method490(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field177) {
			case 1:
				return var1.vmethod4418(this.field173);
			case 2:
				return var1.vmethod4460(this.field173);
			case 3:
				return var1.vmethod4420((char)this.field173);
			case 4:
				return var1.vmethod4422(this.field173 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1381424190"
	)
	public static void method495() {
		InvDefinition.InvDefinition_cached.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "459990555"
	)
	static int method494(int var0, Script var1, boolean var2) {
		Widget var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2022690739"
	)
	@Export("initCredentials")
	static void initCredentials() {
		HttpRequest.accessToken = System.getenv("JX_ACCESS_TOKEN");
		class4.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		ClanChannel.sessionId = System.getenv("JX_SESSION_ID");
		class60.characterId = System.getenv("JX_CHARACTER_ID");
		String var0 = System.getenv("JX_DISPLAY_NAME");
		Login.displayName = MidiPcmStream.method6176(var0);
	}
}
