import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -362162455
	)
	@Export("approxDestinationX")
	public int approxDestinationX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1731708745
	)
	@Export("approxDestinationY")
	public int approxDestinationY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 220941055
	)
	@Export("approxDestinationSizeX")
	public int approxDestinationSizeX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -558872821
	)
	@Export("approxDestinationSizeY")
	public int approxDestinationSizeY;

	protected RouteStrategy() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILko;I)Z",
		garbageValue = "1947951630"
	)
	@Export("hasArrived")
	protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)I",
		garbageValue = "0"
	)
	static final int method5726(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5337) {
			case 7:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([BZI)Ljava/lang/Object;",
		garbageValue = "-732909265"
	)
	public static Object method5729(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}
}
