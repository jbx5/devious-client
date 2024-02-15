import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(1, (byte)0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(3, (byte)2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;
	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	static Archive field2612;
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = 1405247873
	)
	static int field2609;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1612326725
	)
	@Export("type")
	final int type;
	@ObfuscatedName("as")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljf;",
		garbageValue = "-2026189618"
	)
	static WorldMapSectionType[] method4994() {
		return new WorldMapSectionType[]{WORLDMAPSECTIONTYPE2, WORLDMAPSECTIONTYPE0, WORLDMAPSECTIONTYPE3, WORLDMAPSECTIONTYPE1};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZB)V",
		garbageValue = "42"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = WorldMapID.World_worlds[var6];
			WorldMapID.World_worlds[var6] = WorldMapID.World_worlds[var1];
			WorldMapID.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (Messages.method2863(WorldMapID.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = WorldMapID.World_worlds[var9];
					WorldMapID.World_worlds[var9] = WorldMapID.World_worlds[var7];
					WorldMapID.World_worlds[var7++] = var10;
				}
			}

			WorldMapID.World_worlds[var1] = WorldMapID.World_worlds[var7];
			WorldMapID.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}
}
