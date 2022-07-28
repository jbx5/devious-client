import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("eo")
public class class137 extends class128 {
	@ObfuscatedName("ex")
	@ObfuscatedGetter(longValue = 4934187699337403519L)
	static long field1602;

	@ObfuscatedName("o")
	String field1601;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class137(class131 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		this.field1601 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.name = this.field1601;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-390238524")
	public static int method2962(int var0, int var1, int var2) {
		int var3 = ScriptEvent.method2168(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}
}