import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("lq")
public class class329 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lql;")
	static IndexedSprite field4111;

	@ObfuscatedName("l")
	@Export("cacheParentPaths")
	public static String[] cacheParentPaths;

	@ObfuscatedName("ad")
	@Export("client")
	@ObfuscatedSignature(descriptor = "Lclient;")
	static Client client;

	static {
		new HashMap();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lbk;Lbk;IZI)I", garbageValue = "-1110392385")
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}
				if (var5 == -1) {
					var5 = 2001;
				}
			}
			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1644() ? var1.method1644() ? 0 : 1 : var1.method1644() ? -1 : 0;
		} else if (var2 == 5) {
			return var0.method1642() ? var1.method1642() ? 0 : 1 : var1.method1642() ? -1 : 0;
		} else if (var2 == 6) {
			return var0.isPvp() ? var1.isPvp() ? 0 : 1 : var1.isPvp() ? -1 : 0;
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? var1.isMembersOnly() ? 0 : 1 : var1.isMembersOnly() ? -1 : 0;
		} else {
			return var0.id - var1.id;
		}
	}
}