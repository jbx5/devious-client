import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ma")
class class332 implements ThreadFactory {
	@ObfuscatedName("wl")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	public static AbstractArchive field3636;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field3638;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmw;"
	)
	final MidiPcmStream this$0;

	@ObfuscatedSignature(
		descriptor = "(Lmw;)V"
	)
	class332(MidiPcmStream var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "1873546034"
	)
	public static void method6430(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6430(var0, var1, var2, var5 - 1);
			method6430(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-9"
	)
	static int method6433(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class13.Interpreter_intStackSize -= 2;
			Client.field800 = (short)class59.method1145(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]);
			if (Client.field800 <= 0) {
				Client.field800 = 256;
			}

			Client.field801 = (short)class59.method1145(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
			if (Client.field801 <= 0) {
				Client.field801 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class13.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class13.Interpreter_intStackSize -= 4;
			Client.field804 = (short)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			if (Client.field804 <= 0) {
				Client.field804 = 1;
			}

			Client.field760 = (short)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			if (Client.field760 <= 0) {
				Client.field760 = 32767;
			} else if (Client.field760 < Client.field804) {
				Client.field760 = Client.field804;
			}

			Client.field695 = (short)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			if (Client.field695 <= 0) {
				Client.field695 = 1;
			}

			Client.field807 = (short)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
			if (Client.field807 <= 0) {
				Client.field807 = 32767;
			} else if (Client.field807 < Client.field695) {
				Client.field807 = Client.field695;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				MidiPcmStream.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = WorldMapSection2.method5549(Client.field800);
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = WorldMapSection2.method5549(Client.field801);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = DbTable.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
