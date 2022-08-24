import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ci")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -2038881543)
	@Export("plane")
	int plane;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1829738397)
	@Export("type")
	int type;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1805977901)
	@Export("x")
	int x;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1439978855)
	@Export("y")
	int y;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1234401291)
	@Export("objectId")
	int objectId;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -6293433)
	int field1118;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 411557473)
	int field1119;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1740994599)
	@Export("id")
	int id;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1726055575)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -603611573)
	int field1122;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1698221163)
	@Export("delay")
	int delay = 0;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1174693975)
	@Export("hitpoints")
	int hitpoints = -1;

	PendingSpawn() {
	}
}