import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class354 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("clock")
	static Clock clock;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -477664339
	)
	public int field3774;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1104524011
	)
	public int field3771;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1226715139
	)
	public int field3772;

	class354() {
	}

	@ObfuscatedName("ac")
	static double method6859(double var0) {
		return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2012418261"
	)
	public static int method6857(int var0) {
		return class332.field3601[var0];
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "-49"
	)
	static String method6858(String var0, boolean var1) {
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
		if (HttpJsonRequestBody.field5091 != null) {
			var3 = "/p=" + HttpJsonRequestBody.field5091;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + LoginScreenAnimation.clientLanguage + "/a=" + class215.field2352 + var3 + "/";
	}
}
