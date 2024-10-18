import java.io.File;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class327 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;ZI)V",
		garbageValue = "-397578660"
	)
	public static void method6531(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		class164.ObjectDefinition_archive = var0;
		ClientPreferences.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-808073802"
	)
	static void method6530(File var0) {
		HttpRequestTask.FileSystem_cacheDir = var0;
		if (!HttpRequestTask.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}
}
