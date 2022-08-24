import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.Export;
@ObfuscatedName("ma")
public final class class345 {
	@ObfuscatedName("s")
	@Export("base37Table")
	public static final char[] base37Table = new char[]{ '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("h")
	static long[] field4156 = new long[12];

	static {
		for (int var0 = 0; var0 < class345.field4156.length; ++var0) {
			field4156[var0] = ((long) (Math.pow(37.0, ((double) (var0)))));
		}
	}
}