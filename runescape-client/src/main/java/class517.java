import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
final class class517 implements class514 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luk;B)V",
		garbageValue = "-38"
	)
	public void vmethod9263(Object var1, Buffer var2) {
		this.method9231((Long)var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Ljava/lang/Object;",
		garbageValue = "183213382"
	)
	public Object vmethod9259(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Luk;I)V",
		garbageValue = "-729367845"
	)
	void method9231(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
