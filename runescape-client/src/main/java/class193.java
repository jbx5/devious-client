



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public enum class193 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lgv;")

	field2192(((byte) (-1))),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lgv;")

	field2195(((byte) (0))),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lgv;")

	field2193(((byte) (1))),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lgv;")

	field2191(((byte) (2)));

	@ObfuscatedName("hj")
	@ObfuscatedGetter(intValue = 
	1576162761)

	static int field2197;
	@ObfuscatedName("l")
	public byte field2194;

	class193(byte var3) {
		this.field2194 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2194;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Ljava/lang/String;[SI)V", garbageValue = 
	"247092715")

	public static void method3880(String[] var0, short[] var1) {
		ServerPacket.sortItemsByName(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-1325671888")

	static int method3879(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
		} else {
			var3 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
		int[] var5 = null;
		if ((var4.length() > 0) && (var4.charAt(var4.length() - 1) == 'Y')) {
			int var6 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; (var6--) > 0; var5[var6] = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var8 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
		if (var7 != (-1)) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3468 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3395 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3461 = var8;
		} else if (var0 == 1430) {
			var3.field3457 = var8;
		} else if (var0 == 1431) {
			var3.field3458 = var8;
		} else {
			if (var0 != 1434) {
				return 2;
			}

			var3.field3408 = var8;
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(descriptor = 
	"(IIIIII)V", garbageValue = 
	"-251675528")

	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class268.scrollBarSprites[0].drawAt(var0, var1);
		class268.scrollBarSprites[1].drawAt(var0, (var3 + var1) - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field619);
		int var5 = (var3 * (var3 - 32)) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (((var3 - 32) - var5) * var2) / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, (var6 + var1) + 16, 16, var5, Client.field684);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, (var6 + var1) + 16, var5, Client.field514);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, (var6 + var1) + 16, var5, Client.field514);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, (var6 + var1) + 16, 16, Client.field514);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, (var6 + var1) + 17, 16, Client.field514);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, (var6 + var1) + 16, var5, Client.field554);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, (var6 + var1) + 17, var5 - 1, Client.field554);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, ((var5 + var6) + var1) + 15, 16, Client.field554);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, ((var6 + var5) + var1) + 14, 15, Client.field554);
	}}