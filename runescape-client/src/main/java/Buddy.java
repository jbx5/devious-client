import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nt")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1881839891)
	@Export("world")
	public int world = -1;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 547305229)
	@Export("int2")
	public int int2;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1944406411)
	@Export("rank")
	public int rank;

	Buddy() {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-98")
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "40")
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-978620807")
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}