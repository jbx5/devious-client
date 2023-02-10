import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class246 {
   @ObfuscatedName("fi")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1717042974"
   )
   @Export("updateGameState")
   static void updateGameState(int var0) {
      if (var0 != Client.gameState) {
         if (Client.gameState == 30) {
            Client.field752.method4097();
         }

         if (Client.gameState == 0) {
            Decimator.client.method632();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            ModeWhere.method6787(0);
            Client.field532 = 0;
            Client.field533 = 0;
            Client.timer.method7393(var0);
            if (var0 != 20) {
               class373.method7183(false);
            }
         }

         if (var0 != 20 && var0 != 40 && WorldMapLabelSize.field2818 != null) {
            WorldMapLabelSize.field2818.close();
            WorldMapLabelSize.field2818 = null;
         }

         if (Client.gameState == 25) {
            Client.field744 = 0;
            Client.field565 = 0;
            Client.field566 = 1;
            Client.field567 = 0;
            Client.field568 = 1;
         }

         int var1;
         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               var1 = Client.gameState == 11 ? 4 : 0;
               class129.method3086(ApproximateRouteStrategy.archive10, WorldMapEvent.archive8, false, var1);
            } else if (var0 == 11) {
               class129.method3086(ApproximateRouteStrategy.archive10, WorldMapEvent.archive8, false, 4);
            } else if (var0 == 50) {
               class70.setLoginResponseString("", "Updating date of birth...", "");
               class129.method3086(ApproximateRouteStrategy.archive10, WorldMapEvent.archive8, false, 7);
            } else if (Login.clearLoginScreen) {
               class147.titleboxSprite = null;
               Login.titlebuttonSprite = null;
               Login.runesSprite = null;
               Login.leftTitleSprite = null;
               class275.rightTitleSprite = null;
               class33.logoSprite = null;
               Login.title_muteSprite = null;
               Login.options_buttons_0Sprite = null;
               Login.options_buttons_2Sprite = null;
               class491.worldSelectBackSprites = null;
               class307.worldSelectFlagSprites = null;
               class391.worldSelectArrows = null;
               KeyHandler.worldSelectStars = null;
               Login.field935 = null;
               class305.loginScreenRunesAnimation.method2464();
               class28.method430(2);
               if (NetCache.NetCache_socket != null) {
                  try {
                     Buffer var3 = new Buffer(4);
                     var3.writeByte(2);
                     var3.writeMedium(0);
                     NetCache.NetCache_socket.write(var3.array, 0, 4);
                  } catch (IOException var5) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var4) {
                     }

                     ++NetCache.NetCache_ioExceptions;
                     NetCache.NetCache_socket = null;
                  }
               }

               Login.clearLoginScreen = false;
            }
         } else {
            var1 = ClanSettings.method3293() ? 0 : 12;
            class129.method3086(ApproximateRouteStrategy.archive10, WorldMapEvent.archive8, true, var1);
         }

         Client.gameState = var0;
      }
   }
}
