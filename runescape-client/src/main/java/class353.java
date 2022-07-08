import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("mc")
public class class353 {
	@ObfuscatedName("ay")
	@Export("client")
	@ObfuscatedSignature(descriptor = "Lclient;")
	static Client client;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/String;[II)V", garbageValue = "-221200866")
	public static void method6507(String[] var0, int[] var1) {
		method6505(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/String;[IIIB)V", garbageValue = "81")
	static void method6505(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}
			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method6505(var0, var1, var2, var5 - 1);
			method6505(var0, var1, var5 + 1, var3);
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-2096074968")
	static int method6506(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var5)))));
			if (var4 != null) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 2707) {
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var3.method5680()) ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			return class29.method363(var3);
		} else if (var0 == 2709) {
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			return WorldMapSection0.method4947(var3);
		} else {
			return 2;
		}
	}
}