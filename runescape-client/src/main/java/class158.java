import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class158 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1414486485
	)
	int field1739;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class158(class147 var1) {
		this.this$0 = var1;
		this.field1739 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1739 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3338(this.field1739);
	}

	@ObfuscatedName("ab")
	static int method3413(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "11323368"
	)
	static final void method3415() {
		WorldMapArea.method4622("You can't add yourself to your own ignore list");
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1589352545"
	)
	static int method3412(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class60.method1186() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2036594717"
	)
	static int method3414(int var0) {
		return var0 * 3 + 600;
	}
}
