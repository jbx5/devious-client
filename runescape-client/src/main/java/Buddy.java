import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -608742771
	)
	@Export("world")
	public int world;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1329967099
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -430063719
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "915293638"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-439898435"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "723509877"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
