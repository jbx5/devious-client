import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eb")
public class class109 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1410;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1417;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1400;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1401;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1412;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1403;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1416;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1405;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1404;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1407;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1408;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1409;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1406;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("field1390")
	static final class109 field1390;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1398;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	static final class109 field1413;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1922134931
	)
	int field1414;

	static {
		field1410 = new class109(0);
		field1417 = new class109(1);
		field1400 = new class109(2);
		field1401 = new class109(3);
		field1412 = new class109(4);
		field1403 = new class109(5);
		field1416 = new class109(6);
		field1405 = new class109(7);
		field1404 = new class109(8);
		field1407 = new class109(9);
		field1408 = new class109(10);
		field1409 = new class109(11);
		field1406 = new class109(12);
		field1390 = new class109(13);
		field1398 = new class109(14);
		field1413 = new class109(15);
	}

	class109(int var1) {
		this.field1414 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "607576261"
	)
	static int method2718(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			var4 = class243.widgetDefinition.method6281(var3);
		} else {
			var4 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			HttpRequestTask.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
			WorldMapData_0.invalidateWidget(var4);
			UrlRequest.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				IsaacCipher.revalidateWidgetScroll(class243.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			HttpRequestTask.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
			WorldMapData_0.invalidateWidget(var4);
			UrlRequest.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				IsaacCipher.revalidateWidgetScroll(class243.widgetDefinition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				WorldMapData_0.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
