import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mj")
public class class317 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "766976833"
	)
	static int method6089(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
		}

		TriBool.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = SoundCache.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
				MusicPatchPcmStream.method6417(var3, SoundCache.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (var3.field3838 == null) {
					throw new RuntimeException("");
				} else {
					class233.method4446(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				class130.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				if (var3.field3838 == null) {
					throw new RuntimeException("");
				} else {
					class95.method2467(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (var3.field3838 == null) {
					throw new RuntimeException("");
				} else {
					class225.method4302(var3, SoundCache.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			class130.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class164.ItemDefinition_get(var4);
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

			if (var3.field3887 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3887;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}
}
