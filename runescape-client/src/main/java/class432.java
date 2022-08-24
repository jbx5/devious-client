import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("py")
final class class432 implements class429 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lqr;I)V", garbageValue = "1286167930")
	public void vmethod7506(Object var1, Buffer var2) {
		this.method7479(((Long) (var1)), var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;B)Ljava/lang/Object;", garbageValue = "36")
	public Object vmethod7514(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Long;Lqr;B)V", garbageValue = "8")
	void method7479(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}