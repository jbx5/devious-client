import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
final class class516 implements class513 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lul;I)V",
		garbageValue = "-397863290"
	)
	public void vmethod9055(Object var1, Buffer var2) {
		this.method9021((Long)var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Ljava/lang/Object;",
		garbageValue = "-1456241929"
	)
	public Object vmethod9054(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lul;B)V",
		garbageValue = "1"
	)
	void method9021(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
