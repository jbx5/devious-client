import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import net.runelite.mapping.Export;
@ObfuscatedName("j")
public final class class4 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lqu;")
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;

	@ObfuscatedName("ee")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive20")
	static Archive archive20;

	@ObfuscatedName("hw")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1151585250")
	static final void method11() {
		for (PendingSpawn var0 = ((PendingSpawn) (Client.pendingSpawns.last())); var0 != null; var0 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				class151.method3146(var0);
			} else {
				var0.remove();
			}
		}
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIII)V", garbageValue = "-1285432829")
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		class268.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-2033528269")
	static void method12(String var0) {
		GrandExchangeOfferTotalQuantityComparator.field4045 = var0;
		try {
			String var1 = class353.client.getParameter(Integer.toString(18));
			String var2 = class353.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + NPC.method2382(class115.method2692() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Client var4 = class353.client;
			String var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var4).eval(var5);
		} catch (Throwable var6) {
		}
	}
}