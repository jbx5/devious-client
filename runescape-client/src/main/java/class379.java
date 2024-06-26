import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
public enum class379 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4429(-1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4430(0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4431(1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	field4432(2);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2095821695
	)
	public static int field4434;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1933661759
	)
	final int field4433;

	class379(int var3) {
		this.field4433 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4433;
	}

	@ObfuscatedName("pe")
	@ObfuscatedSignature(
		descriptor = "(II)Luh;",
		garbageValue = "-103845045"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(AbstractWorldMapData.field2675, class162.method3436(var0), class414.method7619(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
