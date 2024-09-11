import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
final class class142 implements ThreadFactory {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("WorldMapElement_archive")
	public static AbstractArchive WorldMapElement_archive;
	@ObfuscatedName("jo")
	static int[] field1664;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lhf;",
		garbageValue = "-1345284564"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1226303992"
	)
	static final float method3386(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1167392787"
	)
	static void method3383() {
		Script.Script_cached.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-128"
	)
	static final boolean method3388(int var0, int var1) {
		ObjectComposition var2 = class273.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method4160(var1);
	}
}
