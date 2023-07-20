import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("nt")
public class class351 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;

	static {
		int var0 = 0;
		int var1 = 0;
		class346[] var2 = new class346[]{class346.field3863, class346.field3860};
		class346[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class346 var5 = var3[var4];
			if (var5.field3861 > var0) {
				var0 = var5.field3861;
			}

			if (var5.field3862 > var1) {
				var1 = var5.field3862;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;B)Z",
		garbageValue = "115"
	)
	static boolean method6662(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field176.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class26.method383(class31.field179, var2, new Object[]{(new URL(class31.field179.getCodeBase(), var0)).toString()});
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field179.getAppletContext().showDocument(new URL(class31.field179.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field179;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var9) {
			}

			try {
				class31.field179.getAppletContext().showDocument(new URL(class31.field179.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
