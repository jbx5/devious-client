


import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class271 {
	@ObfuscatedName("v")
	static int[] field3155;
	@ObfuscatedName("b")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lly;")

	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	static 
	{
		new Object();
		field3155 = new int[33];
		field3155[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3155[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"27")

	static int method5220(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) {
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) {
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			if (var3.itemId != (-1)) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_HASSUB) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var5)))));
			if (var4 != null) {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTOP) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.rootInterface;
			return 1;
		} else if (var0 == 1707) {
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3.method5690()) ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return UserComparator9.method2617(var3);
		} else if (var0 == 1708) {
			var3 = class127.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return class305.method5782(var3);
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1452863306")

	static int method5221(int var0, Script var1, boolean var2) {
		if (((((var0 != 6700) && (var0 != 6702)) && (var0 != 6704)) && (var0 != 6706)) && (var0 != 6708)) {
			if (((((var0 != 6701) && (var0 != 6703)) && (var0 != 6705)) && (var0 != 6707)) && (var0 != 6709)) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
					return 1;
				} else if (((var0 != 6751) && (var0 != 6752)) && (var0 != 6753)) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						NPCComposition var4 = KeyHandler.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4 != null) ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
					return 1;
				}
			} else {
				--Interpreter.Interpreter_intStackSize;
				return 1;
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 2;
			--class122.Interpreter_stringStackSize;
			return 1;
		}
	}
}