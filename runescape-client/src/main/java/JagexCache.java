import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ak")
	static File field2357;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luf;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -191524709
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("aw")
	@Export("osName")
	static String osName;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}
}
