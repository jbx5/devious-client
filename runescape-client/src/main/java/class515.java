import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
final class class515 implements class514 {
	@ObfuscatedName("an")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luk;B)V",
		garbageValue = "-38"
	)
	public void vmethod9263(Object var1, Buffer var2) {
		this.method9225((Integer)var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Ljava/lang/Object;",
		garbageValue = "183213382"
	)
	public Object vmethod9259(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Luk;I)V",
		garbageValue = "1734718861"
	)
	void method9225(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}
}
