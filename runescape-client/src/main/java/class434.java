import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("pg")
final class class434 implements class429 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Object;Lqw;B)V", garbageValue = "-1")
	public void vmethod7609(Object var1, Buffer var2) {
		this.method7612(((String) (var1)), var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqw;I)Ljava/lang/Object;", garbageValue = "-1579434609")
	public Object vmethod7608(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lqw;I)V", garbageValue = "86142690")
	void method7612(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;I)V", garbageValue = "-2021337955")
	public static void method7615(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
	}
}