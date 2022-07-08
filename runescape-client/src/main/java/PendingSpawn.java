import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("cg")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1077280707)
	@Export("plane")
	int plane;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1648453221)
	@Export("type")
	int type;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1684914079)
	@Export("x")
	int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 841494057)
	@Export("y")
	int y;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 332033545)
	@Export("objectId")
	int objectId;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1740672261)
	int field1121;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1499374413)
	int field1122;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1955707387)
	@Export("id")
	int id;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1729906445)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1250065699)
	int field1125;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1981751259)
	@Export("delay")
	int delay;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 832910611)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "630642952")
	static int method2180(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			var4 = class140.getWidget(var3);
		} else {
			var4 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		}
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class446.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
			ChatChannel.invalidateWidget(var4);
			class353.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var3 >> 16], var4, false);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class446.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3];
			ChatChannel.invalidateWidget(var4);
			class353.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				BufferedNetSocket.revalidateWidgetScroll(SoundCache.Widget_interfaceComponents[var3 >> 16], var4, false);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				ChatChannel.invalidateWidget(var4);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}