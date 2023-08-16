import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
public class class344 {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -1872004035
	)
	static int field3874;

	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(II)Ltx;",
		garbageValue = "2122507406"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class343.field3869, UserComparator3.method2895(var0), NpcOverrides.method3686(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
