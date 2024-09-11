import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lgm;"
	)
	static ClanChannel field1220;
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field1213;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1988317559
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 80105317
	)
	@Export("type")
	int type;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 119580921
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1436696995
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 753760443
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 127055519
	)
	int field1210;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1767652333
	)
	int field1211;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1729618773
	)
	int field1215;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -646332557
	)
	int field1212;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1642492447
	)
	int field1214;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -828917415
	)
	int field1221;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -371057347
	)
	int field1217;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 205361541
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1115245231
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1217 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1905270664"
	)
	void method2628(int var1) {
		this.field1217 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2132723898"
	)
	boolean method2629(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1217 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "996593762"
	)
	public static boolean method2633() {
		return Client.clickedWidget != null;
	}
}
