import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
final class class514 implements class513 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lul;I)V",
		garbageValue = "-397863290"
	)
	public void vmethod9055(Object var1, Buffer var2) {
		this.method9014((Integer)var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Ljava/lang/Object;",
		garbageValue = "-1456241929"
	)
	public Object vmethod9054(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lul;I)V",
		garbageValue = "1661995876"
	)
	void method9014(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
