import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uo")
final class class532 implements class529 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		longValue = 6580268898646674783L
	)
	static long field5262;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lua;S)V",
		garbageValue = "220"
	)
	public void vmethod9521(Object var1, Buffer var2) {
		this.method9502((Long)var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)Ljava/lang/Object;",
		garbageValue = "-12"
	)
	public Object vmethod9520(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lua;S)V",
		garbageValue = "-1098"
	)
	void method9502(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
