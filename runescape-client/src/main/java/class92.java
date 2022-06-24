import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cz")
public class class92 {
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-35")
	public static void method2389() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", garbageValue = "38")
	static String method2388(String var0) {
		PlayerType[] var1 = SoundSystem.PlayerType_values();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(SecureRandomCallable.method2066(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}
		return var0;
	}
}