import java.io.File;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fn")
@Implements("FileSystem")
public class FileSystem {
   @ObfuscatedName("a")
   @Export("FileSystem_hasPermissions")
   static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("f")
   @Export("FileSystem_cacheDir")
   static File FileSystem_cacheDir;
   @ObfuscatedName("c")
   @Export("FileSystem_cacheFiles")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);
   @ObfuscatedName("hv")
   @ObfuscatedGetter(
      longValue = 1699896206902914651L
   )
   static long field1807;
}
