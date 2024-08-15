import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("World")
public class World {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1514045383
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1123189597
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ac")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ae")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1491934777
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1120706147
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -961216071
	)
	@Export("population")
	int population;
	@ObfuscatedName("as")
	@Export("host")
	String host;
	@ObfuscatedName("aw")
	@Export("activity")
	String activity;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 396738583
	)
	@Export("location")
	int location;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1113393411
	)
	@Export("index")
	int index;
	@ObfuscatedName("ah")
	String field810;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1593398688"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class543.field5349.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "571259477"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class543.field5344.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1497322186"
	)
	boolean method1876() {
		return (class543.field5329.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1450184699"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class543.field5355.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	boolean method1898() {
		return (class543.field5331.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-55"
	)
	boolean method1911() {
		return (class543.field5357.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-52"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class543.field5353.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "963583527"
	)
	boolean method1881() {
		return (class543.field5358.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-114"
	)
	boolean method1909() {
		return (class543.field5336.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1152597387"
	)
	boolean method1905() {
		return (class543.field5352.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ldy;[BIIIII)V",
		garbageValue = "-836374038"
	)
	static final void method1928(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 64; ++var7) {
					for (var8 = 0; var8 < 64; ++var8) {
						if (var7 + var2 > 0 && var7 + var2 < var0.collisionMaps[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.collisionMaps[var6].flags[var7 + var2].length) {
							int[] var10000 = var0.collisionMaps[var6].flags[var7 + var2];
							var10000[var3 + var8] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var2;
					int var11 = var3 + var9;
					class238.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-73"
	)
	static void method1929() {
		if (class219.worldMap != null) {
			class219.worldMap.method9076(ConcurrentMidiTask.topLevelWorldView.plane, (class354.entity.getX() >> 7) + ConcurrentMidiTask.topLevelWorldView.baseX, (class354.entity.getY() >> 7) + ConcurrentMidiTask.topLevelWorldView.baseY, false);
			class219.worldMap.loadCache();
		}

	}
}
