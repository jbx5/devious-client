import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qj")
public class class426 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "777593325"
	)
	static int method7946(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = HealthBarDefinition.widgetDefinition.method6285(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
		}

		class159.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class229.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
				class18.method290(var3, class229.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (var3.field3717 == null) {
					throw new RuntimeException("");
				} else {
					AbstractWorldMapData.method4899(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				DbTableType.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				if (var3.field3717 == null) {
					throw new RuntimeException("");
				} else {
					class306.method5915(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				if (var3.field3717 == null) {
					throw new RuntimeException("");
				} else {
					class302.method5906(var3, class229.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			DbTableType.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class214.ItemDefinition_get(var4);
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

			if (var3.field3684 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3684;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}
}
