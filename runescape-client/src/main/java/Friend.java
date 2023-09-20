import java.applet.Applet;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("rq")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ac")
	boolean field4689;
	@ObfuscatedName("al")
	boolean field4688;

	Friend() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrq;B)I",
		garbageValue = "0"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) {
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) {
			return 1;
		} else if (super.world != 0 && var1.world == 0) {
			return -1;
		} else if (var1.world != 0 && super.world == 0) {
			return 1;
		} else if (this.field4689 && !var1.field4689) {
			return -1;
		} else if (!this.field4689 && var1.field4689) {
			return 1;
		} else if (this.field4688 && !var1.field4688) {
			return -1;
		} else if (!this.field4688 && var1.field4688) {
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrp;I)I",
		garbageValue = "762888653"
	)
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.compareToFriend((Friend)var1);
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lrd;",
		garbageValue = "-67"
	)
	public static class464 method8028() {
		synchronized(class464.field4775) {
			if (class464.field4774 == 0) {
				return new class464();
			} else {
				class464.field4775[--class464.field4774].method8321();
				return class464.field4775[class464.field4774];
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "2116973766"
	)
	static boolean method8021(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class31.field170.startsWith("win")) {
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
				Applet var7 = class31.field171;
				Object[] var5 = new Object[]{(new URL(class31.field171.getCodeBase(), var0)).toString()};
				Object var13 = JSObject.getWindow(var7).call(var2, var5);
				return var13 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class31.field171.getAppletContext().showDocument(new URL(class31.field171.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class31.field171;
				JSObject.getWindow(var3).call("loggedout", (Object[])null);
			} catch (Throwable var12) {
			}

			try {
				class31.field171.getAppletContext().showDocument(new URL(class31.field171.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
