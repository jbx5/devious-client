import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
@Implements("LoginState")
public class LoginState {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field519;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field495;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field496;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field497;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field498;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field499;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field500;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field494;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field502;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field503;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field504;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field505;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field511;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field506;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field501;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field509;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field518;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field508;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field512;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field513;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field507;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field515;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field516;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field517;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final LoginState field514;

	static {
		field519 = new LoginState();
		field495 = new LoginState();
		field496 = new LoginState();
		field497 = new LoginState();
		field498 = new LoginState();
		field499 = new LoginState();
		field500 = new LoginState();
		field494 = new LoginState();
		field502 = new LoginState();
		field503 = new LoginState();
		field504 = new LoginState();
		field505 = new LoginState();
		field511 = new LoginState();
		field506 = new LoginState();
		field501 = new LoginState();
		field509 = new LoginState();
		field518 = new LoginState();
		field508 = new LoginState();
		field512 = new LoginState();
		field513 = new LoginState();
		field507 = new LoginState();
		field515 = new LoginState();
		field516 = new LoginState();
		field517 = new LoginState();
		field514 = new LoginState();
	}

	LoginState() {
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1635168506"
	)
	static int method1207(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "689752090"
	)
	static void method1206() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (ArchiveLoader.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = ArchiveLoader.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = ArchiveLoader.widgetDefinition.method6431(var4);
					if (var5 != null) {
						UserComparator5.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
