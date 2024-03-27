import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pg")
public final class class408 {
	@ObfuscatedName("az")
	@Export("base37Table")
	static final char[] base37Table;
	@ObfuscatedName("ah")
	static long[] field4567;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4567 = new long[12];

		for (int var0 = 0; var0 < field4567.length; ++var0) {
			field4567[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
