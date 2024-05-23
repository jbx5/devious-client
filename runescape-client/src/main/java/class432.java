import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("qs")
public class class432 {
	@ObfuscatedName("cb")
	static String field4745;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2054006819
	)
	int field4747;

	@ObfuscatedSignature(
		descriptor = "(IZ)V",
		garbageValue = "1"
	)
	class432(int var1, boolean var2) {
		this.field4747 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2098017935"
	)
	public int method8126() {
		return this.field4747;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1615154884"
	)
	static boolean method8127(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field162.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class31.field165;
				Object[] var5 = new Object[]{(new URL(class31.field165.getCodeBase(), var0)).toString()};
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field165.getAppletContext().showDocument(new URL(class31.field165.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class26.method375(class31.field165, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class31.field165.getAppletContext().showDocument(new URL(class31.field165.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1459068118"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
