import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
final class class513 implements class510 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luj;B)V",
		garbageValue = "-42"
	)
	public void vmethod9135(Object var1, Buffer var2) {
		this.method9112((Long)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)Ljava/lang/Object;",
		garbageValue = "-69"
	)
	public Object vmethod9141(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Long;Luj;B)V",
		garbageValue = "79"
	)
	void method9112(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
