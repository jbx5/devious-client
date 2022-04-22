import java.applet.Applet;
import java.net.URL;





import netscape.javascript.JSObject; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ux")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1984278839)

	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-685471761)

	@Export("type")
	int type;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1470046835)

	@Export("x")
	int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	241546961)

	@Export("y")
	int y;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1849366507)

	@Export("objectId")
	int objectId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1969851359)

	int field1104;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-2130994383)

	int field1105;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-406866951)

	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	1916353905)

	@Export("orientation")
	int orientation;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1901242165)

	int field1107;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	1886053549)

	@Export("delay")
	int delay;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-758552801)

	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ILjava/lang/String;I)Z", garbageValue = 
	"1938115950")

	static boolean method2165(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field175.startsWith("win")) {
					throw new Exception();
				} else if ((!var0.startsWith("http://")) && (!var0.startsWith("https://"))) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == (-1)) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec(("cmd /c start \"j\" \"" + var0) + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class29.field176;
				Object[] var5 = new Object[]{ new URL(class29.field176.getCodeBase(), var0).toString() };
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field176.getAppletContext().showDocument(new URL(class29.field176.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class27.method383(class29.field176, "loggedout");
			} catch (Throwable var12) {
			}

			try {
				class29.field176.getAppletContext().showDocument(new URL(class29.field176.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("fd")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-617620981")

	static boolean method2166() {
		if ((Client.archiveLoaders != null) && (Client.archiveLoadersDone < Client.archiveLoaders.size())) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = ((ArchiveLoader) (Client.archiveLoaders.get(Client.archiveLoadersDone)));
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			} 

			return true;
		} else {
			return true;
		}
	}
}