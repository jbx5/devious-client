import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gh")
@Implements("FileSystem")
public class FileSystem {
   @ObfuscatedName("aj")
   @Export("FileSystem_hasPermissions")
   static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("al")
   @Export("FileSystem_cacheDir")
   static File FileSystem_cacheDir;
   @ObfuscatedName("ac")
   @Export("FileSystem_cacheFiles")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);
}
