import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Players")
public class Players {
   @ObfuscatedName("tt")
   @ObfuscatedGetter(
      intValue = 994098816
   )
   static int field1352;
   @ObfuscatedName("v")
   static byte[] field1353 = new byte[2048];
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lhz;"
   )
   static class208[] field1340 = new class208[2048];
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "[Lrd;"
   )
   static Buffer[] field1341 = new Buffer[2048];
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1794629455
   )
   @Export("Players_count")
   static int Players_count = 0;
   @ObfuscatedName("i")
   @Export("Players_indices")
   static int[] Players_indices = new int[2048];
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 417558415
   )
   @Export("Players_emptyIdxCount")
   static int Players_emptyIdxCount = 0;
   @ObfuscatedName("l")
   @Export("Players_emptyIndices")
   static int[] Players_emptyIndices = new int[2048];
   @ObfuscatedName("k")
   @Export("Players_regions")
   static int[] Players_regions = new int[2048];
   @ObfuscatedName("c")
   @Export("Players_orientations")
   static int[] Players_orientations = new int[2048];
   @ObfuscatedName("r")
   @Export("Players_targetIndices")
   static int[] Players_targetIndices = new int[2048];
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -542142145
   )
   @Export("Players_pendingUpdateCount")
   static int Players_pendingUpdateCount = 0;
   @ObfuscatedName("m")
   @Export("Players_pendingUpdateIndices")
   static int[] Players_pendingUpdateIndices = new int[2048];
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   static Buffer field1351 = new Buffer(new byte[5000]);

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(ILoi;Llm;I)V",
      garbageValue = "-1261818676"
   )
   static void method2749(int var0, ArchiveDisk var1, Archive var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 1;
      var3.key = (long)var0;
      var3.archiveDisk = var1;
      var3.archive = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      class288.method5590();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "4"
   )
   public static int method2734(int var0) {
      return WallDecoration.method4863(ViewportMouse.ViewportMouse_entityTags[var0]);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lbw;Lbw;IZI)I",
      garbageValue = "1916884447"
   )
   @Export("compareWorlds")
   static int compareWorlds(World var0, World var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.population;
         int var5 = var1.population;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.location - var1.location;
      } else if (var2 == 3) {
         if (var0.activity.equals("-")) {
            if (var1.activity.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.activity.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.activity.compareTo(var1.activity);
         }
      } else if (var2 == 4) {
         return var0.method1789() ? (var1.method1789() ? 0 : 1) : (var1.method1789() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1823() ? (var1.method1823() ? 0 : 1) : (var1.method1823() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
      } else {
         return var0.id - var1.id;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1515481571"
   )
   static final int method2742(int var0, int var1) {
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
}
