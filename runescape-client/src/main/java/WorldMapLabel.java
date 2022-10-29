import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapLabel")
public class WorldMapLabel {
   @ObfuscatedName("a")
   @Export("text")
   String text;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1062281855
   )
   @Export("width")
   int width;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 128768729
   )
   @Export("height")
   int height;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   @Export("size")
   WorldMapLabelSize size;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IILhb;)V"
   )
   WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
      this.text = var1;
      this.width = var2;
      this.height = var3;
      this.size = var4;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "927826836"
   )
   @Export("getGcDuration")
   protected static int getGcDuration() {
      int var0 = 0;
      if (WallDecoration.garbageCollector == null || !WallDecoration.garbageCollector.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  WallDecoration.garbageCollector = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
         }
      }

      if (WallDecoration.garbageCollector != null) {
         long var9 = UserComparator8.method2748();
         long var3 = WallDecoration.garbageCollector.getCollectionTime();
         if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
            long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
            if (0L != var7) {
               var0 = (int)(100L * var5 / var7);
            }
         }

         GameEngine.garbageCollectorLastCollectionTime = var3;
         GameEngine.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }

   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "5021"
   )
   static void method5157() {
      if (class7.worldMap != null) {
         class7.worldMap.method7888(ApproximateRouteStrategy.Client_plane, KeyHandler.baseX * 64 + (class296.localPlayer.x >> 7), class158.baseY * 64 + (class296.localPlayer.y >> 7), false);
         class7.worldMap.loadCache();
      }

   }

   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      descriptor = "(Lco;I)Z",
      garbageValue = "58335505"
   )
   static boolean method5159(Player var0) {
      if (Client.drawPlayerNames == 0) {
         return false;
      } else if (class296.localPlayer == var0) {
         return class453.method8254();
      } else {
         boolean var1 = class313.method6247();
         boolean var2;
         if (!var1) {
            var2 = (Client.drawPlayerNames & 1) != 0;
            var1 = var2 && var0.isFriend();
         }

         var2 = var1;
         if (!var1) {
            boolean var3 = (Client.drawPlayerNames & 2) != 0;
            var2 = var3 && var0.isFriendsChatMember();
         }

         return var2;
      }
   }
}
