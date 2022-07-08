import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
@ObfuscatedName("dk")
public class class125 extends class128 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -901358283)
	int field1557;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 963189529)
	int field1553;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1782830973)
	int field1554;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1564673701)
	int field1555;

	@ObfuscatedSignature(descriptor = "Lej;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lej;)V")
	class125(class131 var1) {
		this.this$0 = var1;
		this.field1557 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "5")
	void vmethod3150(Buffer var1) {
		this.field1557 = var1.readUnsignedShort();
		this.field1553 = var1.readInt();
		this.field1554 = var1.readUnsignedByte();
		this.field1555 = var1.readUnsignedByte();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Len;I)V", garbageValue = "-1718344311")
	void vmethod3149(ClanSettings var1) {
		var1.method2964(this.field1557, this.field1553, this.field1554, this.field1555);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "2000471685")
	static String method2829() {
		return class19.clientPreferences.method2247() ? NetCache.method5952(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "718423512")
	static void method2830() {
		ItemContainer.itemContainers = new NodeHashTable(32);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-61")
	static int method2821(int var0, Script var1, boolean var2) {
		Widget var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var3.isHidden) ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-111")
	static void method2824() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}
}