import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
final class class523 implements class518 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lur;B)V",
		garbageValue = "-69"
	)
	public void vmethod9136(Object var1, Buffer var2) {
		this.method9134((String)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)Ljava/lang/Object;",
		garbageValue = "1753636582"
	)
	public Object vmethod9133(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lur;I)V",
		garbageValue = "-1868390205"
	)
	void method9134(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
