import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
final class class435 implements class430 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lqq;S)V",
		garbageValue = "1113"
	)
	public void vmethod7796(Object var1, Buffer var2) {
		this.method7794((String)var1, var2); // L: 49
	} // L: 50

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)Ljava/lang/Object;",
		garbageValue = "298261584"
	)
	public Object vmethod7802(Buffer var1) {
		return var1.readStringCp1252NullTerminated(); // L: 45
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lqq;I)V",
		garbageValue = "1690638170"
	)
	void method7794(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1); // L: 40
	} // L: 41
}
