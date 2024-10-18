import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class208 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -114988147
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1433508117
	)
	public int field2171;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2126449793
	)
	public int field2166;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 889749475
	)
	public int field2167;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -990836461
	)
	public int field2165;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1484326055
	)
	public int field2169;

	class208(int var1, int var2, int var3, int var4, int var5) {
		this.field2171 = 0;
		this.field2166 = 1;
		this.field2167 = 0;
		this.field2165 = 0;
		this.field2169 = 0;
		this.field2171 = var1;
		this.field2166 = var2;
		this.field2167 = var3;
		this.field2165 = var4;
		this.field2169 = var5;
	}

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1483745131"
	)
	static int method4212(int var0) {
		return var0 * 3 + 600;
	}
}
