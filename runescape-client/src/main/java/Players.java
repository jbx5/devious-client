import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
@Implements("Players")
public class Players {
   @ObfuscatedName("v")
   static byte[] field1370 = new byte[2048];
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "[Lgs;"
   )
   static class204[] field1379 = new class204[2048];
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "[Lqy;"
   )
   static Buffer[] field1372 = new Buffer[2048];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -316088161
   )
   @Export("Players_count")
   static int Players_count = 0;
   @ObfuscatedName("f")
   @Export("Players_indices")
   static int[] Players_indices = new int[2048];
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 888769669
   )
   @Export("Players_emptyIdxCount")
   static int Players_emptyIdxCount = 0;
   @ObfuscatedName("u")
   @Export("Players_emptyIndices")
   static int[] Players_emptyIndices = new int[2048];
   @ObfuscatedName("b")
   @Export("Players_regions")
   static int[] Players_regions = new int[2048];
   @ObfuscatedName("j")
   @Export("Players_orientations")
   static int[] Players_orientations = new int[2048];
   @ObfuscatedName("g")
   @Export("Players_targetIndices")
   static int[] Players_targetIndices = new int[2048];
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 279882375
   )
   @Export("Players_pendingUpdateCount")
   static int Players_pendingUpdateCount = 0;
   @ObfuscatedName("o")
   @Export("Players_pendingUpdateIndices")
   static int[] Players_pendingUpdateIndices = new int[2048];
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   static Buffer field1382 = new Buffer(new byte[5000]);

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1396196168"
   )
   @Export("loadInterface")
   public static boolean loadInterface(int var0) {
      if (Language.Widget_loadedInterfaces[var0]) {
         return true;
      } else if (!class422.Widget_archive.tryLoadGroup(var0)) {
         return false;
      } else {
         int var1 = class422.Widget_archive.getGroupFileCount(var0);
         if (var1 == 0) {
            Language.Widget_loadedInterfaces[var0] = true;
            return true;
         } else {
            if (class71.Widget_interfaceComponents[var0] == null) {
               class71.Widget_interfaceComponents[var0] = new Widget[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if (class71.Widget_interfaceComponents[var0][var2] == null) {
                  byte[] var3 = class422.Widget_archive.takeFile(var0, var2);
                  if (var3 != null) {
                     class71.Widget_interfaceComponents[var0][var2] = new Widget();
                     class71.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
                     if (var3[0] == -1) {
                        class71.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
                     } else {
                        class71.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
                     }
                  }
               }
            }

            Language.Widget_loadedInterfaces[var0] = true;
            return true;
         }
      }
   }
}
