import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
@Implements("World")
public class World {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Lbo;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2103690427
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1377225853
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("q")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("m")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 256284629
	)
	@Export("id")
	int id;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -854169725
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1224237209
	)
	@Export("population")
	int population;
	@ObfuscatedName("t")
	@Export("host")
	String host;
	@ObfuscatedName("u")
	@Export("activity")
	String activity;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1899325135
	)
	@Export("location")
	int location;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -764088689
	)
	@Export("index")
	int index;

	static {
		World_count = 0; // L: 14
		World_listCount = 0; // L: 15
		World_sortOption2 = new int[]{1, 1, 1, 1}; // L: 16
		World_sortOption1 = new int[]{0, 1, 2, 3}; // L: 17
	}

	World() {
	} // L: 27

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0; // L: 247
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2072179057"
	)
	boolean method1729() {
		return (2 & this.properties) != 0; // L: 251
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "727679569"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0; // L: 255
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "20"
	)
	boolean method1731() {
		return (8 & this.properties) != 0; // L: 259
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1070748958"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0; // L: 263
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-414576000"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0; // L: 267
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-132075269"
	)
	boolean method1739() {
		return (1073741824 & this.properties) != 0; // L: 271
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "16"
	)
	boolean method1735() {
		return (256 & this.properties) != 0; // L: 275
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1870138125"
	)
	boolean method1777() {
		return (134217728 & this.properties) != 0; // L: 279
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Lbh;IIS)V",
		garbageValue = "339"
	)
	static final void method1782(MenuAction var0, int var1, int var2) {
		if (var0 != null) { // L: 8367
			class17.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.action, var0.target, var1, var2); // L: 8368
		}

	} // L: 8370
}
