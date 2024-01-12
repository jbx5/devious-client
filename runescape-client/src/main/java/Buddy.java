import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("Buddy")
public class Buddy extends User {
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Luc;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 250013891
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 493572503
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -543157203
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "734486288"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-4063"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "22"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "91806107"
	)
	static int method8383(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}
}
