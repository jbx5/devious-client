import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uf")
final class class530 implements class529 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lua;S)V",
		garbageValue = "220"
	)
	public void vmethod9521(Object var1, Buffer var2) {
		this.method9484((Integer)var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)Ljava/lang/Object;",
		garbageValue = "-12"
	)
	public Object vmethod9520(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lua;I)V",
		garbageValue = "-428768397"
	)
	void method9484(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
