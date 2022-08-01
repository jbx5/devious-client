import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nh")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1154494191)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1482789283)
	@Export("world")
	public int world = -1;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1921385587)
	@Export("int2")
	public int int2;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1193472669)
	@Export("rank")
	public int rank;

	Buddy() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "0")
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "0")
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "111")
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}