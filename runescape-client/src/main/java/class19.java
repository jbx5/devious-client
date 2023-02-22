import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("at")
public class class19 implements Callable {
   @ObfuscatedName("uh")
   @ObfuscatedGetter(
      intValue = 419723581
   )
   static int field104;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lgn;"
   )
   static ClanChannel field107;
   @ObfuscatedName("sf")
   @ObfuscatedSignature(
      descriptor = "Lgn;"
   )
   @Export("guestClanChannel")
   static ClanChannel guestClanChannel;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lak;"
   )
   final class10 field102;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lam;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lam;Lak;)V"
   )
   class19(class14 var1, class10 var2) {
      this.this$0 = var1;
      this.field102 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field102.method81()) {
            Login.method2088(10L);
         }
      } catch (IOException var2) {
         return new class20("Error servicing REST query: " + var2.getMessage());
      }

      return this.field102.method89();
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-608378874"
   )
   public static int method282(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "190436510"
   )
   @Export("updateGameState")
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 30) {
            Client.field713.method4070();
         }

         if (Client.gameState == 0) {
            class392.client.method507();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            class60.method1155(0);
            Client.field549 = 0;
            Client.field516 = 0;
            Client.timer.method7333(var0);
            if (var0 != 20) {
               class130.method3030(false);
            }
         }

         if (var0 != 20 && var0 != 40 && FloorDecoration.field2411 != null) {
            FloorDecoration.field2411.close();
            FloorDecoration.field2411 = null;
         }

         if (Client.gameState == 25) {
            Client.field501 = 0;
            Client.field627 = 0;
            Client.field479 = 1;
            Client.field548 = 0;
            Client.field775 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var3 = Client.gameState == 11 ? 4 : 0;
               PlayerComposition.method5782(AABB.archive10, class143.archive8, false, var3);
            } else if (var0 == 11) {
               PlayerComposition.method5782(AABB.archive10, class143.archive8, false, 4);
            } else if (var0 == 50) {
               Tile.setLoginResponseString("", "Updating date of birth...", "");
               PlayerComposition.method5782(AABB.archive10, class143.archive8, false, 7);
            } else {
               ModeWhere.method6667();
            }
         } else {
            boolean var1 = WorldMapSectionType.clientPreferences.method2448() >= Client.field486;
            int var2 = var1 ? 0 : 12;
            PlayerComposition.method5782(AABB.archive10, class143.archive8, true, var2);
         }

         Client.gameState = var0;
      }
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-194934658"
   )
   static void method278(int var0, int var1) {
      if (WorldMapSectionType.clientPreferences.method2440() != 0 && var0 != -1) {
         class163.method3352(class36.field239, var0, 0, WorldMapSectionType.clientPreferences.method2440(), false);
         Client.playingJingle = true;
      }

   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(ZLsq;B)V",
      garbageValue = "-16"
   )
   static final void method281(boolean var0, PacketBuffer var1) {
      while(true) {
         byte var2 = 16;
         int var3 = 1 << var2;
         if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) {
            int var4 = var1.readBits(var2);
            if (var4 != var3 - 1) {
               boolean var5 = false;
               if (Client.npcs[var4] == null) {
                  Client.npcs[var4] = new NPC();
                  var5 = true;
               }

               NPC var6 = Client.npcs[var4];
               Client.npcIndices[++Client.npcCount - 1] = var4;
               var6.npcCycle = Client.cycle;
               int var10 = var1.readBits(1);
               if (var10 == 1) {
                  Client.field662[++Client.field539 - 1] = var4;
               }

               var6.definition = class188.getNpcDefinition(var1.readBits(14));
               int var9;
               if (var0) {
                  var9 = var1.readBits(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var1.readBits(5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }
               }

               int var7 = var1.readBits(1);
               boolean var11 = var1.readBits(1) == 1;
               if (var11) {
                  var1.readBits(32);
               }

               int var8;
               if (var0) {
                  var8 = var1.readBits(8);
                  if (var8 > 127) {
                     var8 -= 256;
                  }
               } else {
                  var8 = var1.readBits(5);
                  if (var8 > 15) {
                     var8 -= 32;
                  }
               }

               int var12 = Client.defaultRotations[var1.readBits(3)];
               if (var5) {
                  var6.orientation = var6.rotation = var12;
               }

               class418.method7808(var6);
               if (var6.field1209 == 0) {
                  var6.rotation = 0;
               }

               var6.method2557(BuddyRankComparator.localPlayer.pathX[0] + var8, BuddyRankComparator.localPlayer.pathY[0] + var9, var7 == 1);
               continue;
            }
         }

         var1.exportIndex();
         return;
      }
   }
}
