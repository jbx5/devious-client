



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class136 extends class144 {
	@ObfuscatedName("ow")
	@ObfuscatedGetter(intValue = 
	-1282904603)

	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1060413805)

	int field1581;

	@ObfuscatedSignature(descriptor = 
	"Lez;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lez;)V")

	class136(class145 var1) {
		this.this$0 = var1;
		this.field1581 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;S)V", garbageValue = 
	"3239")

	void vmethod3096(Buffer var1) {
		this.field1581 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ley;B)V", garbageValue = 
	"26")

	void vmethod3093(ClanChannel var1) {
		var1.removeMember(this.field1581);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-2073039041")

	static int method2896(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			--var4;
			if (((var3.actions != null) && (var4 < var3.actions.length)) && (var3.actions[var4] != null)) {
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
			}

			return 1;
		}
	}
}