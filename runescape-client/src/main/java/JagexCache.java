import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("JagexCache")
public class JagexCache {
   @ObfuscatedName("x")
   @Export("JagexCache_locationFile")
   static File JagexCache_locationFile;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -519133061
   )
   @Export("idxCount")
   public static int idxCount;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lqx;"
   )
   @Export("JagexCache_randomDat")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lqx;"
   )
   @Export("JagexCache_dat2File")
   public static BufferedFile JagexCache_dat2File = null;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lqx;"
   )
   @Export("JagexCache_idx255File")
   public static BufferedFile JagexCache_idx255File = null;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "[Lqx;"
   )
   @Export("JagexCache_idxFiles")
   public static BufferedFile[] JagexCache_idxFiles;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1962975775
   )
   @Export("cacheGamebuild")
   public static int cacheGamebuild;
}
