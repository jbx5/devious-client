import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
final class class543 implements class540 {
	@ObfuscatedName("ao")
	static int[][][] field5378;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvl;B)V",
		garbageValue = "-55"
	)
	public void vmethod9951(Object var1, Buffer var2) {
		this.method9917((Long)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;S)Ljava/lang/Object;",
		garbageValue = "-9735"
	)
	public Object vmethod9953(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvl;I)V",
		garbageValue = "1486282241"
	)
	void method9917(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
