import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("io")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1091037229)
	@Export("width")
	int width;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -263102101)
	@Export("height")
	int height;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1407371269)
	@Export("x")
	int x;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -673708259)
	@Export("y")
	int y;

	@ObfuscatedSignature(descriptor = "Lha;")
	final WorldMapManager this$0;

	@ObfuscatedSignature(descriptor = "(Lha;)V")
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-1372033756")
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IS)Z", garbageValue = "663")
	public static boolean method4966(int var0) {
		return (var0 >> 22 & 1) != 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "-22")
	static int method4964(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
		} else {
			var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		}
		class220.invalidateWidget(var3);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class28.localPlayer.appearance.getChatHeadId();
				return 1;
			} else {
				return 2;
			}
		} else {
			TaskHandler.Interpreter_intStackSize -= 2;
			int var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
			int var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = class258.ItemDefinition_get(var4);
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
			if (var3.field3421 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3421;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}
			return 1;
		}
	}
}