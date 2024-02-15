import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class193 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2030;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2026;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2027;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2028;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2029;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2025;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class193 field2031;
	@ObfuscatedName("bj")
	@Export("client")
	@ObfuscatedSignature(
		descriptor = "Lclient;"
	)
	public static Client client;

	static {
		field2030 = new class193(0, class207.field2283);
		field2026 = new class193(1, class207.field2280);
		field2027 = new class193(2, class207.field2279);
		field2028 = new class193(3, class207.field2287);
		field2029 = new class193(4, class207.field2284);
		field2025 = new class193(5, class207.field2281);
		field2031 = new class193(6, class207.field2285);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhz;)V"
	)
	class193(int var1, class207 var2) {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "268030870"
	)
	static boolean method3782(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1788920585"
	)
	public static void method3781() {
		synchronized(ArchiveDiskActionHandler.field4365) {
			if (ArchiveDiskActionHandler.field4362 != 0) {
				ArchiveDiskActionHandler.field4362 = 1;
				ArchiveDiskActionHandler.field4363 = true;

				try {
					ArchiveDiskActionHandler.field4365.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "15"
	)
	static int method3783(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = ArchiveLoader.widgetDefinition.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		}

		UserComparator5.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = VarpDefinition.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
				AsyncRestClient.method161(var3, VarpDefinition.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field3774 == null) {
					throw new RuntimeException("");
				} else {
					UserComparator8.method2942(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				Interpreter.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3.field3774 == null) {
					throw new RuntimeException("");
				} else {
					class158.method3402(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var3.field3774 == null) {
					throw new RuntimeException("");
				} else {
					WorldMapElement.method3580(var3, VarpDefinition.localPlayer.appearance.gender, var4);
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
			ItemComposition var6 = ArchiveDiskActionHandler.ItemDefinition_get(var4);
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

			if (var3.field3781 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3781;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}
}
