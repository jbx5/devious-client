import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ds")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2086760251
	)
	@Export("group")
	int group;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2035314843
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	boolean field1081;

	InterfaceParent() {
		this.field1081 = false;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1893248685"
	)
	public static int method2279(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-612957518"
	)
	static int method2277(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		}

		class218.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = VarbitComposition.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
				class160.method3278(var3, VarbitComposition.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (var3.field3704 == null) {
					throw new RuntimeException("");
				} else {
					ReflectionCheck.method710(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				SoundCache.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				if (var3.field3704 == null) {
					throw new RuntimeException("");
				} else {
					Tiles.method2242(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				if (var3.field3704 == null) {
					throw new RuntimeException("");
				} else {
					class135.method3052(var3, VarbitComposition.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			SoundCache.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = InvDefinition.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var6.isStackable == 1) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3702 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3702;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-104"
	)
	static int method2276(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
			SecureRandomFuture.method2151(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-59"
	)
	static void method2278() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class92.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}
}
