import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public class class211 {
   @ObfuscatedName("aw")
   @Export("directions")
   static int[][] directions = new int[128][128];
   @ObfuscatedName("ac")
   @Export("distances")
   static int[][] distances = new int[128][128];
   @ObfuscatedName("al")
   @Export("bufferX")
   static int[] bufferX = new int[4096];
   @ObfuscatedName("at")
   @Export("bufferY")
   static int[] bufferY = new int[4096];

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;IZI)Lfh;",
      garbageValue = "1641739959"
   )
   public static class133 method4301(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.getFile(var2 >> 16 & '\uffff', var2 & '\uffff');
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.getFile(0, var6);
         } else {
            var7 = var1.getFile(var6, 0);
         }

         if (var7 == null) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (class374.field4387 == null) {
               class133.field1593 = Runtime.getRuntime().availableProcessors();
               class374.field4387 = new ThreadPoolExecutor(0, class133.field1593, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class133.field1593 * 100 + 100), new class130());
            }

            try {
               return new class133(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }
}
