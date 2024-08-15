import java.applet.Applet;
import java.net.URL;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("pj")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	static Bounds field4548;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;I)I",
		garbageValue = "-543475618"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lqf;",
		garbageValue = "276930367"
	)
	public static class424 method7406() {
		synchronized(class424.field4676) {
			if (AbstractUserComparator.field4921 == 0) {
				return new class424();
			} else {
				class424.field4676[--AbstractUserComparator.field4921].method7833();
				return class424.field4676[AbstractUserComparator.field4921];
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-543219807"
	)
	static boolean method7414(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field143.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var14 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var14.indexOf(var0.charAt(var4)) == -1) {
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
				Applet var7 = class31.field138;
				Object[] var5 = new Object[]{(new URL(class31.field138.getCodeBase(), var0)).toString()};
				Object var13 = JSObject.getWindow(var7).call(var2, var5);
				return var13 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field138.getAppletContext().showDocument(new URL(class31.field138.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field138;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var12) {
			}

			try {
				class31.field138.getAppletContext().showDocument(new URL(class31.field138.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
