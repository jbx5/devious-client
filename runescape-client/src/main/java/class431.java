import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
final class class431 implements class430 {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqq;S)V",
		garbageValue = "1113"
	)
	public void vmethod7796(Object var1, Buffer var2) {
		this.method7746((Integer)var1, var2); // L: 21
	} // L: 22

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)Ljava/lang/Object;",
		garbageValue = "298261584"
	)
	public Object vmethod7802(Buffer var1) {
		return var1.readInt(); // L: 17
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lqq;B)V",
		garbageValue = "-93"
	)
	void method7746(Integer var1, Buffer var2) {
		var2.writeInt(var1); // L: 12
	} // L: 13

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Llv;III)Lqu;",
		garbageValue = "1917784805"
	)
	static IndexedSprite method7757(AbstractArchive var0, int var1, int var2) {
		return !Occluder.method4475(var0, var1, var2) ? null : class353.method6681(); // L: 28 29
	}
}
