import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class132 implements class123 {
   @ObfuscatedName("ao")
   @Export("musicTrackBoolean")
   public static boolean musicTrackBoolean;

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("getGcDuration")
   protected static int getGcDuration() {
      int var0 = 0;
      if (class405.garbageCollector == null || !class405.garbageCollector.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  class405.garbageCollector = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
         }
      }

      if (class405.garbageCollector != null) {
         long var9 = BoundaryObject.method5027();
         long var3 = class405.garbageCollector.getCollectionTime();
         if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
            long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
            if (var7 != 0L) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         GameEngine.garbageCollectorLastCollectionTime = var3;
         GameEngine.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "578044573"
   )
   static final int method3034() {
      return Client.menuOptionsCount - 1;
   }
}
