import java.util.Comparator;




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("v")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lnl;Lnl;B)I", garbageValue = 
	"99")

	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"109147349")

	static int method2563(int var0, int var1) {
		long var2 = ((long) ((var0 << 16) + var1));
		return (NetCache.NetCache_currentResponse != null) && (NetCache.NetCache_currentResponse.key == var2) ? ((class291.NetCache_responseArchiveBuffer.offset * 99) / (class291.NetCache_responseArchiveBuffer.array.length - NetCache.NetCache_currentResponse.padding)) + 1 : 0;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"78")

	public static int method2566(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"2116886203")

	static int method2567(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class295.Interpreter_intStackSize -= 2;
			Client.field745 = ((short) (FaceNormal.method4313(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize])));
			if (Client.field745 <= 0) {
				Client.field745 = 256;
			}

			Client.field706 = ((short) (FaceNormal.method4313(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1])));
			if (Client.field706 <= 0) {
				Client.field706 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class295.Interpreter_intStackSize -= 2;
			Client.zoomHeight = ((short) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]));
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = ((short) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]));
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class295.Interpreter_intStackSize -= 4;
			Client.field562 = ((short) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize]));
			if (Client.field562 <= 0) {
				Client.field562 = 1;
			}

			Client.field750 = ((short) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]));
			if (Client.field750 <= 0) {
				Client.field750 = 32767;
			} else if (Client.field750 < Client.field562) {
				Client.field750 = Client.field562;
			}

			Client.field751 = ((short) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2]));
			if (Client.field751 <= 0) {
				Client.field751 = 1;
			}

			Client.field752 = ((short) (Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3]));
			if (Client.field752 <= 0) {
				Client.field752 = 32767;
			} else if (Client.field752 < Client.field751) {
				Client.field752 = Client.field751;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				Language.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = GraphicsObject.method1865(Client.field745);
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = GraphicsObject.method1865(Client.field706);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class4.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class309.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}