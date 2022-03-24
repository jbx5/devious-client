import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fu")
@Implements("FileSystem")
public class FileSystem {
	@ObfuscatedName("v")
	@Export("FileSystem_hasPermissions")
	public static boolean FileSystem_hasPermissions;
	@ObfuscatedName("h")
	@Export("FileSystem_cacheFiles")
	static Hashtable FileSystem_cacheFiles;
	static 
	{
		FileSystem_hasPermissions = false;
		FileSystem_cacheFiles = new Hashtable(16);
	}
}