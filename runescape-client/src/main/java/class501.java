import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
final class class501 implements class498 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ltm;I)V",
		garbageValue = "465506048"
	)
	public void vmethod8928(Object var1, Buffer var2) {
		this.method8906((Long)var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)Ljava/lang/Object;",
		garbageValue = "-295239457"
	)
	public Object vmethod8926(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Ltm;B)V",
		garbageValue = "-19"
	)
	void method8906(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
