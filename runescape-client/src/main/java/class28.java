import java.applet.Applet;
import java.net.URL;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("bg")
public class class28 {
	@ObfuscatedName("ws")
	static Iterator field144;
	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static GameBuild field153;
	@ObfuscatedName("dj")
	@Export("KeyHandler_keyCodes")
	static int[] KeyHandler_keyCodes;
	@ObfuscatedName("kh")
	@ObfuscatedGetter(
		intValue = 1264334945
	)
	@Export("cameraY")
	static int cameraY;

	static {
		KeyHandler_keyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "256979698"
	)
	static boolean method428(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field161.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var14.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class31.field163;
				Object[] var5 = new Object[]{(new URL(class31.field163.getCodeBase(), var0)).toString()};
				Object var13 = JSObject.getWindow(var7).call(var2, var5);
				return var13 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field163.getAppletContext().showDocument(new URL(class31.field163.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field163;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var12) {
			}

			try {
				class31.field163.getAppletContext().showDocument(new URL(class31.field163.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-58"
	)
	static int method437(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			UserComparator6.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = class380.widgetDefinition.method6348(var9);
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

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method6713();
						var12.method6700().method6464(new class105(var12));
						var12.method6700().method6463(new class106(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						class31.scriptDotWidget = var12;
					} else {
						class185.scriptActiveWidget = var12;
					}

					FaceNormal.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
				Widget var10 = class380.widgetDefinition.method6348(var3.id);
				var10.children[var3.childIndex] = null;
				FaceNormal.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
				var3.children = null;
				FaceNormal.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class31.scriptDotWidget = var3;
						} else {
							class185.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Widget var5 = class380.widgetDefinition.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class31.scriptDotWidget = var5;
					} else {
						class185.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I[B[BI)V",
		garbageValue = "1118481"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3775 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3775 = new byte[11][];
			var0.field3796 = new byte[11][];
			var0.field3779 = new int[11];
			var0.field3787 = new int[11];
		}

		var0.field3775[var1] = var2;
		if (var2 != null) {
			var0.field3776 = true;
		} else {
			var0.field3776 = false;

			for (int var4 = 0; var4 < var0.field3775.length; ++var4) {
				if (var0.field3775[var4] != null) {
					var0.field3776 = true;
					break;
				}
			}
		}

		var0.field3796[var1] = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-622779644"
	)
	static final int method438(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZS)I",
		garbageValue = "255"
	)
	static int method433(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field849.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				UserComparator6.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class102 var6 = new class102(var5, var3, var4, class380.widgetDefinition.method6348(var3).itemId);
					Interpreter.field849.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field860 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1065 = Interpreter.field860 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	@Export("SpriteBuffer_reset")
	static void SpriteBuffer_reset() {
		Actor.method2489(24);
		class142.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-644305667"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class380.widgetDefinition.loadInterface(var0)) {
			WorldMapRegion.updateInterface(class380.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
