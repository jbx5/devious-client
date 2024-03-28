import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fu")
public class class141 extends class144 {
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1669;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -377447235
	)
	int field1664;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -419301065
	)
	int field1667;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2114631391
	)
	int field1665;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -19255889
	)
	int field1666;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class141(class147 var1) {
		this.this$0 = var1;
		this.field1664 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1664 = var1.readUnsignedShort();
		this.field1667 = var1.readInt();
		this.field1665 = var1.readUnsignedByte();
		this.field1666 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3254(this.field1664, this.field1667, this.field1665, this.field1666);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "-87"
	)
	static int method3122(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "10"
	)
	static void method3130(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class429.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		AABB.method4876(var0, var1);
	}
}
