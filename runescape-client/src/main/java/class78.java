import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class78 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "6"
	)
	static boolean method2234(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 63
			try {
				if (!class29.field172.startsWith("win")) { // L: 65
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 66
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 67

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 68
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 69
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 71
					return true; // L: 72
				}
			} catch (Throwable var5) { // L: 74
				return false; // L: 75
			}
		} else if (var1 == 1) { // L: 78
			try {
				Object var3 = class27.method405(class29.field179, var2, new Object[]{(new URL(class29.field179.getCodeBase(), var0)).toString()}); // L: 80
				return var3 != null; // L: 81
			} catch (Throwable var6) { // L: 83
				return false; // L: 84
			}
		} else if (var1 == 2) { // L: 87
			try {
				class29.field179.getAppletContext().showDocument(new URL(class29.field179.getCodeBase(), var0), "_blank"); // L: 89
				return true; // L: 90
			} catch (Exception var7) { // L: 92
				return false; // L: 93
			}
		} else if (var1 == 3) { // L: 96
			try {
				class27.method404(class29.field179, "loggedout"); // L: 98
			} catch (Throwable var9) { // L: 100
			}

			try {
				class29.field179.getAppletContext().showDocument(new URL(class29.field179.getCodeBase(), var0), "_top"); // L: 102
				return true; // L: 103
			} catch (Exception var8) { // L: 105
				return false; // L: 106
			}
		} else {
			throw new IllegalArgumentException(); // L: 109
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZS)I",
		garbageValue = "-16458"
	)
	static int method2235(int var0, Script var1, boolean var2) {
		return 2; // L: 4443
	}
}
