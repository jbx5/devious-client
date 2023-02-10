import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
@Implements("World")
public class World {
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -903850231
   )
   @Export("World_count")
   static int World_count = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -1916371087
   )
   @Export("World_listCount")
   static int World_listCount = 0;
   @ObfuscatedName("n")
   @Export("World_sortOption2")
   static int[] World_sortOption2 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("l")
   @Export("World_sortOption1")
   static int[] World_sortOption1 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("Widget_spritesArchive")
   public static AbstractArchive Widget_spritesArchive;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 2030773631
   )
   @Export("id")
   int id;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1049858737
   )
   @Export("properties")
   int properties;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 2072891101
   )
   @Export("population")
   int population;
   @ObfuscatedName("m")
   @Export("host")
   String host;
   @ObfuscatedName("t")
   @Export("activity")
   String activity;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -546644607
   )
   @Export("location")
   int location;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 118415625
   )
   @Export("index")
   int index;

   World() {
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1502767212"
   )
   @Export("isMembersOnly")
   boolean isMembersOnly() {
      return (1 & this.properties) != 0;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1721243202"
   )
   boolean method1823() {
      return (2 & this.properties) != 0;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-506019028"
   )
   @Export("isPvp")
   boolean isPvp() {
      return (4 & this.properties) != 0;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "32"
   )
   boolean method1789() {
      return (8 & this.properties) != 0;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-51668830"
   )
   @Export("isDeadman")
   boolean isDeadman() {
      return (536870912 & this.properties) != 0;
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2035293626"
   )
   @Export("isBeta")
   boolean isBeta() {
      return (33554432 & this.properties) != 0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "0"
   )
   boolean method1774() {
      return (1073741824 & this.properties) != 0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-513568052"
   )
   boolean method1781() {
      return (256 & this.properties) != 0;
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-1"
   )
   boolean method1782() {
      return (134217728 & this.properties) != 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Llm;IIIBZI)V",
      garbageValue = "-1460079135"
   )
   @Export("requestNetFile")
   static void requestNetFile(Archive var0, int var1, int var2, int var3, byte var4, boolean var5) {
      long var6 = (long)((var1 << 16) + var2);
      NetFileRequest var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityWrites.get(var6);
      if (var8 == null) {
         var8 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.get(var6);
         if (var8 == null) {
            var8 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var6);
            if (var8 != null) {
               if (var5) {
                  var8.removeDual();
                  NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
                  --NetCache.NetCache_pendingWritesCount;
                  ++NetCache.NetCache_pendingPriorityWritesCount;
               }

            } else {
               if (!var5) {
                  var8 = (NetFileRequest)NetCache.NetCache_pendingResponses.get(var6);
                  if (var8 != null) {
                     return;
                  }
               }

               var8 = new NetFileRequest();
               var8.archive = var0;
               var8.crc = var3;
               var8.padding = var4;
               if (var5) {
                  NetCache.NetCache_pendingPriorityWrites.put(var8, var6);
                  ++NetCache.NetCache_pendingPriorityWritesCount;
               } else {
                  NetCache.NetCache_pendingWritesQueue.addFirst(var8);
                  NetCache.NetCache_pendingWrites.put(var8, var6);
                  ++NetCache.NetCache_pendingWritesCount;
               }

            }
         }
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "963791002"
   )
   public static void method1830() {
      WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZB)I",
      garbageValue = "21"
   )
   static int method1825(int var0, Script var1, boolean var2) {
      if (var0 == 7108) {
         Interpreter.Interpreter_intStack[++class302.Interpreter_intStackSize - 1] = class287.method5579() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      descriptor = "(Lkz;IIIIIII)V",
      garbageValue = "-1837996894"
   )
   static final void method1791(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Client.field681) {
         Client.alternativeScrollbarWidth = 32;
      } else {
         Client.alternativeScrollbarWidth = 0;
      }

      Client.field681 = false;
      int var7;
      if (MouseHandler.MouseHandler_currentButton == 1 || !ClanMate.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.scrollY -= 4;
            LoginScreenAnimation.invalidateWidget(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.scrollY += 4;
            LoginScreenAnimation.invalidateWidget(var0);
         } else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.scrollY = var8 * (var4 - var3) / var9;
            LoginScreenAnimation.invalidateWidget(var0);
            Client.field681 = true;
         }
      }

      if (Client.mouseWheelRotation != 0) {
         var7 = var0.width;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.scrollY += Client.mouseWheelRotation * 45;
            LoginScreenAnimation.invalidateWidget(var0);
         }
      }

   }
}
