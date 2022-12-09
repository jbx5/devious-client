import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("UserComparator5")
public class UserComparator5 extends AbstractUserComparator {
   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "Lon;"
   )
   @Export("spriteIds")
   static GraphicsDefaults spriteIds;
   @ObfuscatedName("h")
   @Export("reversed")
   final boolean reversed;

   public UserComparator5(boolean var1) {
      this.reversed = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Loa;Loa;I)I",
      garbageValue = "-1440387042"
   )
   @Export("compareBuddy")
   int compareBuddy(Buddy var1, Buddy var2) {
      if (var1.world != 0) {
         if (var2.world == 0) {
            return this.reversed ? -1 : 1;
         }
      } else if (var2.world != 0) {
         return this.reversed ? 1 : -1;
      }

      return this.compareUser(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.compareBuddy((Buddy)var1, (Buddy)var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;ZII)V",
      garbageValue = "176810660"
   )
   static void method2830(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (Login.clearLoginScreen) {
         if (var3 == 4) {
            class12.method155(4);
         }

      } else {
         if (var3 == 0) {
            class124.method2939(var2);
         } else {
            class12.method155(var3);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var4 = var0.takeFileByNames("title.jpg", "");
         SecureRandomCallable.leftTitleSprite = Language.method6693(var4);
         class9.rightTitleSprite = SecureRandomCallable.leftTitleSprite.mirrorHorizontally();
         int var5 = Client.worldProperties;
         if ((var5 & 536870912) != 0) {
            Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
         } else if ((var5 & 1073741824) != 0) {
            Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
         } else if ((var5 & 256) != 0) {
            Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
         } else {
            Login.logoSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
         }

         ModelData0.titleboxSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
         Frames.titlebuttonSprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
         class299.field3457 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
         class150.field1756 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
         Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
         int var7 = var1.getGroupId("runes");
         int var8 = var1.getFileId(var7, "");
         IndexedSprite[] var6 = AbstractWorldMapData.method5238(var1, var7, var8);
         Login.runesSprite = var6;
         var8 = var1.getGroupId("title_mute");
         int var9 = var1.getFileId(var8, "");
         IndexedSprite[] var11 = AbstractWorldMapData.method5238(var1, var8, var9);
         class109.title_muteSprite = var11;
         WorldMapLabel.options_buttons_0Sprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
         Login.field949 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
         class89.options_buttons_2Sprite = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
         Login.field927 = Projectile.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
         class126.field1569 = WorldMapLabel.options_buttons_0Sprite.subWidth;
         WorldMapSection1.field2998 = WorldMapLabel.options_buttons_0Sprite.subHeight;
         class154.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
         if (var2) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field915 = new String[8];
            Login.field938 = 0;
         }

         class143.field1697 = 0;
         class141.otp = "";
         Login.field930 = true;
         Login.worldSelectOpen = false;
         if (!StructComposition.clientPreferences.method2428()) {
            Archive var12 = class162.archive6;
            var9 = var12.getGroupId("scape main");
            int var10 = var12.getFileId(var9, "");
            class286.musicPlayerStatus = 1;
            class304.musicTrackArchive = var12;
            class109.musicTrackGroupId = var9;
            class286.musicTrackFileId = var10;
            class467.musicTrackVolume = 255;
            class145.musicTrackBoolean = false;
            class286.pcmSampleLength = 2;
         } else {
            class384.method7370(2);
         }

         if (NetCache.NetCache_socket != null) {
            try {
               Buffer var16 = new Buffer(4);
               var16.writeByte(3);
               var16.writeMedium(0);
               NetCache.NetCache_socket.write(var16.array, 0, 4);
            } catch (IOException var15) {
               try {
                  NetCache.NetCache_socket.close();
               } catch (Exception var14) {
               }

               ++NetCache.NetCache_ioExceptions;
               NetCache.NetCache_socket = null;
            }
         }

         Login.clearLoginScreen = true;
         Login.xPadding = (CollisionMap.canvasWidth - 765) / 2;
         Login.loginBoxX = Login.xPadding + 202;
         UrlRequest.loginBoxCenter = Login.loginBoxX + 180;
         SecureRandomCallable.leftTitleSprite.drawAt(Login.xPadding, 0);
         class9.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
      }
   }
}
