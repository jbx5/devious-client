import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
final class class519 implements class518 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lur;B)V",
		garbageValue = "-69"
	)
	public void vmethod9136(Object var1, Buffer var2) {
		this.method9087((Integer)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)Ljava/lang/Object;",
		garbageValue = "1753636582"
	)
	public Object vmethod9133(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lur;B)V",
		garbageValue = "11"
	)
	void method9087(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
