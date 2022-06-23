import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("pz")
final class class429 implements class428 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lqt;B)V", garbageValue = "-51")
	public void vmethod7583(Object var1, Buffer var2) {
		this.method7543(((Integer) (var1)), var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;I)Ljava/lang/Object;", garbageValue = "-261873850")
	public Object vmethod7580(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Integer;Lqt;I)V", garbageValue = "-97266206")
	void method7543(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}