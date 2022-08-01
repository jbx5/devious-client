import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("fp")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("VarpDefinition_archive")
	static AbstractArchive VarpDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -774409533)
	public static int field1811;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("VarpDefinition_cached")
	static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 894414077)
	static int field1813;

	@ObfuscatedName("gg")
	@ObfuscatedSignature(descriptor = "Lfz;")
	@Export("socketTask")
	static Task socketTask;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1739289855)
	@Export("type")
	public int type = 0;

	VarpDefinition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "1033626215")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "-67")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1994115349")
	public static void method3352() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1253760177")
	static int method3351(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}