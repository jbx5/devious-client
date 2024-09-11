import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
final class class534 implements class533 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvf;B)V",
		garbageValue = "51"
	)
	public void vmethod9785(Object var1, Buffer var2) {
		this.method9726((Integer)var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Ljava/lang/Object;",
		garbageValue = "173380129"
	)
	public Object vmethod9784(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lvf;I)V",
		garbageValue = "951301676"
	)
	void method9726(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
