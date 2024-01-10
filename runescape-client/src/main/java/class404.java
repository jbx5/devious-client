import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pl")
public final class class404 {
	@ObfuscatedName("am")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("ap")
	static long[] field4504;
	@ObfuscatedName("aq")
	@Export("cacheDir")
	static File cacheDir;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4504 = new long[12];

		for (int var0 = 0; var0 < field4504.length; ++var0) {
			field4504[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}
}
