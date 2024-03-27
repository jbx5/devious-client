import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class254 {
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = 370047429
	)
	static int field2776;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2095764740"
	)
	public static int method4942(int var0, int var1) {
		int var2 = var0 >>> 31;
		return (var0 + var2) / var1 - var2;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "64"
	)
	static final void method4939() {
		KitDefinition.KitDefinition_archive = null;
		KitDefinition.KitDefinition_modelsArchive = null;
		SecureRandomSSLSocket.KitDefinition_fileCount = 0;
	}
}
