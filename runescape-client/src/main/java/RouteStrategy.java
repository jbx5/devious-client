import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ac")
	@Export("SpriteBuffer_spritePalette")
	public static int[] SpriteBuffer_spritePalette;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 915322283
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1996518243
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 339389041
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -542422187
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIILkd;I)Z",
		garbageValue = "1206846327"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1920466385"
	)
	public static final synchronized long method5439() {
		long var0 = System.currentTimeMillis();
		if (var0 < class328.field3541) {
			class487.field5014 += class328.field3541 - var0;
		}

		class328.field3541 = var0;
		return var0 + class487.field5014;
	}
}
