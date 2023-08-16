import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -102970783
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1216826241
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 883188487
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -610372655
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIILis;B)Z",
		garbageValue = "85"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1131670989"
	)
	static void method4187() {
		if (Client.field764) {
			class92.addPlayerToScene(VarbitComposition.localPlayer, false);
		}

	}
}
