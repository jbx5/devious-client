import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fe")
class class134 implements Callable {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	static IndexedSprite[] field1582;
	@ObfuscatedName("uc")
	@ObfuscatedGetter(
		intValue = -2047858965
	)
	static int field1581;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class139 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfd;"
	)
	final class130[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfo;II[Lfd;)V"
	)
	class134(class139 var1, int var2, int var3, class130[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "392757608"
	)
	static boolean method3146(int var0, int var1, int var2) {
		return var0 >= 0 && var0 < 4 && var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1168679162"
	)
	public static int method3149(int var0) {
		return (var0 & class520.field5086) - 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1497825445"
	)
	static int method3148(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			DbTableType.Interpreter_intStackSize -= 2;
			Client.field760 = (short)class354.method6859(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize]);
			if (Client.field760 <= 0) {
				Client.field760 = 256;
			}

			Client.field761 = (short)class354.method6859(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
			if (Client.field761 <= 0) {
				Client.field761 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			DbTableType.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			DbTableType.Interpreter_intStackSize -= 4;
			Client.field764 = (short)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			if (Client.field764 <= 0) {
				Client.field764 = 1;
			}

			Client.field765 = (short)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			if (Client.field765 <= 0) {
				Client.field765 = 32767;
			} else if (Client.field765 < Client.field764) {
				Client.field765 = Client.field764;
			}

			Client.field531 = (short)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			if (Client.field531 <= 0) {
				Client.field531 = 1;
			}

			Client.field722 = (short)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
			if (Client.field722 <= 0) {
				Client.field722 = 32767;
			} else if (Client.field722 < Client.field531) {
				Client.field722 = Client.field531;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class348.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class142.method3220(Client.field760);
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class142.method3220(Client.field761);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Language.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class47.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
