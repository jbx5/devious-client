import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bo")
public class class30 {
	@ObfuscatedName("ij")
	@ObfuscatedGetter(
		intValue = -1296447463
	)
	static int field136;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-653880728"
	)
	static int method421(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6960() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return AbstractSocket.method8789(var3);
		} else {
			return var0 == 1709 ? StructComposition.method5054(var3) : 2;
		}
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "93"
	)
	static final void method418() {
		Client.field503 = Client.cycleCntr;
	}
}
