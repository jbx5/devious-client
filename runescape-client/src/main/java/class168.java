

import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class168 {
	@ObfuscatedName("i")
	public short[] field1791;
	@ObfuscatedName("f")
	public short[] field1790;

	class168(int var1) {
		ItemComposition var2 = class19.ItemDefinition_get(var1);
		if (var2.method3722()) {
			this.field1791 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1791, 0, this.field1791.length);
		}

		if (var2.method3708()) {
			this.field1790 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1790, 0, this.field1790.length);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"-32")

	static int method3353(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			Interpreter.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class127.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if ((var11 > 0) && (var6.children[var11 - 1] == null)) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					var6.children[var11] = var12;
					if (var2) {
						WorldMapID.scriptDotWidget = var12;
					} else {
						Interpreter.scriptActiveWidget = var12;
					}

					class346.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
				Widget var10 = class127.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				class346.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var3.children = null;
				class346.invalidateWidget(var3);
				return 1;
			} else if (var0 == 103) {
				Interpreter.Interpreter_intStackSize -= 3;
				return 1;
			} else if (var0 == 104) {
				--Interpreter.Interpreter_intStackSize;
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
						if (var2) {
							WorldMapID.scriptDotWidget = var3;
						} else {
							Interpreter.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else if (var0 == 202) {
					Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] = 0;
					return 1;
				} else if (var0 == 203) {
					Interpreter.Interpreter_intStack[(--Interpreter.Interpreter_intStackSize) + 1] = 0;
					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var5 = ItemComposition.getWidgetChild(var9, var4);
				if ((var5 != null) && (var4 != (-1))) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
					if (var2) {
						WorldMapID.scriptDotWidget = var5;
					} else {
						Interpreter.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-127")

	static boolean method3351() {
		return Client.tapToDrop || KeyHandler.KeyHandler_pressedKeys[81];
	}
}