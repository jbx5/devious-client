import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("sp")
public class class472 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -495003536
	)
	public static int field4892;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2053792151
	)
	static int field4889;
	@ObfuscatedName("az")
	float[] field4891;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 47852205
	)
	int field4890;

	class472(float[] var1, int var2) {
		this.field4891 = var1;
		this.field4890 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZS)I",
		garbageValue = "16383"
	)
	static int method8485(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5);
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.method6697() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			return PcmPlayer.method752(var3);
		} else if (var0 == 2709) {
			var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			return SpriteMask.method6247(var3);
		} else {
			return 2;
		}
	}
}
