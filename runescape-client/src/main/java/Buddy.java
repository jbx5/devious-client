import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1511931945
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1071937363
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 2031106589
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-937756802"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "353004786"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1805188162"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}
