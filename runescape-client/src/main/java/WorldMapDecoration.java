import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ix")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1217125903)
	@Export("objectDefinitionId")
	final int objectDefinitionId;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1822794685)
	@Export("decoration")
	final int decoration;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1636858953)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-2049294776")
	static int method4992(int var0, Script var1, boolean var2) {
		Widget var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-80")
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = ScriptFrame.getWidgetChild(NetCache.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				BoundaryObject.runScriptEvent(var1);
			}
			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			ChatChannel.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1243783436")
	static void method4991(int var0) {
		Client.oculusOrbState = var0;
	}
}