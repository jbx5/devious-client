import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class329 {
	@ObfuscatedName("tn")
	@ObfuscatedGetter(
		intValue = 1373519083
	)
	static int field3545;

	@ObfuscatedName("oq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "-7"
	)
	static String method6181(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (class433.field4740 != null) {
			var3 = "/p=" + class433.field4740;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + RestClientThreadFactory.clientLanguage + "/a=" + class318.field3253 + var3 + "/";
	}
}
