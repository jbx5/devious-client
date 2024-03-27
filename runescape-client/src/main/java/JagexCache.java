import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("an")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}
}
