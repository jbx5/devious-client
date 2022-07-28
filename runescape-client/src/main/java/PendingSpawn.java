import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ck")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("jj")
	@ObfuscatedGetter(intValue = -1558478413)
	@Export("cameraYaw")
	static int cameraYaw;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -935095583)
	@Export("plane")
	int plane;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 2082390373)
	@Export("type")
	int type;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 2034650821)
	@Export("x")
	int x;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -749667645)
	@Export("y")
	int y;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 698731611)
	@Export("objectId")
	int objectId;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1631594257)
	int field1122;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1160898001)
	int field1120;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -681056131)
	@Export("id")
	int id;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1754437145)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1874228033)
	int field1123;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 701132155)
	@Export("delay")
	int delay = 0;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -490880459)
	@Export("hitpoints")
	int hitpoints = -1;

	PendingSpawn() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;B)Z", garbageValue = "45")
	public static boolean method2250(AbstractArchive var0, AbstractArchive var1) {
		WorldMapElement.WorldMapElement_archive = var1;
		if (!var0.isFullyLoaded()) {
			return false;
		} else {
			class432.WorldMapElement_count = var0.getGroupFileCount(35);
			WorldMapElement.WorldMapElement_cached = new WorldMapElement[class432.WorldMapElement_count];
			for (int var2 = 0; var2 < class432.WorldMapElement_count; ++var2) {
				byte[] var3 = var0.takeFile(35, var2);
				WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
				if (var3 != null) {
					WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
					WorldMapElement.WorldMapElement_cached[var2].method3380();
				}
			}
			return true;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "-340952229")
	static void method2249(String var0, String var1, String var2) {
		UserComparator6.method2701(7);
		HealthBarUpdate.setLoginResponseString(var0, var1, var2);
	}
}