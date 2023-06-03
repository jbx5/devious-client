import java.io.IOException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhw;"
   )
   field1981(0, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lhw;"
   )
   @Export("HorizontalAlignment_centered")
   HorizontalAlignment_centered(2, 1),
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lhw;"
   )
   field1982(1, 2);

   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 783030441
   )
   @Export("value")
   public final int value;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1013940965
   )
   @Export("id")
   final int id;

   HorizontalAlignment(int var3, int var4) {
      this.value = var3;
      this.id = var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-14"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.id;
   }

   @ObfuscatedName("at")
   public static String method3685(long var0) {
      Calendar.Calendar_calendar.setTime(new Date(var0));
      int var2 = Calendar.Calendar_calendar.get(7);
      int var3 = Calendar.Calendar_calendar.get(5);
      int var4 = Calendar.Calendar_calendar.get(2);
      int var5 = Calendar.Calendar_calendar.get(1);
      int var6 = Calendar.Calendar_calendar.get(11);
      int var7 = Calendar.Calendar_calendar.get(12);
      int var8 = Calendar.Calendar_calendar.get(13);
      return Calendar.DAYS_OF_THE_WEEK[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;ZIB)V",
      garbageValue = "-22"
   )
   static void method3679(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
      if (Login.clearLoginScreen) {
         if (var3 == 4) {
            class390.method7249(4);
         }

      } else {
         if (var3 == 0) {
            class164.method3362(var2);
         } else {
            class390.method7249(var3);
         }

         Rasterizer2D.Rasterizer2D_clear();
         byte[] var4 = var0.takeFileByNames("title.jpg", "");
         Decimator.leftTitleSprite = Interpreter.method2032(var4);
         Login.rightTitleSprite = Decimator.leftTitleSprite.mirrorHorizontally();
         int var5 = Client.worldProperties;
         if ((var5 & 536870912) != 0) {
            class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
         } else if ((var5 & 1073741824) != 0) {
            class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
         } else if ((var5 & 256) != 0) {
            class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
         } else {
            class13.logoSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
         }

         class481.titleboxSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
         Login.titlebuttonSprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
         ParamComposition.field2110 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
         UserComparator8.field1416 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
         WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
         Login.runesSprite = WorldMapRectangle.method5460(var1, "runes", "");
         SpriteMask.title_muteSprite = WorldMapRectangle.method5460(var1, "title_mute", "");
         class104.options_buttons_0Sprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
         DynamicObject.field1008 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
         class177.options_buttons_2Sprite = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
         NPC.field1290 = WorldMapRectangle.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
         class251.field2858 = class104.options_buttons_0Sprite.subWidth;
         class60.field443 = class104.options_buttons_0Sprite.subHeight;
         class237.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
         if (var2) {
            Login.Login_username = "";
            Login.Login_password = "";
            Login.field938 = new String[8];
            Login.field935 = 0;
         }

         class322.field3521 = 0;
         SoundSystem.otp = "";
         Login.field942 = true;
         Login.worldSelectOpen = false;
         if (!class10.clientPreferences.method2437()) {
            LoginPacket.method5679(2, ReflectionCheck.archive6, "scape main", "", 255, false);
         } else {
            class304.musicPlayerStatus = 1;
            UserComparator9.musicTrackArchive = null;
            VarbitComposition.musicTrackGroupId = -1;
            class304.musicTrackFileId = -1;
            class304.musicTrackVolume = 0;
            class132.musicTrackBoolean = false;
            class157.pcmSampleLength = 2;
         }

         if (NetCache.NetCache_socket != null) {
            try {
               Buffer var6 = new Buffer(4);
               var6.writeByte(3);
               var6.writeMedium(0);
               NetCache.NetCache_socket.write(var6.array, 0, 4);
            } catch (IOException var9) {
               try {
                  NetCache.NetCache_socket.close();
               } catch (Exception var8) {
               }

               ++NetCache.NetCache_ioExceptions;
               NetCache.NetCache_socket = null;
            }
         }

         Login.clearLoginScreen = true;
         Login.xPadding = (class448.canvasWidth - 765) / 2;
         Login.loginBoxX = Login.xPadding + 202;
         class485.loginBoxCenter = Login.loginBoxX + 180;
         Decimator.leftTitleSprite.drawAt(Login.xPadding, 0);
         Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
         class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18);
      }
   }
}
