import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("ak")
	@Export("FileSystem_hasPermissions")
	static boolean FileSystem_hasPermissions;
	@ObfuscatedName("aj")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;

	static {
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvc;IIIB)V",
		garbageValue = "52"
	)
	static void method3638(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var6 = (long)(var3 << 16 | var1 << 8 | var2);
		var4.put(var0, var6, var0.pixels.length * 4);
	}
}
