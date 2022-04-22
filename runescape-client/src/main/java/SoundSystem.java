



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ry")
	static boolean field309;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"[Lay;")

	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			Widget.RunException_sendStackTrace(((String) (null)), var4);
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"([BI)[B", garbageValue = 
	"-862016780")

	static byte[] method764(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(CI)Z", garbageValue = 
	"1307267367")

	@Export("isCharAlphabetic")
	public static boolean isCharAlphabetic(char var0) {
		return ((var0 >= 'A') && (var0 <= 'Z')) || ((var0 >= 'a') && (var0 <= 'z'));
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"1")

	static int method761(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTEXT) {
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 1610) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.color2;
			return 1;
		} else if (var0 == 1613) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.modelTransparency) ? 1 : 0;
			return 1;
		} else if ((var0 != 1615) && (var0 != 1616)) {
			return 2;
		} else {
			++Interpreter.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(descriptor = 
	"(IIIIII)V", garbageValue = 
	"1540502347")

	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class29.scrollBarSprites[0].drawAt(var0, var1);
		class29.scrollBarSprites[1].drawAt(var0, (var3 + var1) - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field566);
		int var5 = (var3 * (var3 - 32)) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (((var3 - 32) - var5) * var2) / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, (var6 + var1) + 16, 16, var5, Client.field670);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, (var6 + var1) + 16, var5, Client.field740);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, (var6 + var1) + 16, var5, Client.field740);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, (var6 + var1) + 16, 16, Client.field740);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, (var6 + var1) + 17, 16, Client.field740);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, (var6 + var1) + 16, var5, Client.field694);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, (var6 + var1) + 17, var5 - 1, Client.field694);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, ((var6 + var5) + var1) + 15, 16, Client.field694);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, ((var5 + var6) + var1) + 14, 15, Client.field694);
	}
}