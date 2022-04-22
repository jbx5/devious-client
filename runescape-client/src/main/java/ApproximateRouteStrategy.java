



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("eg")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive20")
	static Archive archive20;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIILgv;I)Z", garbageValue = 
	"773884525")

	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return (var2 == super.approxDestinationX) && (var3 == super.approxDestinationY);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([BB)Ljava/lang/String;", garbageValue = 
	"79")

	public static String method1125(byte[] var0) {
		return WorldMapData_1.method4226(var0, 0, var0.length);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-227036396")

	static int method1124(int var0, Script var1, boolean var2) {
		Widget var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"-54")

	static int method1123(int var0, Script var1, boolean var2) {
		if (var0 == 7400) {
			--Interpreter.Interpreter_intStackSize;
			--class122.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7401) {
			--Interpreter.Interpreter_intStackSize;
			--class122.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7402) {
			Interpreter.Interpreter_intStackSize -= 2;
			--class122.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7403) {
			Interpreter.Interpreter_intStackSize -= 2;
			--class122.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7404) {
			--Interpreter.Interpreter_intStackSize;
			--class122.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7405) {
			Interpreter.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7406) {
			--Interpreter.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
			return 1;
		} else if (var0 == 7407) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			return 1;
		} else if (var0 == 7408) {
			Interpreter.Interpreter_intStackSize -= 2;
			--class122.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			return 1;
		} else if (var0 == 7409) {
			--Interpreter.Interpreter_intStackSize;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(descriptor = 
	"(Lky;IIZI)V", garbageValue = 
	"229748808")

	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = (var0.rawWidth * var1) >> 14;
		}

		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = (var2 * var0.rawHeight) >> 14;
		}

		if (var0.widthAlignment == 4) {
			var0.width = (var0.field3352 * var0.height) / var0.field3353;
		}

		if (var0.heightAlignment == 4) {
			var0.height = (var0.field3353 * var0.width) / var0.field3352;
		}

		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}

		if ((var3 && (var0.onResize != null)) && ((var4 != var0.width) || (var5 != var0.height))) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}

	}
}