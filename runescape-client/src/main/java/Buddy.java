import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 324544575
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2012385153
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1400572773
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "9"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2091385929"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1754342271"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
