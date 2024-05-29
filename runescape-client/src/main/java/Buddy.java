import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 580704417
	)
	@Export("world")
	public int world;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1407439113
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -772085279
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2133598257"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1192304992"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
