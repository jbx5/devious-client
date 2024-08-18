import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public abstract class class512 extends class513 {
	class512(int var1, int var2) {
		super(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "232112566"
	)
	public abstract int vmethod9031();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	public abstract int vmethod9035();

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2134013300"
	)
	public abstract int vmethod9033();

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "33"
	)
	public static int method9041(int var0) {
		return var0 >>> 12;
	}
}
