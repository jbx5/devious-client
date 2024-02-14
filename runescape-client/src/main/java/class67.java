import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cv")
public class class67 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field519;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field495;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field496;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field497;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field498;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field499;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field500;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field494;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field502;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field503;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field504;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field505;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field511;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field506;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field501;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field509;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field518;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field508;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field512;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field513;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field507;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field515;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field516;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field517;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcv;"
	)
	static final class67 field514;

	static {
		field519 = new class67();
		field495 = new class67();
		field496 = new class67();
		field497 = new class67();
		field498 = new class67();
		field499 = new class67();
		field500 = new class67();
		field494 = new class67();
		field502 = new class67();
		field503 = new class67();
		field504 = new class67();
		field505 = new class67();
		field511 = new class67();
		field506 = new class67();
		field501 = new class67();
		field509 = new class67();
		field518 = new class67();
		field508 = new class67();
		field512 = new class67();
		field513 = new class67();
		field507 = new class67();
		field515 = new class67();
		field516 = new class67();
		field517 = new class67();
		field514 = new class67();
	}

	class67() {
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
