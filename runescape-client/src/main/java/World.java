import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("World")
public class World {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2131264189
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2090683731
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("ab")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("ac")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1955345391
	)
	@Export("id")
	int id;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -169166189
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1068316549
	)
	@Export("population")
	int population;
	@ObfuscatedName("ap")
	@Export("host")
	String host;
	@ObfuscatedName("ae")
	@Export("activity")
	String activity;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -157204183
	)
	@Export("location")
	int location;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -418279125
	)
	@Export("index")
	int index;
	@ObfuscatedName("au")
	String field832;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "69"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (class541.field5314.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-45"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (class541.field5313.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2058456341"
	)
	boolean method1849() {
		return (class541.field5297.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "686436199"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (class541.field5299.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "420125938"
	)
	boolean method1836() {
		return (class541.field5303.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "386339978"
	)
	boolean method1837() {
		return (class541.field5326.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "918975274"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (class541.field5322.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-122"
	)
	boolean method1883() {
		return (class541.field5327.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1943712944"
	)
	boolean method1840() {
		return (class541.field5300.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "91"
	)
	boolean method1881() {
		return (class541.field5302.rsOrdinal() & this.properties) != 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)Lik;",
		garbageValue = "29"
	)
	static Sound method1885(Buffer var0) {
		if (var0 != null) {
			boolean var1 = false;
			boolean var2 = false;
			boolean var3 = false;
			boolean var4 = false;
			int var5 = var0.readUnsignedShort();
			int var6 = var0.readUnsignedByte();
			int var7 = var0.readUnsignedByte();
			int var8 = var0.readUnsignedByte();
			if (var5 >= 1 && var6 >= 1 && var7 >= 0 && var8 >= 0) {
				return new Sound(var5, var6, var7, var8);
			}
		}

		return null;
	}
}
