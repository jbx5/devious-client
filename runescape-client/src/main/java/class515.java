import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
final class class515 implements class510 {
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = -328242465
	)
	@Export("menuHeight")
	static int menuHeight;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luj;B)V",
		garbageValue = "-42"
	)
	public void vmethod9135(Object var1, Buffer var2) {
		this.method9136((String)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)Ljava/lang/Object;",
		garbageValue = "-69"
	)
	public Object vmethod9141(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Luj;I)V",
		garbageValue = "919376125"
	)
	void method9136(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
