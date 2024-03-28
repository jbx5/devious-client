import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("World")
public class World {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lck;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1731085089
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1591562381
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("aw")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ad")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("al")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -176443707
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1561127317
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1952378561
	)
	@Export("population")
	int population;
	@ObfuscatedName("ax")
	@Export("host")
	String host;
	@ObfuscatedName("ar")
	@Export("activity")
	String activity;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1695983185
	)
	@Export("location")
	int location;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1017678471
	)
	@Export("index")
	int index;
	@ObfuscatedName("ay")
	String field831;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1946335841"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class530.field5220.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2027521092"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class530.field5203.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "791710857"
	)
	boolean method1823() {
		return (class530.field5205.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1855347187"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class530.field5221.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-41"
	)
	boolean method1803() {
		return (class530.field5219.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1909979018"
	)
	boolean method1821() {
		return (class530.field5201.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-19"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class530.field5214.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1601754088"
	)
	boolean method1799() {
		return (class530.field5192.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1854422664"
	)
	boolean method1804() {
		return (class530.field5197.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "817322292"
	)
	boolean method1798() {
		return (class530.field5216.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-77"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2059246387"
	)
	public static boolean method1801(int var0) {
		return var0 >= WorldMapDecorationType.field3943.id && var0 <= WorldMapDecorationType.field3929.id;
	}
}
