import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ul")
final class class533 implements class530 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvp;I)V",
		garbageValue = "50536898"
	)
	public void vmethod9425(Object var1, Buffer var2) {
		this.method9396((Long)var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)Ljava/lang/Object;",
		garbageValue = "25"
	)
	public Object vmethod9426(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Lvp;I)V",
		garbageValue = "-285169958"
	)
	void method9396(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
