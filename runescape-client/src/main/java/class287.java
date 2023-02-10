import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
public class class287 {
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1183278198"
   )
   @Export("getGcDuration")
   protected static int getGcDuration() {
      int var0 = 0;
      if (class14.garbageCollector == null || !class14.garbageCollector.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  class14.garbageCollector = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
         }
      }

      if (class14.garbageCollector != null) {
         long var9 = class153.method3317();
         long var3 = class14.garbageCollector.getCollectionTime();
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

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-133010506"
   )
   static final boolean method5579() {
      return Client.isMenuOpen;
   }
}
