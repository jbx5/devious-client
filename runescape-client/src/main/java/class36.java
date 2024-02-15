import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class36 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("reflectionChecks")
	public static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1651175915
	)
	@Export("otpMedium")
	static int otpMedium;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-1197841897"
	)
	public static void method660(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	static void method659(String var0, String var1, String var2) {
		JagexCache.method4224(7);
		SecureUrlRequester.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-55"
	)
	@Export("reinitializeClient")
	static void reinitializeClient() {
		class30.clientPreferences.method2550(Client.field688);
	}
}
