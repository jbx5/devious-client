import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tz")
final class class518 implements class513 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lul;I)V",
		garbageValue = "-397863290"
	)
	public void vmethod9055(Object var1, Buffer var2) {
		this.method9056((String)var1, var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)Ljava/lang/Object;",
		garbageValue = "-1456241929"
	)
	public Object vmethod9054(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lul;B)V",
		garbageValue = "112"
	)
	void method9056(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
