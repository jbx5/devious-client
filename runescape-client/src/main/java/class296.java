



import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
public enum class296 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lkw;")

	field3493(0),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lkw;")

	field3491(1),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lkw;")

	field3490(2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lkw;")

	field3492(3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lkw;")

	field3494(4);

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lqq;")

	static IndexedSprite field3496;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	-1277728875)

	final int field3495;

	class296(int var3) {
		this.field3495 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3495;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1938318651")

	static int method5749(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(Laf;I)V", garbageValue = 
	"1364149382")

	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}}