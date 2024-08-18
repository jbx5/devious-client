import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("at")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1938485659
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -295319087
	)
	@Export("type")
	int type;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 397976539
	)
	@Export("x")
	int x;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1338432725
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1025334675
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -403643135
	)
	int field1169;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1094873645
	)
	int field1170;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1482419795
	)
	int field1171;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2073992157
	)
	int field1172;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2001978311
	)
	int field1176;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1883703133
	)
	int field1174;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1201501579
	)
	int field1175;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1285541711
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1323218761
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1175 = 31;
		this.delay = 0;
		this.hitpoints = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "121"
	)
	void method2518(int var1) {
		this.field1175 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	boolean method2514(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1175 & 1 << var1) != 0;
		} else {
			return true;
		}
	}
}
