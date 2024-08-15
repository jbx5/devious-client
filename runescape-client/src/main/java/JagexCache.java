import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("au")
	static File field2357;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1090388895
	)
	static int field2352;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("JagexCache_randomDat")
	public static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;
	@ObfuscatedName("ah")
	static String[] field2359;
	@ObfuscatedName("cg")
	static String field2360;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}
}
