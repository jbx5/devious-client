import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nm")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lle;")
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 821675641)
	@Export("world")
	public int world;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1716524007)
	@Export("int2")
	public int int2;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1730087151)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1738253192")
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-983995080")
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "20819")
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}
}