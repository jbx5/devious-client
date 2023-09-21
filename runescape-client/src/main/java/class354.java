import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public enum class354 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	field3852(0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	field3855(1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	field3849(2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	field3851(3),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	field3848(4);

	@ObfuscatedName("kg")
	@ObfuscatedGetter(
		intValue = -958946113
	)
	static int field3856;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1156880785
	)
	final int field3853;

	class354(int var3) {
		this.field3853 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3853;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lud;IIII)V",
		garbageValue = "902612467"
	)
	static void method6777(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var6 = (long)(var3 << 16 | var1 << 8 | var2);
		var4.put(var0, var6, var0.pixels.length * 4);
	}
}
