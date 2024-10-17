import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("JagexCache")
public class JagexCache {
	@ObfuscatedName("ai")
	@Export("cacheDir")
	static File cacheDir;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -372511661
	)
	static int field2391;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("JagexCache_randomDat")
	static BufferedFile JagexCache_randomDat;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("JagexCache_dat2File")
	public static BufferedFile JagexCache_dat2File;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	@Export("JagexCache_idx255File")
	public static BufferedFile JagexCache_idx255File;

	static {
		JagexCache_randomDat = null;
		JagexCache_dat2File = null;
		JagexCache_idx255File = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lui;",
		garbageValue = "-113"
	)
	public static class544 method4512(int var0) {
		int var1 = class542.field5377[var0];
		if (var1 == 1) {
			return class544.field5385;
		} else if (var1 == 2) {
			return class544.field5381;
		} else {
			return var1 == 3 ? class544.field5380 : null;
		}
	}
}
