import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bk")
@Implements("World")
public class World {
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 421072963)
	@Export("World_count")
	static int World_count = 0;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1478653531)
	@Export("World_listCount")
	static int World_listCount = 0;

	@ObfuscatedName("j")
	@Export("World_sortOption2")
	static int[] World_sortOption2 = new int[]{ 1, 1, 1, 1 };

	@ObfuscatedName("h")
	@Export("World_sortOption1")
	static int[] World_sortOption1 = new int[]{ 0, 1, 2, 3 };

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1976884449)
	@Export("id")
	int id;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -2140124153)
	@Export("properties")
	int properties;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -1803769653)
	@Export("population")
	int population;

	@ObfuscatedName("g")
	@Export("host")
	String host;

	@ObfuscatedName("p")
	@Export("activity")
	String activity;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -940303367)
	@Export("location")
	int location;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 355835315)
	@Export("index")
	int index;

	World() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "2")
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "-10016")
	boolean method1642() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "55")
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1692512163")
	boolean method1644() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-116")
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "615462888")
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-51")
	boolean method1647() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "4")
	static final int method1692(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 'ﾀ') + var1;
		}
	}
}