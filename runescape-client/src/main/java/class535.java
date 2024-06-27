import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
final class class535 implements class530 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvp;I)V",
		garbageValue = "50536898"
	)
	public void vmethod9425(Object var1, Buffer var2) {
		this.method9424((String)var1, var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)Ljava/lang/Object;",
		garbageValue = "25"
	)
	public Object vmethod9426(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvp;B)V",
		garbageValue = "5"
	)
	void method9424(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
