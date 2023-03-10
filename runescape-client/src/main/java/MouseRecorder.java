import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("Widget_archive")
   static AbstractArchive Widget_archive;
   @ObfuscatedName("aj")
   @Export("isRunning")
   boolean isRunning = true;
   @ObfuscatedName("al")
   @Export("lock")
   Object lock = new Object();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 391327875
   )
   @Export("index")
   int index = 0;
   @ObfuscatedName("ab")
   @Export("xs")
   int[] xs = new int[500];
   @ObfuscatedName("an")
   @Export("ys")
   int[] ys = new int[500];
   @ObfuscatedName("ao")
   @Export("millis")
   long[] millis = new long[500];

   MouseRecorder() {
   }

   public void run() {
      for(; this.isRunning; Login.method2088(50L)) {
         synchronized(this.lock) {
            if (this.index < 500) {
               this.xs[this.index] = MouseHandler.MouseHandler_x;
               this.ys[this.index] = MouseHandler.MouseHandler_y;
               this.millis[this.index] = MouseHandler.MouseHandler_millis;
               ++this.index;
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;I)Z",
      garbageValue = "-721972548"
   )
   public static boolean method2272(AbstractArchive var0, AbstractArchive var1) {
      WorldMapElement.WorldMapElement_archive = var1;
      if (!var0.isFullyLoaded()) {
         return false;
      } else {
         WorldMapElement.WorldMapElement_count = var0.getGroupFileCount(35);
         WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

         for(int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
            byte[] var3 = var0.takeFile(35, var2);
            WorldMapElement.WorldMapElement_cached[var2] = new WorldMapElement(var2);
            if (var3 != null) {
               WorldMapElement.WorldMapElement_cached[var2].decode(new Buffer(var3));
               WorldMapElement.WorldMapElement_cached[var2].method3564();
            }
         }

         return true;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-163022320"
   )
   @Export("sortItemsByName")
   public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         sortItemsByName(var0, var1, var2, var5 - 1);
         sortItemsByName(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1593708548"
   )
   public static void method2275(int var0, int var1) {
      VarbitComposition var3 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
      VarbitComposition var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
         var3 = new VarbitComposition();
         if (var4 != null) {
            var3.decode(new Buffer(var4));
         }

         VarbitComposition.VarbitDefinition_cached.put(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.baseVar;
      int var5 = var2.startBit;
      int var6 = var2.endBit;
      int var7 = Varps.Varps_masks[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
   }
}
