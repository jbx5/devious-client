import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
final class class541 implements class540 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvl;B)V",
		garbageValue = "-55"
	)
	public void vmethod9951(Object var1, Buffer var2) {
		this.method9905((Integer)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;S)Ljava/lang/Object;",
		garbageValue = "-9735"
	)
	public Object vmethod9953(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvl;I)V",
		garbageValue = "827951310"
	)
	void method9905(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
