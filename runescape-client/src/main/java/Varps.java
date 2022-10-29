import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Varps")
public class Varps {
   @ObfuscatedName("a")
   @Export("Varps_masks")
   static int[] Varps_masks = new int[32];
   @ObfuscatedName("f")
   @Export("Varps_temp")
   public static int[] Varps_temp;
   @ObfuscatedName("c")
   @Export("Varps_main")
   public static int[] Varps_main;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         Varps_masks[var1] = var0 - 1;
         var0 += var0;
      }

      Varps_temp = new int[4000];
      Varps_main = new int[4000];
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-782669259"
   )
   static final int method5679(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      descriptor = "(IZZZZI)Llx;",
      garbageValue = "1492192827"
   )
   @Export("newArchive")
   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      ArchiveDisk var5 = null;
      if (JagexCache.JagexCache_dat2File != null) {
         var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[var0], 1000000);
      }

      return new Archive(var5, GameObject.masterDisk, var0, var1, var2, var3, var4);
   }
}
