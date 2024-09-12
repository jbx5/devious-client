import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ur")
final class class538 implements class533 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvf;B)V",
		garbageValue = "51"
	)
	public void vmethod9785(Object var1, Buffer var2) {
		this.method9782((String)var1, var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Ljava/lang/Object;",
		garbageValue = "173380129"
	)
	public Object vmethod9784(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lvf;I)V",
		garbageValue = "359605178"
	)
	void method9782(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "738067984"
	)
	public static String method9791(CharSequence var0) {
		String var1 = ServerPacket.base37DecodeLong(class145.method3424(var0));
		if (var1 == null) {
			var1 = "";
		}

		return var1;
	}
}
