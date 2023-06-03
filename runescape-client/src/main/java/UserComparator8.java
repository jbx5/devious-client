import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
   @ObfuscatedName("ua")
   @ObfuscatedGetter(
      intValue = 1237393549
   )
   static int field1415;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   static IndexedSprite field1416;
   @ObfuscatedName("gr")
   @ObfuscatedGetter(
      intValue = -777492217
   )
   @Export("currentPort")
   static int currentPort;
   @ObfuscatedName("at")
   @Export("reversed")
   final boolean reversed;

   public UserComparator8(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lqg;Lqg;I)I",
      garbageValue = "180048199"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (Client.worldId == var1.world) {
         if (var2.world != Client.worldId) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world == Client.worldId) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-415594604"
   )
   static boolean method2852(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Ldd;",
      garbageValue = "-1140342011"
   )
   static Script method2854(int var0, int var1) {
      Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = class33.archive12.getGroupId(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = class33.archive12.takeFileFlat(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = class165.newScript(var5);
               if (var2 != null) {
                  Script.Script_cached.put(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("gg")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1243357118"
   )
   @Export("updateGameState")
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 30) {
            Client.field740.method4102();
         }

         if (Client.gameState == 0) {
            class347.client.method500();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            class347.method6613(0);
            Client.field558 = 0;
            Client.field782 = 0;
            Client.timer.method7609(var0);
            if (var0 != 20) {
               class152.method3194(false);
            }
         }

         if (var0 != 20 && var0 != 40 && ArchiveLoader.field1037 != null) {
            ArchiveLoader.field1037.close();
            ArchiveLoader.field1037 = null;
         }

         if (Client.gameState == 25) {
            Client.field576 = 0;
            Client.field572 = 0;
            Client.field573 = 1;
            Client.field574 = 0;
            Client.field580 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var3 = Client.gameState == 11 ? 4 : 0;
               HorizontalAlignment.method3679(class53.archive10, class180.archive8, false, var3);
            } else if (var0 == 11) {
               HorizontalAlignment.method3679(class53.archive10, class180.archive8, false, 4);
            } else if (var0 == 50) {
               class478.setLoginResponseString("", "Updating date of birth...", "");
               HorizontalAlignment.method3679(class53.archive10, class180.archive8, false, 7);
            } else {
               ReflectionCheck.method669();
            }
         } else {
            boolean var1 = class10.clientPreferences.method2454() >= Client.field508;
            int var2 = var1 ? 0 : 12;
            HorizontalAlignment.method3679(class53.archive10, class180.archive8, true, var2);
         }

         Client.gameState = var0;
      }
   }
}
