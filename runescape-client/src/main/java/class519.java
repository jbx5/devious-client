import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
final class class519 implements class514 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luk;B)V",
		garbageValue = "-38"
	)
	public void vmethod9263(Object var1, Buffer var2) {
		this.method9258((String)var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)Ljava/lang/Object;",
		garbageValue = "183213382"
	)
	public Object vmethod9259(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Luk;I)V",
		garbageValue = "1680495705"
	)
	void method9258(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
