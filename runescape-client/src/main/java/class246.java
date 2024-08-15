import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jx")
public class class246 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field2100")
	static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("gt")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lob;Ljava/lang/String;Ljava/lang/String;I)[Lvc;",
		garbageValue = "-1300282080"
	)
	public static SpritePixels[] method4966(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return Timer.method8427(var0, var3, var4);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "-55"
	)
	static int method4970(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
		}

		class416.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class253.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				var3.method7045(class253.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field3861 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3861.method6590(var4);
					return 1;
				}
			} else if (var0 == 1209) {
				Interpreter.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3.field3861 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3861.method6589(var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field3861 == null) {
					throw new RuntimeException("");
				} else {
					var3.field3861.method6587(class253.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = Player.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3808 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3808;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "62"
	)
	public static String method4971(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}
}
