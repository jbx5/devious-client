import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gm")
@Implements("FileSystem")
public class FileSystem {
   @ObfuscatedName("af")
   @Export("FileSystem_hasPermissions")
   public static boolean FileSystem_hasPermissions = false;
   @ObfuscatedName("aw")
   @Export("FileSystem_cacheFiles")
   static Hashtable FileSystem_cacheFiles = new Hashtable(16);
   @ObfuscatedName("al")
   @Export("ItemDefinition_inMembersWorld")
   public static boolean ItemDefinition_inMembersWorld;
   @ObfuscatedName("aa")
   @Export("Tiles_hue")
   static int[] Tiles_hue;
}
