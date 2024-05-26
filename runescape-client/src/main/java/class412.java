import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("po")
public class class412 {
	@ObfuscatedName("ak")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Lco;",
		garbageValue = "1263469250"
	)
	@Export("Messages_getByChannelAndID")
	static Message Messages_getByChannelAndID(int var0, int var1) {
		ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var2.getMessage(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-2"
	)
	static int method7695(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			var4 = AsyncRestClient.widgetDefinition.method6536(var3);
		} else {
			var4 = var2 ? Interpreter.scriptDotWidget : SecureRandomSSLSocket.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class13.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
			class324.invalidateWidget(var4);
			class188.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class148.revalidateWidgetScroll(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class13.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 3];
			class324.invalidateWidget(var4);
			class188.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class148.revalidateWidgetScroll(AsyncRestClient.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class324.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
